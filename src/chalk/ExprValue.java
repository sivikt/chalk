package chalk;

import java.awt.Point;

public class ExprValue 
{
	private String type;
	private Point point;
	private boolean isId;
	private boolean isFunc;
		
	public ExprValue(int line, int pos ) 
	{
		this(Name.UNDEF_TYPE_ID, line, pos);
	}
	
	public ExprValue( String type, int line, int pos ) 
	{
		this(type, line, pos, false);
	}
	
	public ExprValue( String type, int line, int pos, boolean isId ) 
	{
		this(type, line, pos, isId, false);
	}
	
	public ExprValue( String type, int line, int pos, boolean isId, boolean isFunc ) 
	{
		this.point = new Point(pos, line);
		this.type = type;
		this.isId = isId;
		this.isFunc = isFunc;
	}
	
	public ExprValue( String type, Point point ) 
	{
		this.point = point;
		this.type = type;
	}
	
	public String getType() 
	{
		return this.type;
	}

	public boolean isT( String type )
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
	
	public int line()
	{
		return this.point.y;
	}
	
	public void setPoint( Point point )
	{
		this.point = point;
	}
	
	public int pos()
	{
		return this.point.x;
	}
	
	public boolean isId()
	{
		return this.isId;
	}
	
	public boolean isFunc()
	{
		return this.isFunc;
	}
	
	public String toString()
	{
		return this.type;
	}
}
