package day37_arrayList;
import java.util.*;
public class MyCities {
	
	public static void main(String[] args) {
		
		ArrayList <String> cities = new ArrayList<>();
		
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		cities.add("Baku");
		//for-each loop
		
		for (String city : cities) {
			System.out.print(city+" ");
			
		}
		System.out.println();
		//for loop
		
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i)+" ");
			
		}
		System.out.println();
		
		//remove Baku, it removes the first Baku
		System.out.println("Removing Baku");
		cities.remove("Baku");
		cities.remove("New York"); // it will not remove or show error
		System.out.println(cities);
		
		//isEmpty()
		
		System.out.println("Is it empty: "+cities.isEmpty());
		cities.add(0,"Adana");
		System.out.println(cities);
		
		//add()
		cities.add(1, "Istanbul");
		System.out.println(cities);
		
		//if we don't give index to the add method it will add the item at the and of list
		cities.add("Ankara");
		System.out.println(cities);
		
		
		//set()
		cities.set(2, "Seoul");
		System.out.println(cities);
		
		//find Sterling in the list and get the index
		int idx = cities.indexOf("Sterling");
		System.out.println("Index of Sterling: "+idx);
		cities.set(idx, "Zagrep");
		System.out.println(cities.toString());
		
		
		//clear()
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println("Empty: "+empty);
	}

}
