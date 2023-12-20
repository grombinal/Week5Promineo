package Assignment;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String ar) {
		/*a.  The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String 
		 * (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console).*/
			String asterix = "***";

			String asterixMessage = asterix+ar+asterix;
			System.out.println(asterixMessage);
		
	}

	@Override
	public void error(String er) {
		/*b. The error method on the AsteriskLogger should print the String 
		 * it receives inside a box of asterisks, with the String preceded by the word “ERROR:”. For example,
		 *  if “Hello” is the argument, the following should be printed:*/
		String as = "***";
		String l="Error: ";
		String ast = as+l+er+as;
		String asterisk2 = "";
		String[]ater=new String[er.length()-1+l.length()];
		for(int i = 0; i <=	 ater.length+as.length()+as.length(); i++) {
			asterisk2+="*";
				}
	
	System.out.println(asterisk2);
	System.out.println(ast);
	System.out.println(asterisk2);
	}

}
