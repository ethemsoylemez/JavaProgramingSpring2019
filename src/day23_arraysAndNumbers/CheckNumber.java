package day23_arraysAndNumbers;

public class CheckNumber {
	
	public static void main(String[] args) {
		for(int i = 1; i<=100; i++) {
			if (i==15) {
				break;
			}
			System.out.print(i+" ");
		}
		System.out.println("\n===============");
		//odd numbers
		for(int i = 1; i<=10; i++) {
			if (i%2==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println("\n============");
		//Numbers from 1 to 20 except from 5 to 10;
		for(int i = 1;i<=20;i++) {
			if(i>=5&&i<=10) {
				continue;
			}
			System.out.print(i+" ");
		}
	
}

}
