package day09_stringequals_conditionals;

public class IfElseNoBraces {
	public static void main(String[] args) {
		String day = "Tuesday";
//if you have just one line you do not have to put curly braces, but it is better to use always
		if (day.equals("Tuesday"))
			System.out.println("Today is " + day);
		else
			System.out.println("Today is not " + day);
		System.out.println("Tuesday is today"); // this line is not part of else block, so it works
	}
}
