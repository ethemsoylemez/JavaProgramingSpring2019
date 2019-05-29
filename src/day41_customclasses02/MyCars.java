package day41_customclasses02;
//in this class we are using attributes and methods from two different classes (Car, BMW)
public class MyCars {
	public static void main(String[] args) {
		
	Car car1 = new Car();
	car1.make = "Ford";
	car1.model = "Fiesta";
	car1.color = "Grey";
	car1.currentSpeed = 55;
	
	car1.printCarInfo();
	car1.showCurrentSpeed(70);
	car1.showCurrentSpeed(35);
	car1.drive();
	System.out.println("before: "+car1.currentSpeed);
	car1.acellerate(20);
	System.out.println("after: "+car1.currentSpeed);
	
	BMW bmw = new BMW();
	System.out.println(bmw.make);
	bmw.model = "740i";
	bmw.showPrice();
	System.out.println("Car Price: "+bmw.price);
	
	BMW bmw2 = new BMW();
	bmw2.model = "X3";
	bmw2.showPrice();
	}
}
