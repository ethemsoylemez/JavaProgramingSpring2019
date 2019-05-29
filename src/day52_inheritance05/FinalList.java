package day52_inheritance05;

import java.util.*;

public class FinalList {

	public static void main(String[] args) {
		ArrayList<String> COLORS = new ArrayList<>();
		COLORS.add("Orange");
		COLORS.add("Grey");
		COLORS.add("White");
		COLORS.add("Blue");
		System.out.println(COLORS);
		COLORS.add("Black");
		System.out.println(COLORS);
		
		COLORS = new ArrayList<>(); // new object
		System.out.println(COLORS);
		COLORS.add("Yellow");
		System.out.println(COLORS);
		
		
	}
}
