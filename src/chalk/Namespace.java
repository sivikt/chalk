package chalk;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Namespace 
{
	public final static String SPACE_SEPARATOR = ".";
	
	private String name;
	private NamesTable<Name> namesTable;
	private List<Namespace> childs;
	private Namespace owner;
	private FuncName funcName;
	
	public Namespace( Namespace owner, String name)
	{
		this(owner, name, null);
	}
	
	public Namespace( Namespace owner, String name, FuncName funcName )
	{
		this.name = name;
		this.owner = owner;
		this.namesTable = new NamesTable<Name>();
		this.funcName = funcName;
		this.childs = new ArrayList<Namespace>();
	}
	
	public void setChilds( List<Namespace> childs )
	{
		this.childs = childs;
	}
	
	public void setOwner( Namespace owner )
	{
		this.owner = owner;
	}
	
	public Namespace getOwner()
	{
		return this.owner;
	}
	
	public void setName( String name )
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public NamesTable<Name> getNamesTable()
	{
		return this.namesTable;
	}
	
	public void addSpace( Namespace space ) 
	{
		this.childs.add(space);
	}
	
	public void addName( Name name ) 
	{
		this.namesTable.add(name);
	}
	
	public boolean isFuncSpace()
	{
		return this.funcName == null ? false : true;
	}
	
	public FuncName getFuncName()
	{
		return this.funcName;
	}
	
	public void setFuncName( FuncName funcName )
	{
		this.funcName = funcName;
	}
	
	public String getSpaceRetType()
	{	
		Namespace tmpSpace = this;
		
		while (tmpSpace != null)
		{
			if (tmpSpace.isFuncSpace())
				return tmpSpace.funcName.getType();
			else
				tmpSpace = tmpSpace.getOwner();
		}
		
		return Name.UNDEF_TYPE_ID;
	}
	
	public FuncName findFuncById( String id )
	{		
		for (Namespace space : childs)
		{
			if (space.isFuncSpace())
			{
				if (space.funcName.getId().equals(id))
					return space.funcName;
			}
		}
		
		return null;
	}	
	
	public FuncName findFunc( FuncName func )
	{
		for (Namespace space : childs)
		{
			if (space.isFuncSpace())
			{
				if (space.funcName.equals(func))
					return space.funcName;
			}
		}
		
		return null;
	}
	
	public FuncName findFuncById( String id, boolean isMain )
	{
		FuncName func = new FuncName(id, -1);
		func.setMain(isMain);
		return findFunc(func);
	}
	
	public boolean mainExist()
	{
		for (Namespace space : childs)
		{
			if (space.isFuncSpace())
			{
				if (space.funcName.isMain())
					return true;
			}
		}
		
		return false;
	}

	public void print( String shift, PrintStream out ) 
	{	
		if (isFuncSpace()) 
		{
			out.print(shift);
			out.println(funcName.toString());
		}
		else
		{
			out.print(shift);
			out.println(name);
		}
		
		for ( Name name : namesTable.getValues() ) 
		{
			out.print(shift + "	");
			out.println(name.toString());
		}
		
		for ( Namespace space : childs ) 
		{
			space.print(shift + "	", out);
		}
	}
	
}
