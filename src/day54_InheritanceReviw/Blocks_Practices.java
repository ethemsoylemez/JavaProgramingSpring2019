package day54_InheritanceReviw;

public class Blocks_Practices {

	static String names;

	static {
		names = "John";
	 }

	{
		names = "Aaron";
	}

	public Blocks_Practices() {
		names = "Muradil";
	}

	int num1 = 10;
	static int num2 = 10;

	public   void main(String[] args) {

		Blocks_Practices obj = new Blocks_Practices();
		obj.num1 = 20;
		Blocks_Practices.num2 = 20;

		Blocks_Practices obj2 = new Blocks_Practices();
		System.out.println(obj2.num1); // 10
		System.out.println(Blocks_Practices.num2); // 20
		System.out.println(names);
	}
}
