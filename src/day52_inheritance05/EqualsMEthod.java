package day52_inheritance05;

public class EqualsMEthod {

	public static void main(String[] args) {
		Computer comp1 = new Computer("iMac", "silver");
		Computer comp2 = new Computer("iMac", "silver");
		Computer comp3 = comp2; // point to same object

		System.out.println(comp1 == comp2);
		System.out.println(comp1.equals(comp2));
		System.out.println("=====================");

		System.out.println(comp3 == comp2);
		System.out.println(comp3.equals(comp2));
		System.out.println("=====================");

		String str1 = "java";
		String str2 = new String("java");
		
		//check only if both str1 and str2 points the same object
		System.out.println(str1 == str2);
		//checking value in the str1 and str2
		System.out.println(str1.equals(str2));

	}

}
