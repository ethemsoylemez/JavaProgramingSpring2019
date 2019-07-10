package day50_inheritance03;


//purpose of this exercises is to understand method overriding 

public class Animal {

	public void speak() {
		System.out.println("Animal is speaking");
	}
	
	public void move(int steps) {
		System.out.println("Animal is moving " +steps +" steps");
	}
}
