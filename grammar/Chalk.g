// It should to remove all semantic errors tests from grammar file, and
// move it to a special class!! 
grammar Chalk;

options { 
	backtrack = true;
	memoize = true;
}

@header {
	package chalk;
	
	import java.io.*;
	import java.util.*;
	import java.lang.Math;
	import org.antlr.runtime.BitSet;
	import java.awt.Point;
	import chalk.FuncName.FuncArg;
	import org.antlr.stringtemplate.StringTemplate;
	import org.antlr.stringtemplate.StringTemplateGroup;
}

@lexer::header {
	package chalk;
}

@members {	
	private final String VAR_DECLAR = "Var [\%s :: \%s :: \%s] was been declared!";
	private final String VAR_NAME = "Var [\%s :: \%s :: \%s] was been declared!";
	private final String DUPLICATE_ERROR = "error(\%d:\%d): Duplicate variable \"\%s\" declaration;";
	private final String TYPE_ERROR = "error(\%d:\%d): Type mismatch: cannot convert from \%s to \%s;";
	private final String FUNC_PARAM_ERROR = "error(\%d:\%d): Wrong function \"\%s\" parameters;";
	private final String INCTBL_TYPE_ERROR = "error(\%d:\%d): Incompatible types \"\%s\" and \"\%s\";";
	private final String NOT_IMPL_ERROR = "error(\%d:\%d): Operation \"\%s\" not implemented for this type \"\%s\";";
	private final String NOT_IMPLS_ERROR = "error(\%d:\%d): Operation \"\%s\" not implemented for this types \"\%s\" and \"\%s\";";
	private final String UNDEF_ERROR = "error(\%d:\%d): Variable \"\%s\" is undefined;";
	private final String FUNC_UNDEF_ERROR = "error(\%d:\%d): Function \"\%s\" is undefined;";
	private final String DUPLICATE_FUNC_ERROR = "error(\%d:\%d): Multiplay function \"\%s\" definition;";
	private final String ENTRY_FUNC_ERROR = "error(\%d:\%d): More then one entry function \"\%s\" definition;";
	private final String DUPLICATE_PARAM_ERROR = "error(\%d:\%d): Duplicate function parameter \"\%s\";";
	private final String FUNC_PARAMS_ERROR = "error(\%d:\%d): The function \%s(\%s) in the type \%s is not applicable for the arguments \%s;";
	private final String NO_MAIN_FUNC_ERROR = "error: The main function is undefined;";
	private final String ARG_NOT_IMPL_ERROR = "error(\%d:\%d): Operation \"\%s\" not implemented for this argument;";
	private final String MAIN_FUNC_PARAMS_ERROR = "error(\%d:\%d): The main \"\%s\" function doesn't have any parameters and doesn't return any value;";
	private final String MAIN_FUNC_CALL_ERROR = "error(\%d:\%d): You can't call the main \"\%s\" function yourself anywhere;";
	private final String ASSIGMENT_STMT_ERROR = "error(\%d:\%d): Assigment operator expected;";
	private final String SYNTAX_ERROR = "error(\%d): There is a syntax error were occured at the token \"\%s\";";
	
	protected Namespace rootSpace = new Namespace(null, "global_space");
	protected ArrayList<String> errors = new ArrayList<String>();
	protected Namespace currentNamespace = null;
	
	private StringTemplate getTemplate( String name )
	{
		return ChalkEntry.getStg().getInstanceOf(name);
	}
	
	private void putError( String pattern, Object... args )
	{
		this.errors.add(String.format(pattern, args));
	}
	
	public String getErrorHeader(RecognitionException e) 
	{
		return String.format(SYNTAX_ERROR, e.line, e.token.getText());	
	}
	
	public void emitErrorMessage( String msg ) 
	{
		this.errors.add(msg);
	}
	
	private Name findVar( Namespace space, String varId )
	{
		return findVar( space, varId, false );
	}
	
	private Name findVar( Namespace space, String varId, boolean forCreate )
	{
		Namespace tmpSpace = space;
		Name varIdName = new Name(varId);
		while (tmpSpace != null)
		{	
			Name name = tmpSpace.getNamesTable().get(varIdName);
			if (name != null)
			{
				return name;
			}	
			else if (tmpSpace.isFuncSpace())
			{
				FuncArg arg = tmpSpace.getFuncName().getArgById(varId);
				if (arg != null)
					return arg;
				
				if (forCreate)
					return null;	
			}	
				
			tmpSpace = tmpSpace.getOwner();	
		}
			
		return null;
	}
}

compiled_unit[String programName, Namespace space] returns [ StringTemplate code = getTemplate("compiled_unit") ]
	:	(	t = var_declaration[space, getTemplate("global_var_declaration")] { code.setAttribute("globalVars", $t.code); }
		|	t = func_definition[space]	{ code.setAttribute("functions", $t.code); }
		)+ {
			if (!rootSpace.mainExist())
				putError(NO_MAIN_FUNC_ERROR);
				
			$code.setAttribute("programName", programName);		
		}
  	;
  
var_declaration[Namespace space, StringTemplate code_in] returns [ StringTemplate code ]
scope {
	String varType;
}
@init {
	$code = code_in;
}
	:	type { $var_declaration::varType = $type.idType; } 
			t = var_declarator[space] {
				$code.setAttribute("declarators", t);
			} ( ',' t = var_declarator[space] {
				$code.setAttribute("declarators", t);
			} )* {
			$code.setAttribute("type", $type.code);
		}
	;

var_declarator[Namespace space] returns [ StringTemplate code ]
@init {
	currentNamespace = space;
}
	: 	ID ( '=' eVal = logic_expr )? { 
			boolean error = false;
			Name varName = findVar(space, $ID.text, true);
			if (varName != null) {
				putError(DUPLICATE_ERROR, $ID.line, $ID.pos + 1, $ID.text);
				error = true;
			} 
			if ($eVal.value != null && !$var_declaration::varType.equals($eVal.value.getType())) { 
				putError(TYPE_ERROR, $eVal.value.line(), $eVal.value.pos(), $eVal.value.getType(), $var_declaration::varType);
			} 
			if (!error) {
				Name name = new Name($ID.text, $var_declaration::varType, $ID.line);	
				space.addName(name);
				
				if ($eVal.code != null) {
					$code = getTemplate("assg_var_declarator");
					$code.setAttribute("id", name.getId());
					$code.setAttribute("value", $eVal.code);	
				}
				else {
					$code = getTemplate("var_declarator");
					$code.setAttribute("id", name.getId());	
					
					if (Name.isIntT($var_declaration::varType)) {
						$code.setAttribute("init", 0);
					} else if (Name.isFloatT($var_declaration::varType)) {
						$code.setAttribute("init", 0.0);
					} else if (Name.isStringT($var_declaration::varType)) {
						$code.setAttribute("init", "");
					} else {
						$code.setAttribute("init", false);
					}
				}
			}
		}
	;

