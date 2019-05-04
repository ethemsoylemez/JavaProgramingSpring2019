package day32_methods04;

public class MethodsWithReturn {
	public static void main(String[] args) {
		System.out.println(giveMe10$());
		int i = giveMe10$();
		System.out.println("i: "+i);
		System.out.println(giveMeYourName());
		String name = giveMeYourName()+" Soylemez";
		System.out.println(name);
	}
	
	public static int giveMe10$() {
		
		return 10;
	}
	
	public static String giveMeYourName() {
		String name = "Ethem";
		return name;
	}

}
