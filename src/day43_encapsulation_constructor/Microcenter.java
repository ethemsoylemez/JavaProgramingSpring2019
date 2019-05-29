package day43_encapsulation_constructor;

public class Microcenter {
	public static void main(String[] args) {
		Computer comp1 = new Computer();
		Computer comp2 = new Computer();
		
		comp1.setBrand("iMac");
		comp1.setOs("macOS High Sierra");
		comp1.setPrice(2567);
		
		comp2.setBrand("ASUS");
		comp2.setOs("Windows 10");
		comp2.setPrice(1500);
		
		// using constructor
		Computer comp3 = new Computer("DELL", "Windows 7", 645.5);

		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		
		System.out.println(comp3.toString());
		comp3.setOs("Windows 11");
		System.out.println(comp3.toString());
		
		comp3.setPrice(comp3.getPrice()-200);
		System.out.println(comp3.toString());
	}

}