func_definition[Namespace space] returns [ StringTemplate code ]
scope {
	Namespace tmpNamespace;
}
@init {
	$code = getTemplate("empty_template");
}
	: 	tk1 = DEF_TK ( tk2 = ENTRY_TK )? ID 
		LPAREN ( eVal = var_args_list )?  RPAREN ( ':' t = type )? {
			boolean error = false;
			FuncName func = new FuncName($ID.text, $tk1.line);
			
			if (tk2 != null) {
				func.setMain(true);
				$code = getTemplate("main_func_definition");
			}
			else {
				$code = getTemplate("func_definition");
				$code.setAttribute("name", func.getId());
			}	
				
			if (rootSpace.findFunc(func) != null) {
				error = true;
				if (func.isMain())
					putError(ENTRY_FUNC_ERROR, $ID.line, $ID.pos + 1, $ID.text);
				else 
					putError(DUPLICATE_FUNC_ERROR, $ID.line, $ID.pos + 1, $ID.text);
			}
			
			if ($eVal.argsList != null && $eVal.argsList.size() != 0) {
				func.setArgs($eVal.argsList);
				
				if (func.isMain())
					putError(MAIN_FUNC_PARAMS_ERROR, $ID.line, $ID.pos + 1, $ID.text);
				else
					$code.setAttribute("args", $eVal.code);	
			}	
				
			if ($t.idType != null) {
				func.setType($t.idType);
				
				if (func.isMain()) 
					putError(MAIN_FUNC_PARAMS_ERROR, $ID.line, $ID.pos + 1, $ID.text);
				else 
					$code.setAttribute("type", $t.code);		
			} else if (!func.isMain()) {
				$code.setAttribute("type", getTemplate("type_void"));
			}
			
			if ($eVal.argErrors != null)
				 errors.addAll($eVal.argErrors);
				 
			$func_definition::tmpNamespace = new Namespace(space, func.getId(), func);
			space.addSpace($func_definition::tmpNamespace);
			
		} '=' t2 = stmt_block[ $func_definition::tmpNamespace ] { $code.setAttribute("stmts", $t2.code); }
	;

var_args_list returns [ ArrayList<FuncArg> argsList, ArrayList<String> argErrors, StringTemplate code ]
@init {
	$argsList = new ArrayList<FuncArg>();
	$argErrors = new ArrayList<String>();
	$code = getTemplate("var_args_list");
}
	: 	t = type id = ID {
			FuncArg arg = new FuncArg($id.text, $t.idType);
			$argsList.add(arg);
			
			StringTemplate argCode = getTemplate("var_arg");
			argCode.setAttribute("type", $t.code);	
			argCode.setAttribute("id", arg.getId());
				
			$code.setAttribute("args", argCode);	
		} ( ',' t = type id = ID {					
			FuncArg arg = new FuncArg($id.text, $t.idType);
			if ($argsList.contains(arg)) {
				$argErrors.add(String.format(DUPLICATE_PARAM_ERROR, $id.line, $id.pos + 1, $id.text));
			}
			
			StringTemplate argCode = getTemplate("var_arg");
			argCode.setAttribute("type", $t.code);	
			argCode.setAttribute("id", arg.getId());
				
			$code.setAttribute("args", argCode);
			
			$argsList.add(arg);
		} )*
	;

stmt_block[Namespace space ] returns [ StringTemplate code ]
@init {
	$code = getTemplate("stmt_list");
}
	: 	( t = stmt[space] { $code.setAttribute("stmts", $t.code); } )* END_TK
	;
  
stmt[Namespace space] returns [ StringTemplate code ]
@init {
	$code = getTemplate("empty_template");
}
	: 	t = print_stmt[space]		{ $code = $t.code; }
	| 	t = var_declaration[space, getTemplate("var_declaration")]	{ $code = $t.code; }
	| 	t = assigment_stmt[space]	{ $code = $t.code; }
	| 	t = selection_stmt[space]	{ $code = $t.code; }
	| 	t = iteration_stmt[space]	{ $code = $t.code; }
	| 	t = jump_stmt[space]		{ $code = $t.code; }
	;
  
print_stmt[Namespace space] returns [ StringTemplate code ]
@init {
	currentNamespace = space;
	$code = getTemplate("empty_template");
}
	: 	'print' { $code = getTemplate("print_stmt"); } t = logic_expr { $code.setAttribute("args", $t.code); }
			( ',' t = logic_expr { $code.setAttribute("args", $t.code); } )*
	|	'println' { $code = getTemplate("println_stmt"); } ( t = logic_expr { $code.setAttribute("args", $t.code); }
			( ',' t = logic_expr { $code.setAttribute("args", $t.code); } )* 
			)? 
	;
    
assigment_stmt[Namespace space] returns [ StringTemplate code ]
@init {
	currentNamespace = space;
	$code = getTemplate("assigment_stmt");
}
	: 	( id = ID 	
			( 	tk = EQ			{ $code = getTemplate("assigment_stmt_eq"); }
			| 	tk = STAR_EQ	{ $code = getTemplate("assigment_stmt_stareq"); }
			|   tk = RSLASH_EQ	{ $code = getTemplate("assigment_stmt_slasheq"); }
			|   tk = PLUS_EQ	{ $code = getTemplate("assigment_stmt_pluseq"); }
			|   tk = MINUS_EQ	{ $code = getTemplate("assigment_stmt_minuseq"); }
			| 	tk = GT_GT_EQ	{ $code = getTemplate("assigment_stmt_gtgteq"); }
			| 	tk = LT_LT_EQ	{ $code = getTemplate("assigment_stmt_ltlteq"); }
			) 
		)? eVal = logic_expr {
			if ($id != null) {
				Name varName = findVar(space, $id.text);
				
				if (varName == null) {
					putError(UNDEF_ERROR, $id.line, $id.pos + 1, $id.text);
				} else {		
					if (Name.isStringT(varName.getType()) && $tk.type != EQ && $eVal.value.isString()) {
						putError(NOT_IMPLS_ERROR, $tk.line, $tk.pos + 1, $tk.text, varName.getType(), $eVal.value.getType());
					} else {
						switch ($tk.type) 
						{
							case EQ:
								if (!Name.typeIsT(varName.getType(), $eVal.value.getType())) {
									putError(TYPE_ERROR, $eVal.value.line(), $eVal.value.pos(), $eVal.value.getType(), varName.getType());
								}
								break;
							case STAR_EQ:
								if (!Name.typeIsT(varName.getType(), $eVal.value.getType())) {
									putError(TYPE_ERROR, $eVal.value.line(), $eVal.value.pos(), $eVal.value.getType(), varName.getType());
								}
								break;
							case RSLASH_EQ:
								if (!Name.isFloatT(varName.getType())) {
									putError(TYPE_ERROR, $id.line, $id.pos, $eVal.value.getType(), varName.getType());
								}
								if (!Name.typeIsT(varName.getType(), $eVal.value.getType())) {
									putError(TYPE_ERROR, $eVal.value.line(), $eVal.value.pos(), $eVal.value.getType(), varName.getType());
								}
								break;	
							case PLUS_EQ:
								if (!Name.typeIsT(varName.getType(), $eVal.value.getType())) {
									putError(TYPE_ERROR, $eVal.value.line(), $eVal.value.pos(), $eVal.value.getType(), varName.getType());
								}				
								break;
							case MINUS_EQ:
								if (!Name.typeIsT(varName.getType(), $eVal.value.getType())) {
									putError(TYPE_ERROR, $eVal.value.line(), $eVal.value.pos(), $eVal.value.getType(), varName.getType());
								}				
								break;
							case GT_GT_EQ:
								if (!Name.typeIsT(varName.getType(), $eVal.value.getType())) {
									putError(TYPE_ERROR, $eVal.value.line(), $eVal.value.pos(), $eVal.value.getType(), varName.getType());
								}				
								break;	
							case LT_LT_EQ:
								if (!Name.typeIsT(varName.getType(), $eVal.value.getType())) {
									putError(TYPE_ERROR, $eVal.value.line(), $eVal.value.pos(), $eVal.value.getType(), varName.getType());
								}				
								break;									
						}
					}
				}
				$code.setAttribute("op1", varName.getId());
				$code.setAttribute("op2", $eVal.code);	
			} else {
				$code.setAttribute("op1", $eVal.code);
				
				if (!$eVal.value.isFunc())
					putError(ASSIGMENT_STMT_ERROR, $eVal.value.line(), $eVal.value.pos());
			}
		}
	;
    
