// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g 2011-02-19 15:33:10

	package chalk;
	
	import java.io.*;
	import java.util.*;
	import java.lang.Math;
	import org.antlr.runtime.BitSet;
	import java.awt.Point;
	import chalk.FuncName.FuncArg;
	import org.antlr.stringtemplate.StringTemplate;
	import org.antlr.stringtemplate.StringTemplateGroup;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class ChalkParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "DEF_TK", "ENTRY_TK", "LPAREN", "RPAREN", "END_TK", "EQ", "STAR_EQ", "RSLASH_EQ", "PLUS_EQ", "MINUS_EQ", "GT_GT_EQ", "LT_LT_EQ", "IF_TK", "ELSIF_TK", "ELSE_TK", "WHILE_TK", "DO_TK", "UNTIL_TK", "FOR_TK", "IN_TK", "LBRACKET", "RBRACKET", "BREAK_TK", "CONTINUE_TK", "RETURN_TK", "BAR_BAR", "AMP_AMP", "GT", "LT", "LT_EQ", "GT_EQ", "EQ_EQ", "SCREAMER_EQ", "BAR", "CARET", "AMP", "LT_LT", "GT_GT", "PLUS", "MINUS", "STAR", "RSLASH", "MOD", "DIV", "TILDE", "SCREAMER", "STAR_STAR", "READ_INT", "READ_FLOAT", "READ_STRING", "READ_BOOL", "PLUS_PLUS", "MINUS_MINUS", "MAX_TK", "MIN_TK", "DECIMAL_LITERAL", "FLOATING_POINT_LITERAL", "STRING_LITERAL", "TRUE", "FALSE", "EXIT_TK", "LBRACE", "RBRACE", "Exponent", "COMMENT", "WHITESPACE", "','", "':'", "'print'", "'println'", "'CONST'", "'.'", "'pi'", "'e'", "'Float'", "'MAX_VALUE'", "'MIN_VALUE'", "'NEGATIVE_INFINITY'", "'POSITIVE_INFINITY'", "'NaN'", "'Int'", "'sin'", "'cos'", "'tan'", "'asin'", "'acos'", "'atan'", "'lg'", "'ln'", "'sqrt'", "'swaps'", "'swapv'", "'log'", "'String'", "'Bool'"
    };
    public static final int LT=33;
    public static final int STAR=45;
    public static final int MOD=47;
    public static final int EXIT_TK=65;
    public static final int CONTINUE_TK=28;
    public static final int EOF=-1;
    public static final int LT_LT_EQ=16;
    public static final int T__93=93;
    public static final int LBRACKET=25;
    public static final int T__94=94;
    public static final int RPAREN=8;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int STRING_LITERAL=62;
    public static final int T__90=90;
    public static final int PLUS_PLUS=56;
    public static final int FLOATING_POINT_LITERAL=61;
    public static final int CARET=39;
    public static final int EQ=10;
    public static final int COMMENT=69;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int LT_LT=41;
    public static final int T__96=96;
    public static final int DEF_TK=5;
    public static final int T__95=95;
    public static final int SCREAMER_EQ=37;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RBRACE=67;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int ELSE_TK=19;
    public static final int WHITESPACE=70;
    public static final int T__85=85;
    public static final int PLUS_EQ=13;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int MIN_TK=59;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int MINUS_EQ=14;
    public static final int READ_STRING=54;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int READ_FLOAT=53;
    public static final int GT=32;
    public static final int READ_BOOL=55;
    public static final int LT_EQ=34;
    public static final int READ_INT=52;
    public static final int ENTRY_TK=6;
    public static final int DO_TK=21;
    public static final int T__76=76;
    public static final int FALSE=64;
    public static final int T__75=75;
    public static final int STAR_STAR=51;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int DECIMAL_LITERAL=60;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int RSLASH=46;
    public static final int AMP_AMP=31;
    public static final int RETURN_TK=29;
    public static final int BAR_BAR=30;
    public static final int AMP=40;
    public static final int LBRACE=66;
    public static final int Exponent=68;
    public static final int ID=4;
    public static final int LPAREN=7;
    public static final int TILDE=49;
    public static final int MAX_TK=58;
    public static final int PLUS=43;
    public static final int GT_GT_EQ=15;
    public static final int RBRACKET=26;
    public static final int GT_EQ=35;
    public static final int UNTIL_TK=22;
    public static final int IF_TK=17;
    public static final int FOR_TK=23;
    public static final int END_TK=9;
    public static final int STAR_EQ=11;
    public static final int MINUS=44;
    public static final int TRUE=63;
    public static final int ELSIF_TK=18;
    public static final int BREAK_TK=27;
    public static final int RSLASH_EQ=12;
    public static final int WHILE_TK=20;
    public static final int IN_TK=24;
    public static final int SCREAMER=50;
    public static final int DIV=48;
    public static final int BAR=38;
    public static final int EQ_EQ=36;
    public static final int MINUS_MINUS=57;
    public static final int GT_GT=42;

    // delegates
    // delegators


        public ChalkParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ChalkParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[133+1];
             
             
        }
        

    public String[] getTokenNames() { return ChalkParser.tokenNames; }
    public String getGrammarFileName() { return "/home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g"; }

    	
    	private final String VAR_DECLAR = "Var [%s :: %s :: %s] was been declared!";
    	private final String VAR_NAME = "Var [%s :: %s :: %s] was been declared!";
    	private final String DUPLICATE_ERROR = "error(%d:%d): Duplicate variable \"%s\" declaration;";
    	private final String TYPE_ERROR = "error(%d:%d): Type mismatch: cannot convert from %s to %s;";
    	private final String FUNC_PARAM_ERROR = "error(%d:%d): Wrong function \"%s\" parameters;";
    	private final String INCTBL_TYPE_ERROR = "error(%d:%d): Incompatible types \"%s\" and \"%s\";";
    	private final String NOT_IMPL_ERROR = "error(%d:%d): Operation \"%s\" not implemented for this type \"%s\";";
    	private final String NOT_IMPLS_ERROR = "error(%d:%d): Operation \"%s\" not implemented for this types \"%s\" and \"%s\";";
    	private final String UNDEF_ERROR = "error(%d:%d): Variable \"%s\" is undefined;";
    	private final String FUNC_UNDEF_ERROR = "error(%d:%d): Function \"%s\" is undefined;";
    	private final String DUPLICATE_FUNC_ERROR = "error(%d:%d): Multiplay function \"%s\" definition;";
    	private final String ENTRY_FUNC_ERROR = "error(%d:%d): More then one entry function \"%s\" definition;";
    	private final String DUPLICATE_PARAM_ERROR = "error(%d:%d): Duplicate function parameter \"%s\";";
    	private final String FUNC_PARAMS_ERROR = "error(%d:%d): The function %s(%s) in the type %s is not applicable for the arguments %s;";
    	private final String NO_MAIN_FUNC_ERROR = "error: The main function is undefined;";
    	private final String ARG_NOT_IMPL_ERROR = "error(%d:%d): Operation \"%s\" not implemented for this argument;";
    	private final String MAIN_FUNC_PARAMS_ERROR = "error(%d:%d): The main \"%s\" function doesn't have any parameters and doesn't return any value;";
    	private final String MAIN_FUNC_CALL_ERROR = "error(%d:%d): You can't call the main \"%s\" function yourself anywhere;";
    	private final String ASSIGMENT_STMT_ERROR = "error(%d:%d): Assigment operator expected;";
    	private final String SYNTAX_ERROR = "error(%d): There is a syntax error were occured at the token \"%s\";";
    	
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



    // $ANTLR start "compiled_unit"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:106:1: compiled_unit[String programName, Namespace space] returns [ StringTemplate code = getTemplate(\"compiled_unit\") ] : (t= var_declaration[space, getTemplate(\"global_var_declaration\")] | t= func_definition[space] )+ ;
    public final StringTemplate compiled_unit(String programName, Namespace space) throws RecognitionException {
        StringTemplate code =  getTemplate("compiled_unit");
        int compiled_unit_StartIndex = input.index();
        StringTemplate t = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return code; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:107:2: ( (t= var_declaration[space, getTemplate(\"global_var_declaration\")] | t= func_definition[space] )+ )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:107:4: (t= var_declaration[space, getTemplate(\"global_var_declaration\")] | t= func_definition[space] )+
            {
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:107:4: (t= var_declaration[space, getTemplate(\"global_var_declaration\")] | t= func_definition[space] )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==79||LA1_0==85||(LA1_0>=98 && LA1_0<=99)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==DEF_TK) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:107:6: t= var_declaration[space, getTemplate(\"global_var_declaration\")]
            	    {
            	    pushFollow(FOLLOW_var_declaration_in_compiled_unit67);
            	    t=var_declaration(space, getTemplate("global_var_declaration"));

            	    state._fsp--;
            	    if (state.failed) return code;
            	    if ( state.backtracking==0 ) {
            	       code.setAttribute("globalVars", t); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:108:5: t= func_definition[space]
            	    {
            	    pushFollow(FOLLOW_func_definition_in_compiled_unit80);
            	    t=func_definition(space);

            	    state._fsp--;
            	    if (state.failed) return code;
            	    if ( state.backtracking==0 ) {
            	       code.setAttribute("functions", t); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return code;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( state.backtracking==0 ) {

              			if (!rootSpace.mainExist())
              				putError(NO_MAIN_FUNC_ERROR);
              				
              			code.setAttribute("programName", programName);		
              		
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, compiled_unit_StartIndex); }
        }
        return code;
    }
    // $ANTLR end "compiled_unit"

    protected static class var_declaration_scope {
        String varType;
    }
    protected Stack var_declaration_stack = new Stack();


    // $ANTLR start "var_declaration"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:117:1: var_declaration[Namespace space, StringTemplate code_in] returns [ StringTemplate code ] : type t= var_declarator[space] ( ',' t= var_declarator[space] )* ;
    public final StringTemplate var_declaration(Namespace space, StringTemplate code_in) throws RecognitionException {
        var_declaration_stack.push(new var_declaration_scope());
        StringTemplate code = null;
        int var_declaration_StartIndex = input.index();
        StringTemplate t = null;

        ChalkParser.type_return type1 = null;



        	code = code_in;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return code; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:124:2: ( type t= var_declarator[space] ( ',' t= var_declarator[space] )* )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:124:4: type t= var_declarator[space] ( ',' t= var_declarator[space] )*
            {
            pushFollow(FOLLOW_type_in_var_declaration119);
            type1=type();

            state._fsp--;
            if (state.failed) return code;
            if ( state.backtracking==0 ) {
               ((var_declaration_scope)var_declaration_stack.peek()).varType = (type1!=null?type1.idType:null); 
            }
            pushFollow(FOLLOW_var_declarator_in_var_declaration131);
            t=var_declarator(space);

            state._fsp--;
            if (state.failed) return code;
            if ( state.backtracking==0 ) {

              				code.setAttribute("declarators", t);
              			
            }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:127:6: ( ',' t= var_declarator[space] )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==71) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:127:8: ',' t= var_declarator[space]
            	    {
            	    match(input,71,FOLLOW_71_in_var_declaration138); if (state.failed) return code;
            	    pushFollow(FOLLOW_var_declarator_in_var_declaration144);
            	    t=var_declarator(space);

            	    state._fsp--;
            	    if (state.failed) return code;
            	    if ( state.backtracking==0 ) {

            	      				code.setAttribute("declarators", t);
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			code.setAttribute("type", (type1!=null?type1.code:null));
              		
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, var_declaration_StartIndex); }
            var_declaration_stack.pop();
        }
        return code;
    }
    // $ANTLR end "var_declaration"


    // $ANTLR start "var_declarator"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:134:1: var_declarator[Namespace space] returns [ StringTemplate code ] : ID ( '=' eVal= logic_expr )? ;
    public final StringTemplate var_declarator(Namespace space) throws RecognitionException {
        StringTemplate code = null;
        int var_declarator_StartIndex = input.index();
        Token ID2=null;
        ChalkParser.logic_expr_return eVal = null;



        	currentNamespace = space;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return code; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:138:2: ( ID ( '=' eVal= logic_expr )? )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:138:5: ID ( '=' eVal= logic_expr )?
            {
            ID2=(Token)match(input,ID,FOLLOW_ID_in_var_declarator174); if (state.failed) return code;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:138:8: ( '=' eVal= logic_expr )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EQ) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:138:10: '=' eVal= logic_expr
                    {
                    match(input,EQ,FOLLOW_EQ_in_var_declarator178); if (state.failed) return code;
                    pushFollow(FOLLOW_logic_expr_in_var_declarator184);
                    eVal=logic_expr();

                    state._fsp--;
                    if (state.failed) return code;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
              			boolean error = false;
              			Name varName = findVar(space, (ID2!=null?ID2.getText():null), true);
              			if (varName != null) {
              				putError(DUPLICATE_ERROR, (ID2!=null?ID2.getLine():0), (ID2!=null?ID2.getCharPositionInLine():0) + 1, (ID2!=null?ID2.getText():null));
              				error = true;
              			} 
              			if ((eVal!=null?eVal.value:null) != null && !((var_declaration_scope)var_declaration_stack.peek()).varType.equals((eVal!=null?eVal.value:null).getType())) { 
              				putError(TYPE_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (eVal!=null?eVal.value:null).getType(), ((var_declaration_scope)var_declaration_stack.peek()).varType);
              			} 
              			if (!error) {
              				Name name = new Name((ID2!=null?ID2.getText():null), ((var_declaration_scope)var_declaration_stack.peek()).varType, (ID2!=null?ID2.getLine():0));	
              				space.addName(name);
              				
              				if ((eVal!=null?eVal.code:null) != null) {
              					code = getTemplate("assg_var_declarator");
              					code.setAttribute("id", name.getId());
              					code.setAttribute("value", (eVal!=null?eVal.code:null));	
              				}
              				else {
              					code = getTemplate("var_declarator");
              					code.setAttribute("id", name.getId());	
              					
              					if (Name.isIntT(((var_declaration_scope)var_declaration_stack.peek()).varType)) {
              						code.setAttribute("init", 0);
              					} else if (Name.isFloatT(((var_declaration_scope)var_declaration_stack.peek()).varType)) {
              						code.setAttribute("init", 0.0);
              					} else if (Name.isStringT(((var_declaration_scope)var_declaration_stack.peek()).varType)) {
              						code.setAttribute("init", "");
              					} else {
              						code.setAttribute("init", false);
              					}
              				}
              			}
              		
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, var_declarator_StartIndex); }
        }
        return code;
    }
    // $ANTLR end "var_declarator"

    protected static class func_definition_scope {
        Namespace tmpNamespace;
    }
    protected Stack func_definition_stack = new Stack();


    // $ANTLR start "func_definition"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:175:1: func_definition[Namespace space] returns [ StringTemplate code ] : tk1= DEF_TK (tk2= ENTRY_TK )? ID LPAREN (eVal= var_args_list )? RPAREN ( ':' t= type )? '=' t2= stmt_block[ $func_definition::tmpNamespace ] ;
    public final StringTemplate func_definition(Namespace space) throws RecognitionException {
        func_definition_stack.push(new func_definition_scope());
        StringTemplate code = null;
        int func_definition_StartIndex = input.index();
        Token tk1=null;
        Token tk2=null;
        Token ID3=null;
        ChalkParser.var_args_list_return eVal = null;

        ChalkParser.type_return t = null;

        StringTemplate t2 = null;



        	code = getTemplate("empty_template");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return code; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:182:2: (tk1= DEF_TK (tk2= ENTRY_TK )? ID LPAREN (eVal= var_args_list )? RPAREN ( ':' t= type )? '=' t2= stmt_block[ $func_definition::tmpNamespace ] )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:182:5: tk1= DEF_TK (tk2= ENTRY_TK )? ID LPAREN (eVal= var_args_list )? RPAREN ( ':' t= type )? '=' t2= stmt_block[ $func_definition::tmpNamespace ]
            {
            tk1=(Token)match(input,DEF_TK,FOLLOW_DEF_TK_in_func_definition219); if (state.failed) return code;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:182:18: (tk2= ENTRY_TK )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ENTRY_TK) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:182:20: tk2= ENTRY_TK
                    {
                    tk2=(Token)match(input,ENTRY_TK,FOLLOW_ENTRY_TK_in_func_definition227); if (state.failed) return code;

                    }
                    break;

            }

            ID3=(Token)match(input,ID,FOLLOW_ID_in_func_definition232); if (state.failed) return code;
            match(input,LPAREN,FOLLOW_LPAREN_in_func_definition237); if (state.failed) return code;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:183:10: (eVal= var_args_list )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==79||LA5_0==85||(LA5_0>=98 && LA5_0<=99)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:183:12: eVal= var_args_list
                    {
                    pushFollow(FOLLOW_var_args_list_in_func_definition245);
                    eVal=var_args_list();

                    state._fsp--;
                    if (state.failed) return code;

                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_func_definition251); if (state.failed) return code;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:183:44: ( ':' t= type )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==72) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:183:46: ':' t= type
                    {
                    match(input,72,FOLLOW_72_in_func_definition255); if (state.failed) return code;
                    pushFollow(FOLLOW_type_in_func_definition261);
                    t=type();

                    state._fsp--;
                    if (state.failed) return code;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			boolean error = false;
              			FuncName func = new FuncName((ID3!=null?ID3.getText():null), (tk1!=null?tk1.getLine():0));
              			
              			if (tk2 != null) {
              				func.setMain(true);
              				code = getTemplate("main_func_definition");
              			}
              			else {
              				code = getTemplate("func_definition");
              				code.setAttribute("name", func.getId());
              			}	
              				
              			if (rootSpace.findFunc(func) != null) {
              				error = true;
              				if (func.isMain())
              					putError(ENTRY_FUNC_ERROR, (ID3!=null?ID3.getLine():0), (ID3!=null?ID3.getCharPositionInLine():0) + 1, (ID3!=null?ID3.getText():null));
              				else 
              					putError(DUPLICATE_FUNC_ERROR, (ID3!=null?ID3.getLine():0), (ID3!=null?ID3.getCharPositionInLine():0) + 1, (ID3!=null?ID3.getText():null));
              			}
              			
              			if ((eVal!=null?eVal.argsList:null) != null && (eVal!=null?eVal.argsList:null).size() != 0) {
              				func.setArgs((eVal!=null?eVal.argsList:null));
              				
              				if (func.isMain())
              					putError(MAIN_FUNC_PARAMS_ERROR, (ID3!=null?ID3.getLine():0), (ID3!=null?ID3.getCharPositionInLine():0) + 1, (ID3!=null?ID3.getText():null));
              				else
              					code.setAttribute("args", (eVal!=null?eVal.code:null));	
              			}	
              				
              			if ((t!=null?t.idType:null) != null) {
              				func.setType((t!=null?t.idType:null));
              				
              				if (func.isMain()) 
              					putError(MAIN_FUNC_PARAMS_ERROR, (ID3!=null?ID3.getLine():0), (ID3!=null?ID3.getCharPositionInLine():0) + 1, (ID3!=null?ID3.getText():null));
              				else 
              					code.setAttribute("type", (t!=null?t.code:null));		
              			} else if (!func.isMain()) {
              				code.setAttribute("type", getTemplate("type_void"));
              			}
              			
              			if ((eVal!=null?eVal.argErrors:null) != null)
              				 errors.addAll((eVal!=null?eVal.argErrors:null));
              				 
              			((func_definition_scope)func_definition_stack.peek()).tmpNamespace = new Namespace(space, func.getId(), func);
              			space.addSpace(((func_definition_scope)func_definition_stack.peek()).tmpNamespace);
              			
              		
            }
            match(input,EQ,FOLLOW_EQ_in_func_definition268); if (state.failed) return code;
            pushFollow(FOLLOW_stmt_block_in_func_definition274);
            t2=stmt_block(((func_definition_scope)func_definition_stack.peek()).tmpNamespace);

            state._fsp--;
            if (state.failed) return code;
            if ( state.backtracking==0 ) {
               code.setAttribute("stmts", t2); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, func_definition_StartIndex); }
            func_definition_stack.pop();
        }
        return code;
    }
    // $ANTLR end "func_definition"

    public static class var_args_list_return extends ParserRuleReturnScope {
        public ArrayList<FuncArg> argsList;
        public ArrayList<String> argErrors;
        public StringTemplate code;
    };

    // $ANTLR start "var_args_list"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:233:1: var_args_list returns [ ArrayList<FuncArg> argsList, ArrayList<String> argErrors, StringTemplate code ] : t= type id= ID ( ',' t= type id= ID )* ;
    public final ChalkParser.var_args_list_return var_args_list() throws RecognitionException {
        ChalkParser.var_args_list_return retval = new ChalkParser.var_args_list_return();
        retval.start = input.LT(1);
        int var_args_list_StartIndex = input.index();
        Token id=null;
        ChalkParser.type_return t = null;



        	retval.argsList = new ArrayList<FuncArg>();
        	retval.argErrors = new ArrayList<String>();
        	retval.code = getTemplate("var_args_list");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:239:2: (t= type id= ID ( ',' t= type id= ID )* )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:239:5: t= type id= ID ( ',' t= type id= ID )*
            {
            pushFollow(FOLLOW_type_in_var_args_list302);
            t=type();

            state._fsp--;
            if (state.failed) return retval;
            id=(Token)match(input,ID,FOLLOW_ID_in_var_args_list308); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              			FuncArg arg = new FuncArg((id!=null?id.getText():null), (t!=null?t.idType:null));
              			retval.argsList.add(arg);
              			
              			StringTemplate argCode = getTemplate("var_arg");
              			argCode.setAttribute("type", (t!=null?t.code:null));	
              			argCode.setAttribute("id", arg.getId());
              				
              			retval.code.setAttribute("args", argCode);	
              		
            }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:248:5: ( ',' t= type id= ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==71) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:248:7: ',' t= type id= ID
            	    {
            	    match(input,71,FOLLOW_71_in_var_args_list314); if (state.failed) return retval;
            	    pushFollow(FOLLOW_type_in_var_args_list320);
            	    t=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    id=(Token)match(input,ID,FOLLOW_ID_in_var_args_list326); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      					
            	      			FuncArg arg = new FuncArg((id!=null?id.getText():null), (t!=null?t.idType:null));
            	      			if (retval.argsList.contains(arg)) {
            	      				retval.argErrors.add(String.format(DUPLICATE_PARAM_ERROR, (id!=null?id.getLine():0), (id!=null?id.getCharPositionInLine():0) + 1, (id!=null?id.getText():null)));
            	      			}
            	      			
            	      			StringTemplate argCode = getTemplate("var_arg");
            	      			argCode.setAttribute("type", (t!=null?t.code:null));	
            	      			argCode.setAttribute("id", arg.getId());
            	      				
            	      			retval.code.setAttribute("args", argCode);
            	      			
            	      			retval.argsList.add(arg);
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, var_args_list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "var_args_list"


    // $ANTLR start "stmt_block"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:264:1: stmt_block[Namespace space ] returns [ StringTemplate code ] : (t= stmt[space] )* END_TK ;
    public final StringTemplate stmt_block(Namespace space) throws RecognitionException {
        StringTemplate code = null;
        int stmt_block_StartIndex = input.index();
        StringTemplate t = null;



        	code = getTemplate("stmt_list");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return code; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:268:2: ( (t= stmt[space] )* END_TK )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:268:5: (t= stmt[space] )* END_TK
            {
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:268:5: (t= stmt[space] )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID||LA8_0==LPAREN||LA8_0==IF_TK||(LA8_0>=WHILE_TK && LA8_0<=DO_TK)||LA8_0==FOR_TK||(LA8_0>=BREAK_TK && LA8_0<=RETURN_TK)||(LA8_0>=PLUS && LA8_0<=MINUS)||(LA8_0>=TILDE && LA8_0<=SCREAMER)||(LA8_0>=READ_INT && LA8_0<=FALSE)||(LA8_0>=73 && LA8_0<=75)||LA8_0==79||(LA8_0>=85 && LA8_0<=99)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:268:7: t= stmt[space]
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmt_block359);
            	    t=stmt(space);

            	    state._fsp--;
            	    if (state.failed) return code;
            	    if ( state.backtracking==0 ) {
            	       code.setAttribute("stmts", t); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,END_TK,FOLLOW_END_TK_in_stmt_block367); if (state.failed) return code;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, stmt_block_StartIndex); }
        }
        return code;
    }
    // $ANTLR end "stmt_block"


    // $ANTLR start "stmt"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:271:1: stmt[Namespace space] returns [ StringTemplate code ] : (t= print_stmt[space] | t= var_declaration[space, getTemplate(\"var_declaration\")] | t= assigment_stmt[space] | t= selection_stmt[space] | t= iteration_stmt[space] | t= jump_stmt[space] );
    public final StringTemplate stmt(Namespace space) throws RecognitionException {
        StringTemplate code = null;
        int stmt_StartIndex = input.index();
        StringTemplate t = null;



        	code = getTemplate("empty_template");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return code; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:275:2: (t= print_stmt[space] | t= var_declaration[space, getTemplate(\"var_declaration\")] | t= assigment_stmt[space] | t= selection_stmt[space] | t= iteration_stmt[space] | t= jump_stmt[space] )
            int alt9=6;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:275:5: t= print_stmt[space]
                    {
                    pushFollow(FOLLOW_print_stmt_in_stmt395);
                    t=print_stmt(space);

                    state._fsp--;
                    if (state.failed) return code;
                    if ( state.backtracking==0 ) {
                       code = t; 
                    }

                    }
                    break;
                case 2 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:276:5: t= var_declaration[space, getTemplate(\"var_declaration\")]
                    {
                    pushFollow(FOLLOW_var_declaration_in_stmt409);
                    t=var_declaration(space, getTemplate("var_declaration"));

                    state._fsp--;
                    if (state.failed) return code;
                    if ( state.backtracking==0 ) {
                       code = t; 
                    }

                    }
                    break;
                case 3 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:277:5: t= assigment_stmt[space]
                    {
                    pushFollow(FOLLOW_assigment_stmt_in_stmt422);
                    t=assigment_stmt(space);

                    state._fsp--;
                    if (state.failed) return code;
                    if ( state.backtracking==0 ) {
                       code = t; 
                    }

                    }
                    break;
                case 4 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:278:5: t= selection_stmt[space]
                    {
                    pushFollow(FOLLOW_selection_stmt_in_stmt435);
                    t=selection_stmt(space);

                    state._fsp--;
                    if (state.failed) return code;
                    if ( state.backtracking==0 ) {
                       code = t; 
                    }

                    }
                    break;
                case 5 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:279:5: t= iteration_stmt[space]
                    {
                    pushFollow(FOLLOW_iteration_stmt_in_stmt448);
                    t=iteration_stmt(space);

                    state._fsp--;
                    if (state.failed) return code;
                    if ( state.backtracking==0 ) {
                       code = t; 
                    }

                    }
                    break;
                case 6 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:280:5: t= jump_stmt[space]
                    {
                    pushFollow(FOLLOW_jump_stmt_in_stmt461);
                    t=jump_stmt(space);

                    state._fsp--;
                    if (state.failed) return code;
                    if ( state.backtracking==0 ) {
                       code = t; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, stmt_StartIndex); }
        }
        return code;
    }
    // $ANTLR end "stmt"


    // $ANTLR start "print_stmt"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:283:1: print_stmt[Namespace space] returns [ StringTemplate code ] : ( 'print' t= logic_expr ( ',' t= logic_expr )* | 'println' (t= logic_expr ( ',' t= logic_expr )* )? );
    public final StringTemplate print_stmt(Namespace space) throws RecognitionException {
        StringTemplate code = null;
        int print_stmt_StartIndex = input.index();
        ChalkParser.logic_expr_return t = null;



        	currentNamespace = space;
        	code = getTemplate("empty_template");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return code; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:288:2: ( 'print' t= logic_expr ( ',' t= logic_expr )* | 'println' (t= logic_expr ( ',' t= logic_expr )* )? )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==73) ) {
                alt13=1;
            }
            else if ( (LA13_0==74) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return code;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:288:5: 'print' t= logic_expr ( ',' t= logic_expr )*
                    {
                    match(input,73,FOLLOW_73_in_print_stmt489); if (state.failed) return code;
                    if ( state.backtracking==0 ) {
                       code = getTemplate("print_stmt"); 
                    }
                    pushFollow(FOLLOW_logic_expr_in_print_stmt497);
                    t=logic_expr();

                    state._fsp--;
                    if (state.failed) return code;
                    if ( state.backtracking==0 ) {
                       code.setAttribute("args", (t!=null?t.code:null)); 
                    }
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:289:4: ( ',' t= logic_expr )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==71) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:289:6: ',' t= logic_expr
                    	    {
                    	    match(input,71,FOLLOW_71_in_print_stmt506); if (state.failed) return code;
                    	    pushFollow(FOLLOW_logic_expr_in_print_stmt512);
                    	    t=logic_expr();

                    	    state._fsp--;
                    	    if (state.failed) return code;
                    	    if ( state.backtracking==0 ) {
                    	       code.setAttribute("args", (t!=null?t.code:null)); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:290:4: 'println' (t= logic_expr ( ',' t= logic_expr )* )?
                    {
                    match(input,74,FOLLOW_74_in_print_stmt522); if (state.failed) return code;
                    if ( state.backtracking==0 ) {
                       code = getTemplate("println_stmt"); 
                    }
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:290:55: (t= logic_expr ( ',' t= logic_expr )* )?
                    int alt12=2;
                    alt12 = dfa12.predict(input);
                    switch (alt12) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:290:57: t= logic_expr ( ',' t= logic_expr )*
                            {
                            pushFollow(FOLLOW_logic_expr_in_print_stmt532);
                            t=logic_expr();

                            state._fsp--;
                            if (state.failed) return code;
                            if ( state.backtracking==0 ) {
                               code.setAttribute("args", (t!=null?t.code:null)); 
                            }
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:291:4: ( ',' t= logic_expr )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==71) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:291:6: ',' t= logic_expr
                            	    {
                            	    match(input,71,FOLLOW_71_in_print_stmt541); if (state.failed) return code;
                            	    pushFollow(FOLLOW_logic_expr_in_print_stmt547);
                            	    t=logic_expr();

                            	    state._fsp--;
                            	    if (state.failed) return code;
                            	    if ( state.backtracking==0 ) {
                            	       code.setAttribute("args", (t!=null?t.code:null)); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop11;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, print_stmt_StartIndex); }
        }
        return code;
    }
    // $ANTLR end "print_stmt"


    // $ANTLR start "assigment_stmt"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:295:1: assigment_stmt[Namespace space] returns [ StringTemplate code ] : (id= ID (tk= EQ | tk= STAR_EQ | tk= RSLASH_EQ | tk= PLUS_EQ | tk= MINUS_EQ | tk= GT_GT_EQ | tk= LT_LT_EQ ) )? eVal= logic_expr ;
    public final StringTemplate assigment_stmt(Namespace space) throws RecognitionException {
        StringTemplate code = null;
        int assigment_stmt_StartIndex = input.index();
        Token id=null;
        Token tk=null;
        ChalkParser.logic_expr_return eVal = null;



        	currentNamespace = space;
        	code = getTemplate("assigment_stmt");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return code; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:300:2: ( (id= ID (tk= EQ | tk= STAR_EQ | tk= RSLASH_EQ | tk= PLUS_EQ | tk= MINUS_EQ | tk= GT_GT_EQ | tk= LT_LT_EQ ) )? eVal= logic_expr )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:300:5: (id= ID (tk= EQ | tk= STAR_EQ | tk= RSLASH_EQ | tk= PLUS_EQ | tk= MINUS_EQ | tk= GT_GT_EQ | tk= LT_LT_EQ ) )? eVal= logic_expr
            {
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:300:5: (id= ID (tk= EQ | tk= STAR_EQ | tk= RSLASH_EQ | tk= PLUS_EQ | tk= MINUS_EQ | tk= GT_GT_EQ | tk= LT_LT_EQ ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                int LA15_1 = input.LA(2);

                if ( ((LA15_1>=EQ && LA15_1<=LT_LT_EQ)) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:300:7: id= ID (tk= EQ | tk= STAR_EQ | tk= RSLASH_EQ | tk= PLUS_EQ | tk= MINUS_EQ | tk= GT_GT_EQ | tk= LT_LT_EQ )
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_assigment_stmt592); if (state.failed) return code;
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:301:4: (tk= EQ | tk= STAR_EQ | tk= RSLASH_EQ | tk= PLUS_EQ | tk= MINUS_EQ | tk= GT_GT_EQ | tk= LT_LT_EQ )
                    int alt14=7;
                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt14=1;
                        }
                        break;
                    case STAR_EQ:
                        {
                        alt14=2;
                        }
                        break;
                    case RSLASH_EQ:
                        {
                        alt14=3;
                        }
                        break;
                    case PLUS_EQ:
                        {
                        alt14=4;
                        }
                        break;
                    case MINUS_EQ:
                        {
                        alt14=5;
                        }
                        break;
                    case GT_GT_EQ:
                        {
                        alt14=6;
                        }
                        break;
                    case LT_LT_EQ:
                        {
                        alt14=7;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return code;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:301:7: tk= EQ
                            {
                            tk=(Token)match(input,EQ,FOLLOW_EQ_in_assigment_stmt606); if (state.failed) return code;
                            if ( state.backtracking==0 ) {
                               code = getTemplate("assigment_stmt_eq"); 
                            }

                            }
                            break;
                        case 2 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:302:7: tk= STAR_EQ
                            {
                            tk=(Token)match(input,STAR_EQ,FOLLOW_STAR_EQ_in_assigment_stmt622); if (state.failed) return code;
                            if ( state.backtracking==0 ) {
                               code = getTemplate("assigment_stmt_stareq"); 
                            }

                            }
                            break;
                        case 3 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:303:8: tk= RSLASH_EQ
                            {
                            tk=(Token)match(input,RSLASH_EQ,FOLLOW_RSLASH_EQ_in_assigment_stmt637); if (state.failed) return code;
                            if ( state.backtracking==0 ) {
                               code = getTemplate("assigment_stmt_slasheq"); 
                            }

                            }
                            break;
                        case 4 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:304:8: tk= PLUS_EQ
                            {
                            tk=(Token)match(input,PLUS_EQ,FOLLOW_PLUS_EQ_in_assigment_stmt652); if (state.failed) return code;
                            if ( state.backtracking==0 ) {
                               code = getTemplate("assigment_stmt_pluseq"); 
                            }

                            }
                            break;
                        case 5 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:305:8: tk= MINUS_EQ
                            {
                            tk=(Token)match(input,MINUS_EQ,FOLLOW_MINUS_EQ_in_assigment_stmt667); if (state.failed) return code;
                            if ( state.backtracking==0 ) {
                               code = getTemplate("assigment_stmt_minuseq"); 
                            }

                            }
                            break;
                        case 6 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:306:7: tk= GT_GT_EQ
                            {
                            tk=(Token)match(input,GT_GT_EQ,FOLLOW_GT_GT_EQ_in_assigment_stmt681); if (state.failed) return code;
                            if ( state.backtracking==0 ) {
                               code = getTemplate("assigment_stmt_gtgteq"); 
                            }

                            }
                            break;
                        case 7 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:307:7: tk= LT_LT_EQ
                            {
                            tk=(Token)match(input,LT_LT_EQ,FOLLOW_LT_LT_EQ_in_assigment_stmt695); if (state.failed) return code;
                            if ( state.backtracking==0 ) {
                               code = getTemplate("assigment_stmt_ltlteq"); 
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_logic_expr_in_assigment_stmt714);
            eVal=logic_expr();

            state._fsp--;
            if (state.failed) return code;
            if ( state.backtracking==0 ) {

              			if (id != null) {
              				Name varName = findVar(space, (id!=null?id.getText():null));
              				
              				if (varName == null) {
              					putError(UNDEF_ERROR, (id!=null?id.getLine():0), (id!=null?id.getCharPositionInLine():0) + 1, (id!=null?id.getText():null));
              				} else {		
              					if (Name.isStringT(varName.getType()) && (tk!=null?tk.getType():0) != EQ && (eVal!=null?eVal.value:null).isString()) {
              						putError(NOT_IMPLS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), varName.getType(), (eVal!=null?eVal.value:null).getType());
              					} else {
              						switch ((tk!=null?tk.getType():0)) 
              						{
              							case EQ:
              								if (!Name.typeIsT(varName.getType(), (eVal!=null?eVal.value:null).getType())) {
              									putError(TYPE_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (eVal!=null?eVal.value:null).getType(), varName.getType());
              								}
              								break;
              							case STAR_EQ:
              								if (!Name.typeIsT(varName.getType(), (eVal!=null?eVal.value:null).getType())) {
              									putError(TYPE_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (eVal!=null?eVal.value:null).getType(), varName.getType());
              								}
              								break;
              							case RSLASH_EQ:
              								if (!Name.isFloatT(varName.getType())) {
              									putError(TYPE_ERROR, (id!=null?id.getLine():0), (id!=null?id.getCharPositionInLine():0), (eVal!=null?eVal.value:null).getType(), varName.getType());
              								}
              								if (!Name.typeIsT(varName.getType(), (eVal!=null?eVal.value:null).getType())) {
              									putError(TYPE_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (eVal!=null?eVal.value:null).getType(), varName.getType());
              								}
              								break;	
              							case PLUS_EQ:
              								if (!Name.typeIsT(varName.getType(), (eVal!=null?eVal.value:null).getType())) {
              									putError(TYPE_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (eVal!=null?eVal.value:null).getType(), varName.getType());
              								}				
              								break;
              							case MINUS_EQ:
              								if (!Name.typeIsT(varName.getType(), (eVal!=null?eVal.value:null).getType())) {
              									putError(TYPE_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (eVal!=null?eVal.value:null).getType(), varName.getType());
              								}				
              								break;
              							case GT_GT_EQ:
              								if (!Name.typeIsT(varName.getType(), (eVal!=null?eVal.value:null).getType())) {
              									putError(TYPE_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (eVal!=null?eVal.value:null).getType(), varName.getType());
              								}				
              								break;	
              							case LT_LT_EQ:
              								if (!Name.typeIsT(varName.getType(), (eVal!=null?eVal.value:null).getType())) {
              									putError(TYPE_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (eVal!=null?eVal.value:null).getType(), varName.getType());
              								}				
              								break;									
              						}
              					}
              				}
              				code.setAttribute("op1", varName.getId());
              				code.setAttribute("op2", (eVal!=null?eVal.code:null));	
              			} else {
              				code.setAttribute("op1", (eVal!=null?eVal.code:null));
              				
              				if (!(eVal!=null?eVal.value:null).isFunc())
              					putError(ASSIGMENT_STMT_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos());
              			}
              		
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, assigment_stmt_StartIndex); }
        }
        return code;
    }
    // $ANTLR end "assigment_stmt"

    protected static class selection_stmt_scope {
        Namespace tmpNamespace;
    }
    protected Stack selection_stmt_stack = new Stack();


    // $ANTLR start "selection_stmt"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:373:1: selection_stmt[Namespace space] returns [ StringTemplate code ] : IF_TK eVal= logic_expr (t= stmt[ $selection_stmt::tmpNamespace ] )+ ( ELSIF_TK eVal= logic_expr (t= stmt[ $selection_stmt::tmpNamespace ] )+ )* ( ELSE_TK (t= stmt[ $selection_stmt::tmpNamespace ] )+ )? END_TK ;
    public final StringTemplate selection_stmt(Namespace space) throws RecognitionException {
        selection_stmt_stack.push(new selection_stmt_scope());
        StringTemplate code = null;
        int selection_stmt_StartIndex = input.index();
        ChalkParser.logic_expr_return eVal = null;

        StringTemplate t = null;



        	currentNamespace = space;
        	code = getTemplate("empty_template");
        	StringTemplate tmp = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return code; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:382:2: ( IF_TK eVal= logic_expr (t= stmt[ $selection_stmt::tmpNamespace ] )+ ( ELSIF_TK eVal= logic_expr (t= stmt[ $selection_stmt::tmpNamespace ] )+ )* ( ELSE_TK (t= stmt[ $selection_stmt::tmpNamespace ] )+ )? END_TK )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:382:5: IF_TK eVal= logic_expr (t= stmt[ $selection_stmt::tmpNamespace ] )+ ( ELSIF_TK eVal= logic_expr (t= stmt[ $selection_stmt::tmpNamespace ] )+ )* ( ELSE_TK (t= stmt[ $selection_stmt::tmpNamespace ] )+ )? END_TK
            {
            match(input,IF_TK,FOLLOW_IF_TK_in_selection_stmt746); if (state.failed) return code;
            pushFollow(FOLLOW_logic_expr_in_selection_stmt752);
            eVal=logic_expr();

            state._fsp--;
            if (state.failed) return code;
            if ( state.backtracking==0 ) {

              			code = getTemplate("if_stmt");
              			code.setAttribute("test", (eVal!=null?eVal.code:null));
              			
              			if (!(eVal!=null?eVal.value:null).isBool()) {
              				putError(TYPE_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (eVal!=null?eVal.value:null).getType(), Name.BOOL_TYPE_ID);
              			}
              			((selection_stmt_scope)selection_stmt_stack.peek()).tmpNamespace = new Namespace(space, "if");
              			space.addSpace(((selection_stmt_scope)selection_stmt_stack.peek()).tmpNamespace);
              			
              		
            }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:392:5: (t= stmt[ $selection_stmt::tmpNamespace ] )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==ID||LA16_0==LPAREN||LA16_0==IF_TK||(LA16_0>=WHILE_TK && LA16_0<=DO_TK)||LA16_0==FOR_TK||(LA16_0>=BREAK_TK && LA16_0<=RETURN_TK)||(LA16_0>=PLUS && LA16_0<=MINUS)||(LA16_0>=TILDE && LA16_0<=SCREAMER)||(LA16_0>=READ_INT && LA16_0<=FALSE)||(LA16_0>=73 && LA16_0<=75)||LA16_0==79||(LA16_0>=85 && LA16_0<=99)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:392:7: t= stmt[ $selection_stmt::tmpNamespace ]
            	    {
            	    pushFollow(FOLLOW_stmt_in_selection_stmt762);
            	    t=stmt(((selection_stmt_scope)selection_stmt_stack.peek()).tmpNamespace);

            	    state._fsp--;
            	    if (state.failed) return code;
            	    if ( state.backtracking==0 ) {
            	       code.setAttribute("stmts", t); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return code;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:393:5: ( ELSIF_TK eVal= logic_expr (t= stmt[ $selection_stmt::tmpNamespace ] )+ )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==ELSIF_TK) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:393:7: ELSIF_TK eVal= logic_expr (t= stmt[ $selection_stmt::tmpNamespace ] )+
            	    {
            	    match(input,ELSIF_TK,FOLLOW_ELSIF_TK_in_selection_stmt777); if (state.failed) return code;
            	    pushFollow(FOLLOW_logic_expr_in_selection_stmt783);
            	    eVal=logic_expr();

            	    state._fsp--;
            	    if (state.failed) return code;
            	    if ( state.backtracking==0 ) {

            	      	  		tmp = getTemplate("elsif_stmt");
            	      			tmp.setAttribute("test", (eVal!=null?eVal.code:null));
            	      			
            	      			if (!(eVal!=null?eVal.value:null).isBool()) {
            	      				putError(TYPE_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (eVal!=null?eVal.value:null).getType(), Name.BOOL_TYPE_ID);
            	      			}
            	      			((selection_stmt_scope)selection_stmt_stack.peek()).tmpNamespace = new Namespace(space, "elsif");
            	      			space.addSpace(((selection_stmt_scope)selection_stmt_stack.peek()).tmpNamespace);
            	      			
            	      	  	
            	    }
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:403:7: (t= stmt[ $selection_stmt::tmpNamespace ] )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==ID||LA17_0==LPAREN||LA17_0==IF_TK||(LA17_0>=WHILE_TK && LA17_0<=DO_TK)||LA17_0==FOR_TK||(LA17_0>=BREAK_TK && LA17_0<=RETURN_TK)||(LA17_0>=PLUS && LA17_0<=MINUS)||(LA17_0>=TILDE && LA17_0<=SCREAMER)||(LA17_0>=READ_INT && LA17_0<=FALSE)||(LA17_0>=73 && LA17_0<=75)||LA17_0==79||(LA17_0>=85 && LA17_0<=99)) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:403:9: t= stmt[ $selection_stmt::tmpNamespace ]
            	    	    {
            	    	    pushFollow(FOLLOW_stmt_in_selection_stmt793);
            	    	    t=stmt(((selection_stmt_scope)selection_stmt_stack.peek()).tmpNamespace);

            	    	    state._fsp--;
            	    	    if (state.failed) return code;
            	    	    if ( state.backtracking==0 ) {
            	    	       tmp.setAttribute("stmts", t); 
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt17 >= 1 ) break loop17;
            	    	    if (state.backtracking>0) {state.failed=true; return code;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(17, input);
            	                throw eee;
            	        }
            	        cnt17++;
            	    } while (true);

            	    if ( state.backtracking==0 ) {
            	       code.setAttribute("alts", tmp); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:404:5: ( ELSE_TK (t= stmt[ $selection_stmt::tmpNamespace ] )+ )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ELSE_TK) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:404:7: ELSE_TK (t= stmt[ $selection_stmt::tmpNamespace ] )+
                    {
                    match(input,ELSE_TK,FOLLOW_ELSE_TK_in_selection_stmt812); if (state.failed) return code;
                    if ( state.backtracking==0 ) {

                      	  		tmp = getTemplate("else_stmt");
                      	  		
                      	  		((selection_stmt_scope)selection_stmt_stack.peek()).tmpNamespace = new Namespace(space, "else");
                      			space.addSpace(((selection_stmt_scope)selection_stmt_stack.peek()).tmpNamespace);
                      	  	
                    }
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:409:7: (t= stmt[ $selection_stmt::tmpNamespace ] )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==ID||LA19_0==LPAREN||LA19_0==IF_TK||(LA19_0>=WHILE_TK && LA19_0<=DO_TK)||LA19_0==FOR_TK||(LA19_0>=BREAK_TK && LA19_0<=RETURN_TK)||(LA19_0>=PLUS && LA19_0<=MINUS)||(LA19_0>=TILDE && LA19_0<=SCREAMER)||(LA19_0>=READ_INT && LA19_0<=FALSE)||(LA19_0>=73 && LA19_0<=75)||LA19_0==79||(LA19_0>=85 && LA19_0<=99)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:409:9: t= stmt[ $selection_stmt::tmpNamespace ]
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_selection_stmt822);
                    	    t=stmt(((selection_stmt_scope)selection_stmt_stack.peek()).tmpNamespace);

                    	    state._fsp--;
                    	    if (state.failed) return code;
                    	    if ( state.backtracking==0 ) {
                    	       tmp.setAttribute("stmts", t); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return code;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    if ( state.backtracking==0 ) {
                       code.setAttribute("alts", tmp); 
                    }

                    }
                    break;

            }

            match(input,END_TK,FOLLOW_END_TK_in_selection_stmt840); if (state.failed) return code;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, selection_stmt_StartIndex); }
            selection_stmt_stack.pop();
        }
        return code;
    }
    // $ANTLR end "selection_stmt"

    protected static class iteration_stmt_scope {
        Namespace tmpNamespace;
    }
    protected Stack iteration_stmt_stack = new Stack();


    // $ANTLR start "iteration_stmt"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:413:1: iteration_stmt[Namespace space] returns [ StringTemplate code ] : ( WHILE_TK eVal= logic_expr t= stmt_block[ $iteration_stmt::tmpNamespace ] | DO_TK (t= stmt[ $iteration_stmt::tmpNamespace ] )* UNTIL_TK eVal= logic_expr | FOR_TK tk= ID IN_TK LBRACKET eVal1= logic_expr ':' eVal2= logic_expr RBRACKET t= stmt_block[ $iteration_stmt::tmpNamespace ] );
    public final StringTemplate iteration_stmt(Namespace space) throws RecognitionException {
        iteration_stmt_stack.push(new iteration_stmt_scope());
        StringTemplate code = null;
        int iteration_stmt_StartIndex = input.index();
        Token tk=null;
        Token FOR_TK4=null;
        Token LBRACKET5=null;
        ChalkParser.logic_expr_return eVal = null;

        StringTemplate t = null;

        ChalkParser.logic_expr_return eVal1 = null;

        ChalkParser.logic_expr_return eVal2 = null;



        	currentNamespace = space;
        	code = getTemplate("empty_template");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return code; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:421:2: ( WHILE_TK eVal= logic_expr t= stmt_block[ $iteration_stmt::tmpNamespace ] | DO_TK (t= stmt[ $iteration_stmt::tmpNamespace ] )* UNTIL_TK eVal= logic_expr | FOR_TK tk= ID IN_TK LBRACKET eVal1= logic_expr ':' eVal2= logic_expr RBRACKET t= stmt_block[ $iteration_stmt::tmpNamespace ] )
            int alt22=3;
            switch ( input.LA(1) ) {
            case WHILE_TK:
                {
                alt22=1;
                }
                break;
            case DO_TK:
                {
                alt22=2;
                }
                break;
            case FOR_TK:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return code;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:421:5: WHILE_TK eVal= logic_expr t= stmt_block[ $iteration_stmt::tmpNamespace ]
                    {
                    match(input,WHILE_TK,FOLLOW_WHILE_TK_in_iteration_stmt866); if (state.failed) return code;
                    pushFollow(FOLLOW_logic_expr_in_iteration_stmt872);
                    eVal=logic_expr();

                    state._fsp--;
                    if (state.failed) return code;
                    if ( state.backtracking==0 ) {

                      			code = getTemplate("while_stmt");
                      			code.setAttribute("test", (eVal!=null?eVal.code:null));
                      			
                      			if (!(eVal!=null?eVal.value:null).isBool()) {
                      				putError(TYPE_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (eVal!=null?eVal.value:null).getType(), Name.BOOL_TYPE_ID);
                      			}
                      			((iteration_stmt_scope)iteration_stmt_stack.peek()).tmpNamespace = new Namespace(space, "while");
                      			space.addSpace(((iteration_stmt_scope)iteration_stmt_stack.peek()).tmpNamespace);
                      			
                      		
                    }
                    pushFollow(FOLLOW_stmt_block_in_iteration_stmt880);
                    t=stmt_block(((iteration_stmt_scope)iteration_stmt_stack.peek()).tmpNamespace);

                    state._fsp--;
                    if (state.failed) return code;
                    if ( state.backtracking==0 ) {
                       code.setAttribute("stmts", t); 
                    }

                    }
                    break;
                case 2 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:432:5: DO_TK (t= stmt[ $iteration_stmt::tmpNamespace ] )* UNTIL_TK eVal= logic_expr
                    {
                    match(input,DO_TK,FOLLOW_DO_TK_in_iteration_stmt889); if (state.failed) return code;
                    if ( state.backtracking==0 ) {

                      			code = getTemplate("until_stmt");
                      			
                      			((iteration_stmt_scope)iteration_stmt_stack.peek()).tmpNamespace = new Namespace(space, "until");
                      			space.addSpace(((iteration_stmt_scope)iteration_stmt_stack.peek()).tmpNamespace);
                      			
                      		
                    }
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:438:5: (t= stmt[ $iteration_stmt::tmpNamespace ] )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==ID||LA21_0==LPAREN||LA21_0==IF_TK||(LA21_0>=WHILE_TK && LA21_0<=DO_TK)||LA21_0==FOR_TK||(LA21_0>=BREAK_TK && LA21_0<=RETURN_TK)||(LA21_0>=PLUS && LA21_0<=MINUS)||(LA21_0>=TILDE && LA21_0<=SCREAMER)||(LA21_0>=READ_INT && LA21_0<=FALSE)||(LA21_0>=73 && LA21_0<=75)||LA21_0==79||(LA21_0>=85 && LA21_0<=99)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:438:7: t= stmt[ $iteration_stmt::tmpNamespace ]
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_iteration_stmt899);
                    	    t=stmt(((iteration_stmt_scope)iteration_stmt_stack.peek()).tmpNamespace);

                    	    state._fsp--;
                    	    if (state.failed) return code;
                    	    if ( state.backtracking==0 ) {
                    	       code.setAttribute("stmts", t); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match(input,UNTIL_TK,FOLLOW_UNTIL_TK_in_iteration_stmt907); if (state.failed) return code;
                    pushFollow(FOLLOW_logic_expr_in_iteration_stmt913);
                    eVal=logic_expr();

                    state._fsp--;
                    if (state.failed) return code;
                    if ( state.backtracking==0 ) {

                      			code.setAttribute("test", (eVal!=null?eVal.code:null));
                      			if (!(eVal!=null?eVal.value:null).isBool()) {
                      				putError(TYPE_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (eVal!=null?eVal.value:null).getType(), Name.BOOL_TYPE_ID);
                      			}
                      		
                    }

                    }
                    break;
                case 3 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:444:5: FOR_TK tk= ID IN_TK LBRACKET eVal1= logic_expr ':' eVal2= logic_expr RBRACKET t= stmt_block[ $iteration_stmt::tmpNamespace ]
                    {
                    FOR_TK4=(Token)match(input,FOR_TK,FOLLOW_FOR_TK_in_iteration_stmt921); if (state.failed) return code;
                    tk=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt927); if (state.failed) return code;
                    match(input,IN_TK,FOLLOW_IN_TK_in_iteration_stmt929); if (state.failed) return code;
                    LBRACKET5=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_iteration_stmt931); if (state.failed) return code;
                    pushFollow(FOLLOW_logic_expr_in_iteration_stmt937);
                    eVal1=logic_expr();

                    state._fsp--;
                    if (state.failed) return code;
                    match(input,72,FOLLOW_72_in_iteration_stmt939); if (state.failed) return code;
                    pushFollow(FOLLOW_logic_expr_in_iteration_stmt945);
                    eVal2=logic_expr();

                    state._fsp--;
                    if (state.failed) return code;
                    match(input,RBRACKET,FOLLOW_RBRACKET_in_iteration_stmt947); if (state.failed) return code;
                    if ( state.backtracking==0 ) {

                      			code = getTemplate("for_stmt");			
                      									
                      			Name varName = findVar(space, (tk!=null?tk.getText():null));
                      			boolean error = false;
                      			
                      			if (varName == null) {	
                      				error = true;	
                      				putError(UNDEF_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null));
                      			} else {
                      				code.setAttribute("id", varName.getId());	
                      				if (!Name.isIntT(varName.getType()) && !Name.isFloatT(varName.getType())) {		
                      					putError(NOT_IMPL_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (FOR_TK4!=null?FOR_TK4.getText():null), varName.getType());
                      				}
                      			}	

                      			if (!error) {
                      				if (!Name.isIntT(varName.getType()) && !Name.isFloatT(varName.getType())) {		
                      					error = true;
                      					putError(NOT_IMPL_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (FOR_TK4!=null?FOR_TK4.getText():null), varName.getType());
                      				}
                      			}
                      			
                      			if ((!(eVal1!=null?eVal1.value:null).isInt() && !(eVal1!=null?eVal1.value:null).isFloat()) ||
                      				(!(eVal2!=null?eVal2.value:null).isInt() && !(eVal2!=null?eVal2.value:null).isFloat()))
                      			{		
                      				error = true;
                      				putError(NOT_IMPLS_ERROR, (LBRACKET5!=null?LBRACKET5.getLine():0), (LBRACKET5!=null?LBRACKET5.getCharPositionInLine():0) + 1, (FOR_TK4!=null?FOR_TK4.getText():null), (eVal1!=null?eVal1.value:null).getType(), (eVal2!=null?eVal2.value:null).getType());
                      			}
                      				
                      			if (!error) {			
                      			 	if (!(eVal1!=null?eVal1.value:null).isT(varName.getType()) || !(eVal2!=null?eVal2.value:null).isT(varName.getType())) {		
                      					putError(NOT_IMPLS_ERROR, (LBRACKET5!=null?LBRACKET5.getLine():0), (LBRACKET5!=null?LBRACKET5.getCharPositionInLine():0) + 1, (FOR_TK4!=null?FOR_TK4.getText():null), (eVal1!=null?eVal1.value:null).getType(), (eVal2!=null?eVal2.value:null).getType());
                      				}
                      			}
                      	
                      			code.setAttribute("op1", (eVal1!=null?eVal1.code:null));
                      			code.setAttribute("op2", (eVal2!=null?eVal2.code:null));
                      			
                      			((iteration_stmt_scope)iteration_stmt_stack.peek()).tmpNamespace = new Namespace(space, "for");
                      			space.addSpace(((iteration_stmt_scope)iteration_stmt_stack.peek()).tmpNamespace);
                      			
                      		
                    }
                    pushFollow(FOLLOW_stmt_block_in_iteration_stmt955);
                    t=stmt_block(((iteration_stmt_scope)iteration_stmt_stack.peek()).tmpNamespace);

                    state._fsp--;
                    if (state.failed) return code;
                    if ( state.backtracking==0 ) {
                       code.setAttribute("stmts", t); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, iteration_stmt_StartIndex); }
            iteration_stmt_stack.pop();
        }
        return code;
    }
    // $ANTLR end "iteration_stmt"


    // $ANTLR start "jump_stmt"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:489:1: jump_stmt[Namespace space] returns [ StringTemplate code ] : ( BREAK_TK | CONTINUE_TK | tk= RETURN_TK (eVal= logic_expr )? );
    public final StringTemplate jump_stmt(Namespace space) throws RecognitionException {
        StringTemplate code = null;
        int jump_stmt_StartIndex = input.index();
        Token tk=null;
        ChalkParser.logic_expr_return eVal = null;



        	currentNamespace = space;
        	code = getTemplate("empty_template");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return code; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:494:2: ( BREAK_TK | CONTINUE_TK | tk= RETURN_TK (eVal= logic_expr )? )
            int alt24=3;
            switch ( input.LA(1) ) {
            case BREAK_TK:
                {
                alt24=1;
                }
                break;
            case CONTINUE_TK:
                {
                alt24=2;
                }
                break;
            case RETURN_TK:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return code;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:494:5: BREAK_TK
                    {
                    match(input,BREAK_TK,FOLLOW_BREAK_TK_in_jump_stmt983); if (state.failed) return code;
                    if ( state.backtracking==0 ) {
                       code = getTemplate("break_stmt"); 
                    }

                    }
                    break;
                case 2 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:495:5: CONTINUE_TK
                    {
                    match(input,CONTINUE_TK,FOLLOW_CONTINUE_TK_in_jump_stmt992); if (state.failed) return code;
                    if ( state.backtracking==0 ) {
                       code = getTemplate("continue_stmt"); 
                    }

                    }
                    break;
                case 3 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:496:5: tk= RETURN_TK (eVal= logic_expr )?
                    {
                    tk=(Token)match(input,RETURN_TK,FOLLOW_RETURN_TK_in_jump_stmt1005); if (state.failed) return code;
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:496:20: (eVal= logic_expr )?
                    int alt23=2;
                    alt23 = dfa23.predict(input);
                    switch (alt23) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:496:22: eVal= logic_expr
                            {
                            pushFollow(FOLLOW_logic_expr_in_jump_stmt1013);
                            eVal=logic_expr();

                            state._fsp--;
                            if (state.failed) return code;
                            if ( state.backtracking==0 ) {

                              			code = getTemplate("return_stmt");
                              			code.setAttribute("arg", (eVal!=null?eVal.code:null));
                              			
                              			String funcType = space.getSpaceRetType();
                              			if (!(eVal!=null?eVal.value:null).isT(funcType)) {
                              				putError(TYPE_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (eVal!=null?eVal.value:null).getType(), funcType);
                              			}
                              		
                            }

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, jump_stmt_StartIndex); }
        }
        return code;
    }
    // $ANTLR end "jump_stmt"

    public static class logic_expr_return extends ParserRuleReturnScope {
        public ExprValue value;
        public StringTemplate code;
    };

    // $ANTLR start "logic_expr"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:507:1: logic_expr returns [ ExprValue value, StringTemplate code ] : eVal1= and_logic_expr (tk= BAR_BAR eVal2= and_logic_expr )* ;
    public final ChalkParser.logic_expr_return logic_expr() throws RecognitionException {
        ChalkParser.logic_expr_return retval = new ChalkParser.logic_expr_return();
        retval.start = input.LT(1);
        int logic_expr_StartIndex = input.index();
        Token tk=null;
        ChalkParser.and_logic_expr_return eVal1 = null;

        ChalkParser.and_logic_expr_return eVal2 = null;


         
        	StringTemplate tmp = null; 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:511:2: (eVal1= and_logic_expr (tk= BAR_BAR eVal2= and_logic_expr )* )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:511:5: eVal1= and_logic_expr (tk= BAR_BAR eVal2= and_logic_expr )*
            {
            pushFollow(FOLLOW_and_logic_expr_in_logic_expr1045);
            eVal1=and_logic_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.value = (eVal1!=null?eVal1.value:null); retval.code = (eVal1!=null?eVal1.code:null); 
            }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:512:3: (tk= BAR_BAR eVal2= and_logic_expr )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==BAR_BAR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:512:5: tk= BAR_BAR eVal2= and_logic_expr
            	    {
            	    tk=(Token)match(input,BAR_BAR,FOLLOW_BAR_BAR_in_logic_expr1058); if (state.failed) return retval;
            	    pushFollow(FOLLOW_and_logic_expr_in_logic_expr1064);
            	    eVal2=and_logic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {

            	      			tmp = retval.code;
            	      			retval.code = getTemplate("logic_expr");
            	      			retval.code.setAttribute("op1", tmp);
            	      			retval.code.setAttribute("op2", (eVal2!=null?eVal2.code:null));
            	      				
            	      			if (!retval.value.isBool() && !(eVal2!=null?eVal2.value:null).isBool()) {
            	      				putError(NOT_IMPLS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), retval.value.getType(), (eVal2!=null?eVal2.value:null).getType());
            	      				retval.value = new ExprValue(Name.BOOL_TYPE_ID, retval.value.line(), retval.value.pos());
            	      			} else {
            	      				retval.value = new ExprValue(Name.BOOL_TYPE_ID, retval.value.line(), retval.value.pos());
            	      			}
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, logic_expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logic_expr"

    public static class and_logic_expr_return extends ParserRuleReturnScope {
        public ExprValue value;
        public StringTemplate code;
    };

    // $ANTLR start "and_logic_expr"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:528:1: and_logic_expr returns [ ExprValue value, StringTemplate code ] : eVal1= comparison_expr (tk= AMP_AMP eVal2= comparison_expr )* ;
    public final ChalkParser.and_logic_expr_return and_logic_expr() throws RecognitionException {
        ChalkParser.and_logic_expr_return retval = new ChalkParser.and_logic_expr_return();
        retval.start = input.LT(1);
        int and_logic_expr_StartIndex = input.index();
        Token tk=null;
        ChalkParser.comparison_expr_return eVal1 = null;

        ChalkParser.comparison_expr_return eVal2 = null;


         
        	StringTemplate tmp = null; 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:532:2: (eVal1= comparison_expr (tk= AMP_AMP eVal2= comparison_expr )* )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:532:5: eVal1= comparison_expr (tk= AMP_AMP eVal2= comparison_expr )*
            {
            pushFollow(FOLLOW_comparison_expr_in_and_logic_expr1102);
            eVal1=comparison_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.value = (eVal1!=null?eVal1.value:null); retval.code = (eVal1!=null?eVal1.code:null); 
            }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:533:3: (tk= AMP_AMP eVal2= comparison_expr )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==AMP_AMP) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:533:5: tk= AMP_AMP eVal2= comparison_expr
            	    {
            	    tk=(Token)match(input,AMP_AMP,FOLLOW_AMP_AMP_in_and_logic_expr1114); if (state.failed) return retval;
            	    pushFollow(FOLLOW_comparison_expr_in_and_logic_expr1120);
            	    eVal2=comparison_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       
            	      			tmp = retval.code;		
            	      			retval.code = getTemplate("and_logic_expr");
            	      			retval.code.setAttribute("op1", tmp);
            	      			retval.code.setAttribute("op2", (eVal2!=null?eVal2.code:null));
            	      				
            	      			if (!retval.value.isBool() && !(eVal2!=null?eVal2.value:null).isBool()) {
            	      				putError(NOT_IMPLS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), retval.value.getType(), (eVal2!=null?eVal2.value:null).getType());
            	      				retval.value = new ExprValue(Name.BOOL_TYPE_ID, retval.value.line(), retval.value.pos());		
            	      			} else {
            	      				retval.value = new ExprValue(Name.BOOL_TYPE_ID, retval.value.line(), retval.value.pos());
            	      			}
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, and_logic_expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "and_logic_expr"

    public static class comparison_expr_return extends ParserRuleReturnScope {
        public ExprValue value;
        public StringTemplate code;
    };

    // $ANTLR start "comparison_expr"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:549:1: comparison_expr returns [ ExprValue value, StringTemplate code ] : eVal1= math_expr ( (tk= GT | tk= LT | tk= LT_EQ | tk= GT_EQ | tk= EQ_EQ | tk= SCREAMER_EQ ) eVal2= math_expr )* ;
    public final ChalkParser.comparison_expr_return comparison_expr() throws RecognitionException {
        ChalkParser.comparison_expr_return retval = new ChalkParser.comparison_expr_return();
        retval.start = input.LT(1);
        int comparison_expr_StartIndex = input.index();
        Token tk=null;
        ChalkParser.math_expr_return eVal1 = null;

        ChalkParser.math_expr_return eVal2 = null;


         
        	StringTemplate tmp = null; 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:553:2: (eVal1= math_expr ( (tk= GT | tk= LT | tk= LT_EQ | tk= GT_EQ | tk= EQ_EQ | tk= SCREAMER_EQ ) eVal2= math_expr )* )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:553:5: eVal1= math_expr ( (tk= GT | tk= LT | tk= LT_EQ | tk= GT_EQ | tk= EQ_EQ | tk= SCREAMER_EQ ) eVal2= math_expr )*
            {
            pushFollow(FOLLOW_math_expr_in_comparison_expr1157);
            eVal1=math_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               
              			retval.value = (eVal1!=null?eVal1.value:null); retval.code = (eVal1!=null?eVal1.code:null); 
              		
            }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:556:3: ( (tk= GT | tk= LT | tk= LT_EQ | tk= GT_EQ | tk= EQ_EQ | tk= SCREAMER_EQ ) eVal2= math_expr )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=GT && LA28_0<=SCREAMER_EQ)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:557:4: (tk= GT | tk= LT | tk= LT_EQ | tk= GT_EQ | tk= EQ_EQ | tk= SCREAMER_EQ ) eVal2= math_expr
            	    {
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:557:4: (tk= GT | tk= LT | tk= LT_EQ | tk= GT_EQ | tk= EQ_EQ | tk= SCREAMER_EQ )
            	    int alt27=6;
            	    switch ( input.LA(1) ) {
            	    case GT:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case LT:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case LT_EQ:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    case GT_EQ:
            	        {
            	        alt27=4;
            	        }
            	        break;
            	    case EQ_EQ:
            	        {
            	        alt27=5;
            	        }
            	        break;
            	    case SCREAMER_EQ:
            	        {
            	        alt27=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:557:7: tk= GT
            	            {
            	            tk=(Token)match(input,GT,FOLLOW_GT_in_comparison_expr1175); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	               tmp = retval.code; retval.code = getTemplate("comparison_expr_gt"); 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:558:7: tk= LT
            	            {
            	            tk=(Token)match(input,LT,FOLLOW_LT_in_comparison_expr1192); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	               tmp = retval.code; retval.code = getTemplate("comparison_expr_lt"); 
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:559:7: tk= LT_EQ
            	            {
            	            tk=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_comparison_expr1209); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	               tmp = retval.code; retval.code = getTemplate("comparison_expr_lteq"); 
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:560:7: tk= GT_EQ
            	            {
            	            tk=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_comparison_expr1225); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	               tmp = retval.code; retval.code = getTemplate("comparison_expr_gteq"); 
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:561:7: tk= EQ_EQ
            	            {
            	            tk=(Token)match(input,EQ_EQ,FOLLOW_EQ_EQ_in_comparison_expr1241); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	               tmp = retval.code; retval.code = getTemplate("comparison_expr_eqeq"); 
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:562:6: tk= SCREAMER_EQ
            	            {
            	            tk=(Token)match(input,SCREAMER_EQ,FOLLOW_SCREAMER_EQ_in_comparison_expr1256); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	               tmp = retval.code; retval.code = getTemplate("comparison_expr_noteq"); 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_math_expr_in_comparison_expr1273);
            	    eVal2=math_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      					
            	      				if ((!retval.value.isInt() && !retval.value.isFloat()) ||
            	      					(!(eVal2!=null?eVal2.value:null).isInt() && !(eVal2!=null?eVal2.value:null).isFloat()))
            	      				{
            	      					putError(NOT_IMPLS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), retval.value.getType(), (eVal2!=null?eVal2.value:null).getType());
            	      					retval.value = new ExprValue(Name.BOOL_TYPE_ID, retval.value.line(), retval.value.pos());
            	      				} else {
            	      					retval.value = new ExprValue(Name.BOOL_TYPE_ID, retval.value.line(), retval.value.pos());
            	      					
            	      					retval.code.setAttribute("op1", tmp);
            	      					retval.code.setAttribute("op2", (eVal2!=null?eVal2.code:null));
            	      				}
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               if ((eVal2!=null?eVal2.value:null) == null) retval.code = (eVal1!=null?eVal1.code:null); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, comparison_expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "comparison_expr"

    public static class math_expr_return extends ParserRuleReturnScope {
        public ExprValue value;
        public StringTemplate code;
    };

    // $ANTLR start "math_expr"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:580:1: math_expr returns [ ExprValue value, StringTemplate code ] : eVal1= xor_math_expr (tk= BAR eVal2= xor_math_expr )* ;
    public final ChalkParser.math_expr_return math_expr() throws RecognitionException {
        ChalkParser.math_expr_return retval = new ChalkParser.math_expr_return();
        retval.start = input.LT(1);
        int math_expr_StartIndex = input.index();
        Token tk=null;
        ChalkParser.xor_math_expr_return eVal1 = null;

        ChalkParser.xor_math_expr_return eVal2 = null;


         
        	StringTemplate tmp = null; 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:584:2: (eVal1= xor_math_expr (tk= BAR eVal2= xor_math_expr )* )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:584:5: eVal1= xor_math_expr (tk= BAR eVal2= xor_math_expr )*
            {
            pushFollow(FOLLOW_xor_math_expr_in_math_expr1311);
            eVal1=xor_math_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.value = (eVal1!=null?eVal1.value:null); retval.code = (eVal1!=null?eVal1.code:null); 
            }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:585:3: (tk= BAR eVal2= xor_math_expr )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==BAR) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:585:5: tk= BAR eVal2= xor_math_expr
            	    {
            	    tk=(Token)match(input,BAR,FOLLOW_BAR_in_math_expr1323); if (state.failed) return retval;
            	    pushFollow(FOLLOW_xor_math_expr_in_math_expr1329);
            	    eVal2=xor_math_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      	
            	      			tmp = retval.code;
            	      			retval.code = getTemplate("math_expr");
            	      			retval.code.setAttribute("op1", tmp);
            	      			retval.code.setAttribute("op2", (eVal2!=null?eVal2.code:null));
            	      					
            	      			if (!(retval.value.isInt() && (eVal2!=null?eVal2.value:null).isInt()) &&
            	      				!(retval.value.isBool() && (eVal2!=null?eVal2.value:null).isBool()) ) 
            	      			{
            	      				putError(NOT_IMPLS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), retval.value.getType(), (eVal2!=null?eVal2.value:null).getType());
            	      				if (retval.value.isInt())
            	      					retval.value = new ExprValue(Name.INT_TYPE_ID, retval.value.line(), retval.value.pos());
            	      				else if (retval.value.isBool())
            	      					retval.value = new ExprValue(Name.BOOL_TYPE_ID, retval.value.line(), retval.value.pos());		
            	      				else 	
            	      					retval.value = new ExprValue(retval.value.line(), retval.value.pos());			
            	      			} else {	
            	      				if (retval.value.isInt())
            	      					retval.value = new ExprValue(Name.INT_TYPE_ID, retval.value.line(), retval.value.pos());
            	      				else 
            	      					retval.value = new ExprValue(Name.BOOL_TYPE_ID, retval.value.line(), retval.value.pos());	
            	      			}	
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, math_expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "math_expr"

    public static class xor_math_expr_return extends ParserRuleReturnScope {
        public ExprValue value;
        public StringTemplate code;
    };

    // $ANTLR start "xor_math_expr"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:611:1: xor_math_expr returns [ ExprValue value, StringTemplate code ] : eVal1= and_math_expr (tk= CARET eVal2= and_math_expr )* ;
    public final ChalkParser.xor_math_expr_return xor_math_expr() throws RecognitionException {
        ChalkParser.xor_math_expr_return retval = new ChalkParser.xor_math_expr_return();
        retval.start = input.LT(1);
        int xor_math_expr_StartIndex = input.index();
        Token tk=null;
        ChalkParser.and_math_expr_return eVal1 = null;

        ChalkParser.and_math_expr_return eVal2 = null;


         
        	StringTemplate tmp = null; 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:615:2: (eVal1= and_math_expr (tk= CARET eVal2= and_math_expr )* )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:615:5: eVal1= and_math_expr (tk= CARET eVal2= and_math_expr )*
            {
            pushFollow(FOLLOW_and_math_expr_in_xor_math_expr1363);
            eVal1=and_math_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.value = (eVal1!=null?eVal1.value:null); retval.code = (eVal1!=null?eVal1.code:null); 
            }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:616:3: (tk= CARET eVal2= and_math_expr )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==CARET) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:616:5: tk= CARET eVal2= and_math_expr
            	    {
            	    tk=(Token)match(input,CARET,FOLLOW_CARET_in_xor_math_expr1375); if (state.failed) return retval;
            	    pushFollow(FOLLOW_and_math_expr_in_xor_math_expr1381);
            	    eVal2=and_math_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {

            	      			tmp = retval.code;
            	      			retval.code = getTemplate("xor_math_expr");
            	      			retval.code.setAttribute("op1", tmp);
            	      			retval.code.setAttribute("op2", (eVal2!=null?eVal2.code:null));
            	      				
            	      			if (!(retval.value.isInt() && (eVal2!=null?eVal2.value:null).isInt()) &&
            	      				!(retval.value.isBool() && (eVal2!=null?eVal2.value:null).isBool()) ) 
            	      			{
            	      				putError(NOT_IMPLS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), retval.value.getType(), (eVal2!=null?eVal2.value:null).getType());
            	      				if (retval.value.isInt())
            	      					retval.value = new ExprValue(Name.INT_TYPE_ID, retval.value.line(), retval.value.pos());
            	      				else if (retval.value.isBool())
            	      					retval.value = new ExprValue(Name.BOOL_TYPE_ID, retval.value.line(), retval.value.pos());		
            	      				else 	
            	      					retval.value = new ExprValue(retval.value.line(), retval.value.pos());	
            	      			} else {	
            	      				if (retval.value.isInt())
            	      					retval.value = new ExprValue(Name.INT_TYPE_ID, retval.value.line(), retval.value.pos());
            	      				else 
            	      					retval.value = new ExprValue(Name.BOOL_TYPE_ID, retval.value.line(), retval.value.pos());					
            	      			}	
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, xor_math_expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "xor_math_expr"

    public static class and_math_expr_return extends ParserRuleReturnScope {
        public ExprValue value;
        public StringTemplate code;
    };

    // $ANTLR start "and_math_expr"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:642:1: and_math_expr returns [ ExprValue value, StringTemplate code ] : eVal1= shift_math_expr (tk= AMP eVal2= shift_math_expr )* ;
    public final ChalkParser.and_math_expr_return and_math_expr() throws RecognitionException {
        ChalkParser.and_math_expr_return retval = new ChalkParser.and_math_expr_return();
        retval.start = input.LT(1);
        int and_math_expr_StartIndex = input.index();
        Token tk=null;
        ChalkParser.shift_math_expr_return eVal1 = null;

        ChalkParser.shift_math_expr_return eVal2 = null;


         
        	StringTemplate tmp = null; 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:646:2: (eVal1= shift_math_expr (tk= AMP eVal2= shift_math_expr )* )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:646:5: eVal1= shift_math_expr (tk= AMP eVal2= shift_math_expr )*
            {
            pushFollow(FOLLOW_shift_math_expr_in_and_math_expr1414);
            eVal1=shift_math_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.value = (eVal1!=null?eVal1.value:null); retval.code = (eVal1!=null?eVal1.code:null); 
            }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:647:3: (tk= AMP eVal2= shift_math_expr )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==AMP) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:647:5: tk= AMP eVal2= shift_math_expr
            	    {
            	    tk=(Token)match(input,AMP,FOLLOW_AMP_in_and_math_expr1426); if (state.failed) return retval;
            	    pushFollow(FOLLOW_shift_math_expr_in_and_math_expr1432);
            	    eVal2=shift_math_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {

            	      			tmp = retval.code;
            	      			retval.code = getTemplate("and_math_expr");	
            	      			retval.code.setAttribute("op1", tmp);
            	      			retval.code.setAttribute("op2", (eVal2!=null?eVal2.code:null));
            	      						
            	      			if (!(retval.value.isInt() && (eVal2!=null?eVal2.value:null).isInt()) &&
            	      				!(retval.value.isBool() && (eVal2!=null?eVal2.value:null).isBool()) ) 
            	      			{
            	      				putError(NOT_IMPLS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), retval.value.getType(), (eVal2!=null?eVal2.value:null).getType());
            	      				if (retval.value.isInt())
            	      					retval.value = new ExprValue(Name.INT_TYPE_ID, retval.value.line(), retval.value.pos());
            	      				else if (retval.value.isBool())
            	      					retval.value = new ExprValue(Name.BOOL_TYPE_ID, retval.value.line(), retval.value.pos());		
            	      				else 	
            	      					retval.value = new ExprValue(retval.value.line(), retval.value.pos());				
            	      			} else {		
            	      				if (retval.value.isInt())
            	      					retval.value = new ExprValue(Name.INT_TYPE_ID, retval.value.line(), retval.value.pos());
            	      				else 
            	      					retval.value = new ExprValue(Name.BOOL_TYPE_ID, retval.value.line(), retval.value.pos());
            	      			}	
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, and_math_expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "and_math_expr"

    public static class shift_math_expr_return extends ParserRuleReturnScope {
        public ExprValue value;
        public StringTemplate code;
    };

    // $ANTLR start "shift_math_expr"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:673:1: shift_math_expr returns [ ExprValue value, StringTemplate code ] : eVal1= additive_math_expr ( (tk= LT_LT | tk= GT_GT ) eVal2= additive_math_expr )* ;
    public final ChalkParser.shift_math_expr_return shift_math_expr() throws RecognitionException {
        ChalkParser.shift_math_expr_return retval = new ChalkParser.shift_math_expr_return();
        retval.start = input.LT(1);
        int shift_math_expr_StartIndex = input.index();
        Token tk=null;
        ChalkParser.additive_math_expr_return eVal1 = null;

        ChalkParser.additive_math_expr_return eVal2 = null;


         
        	StringTemplate tmp = null; 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:677:2: (eVal1= additive_math_expr ( (tk= LT_LT | tk= GT_GT ) eVal2= additive_math_expr )* )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:677:5: eVal1= additive_math_expr ( (tk= LT_LT | tk= GT_GT ) eVal2= additive_math_expr )*
            {
            pushFollow(FOLLOW_additive_math_expr_in_shift_math_expr1464);
            eVal1=additive_math_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.value = (eVal1!=null?eVal1.value:null); retval.code = (eVal1!=null?eVal1.code:null); 
            }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:678:3: ( (tk= LT_LT | tk= GT_GT ) eVal2= additive_math_expr )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=LT_LT && LA33_0<=GT_GT)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:679:4: (tk= LT_LT | tk= GT_GT ) eVal2= additive_math_expr
            	    {
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:679:4: (tk= LT_LT | tk= GT_GT )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==LT_LT) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==GT_GT) ) {
            	        alt32=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:679:6: tk= LT_LT
            	            {
            	            tk=(Token)match(input,LT_LT,FOLLOW_LT_LT_in_shift_math_expr1482); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	               tmp = retval.code; retval.code = getTemplate("shift_math_expr_ltlt"); 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:680:6: tk= GT_GT
            	            {
            	            tk=(Token)match(input,GT_GT,FOLLOW_GT_GT_in_shift_math_expr1495); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	               tmp = retval.code; retval.code = getTemplate("shift_math_expr_gtgt"); 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additive_math_expr_in_shift_math_expr1513);
            	    eVal2=additive_math_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {

            	      				retval.code.setAttribute("op1", tmp);
            	      				retval.code.setAttribute("op2", (eVal2!=null?eVal2.code:null));
            	      										
            	      				if (!retval.value.isInt() && !(eVal2!=null?eVal2.value:null).isInt()) {
            	      					putError(NOT_IMPLS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), retval.value.getType(), (eVal2!=null?eVal2.value:null).getType());
            	      					retval.value = new ExprValue(Name.INT_TYPE_ID, retval.value.line(), retval.value.pos());					
            	      				} else { 
            	      					retval.value = new ExprValue(Name.INT_TYPE_ID, retval.value.line(), retval.value.pos());
            	      				}
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, shift_math_expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shift_math_expr"

    public static class additive_math_expr_return extends ParserRuleReturnScope {
        public ExprValue value;
        public StringTemplate code;
    };

    // $ANTLR start "additive_math_expr"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:696:1: additive_math_expr returns [ ExprValue value, StringTemplate code ] : eVal1= multiplicative_math_expr ( (tk= PLUS | tk= MINUS ) eVal2= multiplicative_math_expr )* ;
    public final ChalkParser.additive_math_expr_return additive_math_expr() throws RecognitionException {
        ChalkParser.additive_math_expr_return retval = new ChalkParser.additive_math_expr_return();
        retval.start = input.LT(1);
        int additive_math_expr_StartIndex = input.index();
        Token tk=null;
        ChalkParser.multiplicative_math_expr_return eVal1 = null;

        ChalkParser.multiplicative_math_expr_return eVal2 = null;


         
        	StringTemplate tmp = null; 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:700:2: (eVal1= multiplicative_math_expr ( (tk= PLUS | tk= MINUS ) eVal2= multiplicative_math_expr )* )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:700:5: eVal1= multiplicative_math_expr ( (tk= PLUS | tk= MINUS ) eVal2= multiplicative_math_expr )*
            {
            pushFollow(FOLLOW_multiplicative_math_expr_in_additive_math_expr1547);
            eVal1=multiplicative_math_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.value = (eVal1!=null?eVal1.value:null); retval.code = (eVal1!=null?eVal1.code:null); 
            }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:701:3: ( (tk= PLUS | tk= MINUS ) eVal2= multiplicative_math_expr )*
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:702:4: (tk= PLUS | tk= MINUS ) eVal2= multiplicative_math_expr
            	    {
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:702:4: (tk= PLUS | tk= MINUS )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==PLUS) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==MINUS) ) {
            	        alt34=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:702:6: tk= PLUS
            	            {
            	            tk=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_math_expr1565); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	               tmp = retval.code; retval.code = getTemplate("additive_math_expr_p"); 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:703:6: tk= MINUS
            	            {
            	            tk=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_math_expr1578); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	               tmp = retval.code; retval.code = getTemplate("additive_math_expr_m"); 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_math_expr_in_additive_math_expr1595);
            	    eVal2=multiplicative_math_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {

            	      				retval.code.setAttribute("op1", tmp);
            	      				retval.code.setAttribute("op2", (eVal2!=null?eVal2.code:null));		
            	      									
            	      				if ((!retval.value.isInt() && !retval.value.isFloat()) ||
            	      					(!(eVal2!=null?eVal2.value:null).isInt() && !(eVal2!=null?eVal2.value:null).isFloat()))
            	      				{
            	      					putError(NOT_IMPLS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), retval.value.getType(), (eVal2!=null?eVal2.value:null).getType());
            	      					retval.value = new ExprValue(retval.value.line(), retval.value.pos());					
            	      				} else {	
            	      					if (retval.value.isInt() && (eVal2!=null?eVal2.value:null).isInt()) {
            	      						retval.value = new ExprValue(Name.INT_TYPE_ID, retval.value.line(), retval.value.pos());
            	      					} else {
            	      						retval.value = new ExprValue(Name.FLOAT_TYPE_ID, retval.value.line(), retval.value.pos());				
            	      					}
            	      				}
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, additive_math_expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additive_math_expr"

    public static class multiplicative_math_expr_return extends ParserRuleReturnScope {
        public ExprValue value;
        public StringTemplate code;
    };

    // $ANTLR start "multiplicative_math_expr"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:725:1: multiplicative_math_expr returns [ ExprValue value, StringTemplate code ] : eVal1= unary_math_expr ( (tk= STAR | tk= RSLASH | tk= MOD | tk= DIV ) eVal2= unary_math_expr )* ;
    public final ChalkParser.multiplicative_math_expr_return multiplicative_math_expr() throws RecognitionException {
        ChalkParser.multiplicative_math_expr_return retval = new ChalkParser.multiplicative_math_expr_return();
        retval.start = input.LT(1);
        int multiplicative_math_expr_StartIndex = input.index();
        Token tk=null;
        ChalkParser.unary_math_expr_return eVal1 = null;

        ChalkParser.unary_math_expr_return eVal2 = null;


         
        	StringTemplate tmp = null; 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:729:2: (eVal1= unary_math_expr ( (tk= STAR | tk= RSLASH | tk= MOD | tk= DIV ) eVal2= unary_math_expr )* )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:729:5: eVal1= unary_math_expr ( (tk= STAR | tk= RSLASH | tk= MOD | tk= DIV ) eVal2= unary_math_expr )*
            {
            pushFollow(FOLLOW_unary_math_expr_in_multiplicative_math_expr1628);
            eVal1=unary_math_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.value = (eVal1!=null?eVal1.value:null); retval.code = (eVal1!=null?eVal1.code:null); 
            }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:730:2: ( (tk= STAR | tk= RSLASH | tk= MOD | tk= DIV ) eVal2= unary_math_expr )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=STAR && LA37_0<=DIV)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:731:3: (tk= STAR | tk= RSLASH | tk= MOD | tk= DIV ) eVal2= unary_math_expr
            	    {
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:731:3: (tk= STAR | tk= RSLASH | tk= MOD | tk= DIV )
            	    int alt36=4;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt36=1;
            	        }
            	        break;
            	    case RSLASH:
            	        {
            	        alt36=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt36=3;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt36=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt36) {
            	        case 1 :
            	            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:731:5: tk= STAR
            	            {
            	            tk=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicative_math_expr1644); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	               tmp = retval.code; retval.code = getTemplate("multiplicative_math_expr_star"); 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:732:6: tk= RSLASH
            	            {
            	            tk=(Token)match(input,RSLASH,FOLLOW_RSLASH_in_multiplicative_math_expr1657); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	               tmp = retval.code; retval.code = getTemplate("multiplicative_math_expr_slash"); 
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:733:6: tk= MOD
            	            {
            	            tk=(Token)match(input,MOD,FOLLOW_MOD_in_multiplicative_math_expr1671); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	               tmp = retval.code; retval.code = getTemplate("multiplicative_math_expr_mod"); 
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:734:6: tk= DIV
            	            {
            	            tk=(Token)match(input,DIV,FOLLOW_DIV_in_multiplicative_math_expr1684); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	               tmp = retval.code; retval.code = getTemplate("multiplicative_math_expr_div"); 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_math_expr_in_multiplicative_math_expr1700);
            	    eVal2=unary_math_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {

            	      			retval.code.setAttribute("op1", tmp);
            	      			retval.code.setAttribute("op2", (eVal2!=null?eVal2.code:null));
            	      			
            	      			if ((!retval.value.isInt() && !retval.value.isFloat()) ||
            	      				(!(eVal2!=null?eVal2.value:null).isInt() && !(eVal2!=null?eVal2.value:null).isFloat()))
            	      			{
            	      				putError(NOT_IMPLS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), retval.value.getType(), (eVal2!=null?eVal2.value:null).getType());
            	      				retval.value = new ExprValue(retval.value.line(), retval.value.pos());				
            	      			} else { 
            	      				switch ((tk!=null?tk.getType():0)) 
            	      				{
            	      					case STAR:
            	      						if (retval.value.isInt() && (eVal2!=null?eVal2.value:null).isInt()) {
            	      							retval.value = new ExprValue(Name.INT_TYPE_ID, retval.value.line(), retval.value.pos());
            	      						} else {
            	      							retval.value = new ExprValue(Name.FLOAT_TYPE_ID, retval.value.line(), retval.value.pos());
            	      						}
            	      						break;
            	      					case RSLASH:
            	      						retval.value = new ExprValue(Name.FLOAT_TYPE_ID, retval.value.line(), retval.value.pos());
            	      						break;
            	      					case MOD:
            	      						if (retval.value.isInt() && (eVal2!=null?eVal2.value:null).isInt()) {
            	      							retval.value = new ExprValue(Name.INT_TYPE_ID, retval.value.line(), retval.value.pos());
            	      						} else {
            	      							retval.value = new ExprValue(Name.FLOAT_TYPE_ID, retval.value.line(), retval.value.pos());
            	      						}
            	      						break;	
            	      					case DIV:
            	      						if (!retval.value.isInt() || !(eVal2!=null?eVal2.value:null).isInt()) {
            	      							putError(NOT_IMPLS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), retval.value.getType(), (eVal2!=null?eVal2.value:null).getType());
            	      						} else {
            	      							retval.value = new ExprValue(Name.INT_TYPE_ID, retval.value.line(), retval.value.pos());
            	      						}
            	      						break;								
            	      				} 	
            	      			}				
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, multiplicative_math_expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplicative_math_expr"

    public static class unary_math_expr_return extends ParserRuleReturnScope {
        public ExprValue value;
        public StringTemplate code;
    };

    // $ANTLR start "unary_math_expr"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:778:1: unary_math_expr returns [ ExprValue value, StringTemplate code ] : ( type ':' eVal= unary_math_expr | (tk= PLUS | tk= MINUS | tk= TILDE | tk= SCREAMER ) eVal= unary_math_expr | eVal2= primary_math_expr (tk= SCREAMER | tk= STAR_STAR eVal3= unary_math_expr )? );
    public final ChalkParser.unary_math_expr_return unary_math_expr() throws RecognitionException {
        ChalkParser.unary_math_expr_return retval = new ChalkParser.unary_math_expr_return();
        retval.start = input.LT(1);
        int unary_math_expr_StartIndex = input.index();
        Token tk=null;
        ChalkParser.unary_math_expr_return eVal = null;

        ChalkParser.primary_math_expr_return eVal2 = null;

        ChalkParser.unary_math_expr_return eVal3 = null;

        ChalkParser.type_return type6 = null;



        	retval.code = getTemplate("empty_template");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:782:2: ( type ':' eVal= unary_math_expr | (tk= PLUS | tk= MINUS | tk= TILDE | tk= SCREAMER ) eVal= unary_math_expr | eVal2= primary_math_expr (tk= SCREAMER | tk= STAR_STAR eVal3= unary_math_expr )? )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==76) ) {
                    alt40=3;
                }
                else if ( (LA40_1==72) ) {
                    alt40=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
                }
                break;
            case 79:
                {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==76) ) {
                    alt40=3;
                }
                else if ( (LA40_2==72) ) {
                    alt40=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
                }
                break;
            case 98:
            case 99:
                {
                alt40=1;
                }
                break;
            case PLUS:
            case MINUS:
            case TILDE:
            case SCREAMER:
                {
                alt40=2;
                }
                break;
            case ID:
            case LPAREN:
            case READ_INT:
            case READ_FLOAT:
            case READ_STRING:
            case READ_BOOL:
            case PLUS_PLUS:
            case MINUS_MINUS:
            case MAX_TK:
            case MIN_TK:
            case DECIMAL_LITERAL:
            case FLOATING_POINT_LITERAL:
            case STRING_LITERAL:
            case TRUE:
            case FALSE:
            case 75:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:782:4: type ':' eVal= unary_math_expr
                    {
                    pushFollow(FOLLOW_type_in_unary_math_expr1728);
                    type6=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,72,FOLLOW_72_in_unary_math_expr1730); if (state.failed) return retval;
                    pushFollow(FOLLOW_unary_math_expr_in_unary_math_expr1736);
                    eVal=unary_math_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      			retval.value = new ExprValue((type6!=null?type6.idType:null), (type6!=null?type6.line:0), (type6!=null?type6.pos:0) + 1);
                      			if ((!(eVal!=null?eVal.value:null).isInt() && !(eVal!=null?eVal.value:null).isFloat()) ||
                      				(!Name.isIntT((type6!=null?type6.idType:null)) && !Name.isFloatT((type6!=null?type6.idType:null)))) 
                      			{
                      				putError(TYPE_ERROR, (type6!=null?type6.line:0), (type6!=null?type6.pos:0) + 1, (eVal!=null?eVal.value:null), (type6!=null?type6.idType:null));
                      			}
                      			
                      			if ((eVal!=null?eVal.value:null).isT((type6!=null?type6.idType:null)))
                      				retval.code = getTemplate("type_cast_eq2eq");
                      			else if ((eVal!=null?eVal.value:null).isFloat())
                      				retval.code = getTemplate("type_cast_float2int");
                      			else
                      				retval.code = getTemplate("type_cast_int2float");
                      				
                      			retval.code.setAttribute("op1", (eVal!=null?eVal.code:null));
                      		
                    }

                    }
                    break;
                case 2 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:799:4: (tk= PLUS | tk= MINUS | tk= TILDE | tk= SCREAMER ) eVal= unary_math_expr
                    {
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:799:4: (tk= PLUS | tk= MINUS | tk= TILDE | tk= SCREAMER )
                    int alt38=4;
                    switch ( input.LA(1) ) {
                    case PLUS:
                        {
                        alt38=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt38=2;
                        }
                        break;
                    case TILDE:
                        {
                        alt38=3;
                        }
                        break;
                    case SCREAMER:
                        {
                        alt38=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }

                    switch (alt38) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:799:6: tk= PLUS
                            {
                            tk=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_math_expr1751); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.code = getTemplate("plus_unary_math_expr"); 
                            }

                            }
                            break;
                        case 2 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:800:5: tk= MINUS
                            {
                            tk=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_math_expr1764); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.code = getTemplate("minus_unary_math_expr"); 
                            }

                            }
                            break;
                        case 3 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:801:5: tk= TILDE
                            {
                            tk=(Token)match(input,TILDE,FOLLOW_TILDE_in_unary_math_expr1777); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.code = getTemplate("tilde_unary_math_expr"); 
                            }

                            }
                            break;
                        case 4 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:802:5: tk= SCREAMER
                            {
                            tk=(Token)match(input,SCREAMER,FOLLOW_SCREAMER_in_unary_math_expr1791); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.code = getTemplate("scream_unary_math_expr"); 
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_unary_math_expr_in_unary_math_expr1803);
                    eVal=unary_math_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      			switch ((tk!=null?tk.getType():0)) 
                      			{
                      				case PLUS:
                      					if (!(eVal!=null?eVal.value:null).isInt() && !(eVal!=null?eVal.value:null).isFloat()) {
                      						putError(NOT_IMPL_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (tk!=null?tk.getText():null), (eVal!=null?eVal.value:null).getType());
                      						retval.value = new ExprValue((tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1);					
                      					} else {
                      						retval.value = new ExprValue((eVal!=null?eVal.value:null).getType(), (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1);
                      					}
                      					break;
                      				case MINUS:
                      					if (!(eVal!=null?eVal.value:null).isInt() && !(eVal!=null?eVal.value:null).isFloat()) {
                      						putError(NOT_IMPL_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (tk!=null?tk.getText():null), (eVal!=null?eVal.value:null).getType());
                      						retval.value = new ExprValue((tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1);					
                      					} else {
                      						retval.value = new ExprValue((eVal!=null?eVal.value:null).getType(), (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1);
                      					}
                      					break;
                      				case TILDE:
                      					retval.value = new ExprValue(Name.INT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1);
                      					if (!(eVal!=null?eVal.value:null).isInt()) {
                      						putError(NOT_IMPL_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (tk!=null?tk.getText():null), (eVal!=null?eVal.value:null).getType());
                      					}
                      					break;	
                      				case SCREAMER:
                      					retval.value = new ExprValue(Name.BOOL_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1);
                      					if (!(eVal!=null?eVal.value:null).isBool()) {
                      						putError(NOT_IMPL_ERROR, (eVal!=null?eVal.value:null).line(), (eVal!=null?eVal.value:null).pos(), (tk!=null?tk.getText():null), (eVal!=null?eVal.value:null).getType());
                      					}
                      					break;								
                      			}
                      			
                      			retval.code.setAttribute("op1", (eVal!=null?eVal.code:null)); 			
                      		
                    }

                    }
                    break;
                case 3 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:838:4: eVal2= primary_math_expr (tk= SCREAMER | tk= STAR_STAR eVal3= unary_math_expr )?
                    {
                    pushFollow(FOLLOW_primary_math_expr_in_unary_math_expr1814);
                    eVal2=primary_math_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:839:9: (tk= SCREAMER | tk= STAR_STAR eVal3= unary_math_expr )?
                    int alt39=3;
                    alt39 = dfa39.predict(input);
                    switch (alt39) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:839:13: tk= SCREAMER
                            {
                            tk=(Token)match(input,SCREAMER,FOLLOW_SCREAMER_in_unary_math_expr1832); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {

                                      		retval.value = new ExprValue(Name.INT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1);
                                      		retval.code = getTemplate("primary_math_expr_scream");
                              				if (!(eVal2!=null?eVal2.value:null).isInt()) {
                              					putError(NOT_IMPL_ERROR, (eVal2!=null?eVal2.value:null).line(), (eVal2!=null?eVal2.value:null).pos(), (tk!=null?tk.getText():null), (eVal2!=null?eVal2.value:null).getType());
                              				} else {
                              					retval.code.setAttribute("op1", (eVal2!=null?eVal2.code:null));
                              				}     		
                                      	
                            }

                            }
                            break;
                        case 2 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:848:11: tk= STAR_STAR eVal3= unary_math_expr
                            {
                            tk=(Token)match(input,STAR_STAR,FOLLOW_STAR_STAR_in_unary_math_expr1850); if (state.failed) return retval;
                            pushFollow(FOLLOW_unary_math_expr_in_unary_math_expr1856);
                            eVal3=unary_math_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {

                                      		retval.code = getTemplate("primary_math_expr_power");
                                      		retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (eVal2!=null?eVal2.value:null).line(), (eVal2!=null?eVal2.value:null).pos());
                                      		if ((!(eVal2!=null?eVal2.value:null).isInt() && !(eVal2!=null?eVal2.value:null).isFloat()) ||
                                      			(!(eVal3!=null?eVal3.value:null).isInt() && !(eVal3!=null?eVal3.value:null).isFloat())) 
                                      		{
                              					putError(NOT_IMPLS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), (eVal2!=null?eVal2.value:null).getType(), (eVal3!=null?eVal3.value:null).getType());
                              				} else {					
                              					retval.code.setAttribute("op1", (eVal2!=null?eVal2.code:null));
                              					retval.code.setAttribute("op2", (eVal3!=null?eVal3.code:null));
                              				}	
                                      	
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                              	if (retval.value == null) {
                              		retval.value = (eVal2!=null?eVal2.value:null); 
                              		retval.code = (eVal2!=null?eVal2.code:null);
                              	}
                              
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, unary_math_expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unary_math_expr"

    protected static class primary_math_expr_scope {
        List<ExprValue> args;
    }
    protected Stack primary_math_expr_stack = new Stack();

    public static class primary_math_expr_return extends ParserRuleReturnScope {
        public ExprValue value;
        public StringTemplate code;
    };

    // $ANTLR start "primary_math_expr"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:869:1: primary_math_expr returns [ ExprValue value, StringTemplate code ] : ( LPAREN eVal0= logic_expr RPAREN | (tk= READ_INT | tk= READ_FLOAT | tk= READ_STRING | tk= READ_BOOL ) | (tk= PLUS_PLUS | tk= MINUS_MINUS ) eVal= ID | tk= ID LPAREN (eValp= logic_expr ( ',' eValp= logic_expr )* )? RPAREN | eVal= ID (tk= PLUS_PLUS | tk= MINUS_MINUS ) | tk= ID | eVal1= literal | eVal2= constants | eVal3= math_lib_funcs );
    public final ChalkParser.primary_math_expr_return primary_math_expr() throws RecognitionException {
        primary_math_expr_stack.push(new primary_math_expr_scope());
        ChalkParser.primary_math_expr_return retval = new ChalkParser.primary_math_expr_return();
        retval.start = input.LT(1);
        int primary_math_expr_StartIndex = input.index();
        Token tk=null;
        Token eVal=null;
        Token LPAREN7=null;
        ChalkParser.logic_expr_return eVal0 = null;

        ChalkParser.logic_expr_return eValp = null;

        ChalkParser.literal_return eVal1 = null;

        ChalkParser.constants_return eVal2 = null;

        ChalkParser.math_lib_funcs_return eVal3 = null;



        	((primary_math_expr_scope)primary_math_expr_stack.peek()).args = new ArrayList<ExprValue>(0);
        	retval.code = getTemplate("empty_template");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:877:2: ( LPAREN eVal0= logic_expr RPAREN | (tk= READ_INT | tk= READ_FLOAT | tk= READ_STRING | tk= READ_BOOL ) | (tk= PLUS_PLUS | tk= MINUS_MINUS ) eVal= ID | tk= ID LPAREN (eValp= logic_expr ( ',' eValp= logic_expr )* )? RPAREN | eVal= ID (tk= PLUS_PLUS | tk= MINUS_MINUS ) | tk= ID | eVal1= literal | eVal2= constants | eVal3= math_lib_funcs )
            int alt46=9;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:877:5: LPAREN eVal0= logic_expr RPAREN
                    {
                    LPAREN7=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary_math_expr1905); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_expr_in_primary_math_expr1911);
                    eVal0=logic_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_primary_math_expr1913); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      		retval.value = (eVal0!=null?eVal0.value:null); 
                      		retval.value.setPoint(new Point((LPAREN7!=null?LPAREN7.getCharPositionInLine():0) + 1, (LPAREN7!=null?LPAREN7.getLine():0)));
                      		retval.code = getTemplate("primary_math_expr_parens");
                      		retval.code.setAttribute("op1", (eVal0!=null?eVal0.code:null));
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:883:5: (tk= READ_INT | tk= READ_FLOAT | tk= READ_STRING | tk= READ_BOOL )
                    {
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:883:5: (tk= READ_INT | tk= READ_FLOAT | tk= READ_STRING | tk= READ_BOOL )
                    int alt41=4;
                    switch ( input.LA(1) ) {
                    case READ_INT:
                        {
                        alt41=1;
                        }
                        break;
                    case READ_FLOAT:
                        {
                        alt41=2;
                        }
                        break;
                    case READ_STRING:
                        {
                        alt41=3;
                        }
                        break;
                    case READ_BOOL:
                        {
                        alt41=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }

                    switch (alt41) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:883:7: tk= READ_INT
                            {
                            tk=(Token)match(input,READ_INT,FOLLOW_READ_INT_in_primary_math_expr1927); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.code = getTemplate("read_int"); retval.value = new ExprValue(Name.INT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true); 
                            }

                            }
                            break;
                        case 2 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:884:5: tk= READ_FLOAT
                            {
                            tk=(Token)match(input,READ_FLOAT,FOLLOW_READ_FLOAT_in_primary_math_expr1940); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.code = getTemplate("read_float"); retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true); 
                            }

                            }
                            break;
                        case 3 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:885:5: tk= READ_STRING
                            {
                            tk=(Token)match(input,READ_STRING,FOLLOW_READ_STRING_in_primary_math_expr1953); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.code = getTemplate("read_string"); retval.value = new ExprValue(Name.STRING_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true); 
                            }

                            }
                            break;
                        case 4 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:886:5: tk= READ_BOOL
                            {
                            tk=(Token)match(input,READ_BOOL,FOLLOW_READ_BOOL_in_primary_math_expr1965); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.code = getTemplate("read_bool"); retval.value = new ExprValue(Name.BOOL_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true); 
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:888:4: (tk= PLUS_PLUS | tk= MINUS_MINUS ) eVal= ID
                    {
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:888:4: (tk= PLUS_PLUS | tk= MINUS_MINUS )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==PLUS_PLUS) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==MINUS_MINUS) ) {
                        alt42=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:888:6: tk= PLUS_PLUS
                            {
                            tk=(Token)match(input,PLUS_PLUS,FOLLOW_PLUS_PLUS_in_primary_math_expr1983); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.code = getTemplate("plusplus_id"); 
                            }

                            }
                            break;
                        case 2 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:889:5: tk= MINUS_MINUS
                            {
                            tk=(Token)match(input,MINUS_MINUS,FOLLOW_MINUS_MINUS_in_primary_math_expr1997); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.code = getTemplate("minusminus_id"); 
                            }

                            }
                            break;

                    }

                    eVal=(Token)match(input,ID,FOLLOW_ID_in_primary_math_expr2009); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      			Name varName = findVar(currentNamespace, (eVal!=null?eVal.getText():null));
                      			
                      			if (varName == null) {
                      				putError(UNDEF_ERROR, (eVal!=null?eVal.getLine():0), (eVal!=null?eVal.getCharPositionInLine():0) + 1, (eVal!=null?eVal.getText():null));
                      				retval.value = new ExprValue(Name.UNDEF_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, true, true);
                      			} else {
                      				retval.code.setAttribute("op1", varName.getId());	
                      						
                      				if (!Name.isIntT(varName.getType()) && !Name.isFloatT(varName.getType())) {
                      					putError(NOT_IMPL_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), varName.getType());
                      					retval.value = new ExprValue((tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1);
                      				} else {
                      					if (Name.isIntT(varName.getType())) {
                      						retval.value = new ExprValue(Name.INT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, true, true);
                      					} else {
                      						retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, true, true);
                      					}							
                      				}
                      			}
                      		
                    }

                    }
                    break;
                case 4 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:911:4: tk= ID LPAREN (eValp= logic_expr ( ',' eValp= logic_expr )* )? RPAREN
                    {
                    tk=(Token)match(input,ID,FOLLOW_ID_in_primary_math_expr2020); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.code = getTemplate("func_call"); 
                    }
                    match(input,LPAREN,FOLLOW_LPAREN_in_primary_math_expr2029); if (state.failed) return retval;
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:912:12: (eValp= logic_expr ( ',' eValp= logic_expr )* )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==ID||LA44_0==LPAREN||(LA44_0>=PLUS && LA44_0<=MINUS)||(LA44_0>=TILDE && LA44_0<=SCREAMER)||(LA44_0>=READ_INT && LA44_0<=FALSE)||LA44_0==75||LA44_0==79||(LA44_0>=85 && LA44_0<=99)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:912:14: eValp= logic_expr ( ',' eValp= logic_expr )*
                            {
                            pushFollow(FOLLOW_logic_expr_in_primary_math_expr2037);
                            eValp=logic_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               
                              			 				((primary_math_expr_scope)primary_math_expr_stack.peek()).args.add(eValp.value);
                              			 				retval.code.setAttribute("args", (eValp!=null?eValp.code:null)); 
                              			   			
                            }
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:915:12: ( ',' eValp= logic_expr )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==71) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:915:14: ',' eValp= logic_expr
                            	    {
                            	    match(input,71,FOLLOW_71_in_primary_math_expr2043); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_logic_expr_in_primary_math_expr2049);
                            	    eValp=logic_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {

                            	      							((primary_math_expr_scope)primary_math_expr_stack.peek()).args.add(eValp.value);
                            	      							retval.code.setAttribute("args", (eValp!=null?eValp.code:null));
                            	      				 		  
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop43;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_primary_math_expr2074); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      					
                      		FuncName func = rootSpace.findFuncById(new FuncName((tk!=null?tk.getText():null), -1).getId());
                      		
                      		if (func == null) {		
                      			putError(FUNC_UNDEF_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null));
                      			retval.value = new ExprValue(Name.UNDEF_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      		} else if (func.isMain()) {
                      			retval.code.setAttribute("name", func.getId());
                      			
                      			putError(MAIN_FUNC_CALL_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null));
                      			retval.value = new ExprValue((tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1);
                      		} else {
                      			retval.code.setAttribute("name", func.getId());
                      			retval.value = new ExprValue(func.getType(), (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      			
                      			if (!func.isCallCorrect(((primary_math_expr_scope)primary_math_expr_stack.peek()).args)) {
                      				putError(FUNC_PARAMS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), func.args2String(), func.getType(), ((primary_math_expr_scope)primary_math_expr_stack.peek()).args.toString());
                      			}
                      		}	
                      	
                    }

                    }
                    break;
                case 5 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:941:4: eVal= ID (tk= PLUS_PLUS | tk= MINUS_MINUS )
                    {
                    eVal=(Token)match(input,ID,FOLLOW_ID_in_primary_math_expr2085); if (state.failed) return retval;
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:942:3: (tk= PLUS_PLUS | tk= MINUS_MINUS )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==PLUS_PLUS) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==MINUS_MINUS) ) {
                        alt45=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:942:5: tk= PLUS_PLUS
                            {
                            tk=(Token)match(input,PLUS_PLUS,FOLLOW_PLUS_PLUS_in_primary_math_expr2096); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.code = getTemplate("primary_math_expr_plusplus"); 
                            }

                            }
                            break;
                        case 2 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:943:11: tk= MINUS_MINUS
                            {
                            tk=(Token)match(input,MINUS_MINUS,FOLLOW_MINUS_MINUS_in_primary_math_expr2115); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.code = getTemplate("primary_math_expr_minusminus"); 
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                        			Name varName = findVar(currentNamespace, (eVal!=null?eVal.getText():null));
                      			
                      			if (varName == null) {
                      				putError(UNDEF_ERROR, (eVal!=null?eVal.getLine():0), (eVal!=null?eVal.getCharPositionInLine():0) + 1, (eVal!=null?eVal.getText():null));
                      				retval.value = new ExprValue(Name.UNDEF_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, true, true);
                      			} else {		
                      				retval.code.setAttribute("op1", varName.getId());	
                      				
                      				if (!Name.isIntT(varName.getType()) && !Name.isFloatT(varName.getType())) {
                      					putError(NOT_IMPL_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), varName.getType());
                      					retval.value = new ExprValue((tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1);
                      				} else {
                      					if (Name.isIntT(varName.getType())) {
                      						retval.value = new ExprValue(Name.INT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, true, true);
                      					} else {
                      						retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, true, true);
                      					}							
                      				}
                      			}
                             	
                    }

                    }
                    break;
                case 6 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:965:5: tk= ID
                    {
                    tk=(Token)match(input,ID,FOLLOW_ID_in_primary_math_expr2139); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      			retval.code = getTemplate("primary_math_expr_id");
                      			Name varName = findVar(currentNamespace, (tk!=null?tk.getText():null));
                      				
                      			if (varName == null) {		
                      				putError(UNDEF_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null));
                      				retval.value = new ExprValue((tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1);
                      			} else {
                      				retval.code.setAttribute("id", varName.getId());	
                      				retval.value = new ExprValue(varName.getType(), (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, true, false);
                      			}
                      		
                    }

                    }
                    break;
                case 7 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:977:5: eVal1= literal
                    {
                    pushFollow(FOLLOW_literal_in_primary_math_expr2151);
                    eVal1=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.value = (eVal1!=null?eVal1.value:null); retval.code = (eVal1!=null?eVal1.code:null); 
                    }

                    }
                    break;
                case 8 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:978:5: eVal2= constants
                    {
                    pushFollow(FOLLOW_constants_in_primary_math_expr2165);
                    eVal2=constants();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.value = (eVal2!=null?eVal2.value:null); retval.code = (eVal2!=null?eVal2.code:null); 
                    }

                    }
                    break;
                case 9 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:979:5: eVal3= math_lib_funcs
                    {
                    pushFollow(FOLLOW_math_lib_funcs_in_primary_math_expr2178);
                    eVal3=math_lib_funcs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.value = (eVal3!=null?eVal3.value:null); retval.code = (eVal3!=null?eVal3.code:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, primary_math_expr_StartIndex); }
            primary_math_expr_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "primary_math_expr"

    public static class constants_return extends ParserRuleReturnScope {
        public ExprValue value;
        public StringTemplate code;
    };

    // $ANTLR start "constants"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:982:1: constants returns [ ExprValue value, StringTemplate code ] : (tk= 'CONST' '.' ( 'pi' | 'e' ) | tk= 'Float' '.' ( 'MAX_VALUE' | 'MIN_VALUE' | 'NEGATIVE_INFINITY' | 'POSITIVE_INFINITY' | 'NaN' ) | tk= 'Int' '.' ( 'MAX_VALUE' | 'MIN_VALUE' ) );
    public final ChalkParser.constants_return constants() throws RecognitionException {
        ChalkParser.constants_return retval = new ChalkParser.constants_return();
        retval.start = input.LT(1);
        int constants_StartIndex = input.index();
        Token tk=null;


        	retval.code = getTemplate("empty_template");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:986:2: (tk= 'CONST' '.' ( 'pi' | 'e' ) | tk= 'Float' '.' ( 'MAX_VALUE' | 'MIN_VALUE' | 'NEGATIVE_INFINITY' | 'POSITIVE_INFINITY' | 'NaN' ) | tk= 'Int' '.' ( 'MAX_VALUE' | 'MIN_VALUE' ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt50=1;
                }
                break;
            case 79:
                {
                alt50=2;
                }
                break;
            case 85:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:986:5: tk= 'CONST' '.' ( 'pi' | 'e' )
                    {
                    tk=(Token)match(input,75,FOLLOW_75_in_constants2205); if (state.failed) return retval;
                    match(input,76,FOLLOW_76_in_constants2207); if (state.failed) return retval;
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:987:3: ( 'pi' | 'e' )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==77) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==78) ) {
                        alt47=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:987:6: 'pi'
                            {
                            match(input,77,FOLLOW_77_in_constants2215); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               
                              				retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1); 
                              				retval.code = getTemplate("const_pi");
                              			
                            }

                            }
                            break;
                        case 2 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:991:6: 'e'
                            {
                            match(input,78,FOLLOW_78_in_constants2226); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               
                              				retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1);
                              				retval.code = getTemplate("const_e"); 
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:996:4: tk= 'Float' '.' ( 'MAX_VALUE' | 'MIN_VALUE' | 'NEGATIVE_INFINITY' | 'POSITIVE_INFINITY' | 'NaN' )
                    {
                    tk=(Token)match(input,79,FOLLOW_79_in_constants2245); if (state.failed) return retval;
                    match(input,76,FOLLOW_76_in_constants2247); if (state.failed) return retval;
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:997:3: ( 'MAX_VALUE' | 'MIN_VALUE' | 'NEGATIVE_INFINITY' | 'POSITIVE_INFINITY' | 'NaN' )
                    int alt48=5;
                    switch ( input.LA(1) ) {
                    case 80:
                        {
                        alt48=1;
                        }
                        break;
                    case 81:
                        {
                        alt48=2;
                        }
                        break;
                    case 82:
                        {
                        alt48=3;
                        }
                        break;
                    case 83:
                        {
                        alt48=4;
                        }
                        break;
                    case 84:
                        {
                        alt48=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }

                    switch (alt48) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:997:5: 'MAX_VALUE'
                            {
                            match(input,80,FOLLOW_80_in_constants2254); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               
                              				retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1);
                              				retval.code = getTemplate("float_max"); 
                              			
                            }

                            }
                            break;
                        case 2 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1001:5: 'MIN_VALUE'
                            {
                            match(input,81,FOLLOW_81_in_constants2264); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               
                              				retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1); 
                              				retval.code = getTemplate("float_min"); 
                              			
                            }

                            }
                            break;
                        case 3 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1005:5: 'NEGATIVE_INFINITY'
                            {
                            match(input,82,FOLLOW_82_in_constants2274); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               
                              				retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1); 
                              				retval.code = getTemplate("float_ni"); 
                              			
                            }

                            }
                            break;
                        case 4 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1009:5: 'POSITIVE_INFINITY'
                            {
                            match(input,83,FOLLOW_83_in_constants2282); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               
                              				retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1); 
                              				retval.code = getTemplate("float_pi");  
                              			
                            }

                            }
                            break;
                        case 5 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1013:5: 'NaN'
                            {
                            match(input,84,FOLLOW_84_in_constants2290); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               
                              				retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1); 
                              				retval.code = getTemplate("float_nan"); 
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1018:4: tk= 'Int' '.' ( 'MAX_VALUE' | 'MIN_VALUE' )
                    {
                    tk=(Token)match(input,85,FOLLOW_85_in_constants2308); if (state.failed) return retval;
                    match(input,76,FOLLOW_76_in_constants2310); if (state.failed) return retval;
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1019:3: ( 'MAX_VALUE' | 'MIN_VALUE' )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==80) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==81) ) {
                        alt49=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1019:5: 'MAX_VALUE'
                            {
                            match(input,80,FOLLOW_80_in_constants2316); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               
                              				retval.value = new ExprValue(Name.INT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1); 
                              				retval.code = getTemplate("int_max"); 
                              			
                            }

                            }
                            break;
                        case 2 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1023:5: 'MIN_VALUE'
                            {
                            match(input,81,FOLLOW_81_in_constants2326); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               
                              				retval.value = new ExprValue(Name.INT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1); 
                              				retval.code = getTemplate("int_min"); 
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch ( Exception ex ) {
             retval.value = new ExprValue((tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1); 
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, constants_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constants"

    protected static class math_lib_funcs_scope {
        List<ExprValue> args;
    }
    protected Stack math_lib_funcs_stack = new Stack();

    public static class math_lib_funcs_return extends ParserRuleReturnScope {
        public ExprValue value;
        public StringTemplate code;
    };

    // $ANTLR start "math_lib_funcs"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1031:1: math_lib_funcs returns [ ExprValue value, StringTemplate code ] : (tk= 'sin' LPAREN eVal= logic_expr RPAREN | tk= 'cos' LPAREN eVal= logic_expr RPAREN | tk= 'tan' LPAREN eVal= logic_expr RPAREN | tk= 'asin' LPAREN eVal= logic_expr RPAREN | tk= 'acos' LPAREN eVal= logic_expr RPAREN | tk= 'atan' LPAREN eVal= logic_expr RPAREN | tk= 'lg' LPAREN eVal= logic_expr RPAREN | tk= 'ln' LPAREN eVal= logic_expr RPAREN | tk= 'sqrt' LPAREN eVal= logic_expr RPAREN | (tk= MAX_TK | tk= MIN_TK ) LPAREN eVal= logic_expr ( ',' eVal1= logic_expr )+ RPAREN | tk= 'swaps' LPAREN eVal2= ID ',' eVal3= ID RPAREN | tk= 'swapv' LPAREN eVal4= ID ',' eVal5= ID RPAREN | tk= 'log' LPAREN eVal6= logic_expr ',' eVal7= logic_expr RPAREN );
    public final ChalkParser.math_lib_funcs_return math_lib_funcs() throws RecognitionException {
        math_lib_funcs_stack.push(new math_lib_funcs_scope());
        ChalkParser.math_lib_funcs_return retval = new ChalkParser.math_lib_funcs_return();
        retval.start = input.LT(1);
        int math_lib_funcs_StartIndex = input.index();
        Token tk=null;
        Token eVal2=null;
        Token eVal3=null;
        Token eVal4=null;
        Token eVal5=null;
        ChalkParser.logic_expr_return eVal = null;

        ChalkParser.logic_expr_return eVal1 = null;

        ChalkParser.logic_expr_return eVal6 = null;

        ChalkParser.logic_expr_return eVal7 = null;



        	((math_lib_funcs_scope)math_lib_funcs_stack.peek()).args = new ArrayList<ExprValue>(0);
        	retval.code = getTemplate("empty_template");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1039:2: (tk= 'sin' LPAREN eVal= logic_expr RPAREN | tk= 'cos' LPAREN eVal= logic_expr RPAREN | tk= 'tan' LPAREN eVal= logic_expr RPAREN | tk= 'asin' LPAREN eVal= logic_expr RPAREN | tk= 'acos' LPAREN eVal= logic_expr RPAREN | tk= 'atan' LPAREN eVal= logic_expr RPAREN | tk= 'lg' LPAREN eVal= logic_expr RPAREN | tk= 'ln' LPAREN eVal= logic_expr RPAREN | tk= 'sqrt' LPAREN eVal= logic_expr RPAREN | (tk= MAX_TK | tk= MIN_TK ) LPAREN eVal= logic_expr ( ',' eVal1= logic_expr )+ RPAREN | tk= 'swaps' LPAREN eVal2= ID ',' eVal3= ID RPAREN | tk= 'swapv' LPAREN eVal4= ID ',' eVal5= ID RPAREN | tk= 'log' LPAREN eVal6= logic_expr ',' eVal7= logic_expr RPAREN )
            int alt53=13;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt53=1;
                }
                break;
            case 87:
                {
                alt53=2;
                }
                break;
            case 88:
                {
                alt53=3;
                }
                break;
            case 89:
                {
                alt53=4;
                }
                break;
            case 90:
                {
                alt53=5;
                }
                break;
            case 91:
                {
                alt53=6;
                }
                break;
            case 92:
                {
                alt53=7;
                }
                break;
            case 93:
                {
                alt53=8;
                }
                break;
            case 94:
                {
                alt53=9;
                }
                break;
            case MAX_TK:
            case MIN_TK:
                {
                alt53=10;
                }
                break;
            case 95:
                {
                alt53=11;
                }
                break;
            case 96:
                {
                alt53=12;
                }
                break;
            case 97:
                {
                alt53=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1039:4: tk= 'sin' LPAREN eVal= logic_expr RPAREN
                    {
                    tk=(Token)match(input,86,FOLLOW_86_in_math_lib_funcs2370); if (state.failed) return retval;
                    match(input,LPAREN,FOLLOW_LPAREN_in_math_lib_funcs2372); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_expr_in_math_lib_funcs2378);
                    eVal=logic_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_math_lib_funcs2380); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      		retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      		retval.code = getTemplate("sin");
                      		retval.code.setAttribute("arg", (eVal!=null?eVal.code:null));
                      		
                      		if (!(eVal!=null?eVal.value:null).isInt() && !(eVal!=null?eVal.value:null).isFloat()) {
                      			putError(FUNC_PARAMS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, (eVal!=null?eVal.value:null).getType());
                      		}
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1048:5: tk= 'cos' LPAREN eVal= logic_expr RPAREN
                    {
                    tk=(Token)match(input,87,FOLLOW_87_in_math_lib_funcs2392); if (state.failed) return retval;
                    match(input,LPAREN,FOLLOW_LPAREN_in_math_lib_funcs2394); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_expr_in_math_lib_funcs2400);
                    eVal=logic_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_math_lib_funcs2402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      		retval.code = getTemplate("cos");
                      		retval.code.setAttribute("arg", (eVal!=null?eVal.code:null));
                      				
                      		if (!(eVal!=null?eVal.value:null).isInt() && !(eVal!=null?eVal.value:null).isFloat()) { 
                      			putError(FUNC_PARAMS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, (eVal!=null?eVal.value:null).getType());
                      		}
                      	
                    }

                    }
                    break;
                case 3 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1057:5: tk= 'tan' LPAREN eVal= logic_expr RPAREN
                    {
                    tk=(Token)match(input,88,FOLLOW_88_in_math_lib_funcs2415); if (state.failed) return retval;
                    match(input,LPAREN,FOLLOW_LPAREN_in_math_lib_funcs2417); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_expr_in_math_lib_funcs2423);
                    eVal=logic_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_math_lib_funcs2425); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      		retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      		retval.code = getTemplate("tan");
                      		retval.code.setAttribute("arg", (eVal!=null?eVal.code:null));
                      				
                      		if (!(eVal!=null?eVal.value:null).isInt() && (eVal!=null?eVal.value:null).isFloat()) {
                      			putError(FUNC_PARAMS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, (eVal!=null?eVal.value:null).getType());
                      		}	 
                      	
                    }

                    }
                    break;
                case 4 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1066:5: tk= 'asin' LPAREN eVal= logic_expr RPAREN
                    {
                    tk=(Token)match(input,89,FOLLOW_89_in_math_lib_funcs2437); if (state.failed) return retval;
                    match(input,LPAREN,FOLLOW_LPAREN_in_math_lib_funcs2439); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_expr_in_math_lib_funcs2445);
                    eVal=logic_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_math_lib_funcs2447); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      		retval.code = getTemplate("asin");
                      		retval.code.setAttribute("arg", (eVal!=null?eVal.code:null));
                      				
                      		if (!(eVal!=null?eVal.value:null).isInt() && !(eVal!=null?eVal.value:null).isFloat()) { 
                      			putError(FUNC_PARAMS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, (eVal!=null?eVal.value:null).getType());
                      		}
                      	
                    }

                    }
                    break;
                case 5 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1075:5: tk= 'acos' LPAREN eVal= logic_expr RPAREN
                    {
                    tk=(Token)match(input,90,FOLLOW_90_in_math_lib_funcs2459); if (state.failed) return retval;
                    match(input,LPAREN,FOLLOW_LPAREN_in_math_lib_funcs2461); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_expr_in_math_lib_funcs2467);
                    eVal=logic_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_math_lib_funcs2469); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      		retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      		retval.code = getTemplate("acos");
                      		retval.code.setAttribute("arg", (eVal!=null?eVal.code:null));
                      				
                      		if (!(eVal!=null?eVal.value:null).isInt() && !(eVal!=null?eVal.value:null).isFloat()) { 
                      			putError(FUNC_PARAMS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, (eVal!=null?eVal.value:null).getType());
                      		}
                      	
                    }

                    }
                    break;
                case 6 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1084:5: tk= 'atan' LPAREN eVal= logic_expr RPAREN
                    {
                    tk=(Token)match(input,91,FOLLOW_91_in_math_lib_funcs2481); if (state.failed) return retval;
                    match(input,LPAREN,FOLLOW_LPAREN_in_math_lib_funcs2483); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_expr_in_math_lib_funcs2489);
                    eVal=logic_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_math_lib_funcs2491); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      		retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      		retval.code = getTemplate("atan");
                      		retval.code.setAttribute("arg", (eVal!=null?eVal.code:null));
                      				
                      		if (!(eVal!=null?eVal.value:null).isInt() && !(eVal!=null?eVal.value:null).isFloat()) {
                      			putError(FUNC_PARAMS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, (eVal!=null?eVal.value:null).getType());
                      		}
                      	
                    }

                    }
                    break;
                case 7 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1093:5: tk= 'lg' LPAREN eVal= logic_expr RPAREN
                    {
                    tk=(Token)match(input,92,FOLLOW_92_in_math_lib_funcs2503); if (state.failed) return retval;
                    match(input,LPAREN,FOLLOW_LPAREN_in_math_lib_funcs2505); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_expr_in_math_lib_funcs2511);
                    eVal=logic_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_math_lib_funcs2513); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      		retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      		retval.code = getTemplate("lg");
                      		retval.code.setAttribute("arg", (eVal!=null?eVal.code:null));
                      				
                      		if (!(eVal!=null?eVal.value:null).isInt() && !(eVal!=null?eVal.value:null).isFloat()) {		
                      			putError(FUNC_PARAMS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, (eVal!=null?eVal.value:null).getType());
                      		}
                      	
                    }

                    }
                    break;
                case 8 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1102:5: tk= 'ln' LPAREN eVal= logic_expr RPAREN
                    {
                    tk=(Token)match(input,93,FOLLOW_93_in_math_lib_funcs2525); if (state.failed) return retval;
                    match(input,LPAREN,FOLLOW_LPAREN_in_math_lib_funcs2527); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_expr_in_math_lib_funcs2533);
                    eVal=logic_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_math_lib_funcs2535); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      		retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      		retval.code = getTemplate("ln");
                      		retval.code.setAttribute("arg", (eVal!=null?eVal.code:null));
                      				
                      		if (!(eVal!=null?eVal.value:null).isInt() && !(eVal!=null?eVal.value:null).isFloat()) {		
                      			putError(FUNC_PARAMS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, (eVal!=null?eVal.value:null).getType());
                      		}
                      	
                    }

                    }
                    break;
                case 9 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1111:5: tk= 'sqrt' LPAREN eVal= logic_expr RPAREN
                    {
                    tk=(Token)match(input,94,FOLLOW_94_in_math_lib_funcs2547); if (state.failed) return retval;
                    match(input,LPAREN,FOLLOW_LPAREN_in_math_lib_funcs2549); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_expr_in_math_lib_funcs2555);
                    eVal=logic_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_math_lib_funcs2557); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      		retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      		retval.code = getTemplate("sqrt");
                      		retval.code.setAttribute("arg", (eVal!=null?eVal.code:null));
                      				
                      		if (!(eVal!=null?eVal.value:null).isInt() && !(eVal!=null?eVal.value:null).isFloat()) {		
                      			putError(FUNC_PARAMS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), Name.FLOAT_TYPE_ID, Name.FLOAT_TYPE_ID, (eVal!=null?eVal.value:null).getType());
                      		}	 
                      	
                    }

                    }
                    break;
                case 10 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1120:5: (tk= MAX_TK | tk= MIN_TK ) LPAREN eVal= logic_expr ( ',' eVal1= logic_expr )+ RPAREN
                    {
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1120:5: (tk= MAX_TK | tk= MIN_TK )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==MAX_TK) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==MIN_TK) ) {
                        alt51=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1120:7: tk= MAX_TK
                            {
                            tk=(Token)match(input,MAX_TK,FOLLOW_MAX_TK_in_math_lib_funcs2572); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1121:6: tk= MIN_TK
                            {
                            tk=(Token)match(input,MIN_TK,FOLLOW_MIN_TK_in_math_lib_funcs2584); if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,LPAREN,FOLLOW_LPAREN_in_math_lib_funcs2591); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_expr_in_math_lib_funcs2597);
                    eVal=logic_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      			if ((eVal!=null?eVal.value:null).isInt()) {
                      				if ((tk!=null?tk.getType():0) == MAX_TK)
                      					retval.code = getTemplate("max_int");
                      				else
                      					retval.code = getTemplate("min_int");
                      			} else {
                      				if ((tk!=null?tk.getType():0) == MAX_TK)
                      					retval.code = getTemplate("max_float");
                      				else
                      					retval.code = getTemplate("min_float");
                      			}
                      					
                      			((math_lib_funcs_scope)math_lib_funcs_stack.peek()).args.add((eVal!=null?eVal.value:null));
                      			retval.code.setAttribute("args", (eVal!=null?eVal.code:null));		
                      		
                    }
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1137:5: ( ',' eVal1= logic_expr )+
                    int cnt52=0;
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==71) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1137:7: ',' eVal1= logic_expr
                    	    {
                    	    match(input,71,FOLLOW_71_in_math_lib_funcs2603); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_logic_expr_in_math_lib_funcs2609);
                    	    eVal1=logic_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {

                    	      				((math_lib_funcs_scope)math_lib_funcs_stack.peek()).args.add((eVal1!=null?eVal1.value:null));	
                    	      				retval.code.setAttribute("args", (eVal1!=null?eVal1.code:null));				
                    	      			
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt52 >= 1 ) break loop52;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(52, input);
                                throw eee;
                        }
                        cnt52++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				boolean error = false;
                      				retval.value = new ExprValue(Name.UNDEF_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      						
                      				if (((math_lib_funcs_scope)math_lib_funcs_stack.peek()).args.size() > 1) {
                      					for (int i = 0; i < ((math_lib_funcs_scope)math_lib_funcs_stack.peek()).args.size() - 1; i++) {
                      						if (!((math_lib_funcs_scope)math_lib_funcs_stack.peek()).args.get(i).isT(((math_lib_funcs_scope)math_lib_funcs_stack.peek()).args.get(i+1).getType())) {
                      							putError(FUNC_PARAMS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), "[any type, any type...]", "[any type]", ((math_lib_funcs_scope)math_lib_funcs_stack.peek()).args.toString());
                      							error = true;
                      							break;
                      						}
                      					}  	
                      				}
                      				
                      				if (!error) {
                      					retval.value = new ExprValue(((math_lib_funcs_scope)math_lib_funcs_stack.peek()).args.get(0).getType(), (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      				}	
                      			
                    }
                    match(input,RPAREN,FOLLOW_RPAREN_in_math_lib_funcs2617); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1158:5: tk= 'swaps' LPAREN eVal2= ID ',' eVal3= ID RPAREN
                    {
                    tk=(Token)match(input,95,FOLLOW_95_in_math_lib_funcs2627); if (state.failed) return retval;
                    match(input,LPAREN,FOLLOW_LPAREN_in_math_lib_funcs2629); if (state.failed) return retval;
                    eVal2=(Token)match(input,ID,FOLLOW_ID_in_math_lib_funcs2635); if (state.failed) return retval;
                    match(input,71,FOLLOW_71_in_math_lib_funcs2637); if (state.failed) return retval;
                    eVal3=(Token)match(input,ID,FOLLOW_ID_in_math_lib_funcs2643); if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_math_lib_funcs2645); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      			retval.code = getTemplate("swaps"); 
                      				
                      			retval.value = new ExprValue(Name.UNDEF_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      			boolean error = false;
                      			
                      			Name varName2 = findVar(currentNamespace, (eVal2!=null?eVal2.getText():null));		
                      			if (varName2 == null) {		
                      				error = true;
                      				putError(UNDEF_ERROR, (eVal2!=null?eVal2.getLine():0), (eVal2!=null?eVal2.getCharPositionInLine():0) + 1, (eVal2!=null?eVal2.getText():null));
                      			}
                      			
                      			Name varName3 = findVar(currentNamespace, (eVal3!=null?eVal3.getText():null));		
                      			if (varName3 == null) {		
                      				error = true;
                      				putError(UNDEF_ERROR, (eVal3!=null?eVal3.getLine():0), (eVal3!=null?eVal3.getCharPositionInLine():0) + 1, (eVal3!=null?eVal3.getText():null));
                      			}
                      			
                      			if (!error) {
                      				retval.code.setAttribute("op1", varName2.getId());	
                      				retval.code.setAttribute("op2", varName3.getId());	
                      				
                      				if (!Name.isIntT((eVal2!=null?eVal2.getText():null)) && !Name.isFloatT((eVal2!=null?eVal2.getText():null))) {
                      					putError(FUNC_PARAM_ERROR, (eVal2!=null?eVal2.getLine():0), (eVal2!=null?eVal2.getCharPositionInLine():0), (tk!=null?tk.getText():null));
                      				} else if (!(eVal3!=null?eVal3.getText():null).equals(Name.INT_TYPE_ID) && !(eVal3!=null?eVal3.getText():null).equals(Name.FLOAT_TYPE_ID)) {
                      					putError(FUNC_PARAM_ERROR, (eVal3!=null?eVal3.getLine():0), (eVal3!=null?eVal3.getCharPositionInLine():0), (tk!=null?tk.getText():null));
                      				}
                      			}	
                      		
                    }

                    }
                    break;
                case 12 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1187:4: tk= 'swapv' LPAREN eVal4= ID ',' eVal5= ID RPAREN
                    {
                    tk=(Token)match(input,96,FOLLOW_96_in_math_lib_funcs2656); if (state.failed) return retval;
                    match(input,LPAREN,FOLLOW_LPAREN_in_math_lib_funcs2658); if (state.failed) return retval;
                    eVal4=(Token)match(input,ID,FOLLOW_ID_in_math_lib_funcs2664); if (state.failed) return retval;
                    match(input,71,FOLLOW_71_in_math_lib_funcs2666); if (state.failed) return retval;
                    eVal5=(Token)match(input,ID,FOLLOW_ID_in_math_lib_funcs2672); if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_math_lib_funcs2674); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      			retval.value = new ExprValue(Name.UNDEF_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      			boolean error = false;
                      			retval.code = getTemplate("swapv");	
                      			
                      			Name varName4 = findVar(currentNamespace, (eVal4!=null?eVal4.getText():null));		
                      			if (varName4 == null) {		
                      				error = true;
                      				putError(UNDEF_ERROR, (eVal4!=null?eVal4.getLine():0), (eVal4!=null?eVal4.getCharPositionInLine():0) + 1, (eVal4!=null?eVal4.getText():null));
                      			}
                      			
                      			Name varName5 = findVar(currentNamespace, (eVal5!=null?eVal5.getText():null));		
                      			if (varName5 == null) {		
                      				error = true;
                      				putError(UNDEF_ERROR, (eVal5!=null?eVal5.getLine():0), (eVal5!=null?eVal5.getCharPositionInLine():0) + 1, (eVal5!=null?eVal5.getText():null));
                      			}
                      			
                      			if (!error) {
                      				retval.code.setAttribute("arg1", varName4.getId());
                      				retval.code.setAttribute("arg2", varName5.getId());
                      				
                      				if (!Name.typeIsT(varName4.getType(), varName5.getType())) {
                      					putError(FUNC_PARAM_ERROR, (eVal4!=null?eVal4.getLine():0), (eVal4!=null?eVal4.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null));
                      				}
                      			
                      				if (Name.isIntT(varName4.getType())) {
                      					retval.code.setAttribute("castType", getTemplate("cast_type_int"));
                      				} else if (Name.isFloatT(varName4.getType())) {
                      					retval.code.setAttribute("castType", getTemplate("cast_type_float"));
                      				} else if (Name.isStringT(varName4.getType())) {
                      					retval.code.setAttribute("castType", getTemplate("cast_type_str"));
                      				} else {
                      					retval.code.setAttribute("castType", getTemplate("cast_type_bool"));
                      				}	
                      			}
                      		
                    }

                    }
                    break;
                case 13 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1223:5: tk= 'log' LPAREN eVal6= logic_expr ',' eVal7= logic_expr RPAREN
                    {
                    tk=(Token)match(input,97,FOLLOW_97_in_math_lib_funcs2687); if (state.failed) return retval;
                    match(input,LPAREN,FOLLOW_LPAREN_in_math_lib_funcs2689); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_expr_in_math_lib_funcs2695);
                    eVal6=logic_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,71,FOLLOW_71_in_math_lib_funcs2697); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_expr_in_math_lib_funcs2703);
                    eVal7=logic_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_math_lib_funcs2705); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      			retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, false, true);
                      			retval.code = getTemplate("log");
                      			retval.code.setAttribute("arg1", (eVal6!=null?eVal6.code:null));	
                      			retval.code.setAttribute("arg2", (eVal7!=null?eVal7.code:null));
                      			
                      			if ((!(eVal6!=null?eVal6.value:null).isInt() && !(eVal6!=null?eVal6.value:null).isFloat()) ||
                      				(!(eVal7!=null?eVal7.value:null).isInt() && !(eVal7!=null?eVal7.value:null).isFloat()))
                      			{
                      				putError(FUNC_PARAMS_ERROR, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1, (tk!=null?tk.getText():null), "[any_type, any_type]", Name.FLOAT_TYPE_ID, "[" + (eVal6!=null?eVal6.value:null).getType() + ", " + (eVal7!=null?eVal7.value:null).getType() + "]");
                      			}
                      		
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, math_lib_funcs_StartIndex); }
            math_lib_funcs_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "math_lib_funcs"

    public static class type_return extends ParserRuleReturnScope {
        public String idType;
        public int line;
        public int pos;
        public StringTemplate code;
    };

    // $ANTLR start "type"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1237:1: type returns [ String idType, int line, int pos, StringTemplate code ] : (tk= 'Int' | tk= 'Float' | tk= 'String' | tk= 'Bool' );
    public final ChalkParser.type_return type() throws RecognitionException {
        ChalkParser.type_return retval = new ChalkParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Token tk=null;


        	retval.code = getTemplate("empty_template");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1241:2: (tk= 'Int' | tk= 'Float' | tk= 'String' | tk= 'Bool' )
            int alt54=4;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt54=1;
                }
                break;
            case 79:
                {
                alt54=2;
                }
                break;
            case 98:
                {
                alt54=3;
                }
                break;
            case 99:
                {
                alt54=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1241:5: tk= 'Int'
                    {
                    tk=(Token)match(input,85,FOLLOW_85_in_type2732); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      			retval.idType = Name.INT_TYPE_ID; retval.line = (tk!=null?tk.getLine():0); retval.pos = (tk!=null?tk.getCharPositionInLine():0); 
                      			retval.code = getTemplate("type_int");
                      		
                    }

                    }
                    break;
                case 2 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1245:5: tk= 'Float'
                    {
                    tk=(Token)match(input,79,FOLLOW_79_in_type2746); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      			retval.idType = Name.FLOAT_TYPE_ID; retval.line = (tk!=null?tk.getLine():0); retval.pos = (tk!=null?tk.getCharPositionInLine():0); 
                      			retval.code = getTemplate("type_float");
                      		
                    }

                    }
                    break;
                case 3 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1249:4: tk= 'String'
                    {
                    tk=(Token)match(input,98,FOLLOW_98_in_type2758); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      			retval.idType = Name.STRING_TYPE_ID; retval.line = (tk!=null?tk.getLine():0); retval.pos = (tk!=null?tk.getCharPositionInLine():0);
                      			retval.code = getTemplate("type_string");
                      		
                    }

                    }
                    break;
                case 4 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1253:5: tk= 'Bool'
                    {
                    tk=(Token)match(input,99,FOLLOW_99_in_type2771); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      			retval.idType = Name.BOOL_TYPE_ID; retval.line = (tk!=null?tk.getLine():0); retval.pos = (tk!=null?tk.getCharPositionInLine():0); 
                      			retval.code = getTemplate("type_bool");
                      		
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class literal_return extends ParserRuleReturnScope {
        public ExprValue value;
        public StringTemplate code;
    };

    // $ANTLR start "literal"
    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1259:1: literal returns [ ExprValue value, StringTemplate code ] : (tk= DECIMAL_LITERAL | tk= FLOATING_POINT_LITERAL | tk= STRING_LITERAL | tk= TRUE | tk= FALSE );
    public final ChalkParser.literal_return literal() throws RecognitionException {
        ChalkParser.literal_return retval = new ChalkParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        Token tk=null;


        	retval.code = getTemplate("literal");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1263:2: (tk= DECIMAL_LITERAL | tk= FLOATING_POINT_LITERAL | tk= STRING_LITERAL | tk= TRUE | tk= FALSE )
            int alt55=5;
            switch ( input.LA(1) ) {
            case DECIMAL_LITERAL:
                {
                alt55=1;
                }
                break;
            case FLOATING_POINT_LITERAL:
                {
                alt55=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt55=3;
                }
                break;
            case TRUE:
                {
                alt55=4;
                }
                break;
            case FALSE:
                {
                alt55=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1263:6: tk= DECIMAL_LITERAL
                    {
                    tk=(Token)match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_literal2801); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      			retval.value = new ExprValue(Name.INT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1); 
                      			retval.code.setAttribute("lit", (tk!=null?tk.getText():null));
                      		
                    }

                    }
                    break;
                case 2 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1267:6: tk= FLOATING_POINT_LITERAL
                    {
                    tk=(Token)match(input,FLOATING_POINT_LITERAL,FOLLOW_FLOATING_POINT_LITERAL_in_literal2814); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      			retval.value = new ExprValue(Name.FLOAT_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1); 
                      			retval.code.setAttribute("lit", (tk!=null?tk.getText():null));
                      		
                    }

                    }
                    break;
                case 3 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1271:4: tk= STRING_LITERAL
                    {
                    tk=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_literal2825); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      			retval.value = new ExprValue(Name.STRING_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1); 
                      			retval.code.setAttribute("lit", (tk!=null?tk.getText():null));
                      		
                    }

                    }
                    break;
                case 4 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1275:6: tk= TRUE
                    {
                    tk=(Token)match(input,TRUE,FOLLOW_TRUE_in_literal2840); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      			retval.value = new ExprValue(Name.BOOL_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1); 
                      			retval.code.setAttribute("lit", true);
                      		
                    }

                    }
                    break;
                case 5 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1279:4: tk= FALSE
                    {
                    tk=(Token)match(input,FALSE,FOLLOW_FALSE_in_literal2855); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                      			retval.value = new ExprValue(Name.BOOL_TYPE_ID, (tk!=null?tk.getLine():0), (tk!=null?tk.getCharPositionInLine():0) + 1); 
                      			retval.code.setAttribute("lit", false);
                      		
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    // $ANTLR start synpred18_Chalk
    public final void synpred18_Chalk_fragment() throws RecognitionException {   
        ChalkParser.logic_expr_return t = null;


        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:290:57: (t= logic_expr ( ',' t= logic_expr )* )
        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:290:57: t= logic_expr ( ',' t= logic_expr )*
        {
        pushFollow(FOLLOW_logic_expr_in_synpred18_Chalk532);
        t=logic_expr();

        state._fsp--;
        if (state.failed) return ;
        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:291:4: ( ',' t= logic_expr )*
        loop57:
        do {
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==71) ) {
                alt57=1;
            }


            switch (alt57) {
        	case 1 :
        	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:291:6: ',' t= logic_expr
        	    {
        	    match(input,71,FOLLOW_71_in_synpred18_Chalk541); if (state.failed) return ;
        	    pushFollow(FOLLOW_logic_expr_in_synpred18_Chalk547);
        	    t=logic_expr();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop57;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred18_Chalk

    // $ANTLR start synpred36_Chalk
    public final void synpred36_Chalk_fragment() throws RecognitionException {   
        ChalkParser.logic_expr_return eVal = null;


        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:496:22: (eVal= logic_expr )
        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:496:22: eVal= logic_expr
        {
        pushFollow(FOLLOW_logic_expr_in_synpred36_Chalk1013);
        eVal=logic_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_Chalk

    // $ANTLR start synpred51_Chalk
    public final void synpred51_Chalk_fragment() throws RecognitionException {   
        Token tk=null;
        ChalkParser.multiplicative_math_expr_return eVal2 = null;


        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:702:4: ( (tk= PLUS | tk= MINUS ) eVal2= multiplicative_math_expr )
        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:702:4: (tk= PLUS | tk= MINUS ) eVal2= multiplicative_math_expr
        {
        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:702:4: (tk= PLUS | tk= MINUS )
        int alt64=2;
        int LA64_0 = input.LA(1);

        if ( (LA64_0==PLUS) ) {
            alt64=1;
        }
        else if ( (LA64_0==MINUS) ) {
            alt64=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 64, 0, input);

            throw nvae;
        }
        switch (alt64) {
            case 1 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:702:6: tk= PLUS
                {
                tk=(Token)match(input,PLUS,FOLLOW_PLUS_in_synpred51_Chalk1565); if (state.failed) return ;

                }
                break;
            case 2 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:703:6: tk= MINUS
                {
                tk=(Token)match(input,MINUS,FOLLOW_MINUS_in_synpred51_Chalk1578); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_multiplicative_math_expr_in_synpred51_Chalk1595);
        eVal2=multiplicative_math_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_Chalk

    // $ANTLR start synpred61_Chalk
    public final void synpred61_Chalk_fragment() throws RecognitionException {   
        Token tk=null;

        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:839:13: (tk= SCREAMER )
        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:839:13: tk= SCREAMER
        {
        tk=(Token)match(input,SCREAMER,FOLLOW_SCREAMER_in_synpred61_Chalk1832); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_Chalk

    // $ANTLR start synpred72_Chalk
    public final void synpred72_Chalk_fragment() throws RecognitionException {   
        Token tk=null;
        ChalkParser.logic_expr_return eValp = null;


        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:911:4: (tk= ID LPAREN (eValp= logic_expr ( ',' eValp= logic_expr )* )? RPAREN )
        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:911:4: tk= ID LPAREN (eValp= logic_expr ( ',' eValp= logic_expr )* )? RPAREN
        {
        tk=(Token)match(input,ID,FOLLOW_ID_in_synpred72_Chalk2020); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred72_Chalk2029); if (state.failed) return ;
        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:912:12: (eValp= logic_expr ( ',' eValp= logic_expr )* )?
        int alt71=2;
        int LA71_0 = input.LA(1);

        if ( (LA71_0==ID||LA71_0==LPAREN||(LA71_0>=PLUS && LA71_0<=MINUS)||(LA71_0>=TILDE && LA71_0<=SCREAMER)||(LA71_0>=READ_INT && LA71_0<=FALSE)||LA71_0==75||LA71_0==79||(LA71_0>=85 && LA71_0<=99)) ) {
            alt71=1;
        }
        switch (alt71) {
            case 1 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:912:14: eValp= logic_expr ( ',' eValp= logic_expr )*
                {
                pushFollow(FOLLOW_logic_expr_in_synpred72_Chalk2037);
                eValp=logic_expr();

                state._fsp--;
                if (state.failed) return ;
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:915:12: ( ',' eValp= logic_expr )*
                loop70:
                do {
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==71) ) {
                        alt70=1;
                    }


                    switch (alt70) {
                	case 1 :
                	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:915:14: ',' eValp= logic_expr
                	    {
                	    match(input,71,FOLLOW_71_in_synpred72_Chalk2043); if (state.failed) return ;
                	    pushFollow(FOLLOW_logic_expr_in_synpred72_Chalk2049);
                	    eValp=logic_expr();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop70;
                    }
                } while (true);


                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred72_Chalk2074); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_Chalk

    // $ANTLR start synpred74_Chalk
    public final void synpred74_Chalk_fragment() throws RecognitionException {   
        Token eVal=null;
        Token tk=null;

        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:941:4: (eVal= ID (tk= PLUS_PLUS | tk= MINUS_MINUS ) )
        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:941:4: eVal= ID (tk= PLUS_PLUS | tk= MINUS_MINUS )
        {
        eVal=(Token)match(input,ID,FOLLOW_ID_in_synpred74_Chalk2085); if (state.failed) return ;
        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:942:3: (tk= PLUS_PLUS | tk= MINUS_MINUS )
        int alt72=2;
        int LA72_0 = input.LA(1);

        if ( (LA72_0==PLUS_PLUS) ) {
            alt72=1;
        }
        else if ( (LA72_0==MINUS_MINUS) ) {
            alt72=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 72, 0, input);

            throw nvae;
        }
        switch (alt72) {
            case 1 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:942:5: tk= PLUS_PLUS
                {
                tk=(Token)match(input,PLUS_PLUS,FOLLOW_PLUS_PLUS_in_synpred74_Chalk2096); if (state.failed) return ;

                }
                break;
            case 2 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:943:11: tk= MINUS_MINUS
                {
                tk=(Token)match(input,MINUS_MINUS,FOLLOW_MINUS_MINUS_in_synpred74_Chalk2115); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred74_Chalk

    // $ANTLR start synpred75_Chalk
    public final void synpred75_Chalk_fragment() throws RecognitionException {   
        Token tk=null;

        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:965:5: (tk= ID )
        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:965:5: tk= ID
        {
        tk=(Token)match(input,ID,FOLLOW_ID_in_synpred75_Chalk2139); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_Chalk

    // Delegated rules

    public final boolean synpred72_Chalk() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_Chalk_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_Chalk() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_Chalk_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_Chalk() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_Chalk_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_Chalk() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_Chalk_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_Chalk() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_Chalk_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_Chalk() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_Chalk_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_Chalk() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_Chalk_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA9_eotS =
        "\13\uffff";
    static final String DFA9_eofS =
        "\13\uffff";
    static final String DFA9_minS =
        "\1\4\1\uffff\4\4\5\uffff";
    static final String DFA9_maxS =
        "\1\143\1\uffff\2\114\2\110\5\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\4\uffff\1\3\1\4\1\5\1\6\1\2";
    static final String DFA9_specialS =
        "\13\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\6\2\uffff\1\6\11\uffff\1\7\2\uffff\2\10\1\uffff\1\10\3\uffff"+
            "\3\11\15\uffff\2\6\4\uffff\2\6\1\uffff\15\6\10\uffff\2\1\1\6"+
            "\3\uffff\1\3\5\uffff\1\2\14\6\1\4\1\5",
            "",
            "\1\12\103\uffff\1\6\3\uffff\1\6",
            "\1\12\103\uffff\1\6\3\uffff\1\6",
            "\1\12\103\uffff\1\6",
            "\1\12\103\uffff\1\6",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "271:1: stmt[Namespace space] returns [ StringTemplate code ] : (t= print_stmt[space] | t= var_declaration[space, getTemplate(\"var_declaration\")] | t= assigment_stmt[space] | t= selection_stmt[space] | t= iteration_stmt[space] | t= jump_stmt[space] );";
        }
    }
    static final String DFA12_eotS =
        "\64\uffff";
    static final String DFA12_eofS =
        "\1\45\63\uffff";
    static final String DFA12_minS =
        "\1\4\44\0\17\uffff";
    static final String DFA12_maxS =
        "\1\143\44\0\17\uffff";
    static final String DFA12_acceptS =
        "\45\uffff\1\2\15\uffff\1\1";
    static final String DFA12_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\17\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\20\2\uffff\1\11\1\uffff\1\45\7\uffff\7\45\3\uffff\3\45\15"+
            "\uffff\1\5\1\6\4\uffff\1\7\1\10\1\uffff\1\12\1\13\1\14\1\15"+
            "\1\16\1\17\1\40\1\41\1\21\1\22\1\23\1\24\1\25\10\uffff\2\45"+
            "\1\26\3\uffff\1\2\5\uffff\1\1\1\27\1\30\1\31\1\32\1\33\1\34"+
            "\1\35\1\36\1\37\1\42\1\43\1\44\1\3\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "290:55: (t= logic_expr ( ',' t= logic_expr )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_10 = input.LA(1);

                         
                        int index12_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_11 = input.LA(1);

                         
                        int index12_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_12 = input.LA(1);

                         
                        int index12_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_13 = input.LA(1);

                         
                        int index12_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_14 = input.LA(1);

                         
                        int index12_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_15 = input.LA(1);

                         
                        int index12_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_16 = input.LA(1);

                         
                        int index12_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_17 = input.LA(1);

                         
                        int index12_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_18 = input.LA(1);

                         
                        int index12_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_19 = input.LA(1);

                         
                        int index12_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_20 = input.LA(1);

                         
                        int index12_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_21 = input.LA(1);

                         
                        int index12_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_22 = input.LA(1);

                         
                        int index12_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_23 = input.LA(1);

                         
                        int index12_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_24 = input.LA(1);

                         
                        int index12_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_25 = input.LA(1);

                         
                        int index12_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_26 = input.LA(1);

                         
                        int index12_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_27 = input.LA(1);

                         
                        int index12_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_28 = input.LA(1);

                         
                        int index12_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_29 = input.LA(1);

                         
                        int index12_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_30 = input.LA(1);

                         
                        int index12_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_31 = input.LA(1);

                         
                        int index12_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_32 = input.LA(1);

                         
                        int index12_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_33 = input.LA(1);

                         
                        int index12_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_34 = input.LA(1);

                         
                        int index12_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_35 = input.LA(1);

                         
                        int index12_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_36 = input.LA(1);

                         
                        int index12_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index12_36);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\64\uffff";
    static final String DFA23_eofS =
        "\1\45\63\uffff";
    static final String DFA23_minS =
        "\1\4\44\0\17\uffff";
    static final String DFA23_maxS =
        "\1\143\44\0\17\uffff";
    static final String DFA23_acceptS =
        "\45\uffff\1\2\15\uffff\1\1";
    static final String DFA23_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\17\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\20\2\uffff\1\11\1\uffff\1\45\7\uffff\7\45\3\uffff\3\45\15"+
            "\uffff\1\5\1\6\4\uffff\1\7\1\10\1\uffff\1\12\1\13\1\14\1\15"+
            "\1\16\1\17\1\40\1\41\1\21\1\22\1\23\1\24\1\25\10\uffff\2\45"+
            "\1\26\3\uffff\1\2\5\uffff\1\1\1\27\1\30\1\31\1\32\1\33\1\34"+
            "\1\35\1\36\1\37\1\42\1\43\1\44\1\3\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "496:20: (eVal= logic_expr )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_2 = input.LA(1);

                         
                        int index23_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_3 = input.LA(1);

                         
                        int index23_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_4 = input.LA(1);

                         
                        int index23_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_5 = input.LA(1);

                         
                        int index23_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_6 = input.LA(1);

                         
                        int index23_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA23_7 = input.LA(1);

                         
                        int index23_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA23_8 = input.LA(1);

                         
                        int index23_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA23_9 = input.LA(1);

                         
                        int index23_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA23_10 = input.LA(1);

                         
                        int index23_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA23_11 = input.LA(1);

                         
                        int index23_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA23_12 = input.LA(1);

                         
                        int index23_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA23_13 = input.LA(1);

                         
                        int index23_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA23_14 = input.LA(1);

                         
                        int index23_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA23_15 = input.LA(1);

                         
                        int index23_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA23_16 = input.LA(1);

                         
                        int index23_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA23_17 = input.LA(1);

                         
                        int index23_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA23_18 = input.LA(1);

                         
                        int index23_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA23_19 = input.LA(1);

                         
                        int index23_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA23_20 = input.LA(1);

                         
                        int index23_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA23_21 = input.LA(1);

                         
                        int index23_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA23_22 = input.LA(1);

                         
                        int index23_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA23_23 = input.LA(1);

                         
                        int index23_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA23_24 = input.LA(1);

                         
                        int index23_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA23_25 = input.LA(1);

                         
                        int index23_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA23_26 = input.LA(1);

                         
                        int index23_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA23_27 = input.LA(1);

                         
                        int index23_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA23_28 = input.LA(1);

                         
                        int index23_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA23_29 = input.LA(1);

                         
                        int index23_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA23_30 = input.LA(1);

                         
                        int index23_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA23_31 = input.LA(1);

                         
                        int index23_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA23_32 = input.LA(1);

                         
                        int index23_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA23_33 = input.LA(1);

                         
                        int index23_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA23_34 = input.LA(1);

                         
                        int index23_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA23_35 = input.LA(1);

                         
                        int index23_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA23_36 = input.LA(1);

                         
                        int index23_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Chalk()) ) {s = 51;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index23_36);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\106\uffff";
    static final String DFA35_eofS =
        "\1\1\105\uffff";
    static final String DFA35_minS =
        "\1\4\30\uffff\2\0\53\uffff";
    static final String DFA35_maxS =
        "\1\143\30\uffff\2\0\53\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\2\103\uffff\1\1";
    static final String DFA35_specialS =
        "\31\uffff\1\0\1\1\53\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\1\1\uffff\3\1\7\uffff\7\1\2\uffff\21\1\1\31\1\32\4\uffff"+
            "\2\1\1\uffff\15\1\6\uffff\5\1\3\uffff\1\1\5\uffff\17\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "()* loopback of 701:3: ( (tk= PLUS | tk= MINUS ) eVal2= multiplicative_math_expr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_25 = input.LA(1);

                         
                        int index35_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Chalk()) ) {s = 69;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_25);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_26 = input.LA(1);

                         
                        int index35_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Chalk()) ) {s = 69;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\113\uffff";
    static final String DFA39_eofS =
        "\1\3\112\uffff";
    static final String DFA39_minS =
        "\1\4\1\0\111\uffff";
    static final String DFA39_maxS =
        "\1\143\1\0\111\uffff";
    static final String DFA39_acceptS =
        "\2\uffff\1\2\1\3\106\uffff\1\1";
    static final String DFA39_specialS =
        "\1\uffff\1\0\111\uffff}>";
    static final String[] DFA39_transitionS = {
            "\2\3\1\uffff\3\3\7\uffff\7\3\2\uffff\30\3\1\1\1\2\15\3\6\uffff"+
            "\5\3\3\uffff\1\3\5\uffff\17\3",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "839:9: (tk= SCREAMER | tk= STAR_STAR eVal3= unary_math_expr )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_1 = input.LA(1);

                         
                        int index39_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_Chalk()) ) {s = 74;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index39_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\42\uffff";
    static final String DFA46_eofS =
        "\42\uffff";
    static final String DFA46_minS =
        "\1\4\7\uffff\1\0\31\uffff";
    static final String DFA46_maxS =
        "\1\141\7\uffff\1\0\31\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\3\2\uffff\1\7\4\uffff\1\10\2\uffff\1"+
        "\11\15\uffff\1\4\1\5\1\6";
    static final String DFA46_specialS =
        "\10\uffff\1\0\31\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\10\2\uffff\1\1\54\uffff\4\2\2\6\2\21\5\11\12\uffff\1\16\3"+
            "\uffff\1\16\5\uffff\1\16\14\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "869:1: primary_math_expr returns [ ExprValue value, StringTemplate code ] : ( LPAREN eVal0= logic_expr RPAREN | (tk= READ_INT | tk= READ_FLOAT | tk= READ_STRING | tk= READ_BOOL ) | (tk= PLUS_PLUS | tk= MINUS_MINUS ) eVal= ID | tk= ID LPAREN (eValp= logic_expr ( ',' eValp= logic_expr )* )? RPAREN | eVal= ID (tk= PLUS_PLUS | tk= MINUS_MINUS ) | tk= ID | eVal1= literal | eVal2= constants | eVal3= math_lib_funcs );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_8 = input.LA(1);

                         
                        int index46_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Chalk()) ) {s = 31;}

                        else if ( (synpred74_Chalk()) ) {s = 32;}

                        else if ( (synpred75_Chalk()) ) {s = 33;}

                         
                        input.seek(index46_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_var_declaration_in_compiled_unit67 = new BitSet(new long[]{0x0000000000000022L,0x0000000C00208000L});
    public static final BitSet FOLLOW_func_definition_in_compiled_unit80 = new BitSet(new long[]{0x0000000000000022L,0x0000000C00208000L});
    public static final BitSet FOLLOW_type_in_var_declaration119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_var_declarator_in_var_declaration131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_var_declaration138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_var_declarator_in_var_declaration144 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_var_declarator174 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_EQ_in_var_declarator178 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_var_declarator184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_TK_in_func_definition219 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ENTRY_TK_in_func_definition227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_func_definition232 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_func_definition237 = new BitSet(new long[]{0x0000000000000100L,0x0000000C00208000L});
    public static final BitSet FOLLOW_var_args_list_in_func_definition245 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_func_definition251 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_func_definition255 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00208000L});
    public static final BitSet FOLLOW_type_in_func_definition261 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_func_definition268 = new BitSet(new long[]{0xFFF6180038B20290L,0x0000000FFFE08E01L});
    public static final BitSet FOLLOW_stmt_block_in_func_definition274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var_args_list302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_var_args_list308 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_var_args_list314 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00208000L});
    public static final BitSet FOLLOW_type_in_var_args_list320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_var_args_list326 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_stmt_in_stmt_block359 = new BitSet(new long[]{0xFFF6180038B20290L,0x0000000FFFE08E01L});
    public static final BitSet FOLLOW_END_TK_in_stmt_block367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_stmt_in_stmt395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_declaration_in_stmt409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assigment_stmt_in_stmt422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_stmt_in_stmt435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_stmt448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_stmt_in_stmt461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_print_stmt489 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_print_stmt497 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_print_stmt506 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_print_stmt512 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_74_in_print_stmt522 = new BitSet(new long[]{0xFFF6180000000092L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_print_stmt532 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_print_stmt541 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_print_stmt547 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_assigment_stmt592 = new BitSet(new long[]{0x000000000001FC00L});
    public static final BitSet FOLLOW_EQ_in_assigment_stmt606 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_STAR_EQ_in_assigment_stmt622 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_RSLASH_EQ_in_assigment_stmt637 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_PLUS_EQ_in_assigment_stmt652 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_MINUS_EQ_in_assigment_stmt667 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_GT_GT_EQ_in_assigment_stmt681 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_LT_LT_EQ_in_assigment_stmt695 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_assigment_stmt714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_TK_in_selection_stmt746 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_selection_stmt752 = new BitSet(new long[]{0xFFF6180038B20090L,0x0000000FFFE08E01L});
    public static final BitSet FOLLOW_stmt_in_selection_stmt762 = new BitSet(new long[]{0xFFF6180038BE0290L,0x0000000FFFE08E01L});
    public static final BitSet FOLLOW_ELSIF_TK_in_selection_stmt777 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_selection_stmt783 = new BitSet(new long[]{0xFFF6180038B20090L,0x0000000FFFE08E01L});
    public static final BitSet FOLLOW_stmt_in_selection_stmt793 = new BitSet(new long[]{0xFFF6180038BE0290L,0x0000000FFFE08E01L});
    public static final BitSet FOLLOW_ELSE_TK_in_selection_stmt812 = new BitSet(new long[]{0xFFF6180038B20090L,0x0000000FFFE08E01L});
    public static final BitSet FOLLOW_stmt_in_selection_stmt822 = new BitSet(new long[]{0xFFF6180038B20290L,0x0000000FFFE08E01L});
    public static final BitSet FOLLOW_END_TK_in_selection_stmt840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_TK_in_iteration_stmt866 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_iteration_stmt872 = new BitSet(new long[]{0xFFF6180038B20290L,0x0000000FFFE08E01L});
    public static final BitSet FOLLOW_stmt_block_in_iteration_stmt880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_TK_in_iteration_stmt889 = new BitSet(new long[]{0xFFF6180038F20090L,0x0000000FFFE08E01L});
    public static final BitSet FOLLOW_stmt_in_iteration_stmt899 = new BitSet(new long[]{0xFFF6180038F20090L,0x0000000FFFE08E01L});
    public static final BitSet FOLLOW_UNTIL_TK_in_iteration_stmt907 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_iteration_stmt913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_TK_in_iteration_stmt921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt927 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_IN_TK_in_iteration_stmt929 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LBRACKET_in_iteration_stmt931 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_iteration_stmt937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_iteration_stmt939 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_iteration_stmt945 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RBRACKET_in_iteration_stmt947 = new BitSet(new long[]{0xFFF6180038B20290L,0x0000000FFFE08E01L});
    public static final BitSet FOLLOW_stmt_block_in_iteration_stmt955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_TK_in_jump_stmt983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_TK_in_jump_stmt992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_TK_in_jump_stmt1005 = new BitSet(new long[]{0xFFF6180000000092L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_jump_stmt1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_logic_expr_in_logic_expr1045 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_BAR_BAR_in_logic_expr1058 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_and_logic_expr_in_logic_expr1064 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_comparison_expr_in_and_logic_expr1102 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_AMP_AMP_in_and_logic_expr1114 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_comparison_expr_in_and_logic_expr1120 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_math_expr_in_comparison_expr1157 = new BitSet(new long[]{0x0000003F00000002L});
    public static final BitSet FOLLOW_GT_in_comparison_expr1175 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_LT_in_comparison_expr1192 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_LT_EQ_in_comparison_expr1209 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_GT_EQ_in_comparison_expr1225 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_EQ_EQ_in_comparison_expr1241 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_SCREAMER_EQ_in_comparison_expr1256 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_math_expr_in_comparison_expr1273 = new BitSet(new long[]{0x0000003F00000002L});
    public static final BitSet FOLLOW_xor_math_expr_in_math_expr1311 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_BAR_in_math_expr1323 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_xor_math_expr_in_math_expr1329 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_and_math_expr_in_xor_math_expr1363 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_CARET_in_xor_math_expr1375 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_and_math_expr_in_xor_math_expr1381 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_shift_math_expr_in_and_math_expr1414 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_AMP_in_and_math_expr1426 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_shift_math_expr_in_and_math_expr1432 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_additive_math_expr_in_shift_math_expr1464 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_LT_LT_in_shift_math_expr1482 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_GT_GT_in_shift_math_expr1495 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_additive_math_expr_in_shift_math_expr1513 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_multiplicative_math_expr_in_additive_math_expr1547 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_PLUS_in_additive_math_expr1565 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_MINUS_in_additive_math_expr1578 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_multiplicative_math_expr_in_additive_math_expr1595 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_unary_math_expr_in_multiplicative_math_expr1628 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicative_math_expr1644 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_RSLASH_in_multiplicative_math_expr1657 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_MOD_in_multiplicative_math_expr1671 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_DIV_in_multiplicative_math_expr1684 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_unary_math_expr_in_multiplicative_math_expr1700 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_type_in_unary_math_expr1728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_unary_math_expr1730 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_unary_math_expr_in_unary_math_expr1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_math_expr1751 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_MINUS_in_unary_math_expr1764 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_TILDE_in_unary_math_expr1777 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_SCREAMER_in_unary_math_expr1791 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_unary_math_expr_in_unary_math_expr1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_math_expr_in_unary_math_expr1814 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_SCREAMER_in_unary_math_expr1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_STAR_in_unary_math_expr1850 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_unary_math_expr_in_unary_math_expr1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary_math_expr1905 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_primary_math_expr1911 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_primary_math_expr1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_INT_in_primary_math_expr1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_FLOAT_in_primary_math_expr1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_STRING_in_primary_math_expr1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_BOOL_in_primary_math_expr1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_PLUS_in_primary_math_expr1983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_MINUS_MINUS_in_primary_math_expr1997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_primary_math_expr2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_math_expr2020 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_primary_math_expr2029 = new BitSet(new long[]{0xFFF6180000000190L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_primary_math_expr2037 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_primary_math_expr2043 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_primary_math_expr2049 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_primary_math_expr2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_math_expr2085 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_PLUS_PLUS_in_primary_math_expr2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_MINUS_in_primary_math_expr2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_math_expr2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary_math_expr2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constants_in_primary_math_expr2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_lib_funcs_in_primary_math_expr2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_constants2205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_constants2207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_constants2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_constants2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_constants2245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_constants2247 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_80_in_constants2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_constants2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_constants2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_constants2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_constants2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_constants2308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_constants2310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_80_in_constants2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_constants2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_math_lib_funcs2370 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_math_lib_funcs2372 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_math_lib_funcs2378 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_math_lib_funcs2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_math_lib_funcs2392 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_math_lib_funcs2394 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_math_lib_funcs2400 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_math_lib_funcs2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_math_lib_funcs2415 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_math_lib_funcs2417 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_math_lib_funcs2423 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_math_lib_funcs2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_math_lib_funcs2437 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_math_lib_funcs2439 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_math_lib_funcs2445 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_math_lib_funcs2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_math_lib_funcs2459 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_math_lib_funcs2461 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_math_lib_funcs2467 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_math_lib_funcs2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_math_lib_funcs2481 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_math_lib_funcs2483 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_math_lib_funcs2489 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_math_lib_funcs2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_math_lib_funcs2503 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_math_lib_funcs2505 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_math_lib_funcs2511 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_math_lib_funcs2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_math_lib_funcs2525 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_math_lib_funcs2527 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_math_lib_funcs2533 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_math_lib_funcs2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_math_lib_funcs2547 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_math_lib_funcs2549 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_math_lib_funcs2555 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_math_lib_funcs2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_TK_in_math_lib_funcs2572 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_MIN_TK_in_math_lib_funcs2584 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_math_lib_funcs2591 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_math_lib_funcs2597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_math_lib_funcs2603 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_math_lib_funcs2609 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_math_lib_funcs2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_math_lib_funcs2627 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_math_lib_funcs2629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_math_lib_funcs2635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_math_lib_funcs2637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_math_lib_funcs2643 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_math_lib_funcs2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_math_lib_funcs2656 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_math_lib_funcs2658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_math_lib_funcs2664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_math_lib_funcs2666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_math_lib_funcs2672 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_math_lib_funcs2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_math_lib_funcs2687 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_math_lib_funcs2689 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_math_lib_funcs2695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_math_lib_funcs2697 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_math_lib_funcs2703 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_math_lib_funcs2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_type2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_type2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_type2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_type2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_LITERAL_in_literal2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATING_POINT_LITERAL_in_literal2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_literal2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_literal2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_literal2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_expr_in_synpred18_Chalk532 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_synpred18_Chalk541 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_synpred18_Chalk547 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_logic_expr_in_synpred36_Chalk1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_synpred51_Chalk1565 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_MINUS_in_synpred51_Chalk1578 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_multiplicative_math_expr_in_synpred51_Chalk1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCREAMER_in_synpred61_Chalk1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred72_Chalk2020 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_synpred72_Chalk2029 = new BitSet(new long[]{0xFFF6180000000190L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_synpred72_Chalk2037 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_synpred72_Chalk2043 = new BitSet(new long[]{0xFFF6180000000090L,0x0000000FFFE08801L});
    public static final BitSet FOLLOW_logic_expr_in_synpred72_Chalk2049 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_synpred72_Chalk2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred74_Chalk2085 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_PLUS_PLUS_in_synpred74_Chalk2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_MINUS_in_synpred74_Chalk2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred75_Chalk2139 = new BitSet(new long[]{0x0000000000000002L});

}