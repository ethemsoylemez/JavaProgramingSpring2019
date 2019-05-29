package day46_static_keyword;

public class Ebay {
	
	
	public static void main(String[] args) {
		
		Customer cm1 = new Customer("Abdallah Aleises", "AbdallahAleises@gmail.com");
		Customer cm2 = new Customer("ADILET KYRGYZ", "adilet@yahoo.com");
		Customer cm3 = new Customer("Anastasiia Zasibna", "Anastasiia@outlook.com");
		
		
		System.out.println(cm3.count1);
		System.out.println("Total customer: "+cm3.count);
		System.out.println("Total customer: "+Customer.count);
		
		Customer cm4 = new Customer("Burak Ucal",  "burak@yahoo.com");
		System.out.println(cm4.count1);
		System.out.println("Total customer: "+cm4.count);
		System.out.println("Total customer: "+Customer.count);
		
		cm1.count = 10;// once we change static variable by one object than it will be changed for all other objects
		System.out.println(cm3.count);
		System.out.println(cm1.toString());
		System.out.println(cm2.toString());
		System.out.println(cm3.toString());
		System.out.println(cm4.toString());
//		System.out.println(cm1.toString());
//		System.out.println(cm2.toString());
//		System.out.println(cm3.toString());
//		System.out.println(cm4.toString());
	}

}
