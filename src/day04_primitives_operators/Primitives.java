package day04_primitives_operators;

public class Primitives {
	public static void main(String[] args) {
		byte byteValue = 127; // 1 byte
		short shortValue = 23000; // 2 byte
		int intValue = 12345645; // 4 byte
		long longValue = 3268430953792402L; // 8 byte

		float floatValue = 12.123F; // 4 byte
		double doubleValue = 1342.7; // 4 byte

		char charValue = '@'; // 1 byte 
		char charValue2 = '8';
		char charValue3 = 65; // this gives A

		boolean booleanValue = true; // 1 byte
		boolean booleanValue2 = false;

		System.out.println("Byte: " + byteValue);
		System.out.println("short: " + shortValue);
		System.out.println("int: " + intValue);
		System.out.println("long: " + longValue);
		System.out.println("float: " + floatValue);
		System.out.println("double: " + doubleValue);
		System.out.println("char: " + charValue);
		System.out.println("char: " + charValue2);
		System.out.println("char: " + charValue3);
		System.out.println("boolean: " + booleanValue);
		System.out.println("boolean: " + booleanValue2);
	}

}
