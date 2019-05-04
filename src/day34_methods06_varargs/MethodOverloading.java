package day34_methods06_varargs;

public class MethodOverloading {
	
	public static void main(String[] args) {
		add(5,8);
		add(10.0, 8);
		add(5439873L,87947523404L);
		add("Java", "Selenium");
	}
	
	public static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public static void add(double num1, double num2) {
		System.out.println(num1+num2);
	}
	public static void add(long num1, long num2) {
		System.out.println(num1+num2);
	}
	public static void add(String str1, String str2) {
		System.out.println(str1+" "+str2);
	}

}
