package day41_customclasses02;

public class Car {
	
	// instance variable/attributes/properties/data;
	String make;
	String model;
	int currentSpeed; 
	String color;
	
	//Methods
	public void printCarInfo() {
		String carInfo = "car make["+make+"], model["+model+"], color["+color+"], currentSpeed["+currentSpeed+"]";
		System.out.println(carInfo);
	}
	
	public void showCurrentSpeed(int speedLimit) {
		if(currentSpeed<=speedLimit) {
			System.out.println(make+" is driving at "+currentSpeed+" mph, following speed limit - "+speedLimit);
		}else {
			System.out.println(make+" is driving at "+currentSpeed+" mph, over the speed limit - "+speedLimit);
		}
	}
	public void drive() {
		System.out.println(make + " "+ model+" is driving");
	}
	public void acellerate(int mph) {
		currentSpeed += mph;
	}
}
