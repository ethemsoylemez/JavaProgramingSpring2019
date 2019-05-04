package day15_string_manipulation;

public class IndexOf2 {
	public static void main(String[] args) {
		//index of with two input
		
		String list = "html-selenium-angular-jenkins-grid";
		int firstDash = list.indexOf('-');
		System.out.println("First dash: "+firstDash);
		int secondDash = list.indexOf("-", 5);
		System.out.println("Second dash: "+secondDash);
		//gets index using variable value
		int thirdDash = list.indexOf("-", secondDash+1);
		System.out.println("Third dash: "+thirdDash);
		int fourtDash = list.indexOf("-", (list.indexOf("-", secondDash+1))+1);
		System.out.println("Third dash: "+fourtDash);
		//find the last dash.
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last dash: "+lastDash);

	}

}
