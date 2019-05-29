package day42_customclasses_encapsulation;

public class Coffee {
	// instance variables/instance fields/attributes
	String name;
	String size;
	double price;
	int calories;

	// methods
	public void getCoffeInfo() {
		String info = name.toUpperCase() + " " + size.toUpperCase() + " $" + price + " " + calories + " CAL";
		System.out.println(info);
	}

	public void setNames(String newName) {
		name = newName;
	}

	public void setSize(String newSize) {

		if (newSize.equalsIgnoreCase("TALL") || newSize.equalsIgnoreCase("grande")
				|| newSize.equalsIgnoreCase("Venti")) {
			size = newSize;
		} else {
			System.out.println("unknown");
		}
	}

	public void setPrice(double newPrice) {
		price = newPrice;
	}

	public void setCalories(int newCalories) {
		calories = newCalories;
	}
	public void setCoffeeInfo(String newMame, String newSize, double newPrice, int newCalories) {
		name = newMame;
		//size = newSize;
		setSize(newSize);
		
		price = newPrice;
		calories = newCalories;
		
	}

}
