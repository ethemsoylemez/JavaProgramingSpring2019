package day37_arrayList;

import java.util.ArrayList;

public class Shopping {
	public static void main(String[] args) {

		ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");

		// print number of items
		int size = shoppingList.size();
		System.out.println("Shopping list item count: " + size);
		System.out.println(shoppingList); // same with .toString()
		System.out.println(shoppingList.toString());
		// print first and last item in single line

		System.out.println(shoppingList.get(0) + " " + shoppingList.get(size - 1));

		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0));
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());

		//for each loop is used also for ArrayList. it is only for reading not modifying
		for (String item : shoppingList) {
			System.out.println(item);
		}
		// remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList);

	}

}
