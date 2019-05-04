package day08_casting_conditional;

public class Relationals {
	public static void main(String[] args) {
		double d1 = 23.56;
		double d2 = 20.89;
		System.out.println(d1 >= d2);
		boolean check = d1 >= d2;
		System.out.println("Check: " + check);

		char ch1 = 'a';
		char ch2 = 'j';
		char ch3 = 'A';
		System.out.println(ch2 > ch1); // true 'j'>'a'
		System.out.println(ch1 > ch3); // true 'a'>'A'

		boolean b = true == false;
		System.out.println("B: " + b);

		b = true != false;
		System.out.println("B: " + b);

	}

}