selection_stmt[Namespace space] returns [ StringTemplate code ]
scope {
	Namespace tmpNamespace;
}
@init {
	currentNamespace = space;
	$code = getTemplate("empty_template");
	StringTemplate tmp = null;
}
	: 	IF_TK eVal = logic_expr {
			$code = getTemplate("if_stmt");
			$code.setAttribute("test", $eVal.code);
			
			if (!$eVal.value.isBool()) {
				putError(TYPE_ERROR, $eVal.value.line(), $eVal.value.pos(), $eVal.value.getType(), Name.BOOL_TYPE_ID);
			}
			$selection_stmt::tmpNamespace = new Namespace(space, "if");
			space.addSpace($selection_stmt::tmpNamespace);
			
		} ( t = stmt[ $selection_stmt::tmpNamespace ] { $code.setAttribute("stmts", $t.code); } )+ 
	  	( ELSIF_TK eVal = logic_expr {
	  		tmp = getTemplate("elsif_stmt");
			tmp.setAttribute("test", $eVal.code);
			
			if (!$eVal.value.isBool()) {
				putError(TYPE_ERROR, $eVal.value.line(), $eVal.value.pos(), $eVal.value.getType(), Name.BOOL_TYPE_ID);
			}
			$selection_stmt::tmpNamespace = new Namespace(space, "elsif");
			space.addSpace($selection_stmt::tmpNamespace);
			
	  	} ( t = stmt[ $selection_stmt::tmpNamespace ] { tmp.setAttribute("stmts", $t.code); } )+ { $code.setAttribute("alts", tmp); } )*
	  	( ELSE_TK {
	  		tmp = getTemplate("else_stmt");
	  		
	  		$selection_stmt::tmpNamespace = new Namespace(space, "else");
			space.addSpace($selection_stmt::tmpNamespace);
	  	} ( t = stmt[ $selection_stmt::tmpNamespace ] { tmp.setAttribute("stmts", $t.code); } )+ { $code.setAttribute("alts", tmp); } )? 
	  	END_TK
	;

iteration_stmt[Namespace space] returns [ StringTemplate code ]
scope {
	Namespace tmpNamespace;
}
@init {
	currentNamespace = space;
	$code = getTemplate("empty_template");
}
	: 	WHILE_TK eVal = logic_expr {
			$code = getTemplate("while_stmt");
			$code.setAttribute("test", $eVal.code);
			
			if (!$eVal.value.isBool()) {
				putError(TYPE_ERROR, $eVal.value.line(), $eVal.value.pos(), $eVal.value.getType(), Name.BOOL_TYPE_ID);
			}
			$iteration_stmt::tmpNamespace = new Namespace(space, "while");
			space.addSpace($iteration_stmt::tmpNamespace);
			
		} t = stmt_block[ $iteration_stmt::tmpNamespace ] { $code.setAttribute("stmts", $t.code); }
	| 	DO_TK {
			$code = getTemplate("until_stmt");
			
			$iteration_stmt::tmpNamespace = new Namespace(space, "until");
			space.addSpace($iteration_stmt::tmpNamespace);
			
		} ( t = stmt[ $iteration_stmt::tmpNamespace ] { $code.setAttribute("stmts", $t.code); } )* UNTIL_TK eVal = logic_expr {
			$code.setAttribute("test", $eVal.code);
			if (!$eVal.value.isBool()) {
				putError(TYPE_ERROR, $eVal.value.line(), $eVal.value.pos(), $eVal.value.getType(), Name.BOOL_TYPE_ID);
			}
		}
	| 	FOR_TK tk = ID IN_TK LBRACKET eVal1 = logic_expr ':' eVal2 = logic_expr RBRACKET {
			$code = getTemplate("for_stmt");			
									
			Name varName = findVar(space, $tk.text);
			boolean error = false;
			
			if (varName == null) {	
				error = true;	
				putError(UNDEF_ERROR, $tk.line, $tk.pos + 1, $tk.text);
			} else {
				$code.setAttribute("id", varName.getId());	
				if (!Name.isIntT(varName.getType()) && !Name.isFloatT(varName.getType())) {		
					putError(NOT_IMPL_ERROR, $tk.line, $tk.pos + 1, $FOR_TK.text, varName.getType());
				}
			}	

			if (!error) {
				if (!Name.isIntT(varName.getType()) && !Name.isFloatT(varName.getType())) {		
					error = true;
					putError(NOT_IMPL_ERROR, $tk.line, $tk.pos + 1, $FOR_TK.text, varName.getType());
				}
			}
			
			if ((!$eVal1.value.isInt() && !$eVal1.value.isFloat()) ||
				(!$eVal2.value.isInt() && !$eVal2.value.isFloat()))
			{		
				error = true;
				putError(NOT_IMPLS_ERROR, $LBRACKET.line, $LBRACKET.pos + 1, $FOR_TK.text, $eVal1.value.getType(), $eVal2.value.getType());
			}
				
			if (!error) {			
			 	if (!$eVal1.value.isT(varName.getType()) || !$eVal2.value.isT(varName.getType())) {		
					putError(NOT_IMPLS_ERROR, $LBRACKET.line, $LBRACKET.pos + 1, $FOR_TK.text, $eVal1.value.getType(), $eVal2.value.getType());
				}
			}
	
			$code.setAttribute("op1", $eVal1.code);
			$code.setAttribute("op2", $eVal2.code);
			
			$iteration_stmt::tmpNamespace = new Namespace(space, "for");
			space.addSpace($iteration_stmt::tmpNamespace);
			
		} t = stmt_block[ $iteration_stmt::tmpNamespace ] { $code.setAttribute("stmts", $t.code); }
	; 
  
jump_stmt[Namespace space] returns [ StringTemplate code ]
@init {
	currentNamespace = space;
	$code = getTemplate("empty_template");
}
	: 	BREAK_TK		{ $code = getTemplate("break_stmt"); }
	| 	CONTINUE_TK		{ $code = getTemplate("continue_stmt"); }
	| 	tk = RETURN_TK ( eVal = logic_expr {
			$code = getTemplate("return_stmt");
			$code.setAttribute("arg", $eVal.code);
			
			String funcType = space.getSpaceRetType();
			if (!$eVal.value.isT(funcType)) {
				putError(TYPE_ERROR, $tk.line, $tk.pos + 1, $eVal.value.getType(), funcType);
			}
		} )?	
	;
	
logic_expr returns [ ExprValue value, StringTemplate code ]
@init { 
	StringTemplate tmp = null; 
}
	: 	eVal1 = and_logic_expr { $value = $eVal1.value; $code = $eVal1.code; } 
		( tk = BAR_BAR eVal2 = and_logic_expr {
			tmp = $code;
			$code = getTemplate("logic_expr");
			$code.setAttribute("op1", tmp);
			$code.setAttribute("op2", $eVal2.code);
				
			if (!$value.isBool() && !$eVal2.value.isBool()) {
				putError(NOT_IMPLS_ERROR, $tk.line, $tk.pos + 1, $tk.text, $value.getType(), $eVal2.value.getType());
				$value = new ExprValue(Name.BOOL_TYPE_ID, $value.line(), $value.pos());
			} else {
				$value = new ExprValue(Name.BOOL_TYPE_ID, $value.line(), $value.pos());
			}
		}
		)* 
	;
	    
