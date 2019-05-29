package day42_customclasses_encapsulation;

import java.util.*;

public class DSWShoesStore {
	public static void main(String[] args) {

		//create objects and assign data
		Shoes shoes1 = new Shoes();
		shoes1.setShoesData("ALDO", 6.5);
		Shoes shoes2 = new Shoes();
		shoes2.setShoesData("Allen Edmonds", 7.5);
		Shoes shoes3 = new Shoes();
		shoes3.setShoesData("BOSS HUGO BOSS", 9.0);

		// Arrays of shoes
		Shoes[] shoesArray = new Shoes[3];
		shoesArray[0] = shoes1;
		shoesArray[1] = shoes2;
		shoesArray[2] = shoes3;

		System.out.println(shoesArray[0].getShoesData());
		System.out.println(shoesArray[1].getShoesData());
		System.out.println(shoesArray[2].getShoesData());
		System.out.println("=============================");
		System.out.println("Brand: " + shoesArray[0].brand);
		System.out.println("Brand: " + shoesArray[1].brand);
		System.out.println("Brand: " + shoesArray[2].brand);
		System.out.println("=============================");

		// ArrayList of shoes
		ArrayList<Shoes> myShoes = new ArrayList<>();
		myShoes.add(shoes1);
		myShoes.add(shoes2);
		myShoes.add(shoes3);

		System.out.println(myShoes.get(0).getShoesData());
		System.out.println(myShoes.get(1).getShoesData());
		System.out.println(myShoes.get(2).getShoesData());
		System.out.println("=============================");
		System.out.println("Size: " + myShoes.get(0).size);
		System.out.println("Size: " + myShoes.get(1).size);
		System.out.println("Size: " + myShoes.get(2).size);
		System.out.println("=============================");

		// store data with custom data type
		Shoes redShoes = myShoes.get(1);
		System.out.println(redShoes.getShoesData());

		// lets use for each loop and print data for each shoe
		for (Shoes shoes : myShoes) {
			System.out.println(shoes.getShoesData());
		}
		// print name of Shoes in the list that size is more than 7
		for (Shoes shoes : myShoes) {
			if (shoes.size > 7.0) {
				System.out.println(shoes.brand);
			}
		}
	}
}
