package day16_string_manipulation;

import java.util.Scanner;

public class url {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		 * com, net, edu, org, gov 
		 * - check that it starts with www. 
		 * - check it contains
		 * the ending dot right before the extension 
		 * - assign String domain and String extension. 
		 * - print them "Domain:" amazon "Extension:" com
		 */

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter url: ");
		String url = keyboard.next();

		if (url.startsWith("www.")) {
			System.out.println("www. is present");

		} else {
			System.out.println("Invalid url format");
			return;

		}
		// (url.length()-4) == url.lastIndexOf(".")
		if (url.charAt(url.length() - 4) == '.') {
			System.out.println("url contains . before extention");
			
		}else {
			System.out.println("url does not contain . before extention");
		}
		String domain = url.substring(4, url.length() - 4);
		String extention = url.substring(url.length()-3);
		System.out.println("Domain: "+domain);
		System.out.println("Extension: "+extention);
		
		

		keyboard.close();
	}

}
