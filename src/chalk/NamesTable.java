package chalk;

import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;

public class NamesTable<T extends Name> 
{
	private HashMap<String, T> names = new HashMap<String, T>();
	
	public boolean isExist( T name ) 
	{
		return this.isExist( name.getId() );
	}
	
	public boolean isExist( String name ) 
	{
		return names.containsKey( name );
	}
	
	public void add( T name ) 
	{
		names.put( name.getId(), name );
	}
	
	public T get( String name ) 
	{
		return names.get( name );
	}
	
	public T get( T name ) 
	{
		return get( name.getId() );
	}
	
	public void print( PrintStream out ) 
	{
		for ( String id : names.keySet() )
			out.println( names.get( id ) );
	}
		
	public Collection<T> getValues()
	{
		return this.names.values();
	}
}




