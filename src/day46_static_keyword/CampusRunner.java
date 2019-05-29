package day46_static_keyword;

public class CampusRunner {
	


	public static void main(String[] args) {
		
		Campus campus1 = new Campus("McLean");
		Campus campus2 = new Campus("Chicago");
		Campus campus3 = new Campus("New Jersey");
		
		campus1.campusInfo();
		campus2.campusInfo();
		campus3.campusInfo();
		System.out.println(Campus.country);
	}
}
