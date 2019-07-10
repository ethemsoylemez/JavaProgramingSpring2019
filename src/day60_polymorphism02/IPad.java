package day60_polymorphism02;

public class IPad extends AppleDevice{
	
	public double maxScreenSize = 12.7;

	@Override
	public void use() {
	System.out.println("IPad | Music | Read Book | Cartoon");
	
		
	}
	public void draw() {
		System.out.println("IPad | Draw");
	}

}
