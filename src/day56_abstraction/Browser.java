package day56_abstraction;

public abstract class Browser {
	
	String name;
	static int id;

	public Browser() {
		System.out.println("Creating a Browser");
	}
	
	public Browser(String name, int id) {
		this.name = name;
		Browser.id = id;
	}
	
	public abstract void navigate(String url);
	public abstract void displayWebpage();
	public abstract boolean launch();
	
	
	public void close() {
		System.out.println("Exiting from browser");
	}

}