and_logic_expr returns [ ExprValue value, StringTemplate code ]
@init { 
	StringTemplate tmp = null; 
}
	: 	eVal1 = comparison_expr { $value = $eVal1.value; $code = $eVal1.code; }
		( tk = AMP_AMP eVal2 = comparison_expr { 
			tmp = $code;		
			$code = getTemplate("and_logic_expr");
			$code.setAttribute("op1", tmp);
			$code.setAttribute("op2", $eVal2.code);
				
			if (!$value.isBool() && !$eVal2.value.isBool()) {
				putError(NOT_IMPLS_ERROR, $tk.line, $tk.pos + 1, $tk.text, $value.getType(), $eVal2.value.getType());
				$value = new ExprValue(Name.BOOL_TYPE_ID, $value.line(), $value.pos());		
			} else {
				$value = new ExprValue(Name.BOOL_TYPE_ID, $value.line(), $value.pos());
			}
		}
		)*
	;   
  
comparison_expr returns [ ExprValue value, StringTemplate code ]
@init { 
	StringTemplate tmp = null; 
}
	: 	eVal1 = math_expr { 
			$value = $eVal1.value; $code = $eVal1.code; 
		}
		(
			( 	tk = GT				{ tmp = $code; $code = getTemplate("comparison_expr_gt"); }
			| 	tk = LT				{ tmp = $code; $code = getTemplate("comparison_expr_lt"); }
			| 	tk = LT_EQ			{ tmp = $code; $code = getTemplate("comparison_expr_lteq"); }
			| 	tk = GT_EQ			{ tmp = $code; $code = getTemplate("comparison_expr_gteq"); }
			| 	tk = EQ_EQ			{ tmp = $code; $code = getTemplate("comparison_expr_eqeq"); }
			|	tk = SCREAMER_EQ	{ tmp = $code; $code = getTemplate("comparison_expr_noteq"); }
			)	
			eVal2 = math_expr {					
				if ((!$value.isInt() && !$value.isFloat()) ||
					(!$eVal2.value.isInt() && !$eVal2.value.isFloat()))
				{
					putError(NOT_IMPLS_ERROR, $tk.line, $tk.pos + 1, $tk.text, $value.getType(), $eVal2.value.getType());
					$value = new ExprValue(Name.BOOL_TYPE_ID, $value.line(), $value.pos());
				} else {
					$value = new ExprValue(Name.BOOL_TYPE_ID, $value.line(), $value.pos());
					
					$code.setAttribute("op1", tmp);
					$code.setAttribute("op2", $eVal2.code);
				}
			}
		 )*  { if ($eVal2.value == null) $code = $eVal1.code; }
	;
  
math_expr returns [ ExprValue value, StringTemplate code ]
@init { 
	StringTemplate tmp = null; 
}
	: 	eVal1 = xor_math_expr { $value = $eVal1.value; $code = $eVal1.code; }
		( tk = BAR eVal2 = xor_math_expr {	
			tmp = $code;
			$code = getTemplate("math_expr");
			$code.setAttribute("op1", tmp);
			$code.setAttribute("op2", $eVal2.code);
					
			if (!($value.isInt() && $eVal2.value.isInt()) &&
				!($value.isBool() && $eVal2.value.isBool()) ) 
			{
				putError(NOT_IMPLS_ERROR, $tk.line, $tk.pos + 1, $tk.text, $value.getType(), $eVal2.value.getType());
				if ($value.isInt())
					$value = new ExprValue(Name.INT_TYPE_ID, $value.line(), $value.pos());
				else if ($value.isBool())
					$value = new ExprValue(Name.BOOL_TYPE_ID, $value.line(), $value.pos());		
				else 	
					$value = new ExprValue($value.line(), $value.pos());			
			} else {	
				if ($value.isInt())
					$value = new ExprValue(Name.INT_TYPE_ID, $value.line(), $value.pos());
				else 
					$value = new ExprValue(Name.BOOL_TYPE_ID, $value.line(), $value.pos());	
			}	
		}
		)*
	;
  
xor_math_expr returns [ ExprValue value, StringTemplate code ]
@init { 
	StringTemplate tmp = null; 
}
	: 	eVal1 = and_math_expr { $value = $eVal1.value; $code = $eVal1.code; }
		( tk = CARET eVal2 = and_math_expr {
			tmp = $code;
			$code = getTemplate("xor_math_expr");
			$code.setAttribute("op1", tmp);
			$code.setAttribute("op2", $eVal2.code);
				
			if (!($value.isInt() && $eVal2.value.isInt()) &&
				!($value.isBool() && $eVal2.value.isBool()) ) 
			{
				putError(NOT_IMPLS_ERROR, $tk.line, $tk.pos + 1, $tk.text, $value.getType(), $eVal2.value.getType());
				if ($value.isInt())
					$value = new ExprValue(Name.INT_TYPE_ID, $value.line(), $value.pos());
				else if ($value.isBool())
					$value = new ExprValue(Name.BOOL_TYPE_ID, $value.line(), $value.pos());		
				else 	
					$value = new ExprValue($value.line(), $value.pos());	
			} else {	
				if ($value.isInt())
					$value = new ExprValue(Name.INT_TYPE_ID, $value.line(), $value.pos());
				else 
					$value = new ExprValue(Name.BOOL_TYPE_ID, $value.line(), $value.pos());					
			}	
		}
		)* 
	;

and_math_expr returns [ ExprValue value, StringTemplate code ]
@init { 
	StringTemplate tmp = null; 
}
	: 	eVal1 = shift_math_expr { $value = $eVal1.value; $code = $eVal1.code; }
		( tk = AMP eVal2 = shift_math_expr {
			tmp = $code;
			$code = getTemplate("and_math_expr");	
			$code.setAttribute("op1", tmp);
			$code.setAttribute("op2", $eVal2.code);
						
			if (!($value.isInt() && $eVal2.value.isInt()) &&
				!($value.isBool() && $eVal2.value.isBool()) ) 
			{
				putError(NOT_IMPLS_ERROR, $tk.line, $tk.pos + 1, $tk.text, $value.getType(), $eVal2.value.getType());
				if ($value.isInt())
					$value = new ExprValue(Name.INT_TYPE_ID, $value.line(), $value.pos());
				else if ($value.isBool())
					$value = new ExprValue(Name.BOOL_TYPE_ID, $value.line(), $value.pos());		
				else 	
					$value = new ExprValue($value.line(), $value.pos());				
			} else {		
				if ($value.isInt())
					$value = new ExprValue(Name.INT_TYPE_ID, $value.line(), $value.pos());
				else 
					$value = new ExprValue(Name.BOOL_TYPE_ID, $value.line(), $value.pos());
			}	
		}
		)*
	;

shift_math_expr returns [ ExprValue value, StringTemplate code ]
@init { 
	StringTemplate tmp = null; 
}
	: 	eVal1 = additive_math_expr { $value = $eVal1.value; $code = $eVal1.code; }
		( 
			(	tk = LT_LT	{ tmp = $code; $code = getTemplate("shift_math_expr_ltlt"); }
			|	tk = GT_GT	{ tmp = $code; $code = getTemplate("shift_math_expr_gtgt"); } 
			) 
			eVal2 = additive_math_expr {
				$code.setAttribute("op1", tmp);
				$code.setAttribute("op2", $eVal2.code);
										
				if (!$value.isInt() && !$eVal2.value.isInt()) {
					putError(NOT_IMPLS_ERROR, $tk.line, $tk.pos + 1, $tk.text, $value.getType(), $eVal2.value.getType());
					$value = new ExprValue(Name.INT_TYPE_ID, $value.line(), $value.pos());					
				} else { 
					$value = new ExprValue(Name.INT_TYPE_ID, $value.line(), $value.pos());
				}
			} 
		)* 
	;

