package day13_ternary_strings_intro;

public class MoreTernary {
	public static void main(String[] args) {
		String quality = "bad";
		
		int rating = (quality.equals("good"))? 100: 0;
		System.out.println("Rating: "+rating);
		
		int PMHour = 6;
		//rush  hour during evening 4-7
		boolean rushHour;
		
		rushHour = (PMHour>=4 && PMHour <=7)? true: false;
		//System.out.println(PMHour+" is rush hour? "+rushHour);
		
		String result;
		  
		result = (rushHour)? "yes": "no";
		System.out.println(PMHour+" is rush hour? "+result);
		
		int AMHour = 9;
		//rush  hour during evening 6-9
		String amRushHour;
		
		amRushHour = (AMHour>=6 && AMHour <=9)? "yes": "no";
		System.out.println(AMHour+" is rush hour? "+amRushHour);
		
		
	}

}
