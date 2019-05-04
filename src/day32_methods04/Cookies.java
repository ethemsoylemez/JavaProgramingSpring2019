package day32_methods04;

public class Cookies {
	public static void main(String[] args) {
		makePancakes();
		makePasta();
		cook("Omlette", "Eggs, Salt, Tomatoes, Green Peppers, Onions");
	}
	public static void cook(String dish, String ingredients) {
		System.out.println("~~" + dish.toUpperCase() + " RECIPE~~");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("~~" + dish.toUpperCase() + " IS READY~~");
	}
	public static void makePasta() {
		System.out.println("~~ITALIAN PASTA RECIPE~~");
		add("Water, Salt, Olive Oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		add("Parmesan cheese, Marinara");
		System.out.println("~~DELICIOUS PASTA IS READY~~");
	}
	public static void makePancakes() {
		System.out.println("~~PANCAKES RECIPE~~");
		add("Milk, Eggs, Flour,Sugar, Salt");
		mix(120);
		fry(3);
//		boil();
		System.out.println("~~ENJOY YOUR DELICIOUS PANCAKES~~");

	}
//	Cooking 
//    -> add something
//    -> mix some seconds
//    -> fry some minutes
//    -> boil some minutes
//    1) method name add
//       -> return: void
//       -> params: 1 String 
//       -> print "Add something"
//       add("oil"); "Add oil"
//       add("oil, onions");"Add oil, onions"
//    2) mix
//       -> param: 1 int seconds
//       "Mix for 10 seconds"

	public static void add(String ingredients) {
		System.out.println("Add " + ingredients);
	}

	public static void mix(int seconds) {
		System.out.println("Mix for " + seconds + " seconds");
	}

	public static void fry(int minutes) {
		System.out.println("Fry for " + minutes + " minutes");
	}

	public static void boil(int minutes) {
		System.out.println("Boil for " + minutes + " minutes");
	}
}
