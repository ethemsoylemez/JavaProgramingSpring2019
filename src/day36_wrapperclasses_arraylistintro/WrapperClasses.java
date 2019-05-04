package day36_wrapperclasses_arraylistintro;

public class WrapperClasses {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		int n1 = 10;
		Integer n2 = new Integer(20);
		System.out.println(n1);
		System.out.println(n2);

		double d1 = 44.5;
		Double d2 = new Double(123.1);
		Double d3 = new Double("5.3");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d1 + d2 + d3);

		char ch1 = 'a';
		Character ch2 = new Character('b');
		System.out.println(ch1);
		System.out.println(ch2);

		byte b1 = 100;
		Byte b2 = new Byte((byte) 10);
		Byte b3 = new Byte("-55");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b1 + b2 + b3);
		
		Integer num1 = Integer.valueOf(1234);
		Integer num2 = Integer.valueOf("567");
		Boolean bl1 = Boolean.valueOf(true);
		Boolean bl2 = Boolean.valueOf("false");
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(bl1);
		System.out.println(bl2);
		

	}

}
