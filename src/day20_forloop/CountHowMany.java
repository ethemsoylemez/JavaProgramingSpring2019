package day20_forloop;

public class CountHowMany {
	public static void main(String[] args) {
		
		String word = "computer programing";
		
		char myChar = 'q';
		int count = 0;
		
		for(int i = 0; i<word.length(); i++) {
			if (word.charAt(i) == myChar) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
