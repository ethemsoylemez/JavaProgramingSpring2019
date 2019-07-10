package day62_exceptions01;

public class TryCatch2 {
	public static void main(String[] args) {
		int[] nums = {34, 6, 34, 12};
		//Handle if any issues with below line. 
		//If any exception happens, print "Wrong Index"
		try {
		   System.out.println(nums[6]);
		} catch(Exception e) {
			System.out.println("Wrong index");
		}

		System.out.println("Some code after array");
		try {
			int j = 100;
			int n = j / 0; //cannot / by zero. Arithmetic exception
			System.out.println(n);
		} catch (ArithmeticException e) {
			System.out.println("Cannot / by zero");
			e.printStackTrace();
		}
		System.out.println("AFTER TRY CATCH");
	}
}
