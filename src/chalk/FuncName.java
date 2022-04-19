package chalk;

import java.util.ArrayList;
import java.util.List;

public class FuncName extends Name 
{
	public static class FuncArg extends Name
	{
		public FuncArg(String id, String type) 
		{
			super(id, type, -1);
		}
		
		public FuncArg(String id, String type, int line) 
		{
			super(id, type, line);
		}
		
		public String toString()
		{
			return getType() + ":" + getId();
		}
	}
	
	private boolean isMain;
	private ArrayList<FuncArg> args;
	
	public FuncName( String id, int line ) 
	{
		this(id, VOID_TYPE_ID, line);
	}
	
	public FuncName( String id, String retType, int line ) 
	{
		this(id, retType, false, line);
	}
	
	public FuncName( String id, String retType, boolean isMain, int line ) 
	{
		super(null, id, retType, line);
		this.isMain = isMain;
		this.args = new ArrayList<FuncArg>(0);
	}
	
	public String toString() 
	{
		String lineUse = getLinesUses().isEmpty() ? "not uses" : getLinesUses().toString();
		return String.format( "%sFUNC=%s :: ARGS=%s :: TYPE=%s :: LINE=%d :: LINE_USE=%s", 
				isMain ? "ENTRY " : "", 
				getId(),
				args.toString(),
				getType(), 
				getLine(), 
				lineUse);
	}
	
	public boolean isCallCorrect( List<ExprValue> callArgs )
	{
		if ( callArgs == null || args.size() != callArgs.size() )
			return false;
		
		for ( int i = 0; i < args.size(); i++ )
		{
			if (!args.get(i).typeIs(callArgs.get(i).getType()))
				return false;
		}
		
		return true;
	}
	
	public String args2String()
	{
		StringBuilder buff = new StringBuilder("");

		for ( int i = 0; i < args.size(); i++ )
		{
			if ( i != args.size() - 1 ) 
			{
				buff.append(args.get(i).getType());
				buff.append(", ");
			}
			else
				buff.append(args.get(i).getType());
		}
		
		return buff.toString();
	}
	
	public boolean isMain()
	{
		return this.isMain;
	}
	
	public void setMain( boolean b )
	{
		this.isMain = b;
	}

	public void setArgs( List<FuncArg> args )
	{
		if (args != null)
			this.args = (ArrayList<FuncArg>)args;
		else 
			this.args.clear();
	}
	
	public boolean containsArgId( String argId )
	{
		for ( FuncArg arg : args )
		{
			if ( arg.idIs(argId) )
				return true;
		}
		
		return false;
	}
	
	public FuncArg getArgById( String argId )
	{
		for ( FuncArg arg : args )
		{
			if ( arg.idIs(argId) )
				return arg;
		}
		
		return null;
	}
	
	public boolean containsArg( FuncArg arg )
	{
		return this.args.contains(arg);
	}
	
	public boolean equals( Object obj )
	{
		if ( !(obj instanceof FuncName) )
			return false;
		
		FuncName name = ( FuncName )obj;
		
		if ( isMain && name.isMain )
		{
			return true;
		}
		else if ( getId().equals(name.getId()) )
		{
			return true;
		}
		
		return false;
	}

}
