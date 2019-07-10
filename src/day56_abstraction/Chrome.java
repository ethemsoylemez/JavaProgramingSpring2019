package day56_abstraction;

public class Chrome extends Browser {
	
	public Chrome(String name,int id) {
		super(name,id);
	}

	@Override
	public void navigate(String url) {
		System.out.println("Chrome - navigating to: "+url);
	}

	@Override
	public void displayWebpage() {
		System.out.println("Chrome - displaying webpage");
		
	}

	@Override
	public boolean launch() {
		System.out.println("Chrome is lounching\n1 2 3");
		return true;
	}
	
	//not necessary
	@Override 
	public void close() {
		System.out.println("Existing Chrome");
	}

}
