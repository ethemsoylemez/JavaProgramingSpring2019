package day15_string_manipulation;

public class IndexOf {
	public static void main(String[] args) {
		// 012345
		String word1 = "github";
		System.out.println(word1.indexOf('g'));// 0
		System.out.println(word1.indexOf("th"));//
		System.out.println(word1.indexOf("hub"));// 3

		String url = "www.okta.com";
		int index = url.indexOf(".");
		System.out.println("Position of . : " + index);
		System.out.println(url.charAt(index + 1));
//		int ch = url.charAt(index);
//		System.out.println(ch);

		String title = "Java - Google Search";
		int dash = title.indexOf('-');
		System.out.println(title.charAt(dash - 1));
		System.out.println(title.charAt(dash + 1));
		System.out.println(title.charAt(dash - 2));
		System.out.println(title.charAt(dash + 2));
		if (title.indexOf(' ') < dash) {
			System.out.println("Space is at left side of -");
		} else {
			System.out.println("Space is at right side of -");
		}

		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("Position of states: " + states);

		String word2 = "java, c++, pyhton, tomcat, ruby";
		String wordPart = "matlab";
		// check if c++ is in the word
		// 1) using contains

		if (word2.contains(wordPart)) {
			System.out.println(wordPart + " is there");
		} else {
			System.out.println(wordPart + " is not there");
		}
		// using indexOf
		if (word2.indexOf(wordPart) > -1) {
			System.out.println(wordPart + " is there");

		} else {
			System.out.println(wordPart + " is not there");
		}
	}
}
