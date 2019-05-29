package day46_static_keyword;

public class Restaurant {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Dinner Mom = new Dinner();
		Dinner Kid = new Dinner();
		Dinner Dad = new Dinner();
		
		
		//we can access to static variables by class name or object name
		System.out.println("Total slices: "+ Dinner.pizzaSlices);
		
		Dad.takeASlice();
		Kid.takeASlice();
		Mom.takeASlice();
		
		System.out.println("Total slices: "+ Dinner.pizzaSlices);
		System.out.println("Total slices: "+ Dad.pizzaSlices);
		
		Kid.takeASlice(3);
		Dad.takeASlice(2);
		//Mom.takeASlice();
		
		System.out.println("Total slice: "+ Mom.pizzaSlices);
		System.out.println("Total slices: "+ Dinner.pizzaSlices);
	}

}
