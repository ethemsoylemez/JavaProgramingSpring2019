package day54_InheritanceReviw;

import java.util.*;

 class Cybertek {


	@SuppressWarnings("unused")
	private int password;

	public void setPassword(int num) {
		password = num;
	}
}

 public class This_Super extends Cybertek {

	/*
	 * this&super: refers to object instances. 
	 * this: refers object instance in the class. 
	 * this. :calls the instance methods, instance variables. can only be used at: constructor, instance block, instance methods
	 * 
	 * this(): can only be used in the constructor.
	 * 
	 * super: refers object instance in super class. 
	 * super. : calls the instance methods, instance variables from super class. can only be used at: constructor, instance block, and instance methods 
	 * super(): can be used in constructor
	 * 
	 * 
	 */

	static String str = "School";

	public static void methodY(String str) {
		System.out.println(This_Super.str);
	}

	boolean result1;
	String str1;
	double decimal;

	static char ch;

	public static void main(String[] args) {
		// this.result1 =true; // there is object instance
		methodY(str);
		
	}

	static {
		// this.result1 =true; // there is object instance
	}

	public This_Super() {
		this.result1 = true;
		this.str1 = "obj";
		this.decimal = 0.9;
		//this.ch = '7';
		ch = 'l'; //static way
		//new This_Super().ch = 'p';
		This_Super.ch = 'o'; //static way
	}

	public void instancemethod() {
		this.result1 = true;
	}

	{
		this.result1 = true;
	}

	static Scanner scan = new Scanner(System.in);

	public void scan1() {
		float num = scan.nextFloat();
		scan2(num);
	}

	public static void scan2(float t) {
		@SuppressWarnings("unused")
		int B = scan.nextInt();
	}

	public This_Super(char c) {
		@SuppressWarnings("unused")
		boolean b = scan.nextBoolean();
	}
}
