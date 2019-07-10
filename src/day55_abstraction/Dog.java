package day55_abstraction;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}
	
	//abstract method implemented
	@Override
	public void speak() {
		System.out.println("woof woof");	
	}

	//abstract method implemented
	@Override
	public void eat() {
		System.out.println(getName() + " eats");	
	}
}
