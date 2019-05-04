package day23_arraysAndNumbers;

public class Arrays1 {
	public static void main(String[] args) {

		int[] numbers = new int[3];
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;

		numbers[0] = num1;
		numbers[1] = num2;
		numbers[2] = num3;

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println("=============");

		numbers[0] = 49;
		numbers[1] = 18;
		numbers[2] = 34; // 'A';
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("=============");

		String[] names = new String[5];
		String[] names2 = { "Shaun", "Roman", "Vlad", "Burak", "Maria" };

		System.out.println(names[2]); // null
		System.out.println(names2[0]);

		String[] countries = {};
		countries[0] = "USA";
		//System.out.println(countries[0]);// out of bounds
		
		String[] fruits = new String[] {"apple", "orange"};
		//for each loop or enhanced loop
		for(String fruit:fruits) {
			System.out.println("Fruits: "+fruit);
		}
		
		
		
	}

}
