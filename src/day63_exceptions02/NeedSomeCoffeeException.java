package day63_exceptions02;

//CUSTOM CHECKED EXCEPTION. EXTENDS EXCEPTION


public class NeedSomeCoffeeException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NeedSomeCoffeeException() {}

	public NeedSomeCoffeeException(String message) {
		super(message);
	}

}
