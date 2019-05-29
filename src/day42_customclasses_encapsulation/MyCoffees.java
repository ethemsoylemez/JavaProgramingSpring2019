package day42_customclasses_encapsulation;

public class MyCoffees {
	public static void main(String[] args) {
		
		Coffee coffee1 = new Coffee();
		
		//Assign values directly
		coffee1.name = "ICED CARAMEL MACCHIATO";
		coffee1.size = "GRANDE";
		coffee1.price = 4.75;
		coffee1.calories = 250;
		
		coffee1.getCoffeInfo();
		
		//Assign values directly
		Coffee coffee2 = new Coffee();
		coffee2.name = "JAVA CHIP";
		coffee2.size = "VENTI";
		coffee2.price = 5.95;
		coffee2.calories = 600;
		
		coffee2.getCoffeInfo();
		
		//Assign values by methods
		Coffee coffee3 = new Coffee();
		coffee3.setNames("ICED COFFEE");
		coffee3.setSize("TALL");
		coffee3.setPrice(2.45);
		coffee3.setCalories(60);
		
		//System.out.println("Coffee3 name: "+coffee3.name);
		coffee3.getCoffeInfo();
		
		Coffee coffee4 = new Coffee();
		
		//Assign values with one line
		coffee4.setCoffeeInfo("FLAT WHITE", "TALL", 3.95, 170);
		coffee4.getCoffeInfo();;
		
	}

}
