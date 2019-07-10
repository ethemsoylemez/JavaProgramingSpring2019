package day61_polymorphism03;

import day60_polymorphism02.*;

public class DownCasting {

	public static void main(String[] args) {

		AppleDevice appDev = new IPad();

		// appDev can access use method, startingPrice method
		appDev.use();
		// appDev.draw() not accessible
		// how to call draw method from IPad

		IPad ipad2 = (IPad) appDev;
		ipad2.use();
		ipad2.draw();

		AppleDevice dev2 = new Mac();
		dev2.use();
		// 1) using another reference variable

		Mac mac = (Mac) dev2;
		mac.code();
		System.out.println(mac.model);

		// 20 cast and call in single statement
		((Mac) dev2).code();
		System.out.println(((Mac) dev2).model);

		// String str = (String) dev2; not related with inheritance

		double d = 123.45;
		int j = (int) d; // 123
		System.out.println(j);
	}

}
