package day22_loopspractice2;

public class FindHowManyUsingReplace {
	
	public static void main(String[] args) {
		
		String word = "including webpages, images";
		
		String newWord = word.replace("e", "");
		
		int count = word.length()-newWord.length();
		System.out.println("Letter count: "+count);
	}

}