additive_math_expr returns [ ExprValue value, StringTemplate code ]
@init { 
	StringTemplate tmp = null; 
}
	: 	eVal1 = multiplicative_math_expr { $value = $eVal1.value; $code = $eVal1.code; }
		( 
			(	tk = PLUS	{ tmp = $code; $code = getTemplate("additive_math_expr_p"); }
			|	tk = MINUS	{ tmp = $code; $code = getTemplate("additive_math_expr_m"); }
			) 
			eVal2 = multiplicative_math_expr {
				$code.setAttribute("op1", tmp);
				$code.setAttribute("op2", $eVal2.code);		
									
				if ((!$value.isInt() && !$value.isFloat()) ||
					(!$eVal2.value.isInt() && !$eVal2.value.isFloat()))
				{
					putError(NOT_IMPLS_ERROR, $tk.line, $tk.pos + 1, $tk.text, $value.getType(), $eVal2.value.getType());
					$value = new ExprValue($value.line(), $value.pos());					
				} else {	
					if ($value.isInt() && $eVal2.value.isInt()) {
						$value = new ExprValue(Name.INT_TYPE_ID, $value.line(), $value.pos());
					} else {
						$value = new ExprValue(Name.FLOAT_TYPE_ID, $value.line(), $value.pos());				
					}
				}
			}
		)*
	;

multiplicative_math_expr returns [ ExprValue value, StringTemplate code ]
@init { 
	StringTemplate tmp = null; 
} 
	: 	eVal1 = unary_math_expr { $value = $eVal1.value; $code = $eVal1.code; }
	( 
		(	tk = STAR	{ tmp = $code; $code = getTemplate("multiplicative_math_expr_star"); }
		| 	tk = RSLASH	{ tmp = $code; $code = getTemplate("multiplicative_math_expr_slash"); } 
		| 	tk = MOD	{ tmp = $code; $code = getTemplate("multiplicative_math_expr_mod"); }
		| 	tk = DIV 	{ tmp = $code; $code = getTemplate("multiplicative_math_expr_div"); }
		) 
		eVal2 = unary_math_expr {
			$code.setAttribute("op1", tmp);
			$code.setAttribute("op2", $eVal2.code);
			
			if ((!$value.isInt() && !$value.isFloat()) ||
				(!$eVal2.value.isInt() && !$eVal2.value.isFloat()))
			{
				putError(NOT_IMPLS_ERROR, $tk.line, $tk.pos + 1, $tk.text, $value.getType(), $eVal2.value.getType());
				$value = new ExprValue($value.line(), $value.pos());				
			} else { 
				switch ($tk.type) 
				{
					case STAR:
						if ($value.isInt() && $eVal2.value.isInt()) {
							$value = new ExprValue(Name.INT_TYPE_ID, $value.line(), $value.pos());
						} else {
							$value = new ExprValue(Name.FLOAT_TYPE_ID, $value.line(), $value.pos());
						}
						break;
					case RSLASH:
						$value = new ExprValue(Name.FLOAT_TYPE_ID, $value.line(), $value.pos());
						break;
					case MOD:
						if ($value.isInt() && $eVal2.value.isInt()) {
							$value = new ExprValue(Name.INT_TYPE_ID, $value.line(), $value.pos());
						} else {
							$value = new ExprValue(Name.FLOAT_TYPE_ID, $value.line(), $value.pos());
						}
						break;	
					case DIV:
						if (!$value.isInt() || !$eVal2.value.isInt()) {
							putError(NOT_IMPLS_ERROR, $tk.line, $tk.pos + 1, $tk.text, $value.getType(), $eVal2.value.getType());
						} else {
							$value = new ExprValue(Name.INT_TYPE_ID, $value.line(), $value.pos());
						}
						break;								
				} 	
			}				
		} 
	)* 
	;

unary_math_expr returns [ ExprValue value, StringTemplate code ]
@init {
	$code = getTemplate("empty_template");
}
	:	type ':' eVal = unary_math_expr {
			$value = new ExprValue($type.idType, $type.line, $type.pos + 1);
			if ((!$eVal.value.isInt() && !$eVal.value.isFloat()) ||
				(!Name.isIntT($type.idType) && !Name.isFloatT($type.idType))) 
			{
				putError(TYPE_ERROR, $type.line, $type.pos + 1, $eVal.value, $type.idType);
			}
			
			if ($eVal.value.isT($type.idType))
				$code = getTemplate("type_cast_eq2eq");
			else if ($eVal.value.isFloat())
				$code = getTemplate("type_cast_float2int");
			else
				$code = getTemplate("type_cast_int2float");
				
			$code.setAttribute("op1", $eVal.code);
		} 	
	|	(	tk = PLUS		{ $code = getTemplate("plus_unary_math_expr"); }
		|	tk = MINUS		{ $code = getTemplate("minus_unary_math_expr"); }
		|	tk = TILDE 		{ $code = getTemplate("tilde_unary_math_expr"); }
		|	tk = SCREAMER	{ $code = getTemplate("scream_unary_math_expr"); }
		) eVal = unary_math_expr {
			switch ($tk.type) 
			{
				case PLUS:
					if (!$eVal.value.isInt() && !$eVal.value.isFloat()) {
						putError(NOT_IMPL_ERROR, $eVal.value.line(), $eVal.value.pos(), $tk.text, $eVal.value.getType());
						$value = new ExprValue($tk.line, $tk.pos + 1);					
					} else {
						$value = new ExprValue($eVal.value.getType(), $tk.line, $tk.pos + 1);
					}
					break;
				case MINUS:
					if (!$eVal.value.isInt() && !$eVal.value.isFloat()) {
						putError(NOT_IMPL_ERROR, $eVal.value.line(), $eVal.value.pos(), $tk.text, $eVal.value.getType());
						$value = new ExprValue($tk.line, $tk.pos + 1);					
					} else {
						$value = new ExprValue($eVal.value.getType(), $tk.line, $tk.pos + 1);
					}
					break;
				case TILDE:
					$value = new ExprValue(Name.INT_TYPE_ID, $tk.line, $tk.pos + 1);
					if (!$eVal.value.isInt()) {
						putError(NOT_IMPL_ERROR, $eVal.value.line(), $eVal.value.pos(), $tk.text, $eVal.value.getType());
					}
					break;	
				case SCREAMER:
					$value = new ExprValue(Name.BOOL_TYPE_ID, $tk.line, $tk.pos + 1);
					if (!$eVal.value.isBool()) {
						putError(NOT_IMPL_ERROR, $eVal.value.line(), $eVal.value.pos(), $tk.text, $eVal.value.getType());
					}
					break;								
			}
			
			$code.setAttribute("op1", $eVal.code); 			
		}
	|	eVal2 = primary_math_expr
        (   tk = SCREAMER {
        		$value = new ExprValue(Name.INT_TYPE_ID, $tk.line, $tk.pos + 1);
        		$code = getTemplate("primary_math_expr_scream");
				if (!$eVal2.value.isInt()) {
					putError(NOT_IMPL_ERROR, $eVal2.value.line(), $eVal2.value.pos(), $tk.text, $eVal2.value.getType());
				} else {
					$code.setAttribute("op1", $eVal2.code);
				}     		
        	}
        |	tk = STAR_STAR eVal3 = unary_math_expr {
        		$code = getTemplate("primary_math_expr_power");
        		$value = new ExprValue(Name.FLOAT_TYPE_ID, $eVal2.value.line(), $eVal2.value.pos());
        		if ((!$eVal2.value.isInt() && !$eVal2.value.isFloat()) ||
        			(!$eVal3.value.isInt() && !$eVal3.value.isFloat())) 
        		{
					putError(NOT_IMPLS_ERROR, $tk.line, $tk.pos + 1, $tk.text, $eVal2.value.getType(), $eVal3.value.getType());
				} else {					
					$code.setAttribute("op1", $eVal2.code);
					$code.setAttribute("op2", $eVal3.code);
				}	
        	}
        )?
        {
        	if ($value == null) {
        		$value = $eVal2.value; 
        		$code = $eVal2.code;
        	}
        }
	;

