package day62_exceptions01;

public class TryCatch {
	
	public static void main(String[] args) {
		try {
		String str = "java";
		System.out.println(str.charAt(30));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(1));
		}catch(Exception e){
			System.out.println("Exception happen in try block and was caught");
			
		}
		
		System.out.println("After try catch block");
	}

}
