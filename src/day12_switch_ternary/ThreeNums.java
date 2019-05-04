package day12_switch_ternary;

public class ThreeNums {
	public static void main(String[] args) {
		int n1 = 100;
		int n2 = 10;
		int n3 = 100;
		//first version
		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 is bigger");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("n2 is bigger");
		}  else {
			System.out.println("n3 is bigger");
		}
		
		
		//second version
				if (n1 > n2 && n1 > n3) {
					System.out.println("n1 is bigger");
				} else if (n2 > n3) {
					System.out.println("n2 is bigger");
				} else {
					System.out.println("n3 is bigger");
				} 
	}

}
