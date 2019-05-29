package day41_customclasses02;

public class Microwave {

	// instance variable/attributes
	String brand;
	boolean isOn; // by default false (it's turn off)

	// methods
	public void turnOn() {
		if (isOn) {
			System.out.println(brand + " microwave is already on");
		} else {
			System.out.println("Turning on the " + brand + " microwave");
			isOn = true;
		}
	}

	public void turnOff() {
		if (!isOn) {
			System.out.println(brand + " microwave is already off");
		} else {
			System.out.println("Turning OFF the " + brand + " microwave");
			isOn = false;
		}
	}

	public void heat(String food) {
		if (isOn) {
			System.out.println("Heating " + food);
		} else {
			System.out.println(brand + " microwave is OFF, cannot heat " + food);
		}
	}
}
