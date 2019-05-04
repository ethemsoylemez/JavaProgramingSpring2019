package day31_methods03;

public class Counter {

	public static void main(String[] args) {

		countUp(10);
		countDown(10);
		drive("Audi", 60);
		drive("Mazda", 50);
	}
	
/*create a class Counter
	
	1) name: countUp
	   return type: void
	   param: int
	   it prints from 1 to the value of the param
	   countUp(5);
	   1 2 3 4 5

	   param value less than 1 then
	   print "invalid input"

	2) name countDown
	   return type: void
	   param: int
	   it prints from param value till 1
	   countDown(5);
	   5 4 3 2 1

       countDown(0);
       "Invalid input"
       */

	public static void countUp(int num) {
		if (num < 1) {
			System.out.println("invalid input");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n============");
	}

	public static void countDown(int num) {
		if (num == 0) {
			System.out.println("invalid input");
		} else {
			for (int n = num; n >= 1; n--) {
				System.out.print(n + " ");
			}
		}
		System.out.println("\n============");
	}

	public static void drive(String car, int speed) {
		System.out.println(car + " is driving " + speed + " mph");
	}

}
