package day20_forloop;

public class IndexOf {

	public static void main(String[] args) {

		String word = "amazon";
		char letter = 'z';
		int index = -1;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter) {
				index = i;
				System.out.println("Index of "+letter+" is "+index);
				break;
			}
		}
	}
}
