package day60_polymorphism02;

public class Mac extends AppleDevice{
	
	public String model = "Mac";

	@Override
	public void use() {
		System.out.println("Mac | computer | code | read book | email");
		
	}
	public void code() {
		System.out.println("Coding java with Mac");
	}
}
