package day59_polymorphism01;

public class Zebra extends Animal {
	
	
	@Override
	public void talk() {
		System.out.println("Zebra is talking > Zzzee");
	}
	public void run() {
		System.out.println("Zebra does'n run");
	}
}
