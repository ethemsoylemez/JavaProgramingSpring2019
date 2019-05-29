package day42_customclasses_encapsulation;

//import java.util.*;
public class StarBucks {
	
	public static void main(String[] args) {
		
		//declare an array that can store two coffee object
		Coffee [] coffeeArray = new Coffee[2];
		
		//create object and assign to index 0
		coffeeArray[0] = new Coffee();
		
		//assign value to object
		coffeeArray[0].setCoffeeInfo("EXPRESSO", "TALL", 2.55, 7);
		
		//print object info
		coffeeArray[0].getCoffeInfo();
		
		Coffee latte = new Coffee();
		latte.setCoffeeInfo("CAFE LATTE", "GRANDE", 3.85, 190);
		
		coffeeArray[1] = latte;
		coffeeArray[1].getCoffeInfo();
	}

}
