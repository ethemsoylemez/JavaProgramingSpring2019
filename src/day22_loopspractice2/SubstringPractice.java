package day22_loopspractice2;

public class SubstringPractice {
	public static void main(String[] args) {
		String word = "java",rever="";
		
		// System.out.println(word.substring(0,2));

		System.out.println(word.substring(0, 1));
		System.out.println(word.substring(1, 2));
		System.out.println(word.substring(2, 3));
		System.out.println(word.substring(3, 4));
		System.out.println("=================");

		int i = 0;
		System.out.println(word.substring(i, i + 1));
		i++;
		System.out.println(word.substring(i, i + 1));
		i++;
		System.out.println(word.substring(i, i + 1));
		i++;
		System.out.println(word.substring(i, i + 1));
		i++;
		System.out.println("===================");

		for (int j = 0; j < word.length(); j++) {
			rever = word.substring(j, j + 1)+rever;
			//System.out.println(word.substring(j, j + 1));
			System.out.println("reversed: "+rever);
		}
		System.out.println("===================");

		for (int j = word.length()-1; j >=0; j--) {
			System.out.println(word.substring(j, j + 1));
		}
		System.out.println("===================");
		int start = 1;
		int end = 10;
		String str = "Unidetstates";
		System.out.println(str.substring(start, end));
	}

}
