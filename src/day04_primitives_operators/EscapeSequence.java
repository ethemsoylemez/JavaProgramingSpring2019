package day04_primitives_operators;

public class EscapeSequence {
	public static void main (String[] args) {
		
		/* double quotes("") =>  \"   \"
   		   single quote(') =>    \'   \'
	    	New line  =>       \n
			Tab       =>       \t
			Backslash (\) =>   \ 
	   */
		
	// print: He said "Hello".
	System.out.println("He said \"Hello\".");
	
	//print: Would you like 'coffee' or 'tea'?
	System.out.println("Would you like \'coffee\' or \'tea\'?");
	
	// print: "\__/"
	System.out.println("\"\\__/\"");
	
	/* print: Java
	        Selenium */
	System.out.println("Java\nSelenium");
	System.out.println("\ttab \tspace\t.");
	System.out.println("Backslash\\");
		
	}

}
