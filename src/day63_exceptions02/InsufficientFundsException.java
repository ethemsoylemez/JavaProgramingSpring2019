package day63_exceptions02;

//CUSTOM UNCHECKED EXCEPTION. EXTENDS RUNTIME EXCEPTION


public class InsufficientFundsException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException() {

	}

    public InsufficientFundsException(String message) {
	  super(message);
	}
}
