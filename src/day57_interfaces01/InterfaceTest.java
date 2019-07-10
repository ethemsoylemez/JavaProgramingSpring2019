package day57_interfaces01;

public class InterfaceTest {
	
	public static void main(String[] args) {
		// we can not create object of INTERFACES
		//Electric el = new Electric()

		Tesla t = new Tesla();
		BMWi8 i8 = new BMWi8();

		t.charge();
		t.drive();
		t.selfDrive();
		
		i8.charge();
	
		System.out.println("==================");
		
		Cat cat = new Cat();
		cat.keepAsPet();
		cat.play();
		
		
		System.out.println("==================");
		
		Pet pat = new Cat();
		pat.play();
		
		
		Pet.feed("Dry food");
	
		System.out.println(Pet.FRIENDLY);
	
	}
}
