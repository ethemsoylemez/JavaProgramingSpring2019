package day56_abstraction;

public abstract class MobilePhone extends Phone {
	// it doesn't need to override call method since it's also abstract
	
	public abstract void text(String message);

}
