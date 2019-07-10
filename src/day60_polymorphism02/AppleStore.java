package day60_polymorphism02;

public class AppleStore {
	
	public static void main(String[] args) {
		
		AppleDevice mac = new Mac();
		mac.use();
		//mac.code(); is not visible 
		//Only AppleDivece(Parent Class) method can be called
		
		Mac myMac = new Mac();
		myMac.use();
		myMac.code();
		
		AppleDevice watc = new AppleWatch();
		watc.use();
		
		AppleWatch myWatch = new AppleWatch();
		myWatch.use();
		myWatch.wear();
		
		AppleDevice dev1 = new Mac();
		System.out.println("Starting price "+dev1.startingPrice);
		//System.out.println(dev1.model); ==> ERROR
		
		AppleDevice dev2 = new IPad();
		System.out.println("Starting price "+dev2.startingPrice);
		//System.out.println(dev2.maxScreenSize); error
		
		IPad ipad = new IPad();
		
		System.out.println("Starting price "+ipad.startingPrice);
		System.out.println("Maximum screen size "+ipad.maxScreenSize);
		
	}

}
