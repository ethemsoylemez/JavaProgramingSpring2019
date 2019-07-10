package day55_abstraction;

public class Cat extends Mammal {

	public Cat(String name) {
		super(name);
	}

	//abstract method from animal class is implemented
	@Override
	public void speak() {
		System.out.println("miyaavv miyaavv");
	}

	//abstract method from animal class is implemented 
	@Override
	public void eat() {
		System.out.println(getName()+" eats");
	}

	//abstract method from mammal class is implemented 
	@Override
	public void produceMilk() {
		
	}
}
