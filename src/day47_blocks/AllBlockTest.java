package day47_blocks;

public class AllBlockTest {
	

	public static void main(String[] args) {
		
		AllBlocks all1 = new AllBlocks();
		System.out.println("Non-static variable value at the end: "+all1.nonStaticInt);
		System.out.println("Static variable value: "+all1.staticInt);
		System.out.println("\n================================");
		
		AllBlocks all2 = new AllBlocks();
		System.out.println("Non-static variable value: "+all2.nonStaticInt);
		System.out.println("Static variable value: "+all2.staticInt);
		System.out.println("\n================================");
		
		AllBlocks all3 = new AllBlocks();
		System.out.println("Non Static variable value: "+all3.nonStaticInt);
		System.out.println("Static variable value: "+all3.staticInt);
		System.out.println("\n================================");
		
		System.out.println("Static variable value at the end object1: "+all1.staticInt);
		System.out.println("Static variable value at the end object2: "+all2.staticInt);
		System.out.println("Static variable value at the end object3: "+all3.staticInt);
	}

}
