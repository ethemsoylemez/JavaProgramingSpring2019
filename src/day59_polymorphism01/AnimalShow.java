package day59_polymorphism01;

public class AnimalShow {

	public static void main(String[] args) {

		//reference type and object type are same
		Animal an = new Animal();

		// Since reference type and object type are different this is polymorphism
		// Reference type must be parent class and object type must be child class
		Animal zb = new Zebra();
		Animal tg = new Tiger();
		Animal ct = new Cheetah();

		an.talk();
		tg.talk();
		zb.talk();
		//zb.run(); not exist
		ct.talk();
		System.out.println("================");

		Animal[] animals = new Animal[3];
		
		animals[0] = new Tiger();
		animals[1] = new Zebra();
		animals[2] = new Cheetah();
		
		animals[0].talk();
		animals[1].talk();
		animals[2].talk();
		
	}

}
