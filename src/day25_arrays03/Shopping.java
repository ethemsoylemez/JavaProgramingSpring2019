package day25_arrays03;

public class Shopping {

	public static void main(String[] args) {
		String[] products = { "Timberland Shoes", "H&M Shirt", "Swatch Watch Watch", "Gucci Bag", "Adidas sock" };
		double[] prices = { 120, 5.99, 150.5, 3000.5, 6.99 };
		int[] itemsId = { 12345, 12346, 12347, 12348, 12349 };
		System.out.println("Products count: " + products.length);

		if (products.length == prices.length && products.length == itemsId.length) {
			System.out.println("Shopping list length is matching");
		} else {
			System.out.println("Shopping list lenght has to match!");

		}
		// for each loop
		for (String product : products) {
			System.out.println(product);
		}
		// for loop
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		for (int i = itemsId.length - 1; i >= 0; i--) {
			System.out.println(itemsId[i]);
		}
		// print a report with a total price
		// Item 1: 1234 - Timberland Shoes - $120.0
		double sum = 0.0;
		System.out.println("#########  YOUR SHOPPING RECEIPT  ###########");
		for (int i = 0; i < prices.length; i++) {
			System.out.println("Item " + (i + 1) + ": " + itemsId[i] + " - " + products[i] + " - $" + prices[i]);
			sum += prices[i];
		}
		System.out.println("Total Price: #" + sum);

		// find the most expensive item in your list and print it as a report
		int maxIndex = 0;
		double maxPrice = Integer.MIN_VALUE;
		for (int j = 0; j < prices.length - 1; j++) {
			if (prices[j] > maxPrice) {
				maxPrice = prices[j];
				maxIndex = j;
			}
		}
		System.out.println(itemsId[maxIndex] + " - " + products[maxIndex] + " - " + prices[maxIndex]);

		int minIndex = 0 ;
		 double minPrice = Integer.MAX_VALUE;
		for (int m = 0; m < prices.length - 1; m++) {
			if (prices[m] < minPrice) {
				minPrice= prices[m];
				minIndex = m;
			}	
		}
		System.out.println(itemsId[minIndex] + " - " + products[minIndex] + " - " + prices[minIndex]);
	}
}
