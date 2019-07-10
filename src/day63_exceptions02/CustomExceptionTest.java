package day63_exceptions02;

public class CustomExceptionTest {
	
	public static void main(String[] args) throws NeedSomeCoffeeException {
		double balance = 2000;
		double transaction = 210;

		if(transaction > balance) {
			//throw new InsufficientFundsException();
		
			throw new InsufficientFundsException("Balance is too low.");
		}else {
			System.out.println("Purschace successful.");
			balance -= transaction;
		}

		throw new NeedSomeCoffeeException("getting sleepy");

	}
}
