package day06_operatos2;

public class ShortHandOperators {
	public static void main(String[] args) {

		int students = 45;
		System.out.println("Students: " + students);
		students = students + 5;
		System.out.println("Students: " + students);
		students = students - 2;
		System.out.println("Students: " + students);
		students += 5;
		System.out.println("Students: " + students);

		int teachers = 10;
		System.out.println("Teachers: " + teachers);
		teachers -= 2;
		System.out.println("Teachers: " + teachers);

		int cars = 12;
		System.out.println("Cars: " + cars);
		cars *= 2;
		System.out.println("Cars: " + cars);
		cars += cars;
		System.out.println("Cars: " + cars);

		int shoes = 20;
		shoes /= 4;
		System.out.println("Shoes: " + shoes);
		
		double price = 45.8;
		int amount = 5;
		price += amount;
		System.out.println("Price: " + price);
		
		int minutes = 66;
		minutes %= 60;
		System.out.println("Minutes: " + minutes);
		
		

	}

}