primary_math_expr returns [ ExprValue value, StringTemplate code ]
scope {
	List<ExprValue> args;
} 
@init {
	$primary_math_expr::args = new ArrayList<ExprValue>(0);
	$code = getTemplate("empty_template");
}
	: 	LPAREN eVal0 = logic_expr RPAREN { 
		$value = $eVal0.value; 
		$value.setPoint(new Point($LPAREN.pos + 1, $LPAREN.line));
		$code = getTemplate("primary_math_expr_parens");
		$code.setAttribute("op1", $eVal0.code);
	}
	| 	(	tk = READ_INT		{ $code = getTemplate("read_int"); $value = new ExprValue(Name.INT_TYPE_ID, $tk.line, $tk.pos + 1, false, true); }
		|	tk = READ_FLOAT		{ $code = getTemplate("read_float"); $value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1, false, true); }
		|	tk = READ_STRING	{ $code = getTemplate("read_string"); $value = new ExprValue(Name.STRING_TYPE_ID, $tk.line, $tk.pos + 1, false, true); }
		|	tk = READ_BOOL		{ $code = getTemplate("read_bool"); $value = new ExprValue(Name.BOOL_TYPE_ID, $tk.line, $tk.pos + 1, false, true); }
		)
	|	(	tk = PLUS_PLUS 		{ $code = getTemplate("plusplus_id"); }
		|	tk = MINUS_MINUS	{ $code = getTemplate("minusminus_id"); }
		) eVal = ID {
			Name varName = findVar(currentNamespace, $eVal.text);
			
			if (varName == null) {
				putError(UNDEF_ERROR, $eVal.line, $eVal.pos + 1, $eVal.text);
				$value = new ExprValue(Name.UNDEF_TYPE_ID, $tk.line, $tk.pos + 1, true, true);
			} else {
				$code.setAttribute("op1", varName.getId());	
						
				if (!Name.isIntT(varName.getType()) && !Name.isFloatT(varName.getType())) {
					putError(NOT_IMPL_ERROR, $tk.line, $tk.pos + 1, $tk.text, varName.getType());
					$value = new ExprValue($tk.line, $tk.pos + 1);
				} else {
					if (Name.isIntT(varName.getType())) {
						$value = new ExprValue(Name.INT_TYPE_ID, $tk.line, $tk.pos + 1, true, true);
					} else {
						$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1, true, true);
					}							
				}
			}
		}
	|	tk = ID { $code = getTemplate("func_call"); } 
				LPAREN ( eValp = logic_expr { 
			 				$primary_math_expr::args.add(eValp.value);
			 				$code.setAttribute("args", $eValp.code); 
			   			} ( ',' eValp = logic_expr {
							$primary_math_expr::args.add(eValp.value);
							$code.setAttribute("args", $eValp.code);
				 		  } )* 
				 	   )? 
				RPAREN {
					
		FuncName func = rootSpace.findFuncById(new FuncName($tk.text, -1).getId());
		
		if (func == null) {		
			putError(FUNC_UNDEF_ERROR, $tk.line, $tk.pos + 1, $tk.text);
			$value = new ExprValue(Name.UNDEF_TYPE_ID, $tk.line, $tk.pos + 1, false, true);
		} else if (func.isMain()) {
			$code.setAttribute("name", func.getId());
			
			putError(MAIN_FUNC_CALL_ERROR, $tk.line, $tk.pos + 1, $tk.text);
			$value = new ExprValue($tk.line, $tk.pos + 1);
		} else {
			$code.setAttribute("name", func.getId());
			$value = new ExprValue(func.getType(), $tk.line, $tk.pos + 1, false, true);
			
			if (!func.isCallCorrect($primary_math_expr::args)) {
				putError(FUNC_PARAMS_ERROR, $tk.line, $tk.pos + 1, $tk.text, func.args2String(), func.getType(), $primary_math_expr::args.toString());
			}
		}	
	}
	|	eVal = ID 
		(	tk = PLUS_PLUS		{ $code = getTemplate("primary_math_expr_plusplus"); }
        |	tk = MINUS_MINUS	{ $code = getTemplate("primary_math_expr_minusminus"); }
       	) {
  			Name varName = findVar(currentNamespace, $eVal.text);
			
			if (varName == null) {
				putError(UNDEF_ERROR, $eVal.line, $eVal.pos + 1, $eVal.text);
				$value = new ExprValue(Name.UNDEF_TYPE_ID, $tk.line, $tk.pos + 1, true, true);
			} else {		
				$code.setAttribute("op1", varName.getId());	
				
				if (!Name.isIntT(varName.getType()) && !Name.isFloatT(varName.getType())) {
					putError(NOT_IMPL_ERROR, $tk.line, $tk.pos + 1, $tk.text, varName.getType());
					$value = new ExprValue($tk.line, $tk.pos + 1);
				} else {
					if (Name.isIntT(varName.getType())) {
						$value = new ExprValue(Name.INT_TYPE_ID, $tk.line, $tk.pos + 1, true, true);
					} else {
						$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1, true, true);
					}							
				}
			}
       	}
	| 	tk = ID {
			$code = getTemplate("primary_math_expr_id");
			Name varName = findVar(currentNamespace, $tk.text);
				
			if (varName == null) {		
				putError(UNDEF_ERROR, $tk.line, $tk.pos + 1, $tk.text);
				$value = new ExprValue($tk.line, $tk.pos + 1);
			} else {
				$code.setAttribute("id", varName.getId());	
				$value = new ExprValue(varName.getType(), $tk.line, $tk.pos + 1, true, false);
			}
		}
	| 	eVal1 = literal			{ $value = $eVal1.value; $code = $eVal1.code; }
	| 	eVal2 = constants		{ $value = $eVal2.value; $code = $eVal2.code; }
	| 	eVal3 = math_lib_funcs	{ $value = $eVal3.value; $code = $eVal3.code; }
	;

constants returns [ ExprValue value, StringTemplate code ]
@init {
	$code = getTemplate("empty_template");
}
	: 	tk = 'CONST' '.' 
		( 	'pi'			{ 
				$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1); 
				$code = getTemplate("const_pi");
			}
		| 	'e'			 	{ 
				$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1);
				$code = getTemplate("const_e"); 
			}
		)
	|	tk = 'Float' '.'	
		(	'MAX_VALUE'			{ 
				$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1);
				$code = getTemplate("float_max"); 
			}
		|	'MIN_VALUE'			{ 
				$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1); 
				$code = getTemplate("float_min"); 
			}
		|	'NEGATIVE_INFINITY'	{ 
				$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1); 
				$code = getTemplate("float_ni"); 
			}
		|	'POSITIVE_INFINITY'	{ 
				$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1); 
				$code = getTemplate("float_pi");  
			}
		|	'NaN'				{ 
				$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1); 
				$code = getTemplate("float_nan"); 
			}
		)
	|	tk = 'Int' '.'
		(	'MAX_VALUE' 		{ 
				$value = new ExprValue(Name.INT_TYPE_ID, $tk.line, $tk.pos + 1); 
				$code = getTemplate("int_max"); 
			}
		|	'MIN_VALUE'			{ 
				$value = new ExprValue(Name.INT_TYPE_ID, $tk.line, $tk.pos + 1); 
				$code = getTemplate("int_min"); 
			}
		)
	;
	catch [ Exception ex ] { $value = new ExprValue($tk.line, $tk.pos + 1); }

