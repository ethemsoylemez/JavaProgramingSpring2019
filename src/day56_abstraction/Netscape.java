package day56_abstraction;

public class Netscape extends Browser {

	@Override
	public void navigate(String url) {
		System.out.println("Netscape - navigating to: "+url);
	}

	@Override
	public void displayWebpage() {
		System.out.println("Netscape - displaying webpage");
		
	}

	@Override
	public boolean launch() {
		System.out.println("Netscape is lounching\n 1 2 3");
		return true;
	}
	
	//not necessary
	@Override 
	public void close() {
		System.out.println("Existing netscape");
	}

}
