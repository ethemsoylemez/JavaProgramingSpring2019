package day41_customclasses02;

public class CapitlaOne {
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		acc1.accountHolder = "Ethem Soylemez";
		acc1.accountNumber = 12345;
		
		acc1.deposit(250);
		acc1.withDraw(100);
		acc1.showBalance();
		acc1.charge(50, "wooden spoon");
		acc1.showBalance();
		
		
	}

}
