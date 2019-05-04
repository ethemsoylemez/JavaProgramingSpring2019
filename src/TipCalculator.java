

import java.util.Scanner;
/**
 * Requirements added:
 * 1)Splitting the tip among a different number of people than are present.
 * 2)Tipping a dollar amount rather than choosing a percentage.
 * 3)Giving a different discount if party spent more than $1000 and the service is great or above.
 * 4)Invalid response checks.
 */
public class TipCalculator {
	public static void main(String[] args) {
		Scanner defaulted = new Scanner(System.in);
		double subtotal = 0, tipPercent = 0, customTip = 0, total = 0, tip = 0, tipPerPerson = 0, totalPerPerson = 0,
				percentDiscount = 0, discount = 0, totalAfterDiscount = 0;
		int numberOfPeople = 0, customSplit = 0;
		boolean resetLoop, isSplit = false, hasDiscount = true, hasCustomTip = false, isCustomSplit=false;
		String serviceQuality = "", customizeTip = "", split = "";
		//split input{
		do {
			resetLoop = false;
			System.out.println("Split: Yes, No, or Custom?");
			split = defaulted.next().toLowerCase();
			switch (split) {
			case "custom":
				System.out.println("Enter amount of ways you splitting the check: ");
				customSplit = defaulted.nextInt();
				resetLoop = customSplit > 1 ? false : true;
				if (resetLoop) 
					System.out.println("Invalid split");
				else
					isCustomSplit=true;
				break;
			case "yes":
				isSplit = true;
				break;
			case "no":
				isSplit = false;
				break;
			default:
				System.out.println("Invalid split");
				resetLoop = true;
			}
		} while (resetLoop);
		//}
		//number of people and check amount inputs{
		while (true) {
		//	number of people{
			System.out.println("Number of people: ");
			numberOfPeople = defaulted.nextInt();
			if (numberOfPeople >= 0 && numberOfPeople >= customSplit) {
				numberOfPeople += numberOfPeople == 0 ? 1 : 0;
				System.out.println("Number of people: "+numberOfPeople);
		//		check amount{
				System.out.println("Check amount:");
				subtotal = defaulted.nextDouble();
				if (subtotal <= 0)
					System.out.println("Please enter correct amount!");
				else
					break;
		//		}
			} else if (numberOfPeople < 0)
				System.out.println("Number of people cannot be negitive!");
			else
				System.out.println("How do you plan to split the check with more people than are here?");
		}
		//	}
		//}
		//Service Quality input{
		do {
			resetLoop = false;
			System.out.println("Service Quality: ");
			serviceQuality = defaulted.next();
			switch (serviceQuality) {
			case "excellent":
				tipPercent = 0.25;
				break;
			case "great":
				tipPercent = 0.20;
				break;
			case "good":
				tipPercent = 0.15;
				break;
			case "fair":
				tipPercent = 0.10;
				break;
			case "poor":
				tipPercent = 0.05;
				break;
			default:
				System.out.println("Invalid choice, do you want to customize your tip?");
				customizeTip = defaulted.next();
				if (customizeTip.equalsIgnoreCase("yes")) {
		//			input of a dollar amount for tip{
					hasCustomTip = true;
					System.out.println("Enter your tip amount:");
					customTip = defaulted.nextDouble();
		//				assigning service quality based on tip {
					double tipFair = subtotal * .10, tipGood = subtotal * .15, tipGreat = subtotal * 0.20,
							tipExcellent = subtotal * .25;
					if (customTip<=0) {
						System.out.println("Invalid Tip");
						resetLoop = true;
					}
					else if (customTip >= tipGood && customTip < tipExcellent)
						serviceQuality = customTip >= tipGood && customTip < tipGreat ? "good" : "great";
					else if (customTip >= tipExcellent)
						serviceQuality = "excellent";
					else
						serviceQuality = customTip >= tipFair ? "fair" : "poor";
		//				}
		//			}
				} else
					resetLoop = true;
			}
		} while (resetLoop);
		//}
		System.out.println("===============");// end of inputs
		
		//calculations {
		tip = hasCustomTip ? customTip : tipPercent * subtotal; // defining tip, predefined or custom
		total = subtotal + tip; // defining total
		if (numberOfPeople == 1 || (isSplit == false && split.equals("no"))) { //not splitting
			totalPerPerson = total;
			tipPerPerson = tip;
		} else if (isSplit && numberOfPeople > 1) { //is splitting
			totalPerPerson = total / numberOfPeople;
			tipPerPerson = tip / numberOfPeople;
		} else if (split.contentEquals("custom")) {//custom split
			totalPerPerson = total / customSplit;
			tipPerPerson = tip / customSplit;
		} else {
			System.out.println("ERROR: calculations");
			defaulted.close();
			return;
		}
		//}
		// discount if sub-total > 1000 will not offer discount unless the service is great or above{
		if (subtotal >= 1000 && (serviceQuality.equals("great") || serviceQuality.equals("excellent"))) {
			if (subtotal < 2000) {
				System.out.println("You got a 5% discount for spending $1000 or more!\nThank you!");
				percentDiscount = 5;
				discount = subtotal * percentDiscount / 100;
				totalAfterDiscount = total - discount;
			} else if (subtotal >= 2000 && subtotal < 3000) {
				System.out.println("You got a 7% discount for spending $2000 or more!\nThank you!");
				percentDiscount = 7;
				discount = subtotal * percentDiscount / 100;
				totalAfterDiscount = total - discount;
			} else {
				System.out.println("You got a 10% discount for spending $3000 or more!\nThank you!");
				percentDiscount = 10;
				discount = subtotal * percentDiscount / 100;
				totalAfterDiscount = total - discount;
			}
		} else
			hasDiscount = false;
		//}
		//outputs{
		//	split output{
		split = split.substring(0, 1).toUpperCase() + split.substring(1); // first char to upper case
		System.out.print("Split: " + split);
		if (isCustomSplit)
			System.out.println(": "+customSplit+" ways");
		else
			System.out.println();
		//	}
		//	number of people output{
		System.out.print("Number of people entered: ");
		for (int i = numberOfPeople; i > 0; i--)
			System.out.print("&");
		System.out.print("\n");
		//	}
		//service quality output{
		serviceQuality = serviceQuality.substring(0, 1).toUpperCase() + serviceQuality.substring(1); //first char to upper case
		System.out.println("Service Quality: " + serviceQuality);
		//	}
		//	monetary outputs{
		System.out.printf("Total to pay: $%1.2f\n", total);
		System.out.printf("Total tip: $%1.2f\n", tip);
		System.out.printf("Total per person: $%1.2f\n", totalPerPerson);
		System.out.printf("Tip per person: $%1.2f\n", tipPerPerson);
		if (hasDiscount) {
			System.out.println("Discount (" + percentDiscount + "%) : " + discount);
			System.out.printf("Price after discount: $%1.2f", totalAfterDiscount);
		}
		//	}
		//}
		defaulted.close();
	}
}