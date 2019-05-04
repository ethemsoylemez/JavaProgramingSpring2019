package day28_multid_arrays;

import java.io.IOException;
//import java.nio.*; //new input output
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.util.Arrays;
//import java.util.Arrays;

public class FastFoodRestaurant {
	public static void main(String[] args) throws IOException {
		// read all data and assign to array

		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		System.out.println("Data size: " + data.length);

		// print first row
		//System.out.println(data[0]);

		// print all lines
//		int counter = 0;
//		for (String restaurant : data) {
//			System.out.println("#"+counter+"=>"+restaurant);
//			counter++;
//		}

		// print all restaurants information in state of VA

//		int counterVA = 0;
//		for (String row : data) {
//			if (row.contains(",VA,")) {
//				System.out.println("#" + counterVA + "=>" + row);
//				counterVA++;
//			}
//		}
		//System.out.println("######Total Restaurants in VA: " + counterVA);
		
		//find all restaurant information in state of VA
		//print the restaurant names alond with cityname
		
		for (String res : data) {
			if (res.contains(",VA,")) {
				String [] resArr = res.split(",");
				if(resArr[1].contains("Fairfax")) {
				System.out.println(resArr[2]+", "+resArr[1]);
				}
			}
		}

	}
}
