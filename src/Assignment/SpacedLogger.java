package Assignment;

public class SpacedLogger  implements Logger{

	@Override
	public void log(String ar) {
		// a. If the log method received “Hello” as an argument, it should print H e l l o
		
		String b = "";
		for (int i = 0;i < ar.length();i++) {
			b+=ar.charAt(i)+" ";
		}
		
		System.out.println(b);
	}

	@Override
	public void error(String er) {
		// b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
	
		String l= "Error: ";
		String g ="";
		for(int i = 0; i< er.length(); i++ ) {
			g+=er.charAt(i)+" ";
		}
		System.out.println(l+g);
		
	}



}