math_lib_funcs returns [ ExprValue value, StringTemplate code ]
scope {
	List<ExprValue> args;
} 
@init {
	$math_lib_funcs::args = new ArrayList<ExprValue>(0);
	$code = getTemplate("empty_template");
}
	:	tk = 'sin' LPAREN eVal = logic_expr RPAREN { 
		$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1, false, true);
		$code = getTemplate("sin");
		$code.setAttribute("arg", $eVal.code);
		
		if (!$eVal.value.isInt() && !$eVal.value.isFloat()) {
			putError(FUNC_PARAMS_ERROR, $tk.line, $tk.pos + 1, $tk.text, Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, $eVal.value.getType());
		}
	}
	| 	tk = 'cos' LPAREN eVal = logic_expr RPAREN {
		$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1, false, true);
		$code = getTemplate("cos");
		$code.setAttribute("arg", $eVal.code);
				
		if (!$eVal.value.isInt() && !$eVal.value.isFloat()) { 
			putError(FUNC_PARAMS_ERROR, $tk.line, $tk.pos + 1, $tk.text, Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, $eVal.value.getType());
		}
	} 
	| 	tk = 'tan' LPAREN eVal = logic_expr RPAREN { 
		$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1, false, true);
		$code = getTemplate("tan");
		$code.setAttribute("arg", $eVal.code);
				
		if (!$eVal.value.isInt() && $eVal.value.isFloat()) {
			putError(FUNC_PARAMS_ERROR, $tk.line, $tk.pos + 1, $tk.text, Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, $eVal.value.getType());
		}	 
	}
	| 	tk = 'asin' LPAREN eVal = logic_expr RPAREN {
		$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1, false, true);
		$code = getTemplate("asin");
		$code.setAttribute("arg", $eVal.code);
				
		if (!$eVal.value.isInt() && !$eVal.value.isFloat()) { 
			putError(FUNC_PARAMS_ERROR, $tk.line, $tk.pos + 1, $tk.text, Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, $eVal.value.getType());
		}
	}
	| 	tk = 'acos' LPAREN eVal = logic_expr RPAREN { 
		$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1, false, true);
		$code = getTemplate("acos");
		$code.setAttribute("arg", $eVal.code);
				
		if (!$eVal.value.isInt() && !$eVal.value.isFloat()) { 
			putError(FUNC_PARAMS_ERROR, $tk.line, $tk.pos + 1, $tk.text, Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, $eVal.value.getType());
		}
	}
	| 	tk = 'atan' LPAREN eVal = logic_expr RPAREN { 
		$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1, false, true);
		$code = getTemplate("atan");
		$code.setAttribute("arg", $eVal.code);
				
		if (!$eVal.value.isInt() && !$eVal.value.isFloat()) {
			putError(FUNC_PARAMS_ERROR, $tk.line, $tk.pos + 1, $tk.text, Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, $eVal.value.getType());
		}
	}
	| 	tk = 'lg' LPAREN eVal = logic_expr RPAREN { 
		$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1, false, true);
		$code = getTemplate("lg");
		$code.setAttribute("arg", $eVal.code);
				
		if (!$eVal.value.isInt() && !$eVal.value.isFloat()) {		
			putError(FUNC_PARAMS_ERROR, $tk.line, $tk.pos + 1, $tk.text, Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, $eVal.value.getType());
		}
	}
	| 	tk = 'ln' LPAREN eVal = logic_expr RPAREN { 
		$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1, false, true);
		$code = getTemplate("ln");
		$code.setAttribute("arg", $eVal.code);
				
		if (!$eVal.value.isInt() && !$eVal.value.isFloat()) {		
			putError(FUNC_PARAMS_ERROR, $tk.line, $tk.pos + 1, $tk.text, Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, $eVal.value.getType());
		}
	}
	| 	tk = 'sqrt' LPAREN eVal = logic_expr RPAREN { 
		$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1, false, true);
		$code = getTemplate("sqrt");
		$code.setAttribute("arg", $eVal.code);
				
		if (!$eVal.value.isInt() && !$eVal.value.isFloat()) {		
			putError(FUNC_PARAMS_ERROR, $tk.line, $tk.pos + 1, $tk.text, Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, $eVal.value.getType());
		}	 
	}	
	| 	(	tk = MAX_TK 
		| 	tk = MIN_TK 
		) LPAREN eVal = logic_expr {
			if ($eVal.value.isInt()) {
				if ($tk.type == MAX_TK)
					$code = getTemplate("max_int");
				else
					$code = getTemplate("min_int");
			} else {
				if ($tk.type == MAX_TK)
					$code = getTemplate("max_float");
				else
					$code = getTemplate("min_float");
			}
					
			$math_lib_funcs::args.add($eVal.value);
			$code.setAttribute("args", $eVal.code);		
		} ( ',' eVal1 = logic_expr {
				$math_lib_funcs::args.add($eVal1.value);	
				$code.setAttribute("args", $eVal1.code);				
			})+ {
				boolean error = false;
				$value = new ExprValue(Name.UNDEF_TYPE_ID, $tk.line, $tk.pos + 1, false, true);
						
				if ($math_lib_funcs::args.size() > 1) {
					for (int i = 0; i < $math_lib_funcs::args.size() - 1; i++) {
						if (!$math_lib_funcs::args.get(i).isT($math_lib_funcs::args.get(i+1).getType())) {
							putError(FUNC_PARAMS_ERROR, $tk.line, $tk.pos + 1, $tk.text, "[any type, any type...]", "[any type]", $math_lib_funcs::args.toString());
							error = true;
							break;
						}
					}  	
				}
				
				if (!error) {
					$value = new ExprValue($math_lib_funcs::args.get(0).getType(), $tk.line, $tk.pos + 1, false, true);
				}	
			} RPAREN
	| 	tk = 'swaps' LPAREN eVal2 = ID ',' eVal3 = ID RPAREN {
			$code = getTemplate("swaps"); 
				
			$value = new ExprValue(Name.UNDEF_TYPE_ID, $tk.line, $tk.pos + 1, false, true);
			boolean error = false;
			
			Name varName2 = findVar(currentNamespace, $eVal2.text);		
			if (varName2 == null) {		
				error = true;
				putError(UNDEF_ERROR, $eVal2.line, $eVal2.pos + 1, $eVal2.text);
			}
			
			Name varName3 = findVar(currentNamespace, $eVal3.text);		
			if (varName3 == null) {		
				error = true;
				putError(UNDEF_ERROR, $eVal3.line, $eVal3.pos + 1, $eVal3.text);
			}
			
			if (!error) {
				$code.setAttribute("op1", varName2.getId());	
				$code.setAttribute("op2", varName3.getId());	
				
				if (!Name.isIntT($eVal2.text) && !Name.isFloatT($eVal2.text)) {
					putError(FUNC_PARAM_ERROR, $eVal2.line, $eVal2.pos, $tk.text);
				} else if (!$eVal3.text.equals(Name.INT_TYPE_ID) && !$eVal3.text.equals(Name.FLOAT_TYPE_ID)) {
					putError(FUNC_PARAM_ERROR, $eVal3.line, $eVal3.pos, $tk.text);
				}
			}	
		}
	|	tk = 'swapv' LPAREN eVal4 = ID ',' eVal5 = ID RPAREN {
			$value = new ExprValue(Name.UNDEF_TYPE_ID, $tk.line, $tk.pos + 1, false, true);
			boolean error = false;
			$code = getTemplate("swapv");	
			
			Name varName4 = findVar(currentNamespace, $eVal4.text);		
			if (varName4 == null) {		
				error = true;
				putError(UNDEF_ERROR, $eVal4.line, $eVal4.pos + 1, $eVal4.text);
			}
			
			Name varName5 = findVar(currentNamespace, $eVal5.text);		
			if (varName5 == null) {		
				error = true;
				putError(UNDEF_ERROR, $eVal5.line, $eVal5.pos + 1, $eVal5.text);
			}
			
			if (!error) {
				$code.setAttribute("arg1", varName4.getId());
				$code.setAttribute("arg2", varName5.getId());
				
				if (!Name.typeIsT(varName4.getType(), varName5.getType())) {
					putError(FUNC_PARAM_ERROR, $eVal4.line, $eVal4.pos + 1, $tk.text);
				}
			
				if (Name.isIntT(varName4.getType())) {
					$code.setAttribute("castType", getTemplate("cast_type_int"));
				} else if (Name.isFloatT(varName4.getType())) {
					$code.setAttribute("castType", getTemplate("cast_type_float"));
				} else if (Name.isStringT(varName4.getType())) {
					$code.setAttribute("castType", getTemplate("cast_type_str"));
				} else {
					$code.setAttribute("castType", getTemplate("cast_type_bool"));
				}	
			}
		} 
	| 	tk = 'log' LPAREN eVal6 = logic_expr ',' eVal7 = logic_expr RPAREN {
			$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1, false, true);
			$code = getTemplate("log");
			$code.setAttribute("arg1", $eVal6.code);	
			$code.setAttribute("arg2", $eVal7.code);
			
			if ((!$eVal6.value.isInt() && !$eVal6.value.isFloat()) ||
				(!$eVal7.value.isInt() && !$eVal7.value.isFloat()))
			{
				putError(FUNC_PARAMS_ERROR, $tk.line, $tk.pos + 1, $tk.text, "[any_type, any_type]", Name.FLOAT_TYPE_ID, "[" + $eVal6.value.getType() + ", " + $eVal7.value.getType() + "]");
			}
		}
	;

