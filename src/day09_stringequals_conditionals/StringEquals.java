package day09_stringequals_conditionals;

public class StringEquals {
	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "Java";

		// using ==
		System.out.println(str1 == str2); // true
		System.out.println(str1 == "Java");// true
		System.out.println(str1 == "java");// false
		System.out.println("=====================");

		// equals method, preferred way
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals("Java"));// true
		System.out.println(str1.equals("java"));// false
		System.out.println("=========================");

		// String month = "March";
		String month = new String("March");
		String month2 = new String("March");

		System.out.println(month == month2); // false
		System.out.println(month.equals(month2));// true
		System.out.println(month2.equals(month));// true
		System.out.println(month.equals("March"));// true
		System.out.println(month2.equals("March"));// true

	}
}
