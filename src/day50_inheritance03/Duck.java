package day50_inheritance03;

public class Duck extends Animal {
	public void speak() {
		System.out.println("Duck is saying wuck wuck");
	}
	public void move(int steps) {
		System.out.println("Duck is moving "+ steps+" steps");
	}

}