type returns [ String idType, int line, int pos, StringTemplate code ]
@init {
	$code = getTemplate("empty_template");
}
	: 	tk = 'Int'		{ 
			$idType = Name.INT_TYPE_ID; $line = $tk.line; $pos = $tk.pos; 
			$code = getTemplate("type_int");
		} 
	| 	tk = 'Float'	{ 
			$idType = Name.FLOAT_TYPE_ID; $line = $tk.line; $pos = $tk.pos; 
			$code = getTemplate("type_float");
		} 
	|	tk = 'String'	{ 
			$idType = Name.STRING_TYPE_ID; $line = $tk.line; $pos = $tk.pos;
			$code = getTemplate("type_string");
		} 
	| 	tk = 'Bool'		{ 
			$idType = Name.BOOL_TYPE_ID; $line = $tk.line; $pos = $tk.pos; 
			$code = getTemplate("type_bool");
		} 
	;

literal returns [ ExprValue value, StringTemplate code ]
@init {
	$code = getTemplate("literal");
}
	:   tk = DECIMAL_LITERAL	{ 
			$value = new ExprValue(Name.INT_TYPE_ID, $tk.line, $tk.pos + 1); 
			$code.setAttribute("lit", $DECIMAL_LITERAL.text);
		}
	|   tk = FLOATING_POINT_LITERAL	{ 
			$value = new ExprValue(Name.FLOAT_TYPE_ID, $tk.line, $tk.pos + 1); 
			$code.setAttribute("lit", $FLOATING_POINT_LITERAL.text);
		}
	|	tk = STRING_LITERAL			{ 
			$value = new ExprValue(Name.STRING_TYPE_ID, $tk.line, $tk.pos + 1); 
			$code.setAttribute("lit", $STRING_LITERAL.text);
		}
	|   tk = TRUE					{ 
			$value = new ExprValue(Name.BOOL_TYPE_ID, $tk.line, $tk.pos + 1); 
			$code.setAttribute("lit", true);
		}
	|	tk = FALSE					{ 
			$value = new ExprValue(Name.BOOL_TYPE_ID, $tk.line, $tk.pos + 1); 
			$code.setAttribute("lit", false);
		}
	; 

FALSE
	:	'false';

TRUE
	:	'true';	

DEF_TK
	:	'def';	
	
ENTRY_TK
	:	'entry';	
	
END_TK
	:	'end';	
	
IF_TK
	:	'if';	
	
ELSIF_TK
	:	'elsif';		

ELSE_TK
	:	'else';	

WHILE_TK
	:	'while';	
	
DO_TK
	:	'do';	
	
UNTIL_TK
	:	'until';
	
FOR_TK
	:	'for';	

IN_TK
	:	'in';

BREAK_TK
	:	'break';	
	
CONTINUE_TK
	:	'continue';	
	
RETURN_TK
	:	'return';
	
EXIT_TK
	:	'exit';	

PLUS
	:	'+';
	
PLUS_PLUS
	:	'++';
	
MINUS
	:	'-';	
	
MINUS_MINUS
	:	'--';	

TILDE 
	:	'~';
	
SCREAMER
	:	'!';	
	
STAR
	:	'*';	

STAR_STAR
	:	'**';
	
RSLASH
	:	'/';	
	
DIV
	:	'div';		

MOD
	:	'mod';	
	
GT
    :   '>';
  
GT_GT
    :   '>>';   
    
GT_GT_EQ
    :   '>>=';    
    
LT
    :   '<';
  
LT_LT
    :   '<<'; 
    
LT_LT_EQ
    :   '<<=';       
    
LT_EQ
    :   '<=';
  
GT_EQ
    :   '>=';       		

EQ
	:	'=';

EQ_EQ
	:	'==';

SCREAMER_EQ
	:	'!=';	
	
PLUS_EQ
	:	'+=';

MINUS_EQ
	:	'-=';
	
STAR_EQ
	:	'*=';		
	
RSLASH_EQ
	:	'/=';
	
BAR
	:	'|';
	
BAR_BAR
	:	'||';		
	
AMP
	:	'&';
	
AMP_AMP
	:	'&&';
	
CARET
    :   '^';
    
LPAREN
    :   '(';

RPAREN
    :   ')';

LBRACE
    :   '{';

RBRACE
    :   '}';

LBRACKET
    :   '[';

RBRACKET
    :   ']'; 
    
MAX_TK
	:	'max';
	
MIN_TK
	:	'min';	
	
READ_INT
	:	'readInt';
	
READ_FLOAT
	:	'readFloat';	
	
READ_STRING
	:	'readString';
	
READ_BOOL
	:	'readBool';	       			

ID  
	: 	( 'a'..'z' | 'A'..'Z' | '_' ) ( 'a'..'z' | 'A'..'Z' | '0'..'9' | '_' )*
	;

STRING_LITERAL 
	:	'"' ( ~( '"' | '\n' | '\r' ) )* '"'
	;

DECIMAL_LITERAL 
	:   '0' 
	| 	'1'..'9' ( '0'..'9' )*
	;
  
FLOATING_POINT_LITERAL
	:	('0' .. '9')+ '.' ('0' .. '9')* Exponent? 
    |	'.'	('0' .. '9')+ Exponent?  
   	|	('0' .. '9')+ 
	;

fragment
Exponent
	: 	( 'e' | 'E' ) ( '+' | '-' )? ('0'..'9')+ 
	;

COMMENT
	:	'#' ~( '\n' | '\r' )* '\r'? '\n' { $channel = HIDDEN; }
	| 	'#!' ( options { greedy = false; } : . )* '!#' { $channel = HIDDEN; }
	;

WHITESPACE
	: 	( ' ' | '\t' | '\r' | '\n' ) { $channel = HIDDEN; }
	;