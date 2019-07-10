package day57_interfaces01;

public class Cat implements Pet, Callable {

	@Override
	public void respond() {
		System.out.println("Dog is responding miyaw-miyaw");

	}

	@Override
	public void keepAsPet() {
		System.out.println("Cat is kept inside home");
	}
}
