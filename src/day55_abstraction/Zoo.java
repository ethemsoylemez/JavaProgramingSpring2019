package day55_abstraction;

public class Zoo {
	
	public static void main(String[] args) {
		
		//Animal animal1 = new Animal(); // cannot instantiate the type animal
		//Mammal animal1 = new Mammal(); // cannot instantiate the type mammal
		// animal and mammal are abstract , we can not create object of abstract class
		Cat pisik = new Cat("pisik");
		pisik.speak();
		pisik.eat();
		
		Dog hirco = new Dog("Hirco");
		hirco.speak();
		hirco.eat();
	}

}
