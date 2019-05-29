package day43_encapsulation_constructor;

public class MyPets {
	
	public static void main(String[] args) {
		//Initialize values by constructor 
		Pet pet1 = new Pet("Dog" , "Poohchi");
		Pet pet2 = new Pet("Cat" , "Barsik");
		Pet pet3 = new Pet("Cat" , "Mila");
		Pet pet4 = new Pet("Fish", "Purple");
		Pet pet5 = new Pet("Goat", "Kozlik");
		Pet pet6 = new Pet("Bird", "Mina | Chika");
		
		pet1.speak();
		pet2.speak();
		pet3.speak();
		pet4.speak();
		pet5.speak();
		pet6.speak();
		
		System.out.println(pet1.toString());
		System.out.println(pet2.toString());
		System.out.println(pet3.toString());
		System.out.println(pet4.toString());
		System.out.println(pet5.toString());
		System.out.println(pet6.toString());
		
	}
}
