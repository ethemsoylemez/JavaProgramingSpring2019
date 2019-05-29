package day49_inheritance02;

public class Leopard extends Animal {
	
	public Leopard() {
		super();//call parent class no-arg constructor
		System.out.println("Leopard constructor");
		setType("Leopard");
		//super.setType("Leopard");
	}
	
	public Leopard(String type) {
		super(type); //call parent class one-arg constructor
		System.out.println("Leopard 1 arg constructor");
	}

}
