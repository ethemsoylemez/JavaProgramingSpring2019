package day08_casting_conditional;

public class CastingPrimitives {
	public static void main(String[] args) {
		// cost double value to integer

		// int i = 3.4;
		int i = (int) 3.4; // will remove .4

		System.out.println("i: " + i);

		double price = 230.50;
		int dollars = (int) price;
		System.out.println("Price: " + dollars);

		// whole numbers: byte, short, int, long

		int count = 126;
		byte byteCount = (byte) count;
		System.out.println("ByteCount: " + byteCount);

		long longValue = 3456459L;
		int intValue = (int) longValue;
		System.out.println("Int value: " + intValue);

		int large = 5678;
		short small = (short) large;
		System.out.println("Small: " + small);

		// int result = (int)500.4/2.0;
		int result = (int) (500.4 / 2.0);
		System.out.println("Result: " + result);

		byte b = 123;
		int k = b;
		System.out.println("K: " + k);
	}

}
