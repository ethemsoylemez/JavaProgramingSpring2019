package day62_exceptions01;

public class RuntimeError {
	
	static int i =0;
	public static void main(String[] args) {
		// Below line will create StackOverflowError. Stack get full
		// due to calling the method non-stop
		go();
	}
	public static void go() {
		System.out.println(i+" going");
		i++;
		go(); //method calls itself - recursive method. recursion
	}

}
