package day04_primitives_operators;

public class UsingVariables {
	// main ctrl+space (shortcut)
	public static void main(String[] args) {

		int num1, num2, num3;
		// assign 100 to num1
		num1 = 100;
		// assign value of num1 to num2
		num2 = num1;
		// syso or sysout ctrl+space (shortcut)
		System.out.println(num1);
		System.out.println(num2);
		
		num2 = 200;
		num1 = num2;
		num3 = num1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("===========");
		
		//declare apples and assign 25
		int apples = 25;
		System.out.println(apples);
		
		// declare kiwis and assign values of apples to it
		int kiwis = apples;
		System.out.println(kiwis);
		
		//declare mangoes and 55
		int mangoes = 55;
		System.out.println(mangoes);
		
		//assign mangoes to kiwis
		kiwis = mangoes;
		System.out.println(kiwis);
		
		System.out.println("===========");
		System.out.println(apples);
		System.out.println(kiwis);
		System.out.println(mangoes);
		System.out.println(kiwis);
		
		
		
		
	}

}
