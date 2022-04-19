package chalk;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

public class ChalkEntry
{
	private static final String CHALK_LIB_NAME = "ChalkLib";
	
	private static String JAR_BUILDER_NAME;
	
	private static String OUTPUT_DIR = "";
	
	private static String STG_FILE = "grammar/Chalk.stg";
		
	private static String PARSER_OUTPUT_FILE = null;
	
	private static String PROG_NAME = null;
	
	private static String SRC_NAME = null;
	
	private static PrintStream outputStream;
	
	private static StringTemplateGroup stGroup = null;
		
	static 
	{
		if (isUnix())
			JAR_BUILDER_NAME = "jar_builder";
		else if (isWindows())
			JAR_BUILDER_NAME = "jar_builder.bat";
	}
	
	public static void main( String[] args ) throws Exception 
	{
		try {
			parseInputParams(args);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return;
		}
				
		if ( PARSER_OUTPUT_FILE != null ) 
			outputStream = new PrintStream( new File( PARSER_OUTPUT_FILE ) ); 
		else
			outputStream = System.out;
		
		ChalkLexer lex = new ChalkLexer( new ANTLRFileStream( SRC_NAME ) );
		ChalkParser parser = new ChalkParser( new CommonTokenStream( lex ) );
		
		StringTemplate middleCode = parser.compiled_unit( PROG_NAME, parser.rootSpace );
		
		parser.rootSpace.print( "", outputStream );

		outputStream.println( String.format( "\n\nFound %d errors:", parser.errors.size() ) );
		if ( !parser.errors.isEmpty() ) 
		{	
			for ( int i = 0; i < parser.errors.size(); i++ )
			{
				outputStream.print(i+1 + ". ");
				outputStream.println(parser.errors.get(i));
			}	
		}
		else 
		{
			String srcPath = OUTPUT_DIR + PROG_NAME;
		
			FileWriter middleCodeFile = new FileWriter(new File( srcPath + ".java" ) );
			middleCodeFile.write(middleCode.toString());
			middleCodeFile.close();
			
			FileWriter jarBuildFile = new FileWriter(new File( JAR_BUILDER_NAME ) );
			if (isUnix()) 
			{
				jarBuildFile.write("#/bin/bash\n");
				jarBuildFile.write(String.format("javac %s.java\n", srcPath));
				jarBuildFile.write(String.format("jar cfe %s.jar %s %s %s\n", srcPath, srcPath, srcPath + ".class", OUTPUT_DIR + CHALK_LIB_NAME + ".class"));
				jarBuildFile.write(String.format("rm %s.java\n", srcPath));
				jarBuildFile.write(String.format("rm %s.class\n", srcPath));
				jarBuildFile.write(String.format("rm %s.class\n", OUTPUT_DIR + CHALK_LIB_NAME));
				jarBuildFile.write("rm " + JAR_BUILDER_NAME);
			} else if (isWindows()) 
			{
				jarBuildFile.write(String.format("javac %s.java\n", srcPath));
				jarBuildFile.write(String.format("jar cfe %s.jar %s %s %s\n", srcPath, srcPath, srcPath + ".class", OUTPUT_DIR + CHALK_LIB_NAME + ".class"));
				jarBuildFile.write(String.format("del %s.java\n", srcPath));
				jarBuildFile.write(String.format("del %s.class\n", srcPath));
				jarBuildFile.write(String.format("del %s.class\n", OUTPUT_DIR + CHALK_LIB_NAME));
				jarBuildFile.write(String.format("del %s\n", JAR_BUILDER_NAME));
				jarBuildFile.write("exit");
			}
			jarBuildFile.close();
			
			if (isUnix())
				Runtime.getRuntime().exec("sh " + JAR_BUILDER_NAME);
			else if (isWindows()) 
			{
				String[] cmd = {"cmd" , "/c" , "start" , JAR_BUILDER_NAME};
				Runtime.getRuntime().exec(cmd);
			}
		}
    }

	public static void printMsg( String frmtMsg, Object... args )
	{
		outputStream.println( String.format( frmtMsg, args ) );
	}
	
	public static StringTemplateGroup getStg()
	{
		if (stGroup == null)
			try {
				stGroup = new StringTemplateGroup(new FileReader(STG_FILE));
			} catch (Exception e) {
				e.printStackTrace();
			}	
		
		return stGroup;
	}
	
	private static void parseInputParams(String[] args) throws Exception
	{
		String err = "Use parameters: [[-ont] [output_file] [prog_name] [stg_file]] <src_file>";
		
		if ( args.length == 0 ) {
			throw new Exception(err);
		}
		
		if ( args[0].startsWith("-") && args[0].length() == 1 )
		{
			throw new Exception(err);
		}
		
		if ( args[0].startsWith("-") ) 
		{
			if ( args.length != args[0].length() + 1 )
			{
				throw new Exception(err);
			}
			
			
			for ( int i = 1; i < args[0].length(); i++ ) {
				switch (args[0].charAt(i)) {
					case 'o':
						PARSER_OUTPUT_FILE = args[i];
					break;
					
					case 'n':
						PROG_NAME = args[i];
					break;
					
					case 't':
						STG_FILE = args[i];
					break;
					
					default:
						throw new Exception(err);
				}
			}
			
			SRC_NAME = args[args.length - 1];
		}
		else 
		{
			SRC_NAME = args[0];
		}
		
		if ( PROG_NAME == null ) 
		{
			PROG_NAME = SRC_NAME.substring(SRC_NAME.lastIndexOf('/') + 1);
			
			int k = PROG_NAME.indexOf('.');
			if (k != -1)
				PROG_NAME = PROG_NAME.substring(0, PROG_NAME.indexOf('.'));
			
			if (PROG_NAME.equals(CHALK_LIB_NAME))
				PROG_NAME = PROG_NAME + "_";
		}
		
		int k = SRC_NAME.lastIndexOf('/');
		if (k != -1)
			OUTPUT_DIR = SRC_NAME.substring(0, SRC_NAME.lastIndexOf('/') + 1);
	}
	
	public static boolean isWindows()
	{
		String os = System.getProperty("os.name").toLowerCase();
	    return (os.indexOf( "win" ) >= 0); 
 
	}
 
	public static boolean isMac()
	{
		String os = System.getProperty("os.name").toLowerCase();
	    return (os.indexOf( "mac" ) >= 0); 
	}
 
	public static boolean isUnix()
	{
		String os = System.getProperty("os.name").toLowerCase();
	    return (os.indexOf( "nix") >=0 || os.indexOf( "nux") >=0);
	}

}
