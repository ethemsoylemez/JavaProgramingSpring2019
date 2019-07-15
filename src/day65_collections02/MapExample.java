package day65_collections02;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Double> items = new HashMap<>();
		items.put("Apples", 3.49);
		items.put("Flowers", 10.99);
		items.put("Eggs", 4.99);
		items.put("Cherries", 4.34);
		items.put("Milk", 5.0);
		items.put("Milk", 6.0);//milk will be updated to 6.0
		
		System.out.println(items.size());
		
		System.out.println(items.get("Apples"));
		System.out.println(items.get("Flowers"));
		System.out.println(items.get("Eggs"));
		System.out.println(items.get("Cherries"));
		System.out.println(items.get("Milk"));
		
		System.out.println(items.toString());
		
		System.out.println(items.isEmpty());
		
		items.remove("Flowers");
		System.out.println(items.toString());
		
		System.out.println("Is Apple there "+items.containsKey("Apples"));
		System.out.println("Is Flowers there "+items.containsKey("Flowers"));
		
		items.replace("Eggs", 2.99);
		System.out.println("Price of Eggs "+items.get("Eggs"));
		
		//increase price of Cherries by $2
		items.replace("Cherries", items.get("Cherries")+2);
		System.out.println("Price of Charries "+ items.get("Cherries"));		
	}
}
