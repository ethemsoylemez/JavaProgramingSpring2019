package day21_loopspractice1;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome, how many items are you purhasing?");
		int itemCount = scan.nextInt();
		String items = "", itemName;
		double totalPrice = 0;

		for (int count = 1; count <= itemCount; count++) {
			System.out.println("Enter item " + count);
			itemName = scan.next();
			System.out.println("How much is " + itemName + "?");
			double itemPrice = scan.nextDouble();
			
			if (count == itemCount) {
				items += itemName.substring(0, 1).toUpperCase() + itemName.substring(1);	
			}else {
				items += itemName.substring(0, 1).toUpperCase() + itemName.substring(1) + ", ";
			}
			totalPrice += itemPrice;
		}
//		String newItems = "";
//		if (items.endsWith(", ")) {
//			for(int i =0;i<items.length()-2;i++) {
//			newItems += Character.toString(items.charAt(i));
//			}
//			System.out.println("Purhcased items: " + newItems);
//		} else {
//			System.out.println("Purhcased items: " + items);
//		}
		System.out.println("Purhcased items: " + items);
		System.out.println("Total price: " + totalPrice);
		scan.close();
	}

}
