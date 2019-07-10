package day54_InheritanceReviw;

 class data {

	private String password = "123456";
	private final int age = 40;// we need to create just getter for private final attributes.

	public String getPassword() {
		return password;
	}

	public int getAge() {
		return age;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public void setAge(int age) {     //final variable cannot have setter
//		this.age = age;
//	}

}

 public class FinalKeyword {

	/*
	 * final: value cannot be changed. V Variable, class and method can be final.
	 * 
	 * variable: 1. local variable: doesn't need to be initialized immediately
	 * cannot be re-assigned. 2. instance variable: needs to be initialized
	 * immediately or can be initialized in either instance block or constructor
	 * 
	 * 3. static variable: needs to be initialized immediately can be initialized in
	 * static block
	 * 
	 * class : class cannot extended, abstract class cannot be final because it has
	 * to be inherited.
	 * 
	 * method: cannot be override
	 * 
	 */

	final String name;

	{
		// name = "Batch 11";
	}

	public FinalKeyword() {
		name = "Batch 13";
	}

	final static String school;

	static {
		school = "Cybertek";
	}
	
	public static void main(String[] args) {
		final boolean result = false;

//		result = true; // final variable cannot be re-assigned
		System.out.println(result);

	}// break till

}
