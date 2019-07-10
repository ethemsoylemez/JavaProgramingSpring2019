package day63_exceptions02;

public class ORCatchBlock {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String str = "abc";
		try {
			System.out.println(str.charAt(10));
			String st2 = null;
			System.out.println(st2.toUpperCase());
		}catch(IndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Exception Happened");
		}
	}

}
