package day08_casting_conditional;

public class ImplicitCasting {
	public static void main(String[] args) {
		// Automatic casting from smaller to larger type
		short shortValue = 3455;
		int intValue = shortValue;
		System.out.println("int value: " + intValue);
		// int intValue = (int) shortValue; no need, optional

		double price = 345;
		System.out.println("Price:" + price);

		int price1 = 34563;
		double dPrice = price1;
		System.out.println("dPrice: " + dPrice);

	}

}
