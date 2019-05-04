package day13_ternary_strings_intro;

public class Ternary {
	public static void main(String[] args) {
		String result;
		int score = 66;

//		if (score>60) {
//			result = "Pass";
//		}else {
//			result = "Fail";
//		}
//		System.out.println("Result: "+result);

		result = score > 60 ? "Pass" : "Fail";

		System.out.println("Reault: " + result);
	}

}
