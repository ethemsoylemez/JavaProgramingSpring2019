package day24_arrays;

public class ArrayOfChars {
	public static void main(String[] args) {
		char[] values = { 'a', 'b', 'c' };
		for (char value : values) {
			System.out.println(value);
		}
		System.out.println("==============");
		String str = "Wooden spoon";
		// this method toCharArray() converts string into array of characters
		char[] chars = str.toCharArray();
		for (char ch : chars) {
			System.out.print(ch+"_");
		}
		System.out.println("\n============");
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]+"_");
		}
		System.out.println("\n============");
		str ="";
		for(int i = chars.length-1;i>=0;i--) {
			str += chars[i]+"_";
		}
		System.out.print(str);
		System.out.println("\n============");
		
		str = "Wooden Spoon";
		char [] charss = str.toCharArray();
		for(char ch:charss) {
			if(ch == 'o') {
				System.out.print("*");
			}else {
				System.out.print(ch);
			}
		}
	}
}
