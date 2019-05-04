package day07_scanner_operator;

public class PreAndPost {
	public static void main(String[] args) {
		int num = 0;
		int num2 = num++;
		
		System.out.println("num: "  + num);
		System.out.println("num2: " + num2);
		
		int n = 0;
		int n2 = ++n;
		
		System.out.println("n: "  + n);
		System.out.println("n2: " + n2);
		
		int i = 10;
		i++;
		++i;
		System.out.println("i: "+i);
		
		int apples = 4;
		int pears = apples++;
		System.out.println("Apples: "+apples);
		System.out.println("Pears: "+pears);
		
		apples = 4;
		pears = ++apples;
		System.out.println("Apples: "+apples);
		System.out.println("Pears: "+pears);
		
		int bananas = 6;
		int pears2 = bananas++;
		int appless = ++bananas;
		System.out.println("bananas: " + bananas);
		System.out.println("pears2: " + pears2);
		System.out.println("appless: " + appless);
		
		int friends = 10;
		System.out.println("Friends: " + friends++);
		System.out.println("Friends: " + friends);
		System.out.println("Friends: " + ++friends);
		
		int p1 = 10;
		int sum = p1++ + 5; // Assign p1 to sum, increase p11 add 5 to sum
		System.out.println("Sum: " + sum);
		System.out.println("P1: " + p1);
		
		int batteries = 8;
		int oldBatteries = 5;
		int totalBatteries = batteries++ + ++oldBatteries;
		System.out.println("batteries: " + batteries);
		System.out.println("oldBatteries: " + oldBatteries);
		System.out.println("totelBatteries: " + totalBatteries);
		
		
		
		
	}

}
