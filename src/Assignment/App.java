package Assignment;



public class App {

	public static void main(String[] args) {

		Logger l = new AsteriskLogger();

		String ss = "Hello";
		l.log(ss);
		
		
		Logger ll = new AsteriskLogger();
		String se = "hello";
		ll.error(se);
		
		
		Logger sp = new SpacedLogger();
		sp.log("hi");
		
		Logger space = new SpacedLogger();
		space.error("welcome");
		

		

		
	}

}
