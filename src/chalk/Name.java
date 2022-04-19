package chalk;

import java.util.ArrayList;

public class Name 
{
	public final static String ID_PREFIX = "_";
	public final static String ID_SEPARATOR = ".";
	
	public final static String INT_TYPE_ID = "Int";
	public final static String FLOAT_TYPE_ID = "Float";
	public final static String DOUBLE_TYPE_ID = "Double";
	public final static String CHAR_TYPE_ID = "Char";
	public final static String STRING_TYPE_ID = "String";
	public final static String BOOL_TYPE_ID = "Bool";
	public final static String UNDEF_TYPE_ID = "Undef_Type";
	public final static String VOID_TYPE_ID = "Void";
	public final static String NULL_TYPE_ID = "NULL";
	
	private String 	id;
	private String	type;	
	private int		lineDeclaration;
	private ArrayList<Integer> linesUses = new ArrayList<Integer>();
	
	public Name( String id ) 
	{
		this( null, id ); 
	}
	
	public Name( String relative, String id ) 
	{
		this( relative, id, UNDEF_TYPE_ID, -1 ); 
	}
	
	public Name( String id, String type, int line) 
	{
		this( null, id, type, line );
	}
	
	public Name( String relative, String id, String type, int line) 
	{
		if ( relative != null && relative.length() != 0 ) 
		{
			this.id = relative + ID_SEPARATOR + id;
		}
		else
		{
			this.id = ID_PREFIX + id;
		}
		
		this.type = type;
		lineDeclaration = line;
	}
	
	public void addLineUses( int line ) 
	{
		linesUses.add( new Integer(line) );
	}

	public ArrayList<Integer> getLinesUses()
	{
		return this.linesUses;
	}
	
	public Integer getLine() 
	{
		return this.lineDeclaration;
	}
	
	public String getType() 
	{
		return type;
	}
	
	public void setType( String type )
	{
		this.type = type;
	}
	
	public String getId()
	{
		return this.id;
	}
	
	public void setId( String id )
	{
		this.id = ID_PREFIX + id;
	}
	
	public boolean typeIs( String type )
	{
		return this.type.equals(type);
	}
	
	public boolean isFloat()
	{
		return this.type.equals(Name.FLOAT_TYPE_ID);
	}
	
	public boolean isInt()
	{
		return this.type.equals(Name.INT_TYPE_ID);
	}
	
	public boolean isBool()
	{
		return this.type.equals(Name.BOOL_TYPE_ID);
	}
	
	public boolean isString()
	{
		return this.type.equals(Name.STRING_TYPE_ID);
	}
	
	public static boolean isFloatT( String type )
	{
		if (type != null)
			return type.equals(Name.FLOAT_TYPE_ID);
		
		return false;
	}
	
	public static boolean isIntT( String type )
	{
		if (type != null)
			return type.equals(Name.INT_TYPE_ID);
		
		return false;
	}
	
	public static boolean isBoolT( String type )
	{
		if (type != null)
			return type.equals(Name.BOOL_TYPE_ID);
		
		return false;
	}
	
	public static boolean isStringT( String type )
	{
		if (type != null)
			return type.equals(Name.STRING_TYPE_ID);
		
		return false;
	}
	
	public static boolean typeIsT( String type1, String type2 )
	{
		if (type1 != null)
			return type1.equals(type2);
		
		return false;
	}
	
	public boolean idIs( String id )
	{
		if (this.id.equals(ID_PREFIX + id))
			return true;
		
		return false;
	}
	
	public String toString() 
	{ 
		String lineUse = linesUses.isEmpty() ? "not uses" : linesUses.toString();
		return String.format( "ID=%s :: TYPE=%s :: LINE=%d :: LINE_USE=%s", id, type, lineDeclaration, lineUse );
	}
	
	public boolean equals( Object obj )
	{
		if ( !(obj instanceof Name) )
			return false;
		
		if (!id.equals(((Name)obj).id))
			return false;
			
		return true;
	}
}