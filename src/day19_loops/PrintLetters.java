package day19_loops;

public class PrintLetters {

	public static void main(String[] args) {
		String word = "Amazon";

		int idx1 = 0;
		while (idx1 < word.length()) {
			if (idx1==3) {
				System.out.print(Character.toString(word.charAt(idx1)).toUpperCase());
				idx1++;
			}
			System.out.print(word.charAt(idx1));
			idx1++;
		}
		System.out.println("\n========");
		int idx2 = word.length() - 1;
		while (idx2 >= 0) {
			System.out.print(word.charAt(idx2));
			idx2--;
		}
//		
//		String[] name = word.split("");
//		System.out.print(Arrays.toString(name));
//		
	}
}
