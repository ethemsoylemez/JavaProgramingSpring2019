package day46_static_keyword;

public class Campus {
	
	private String city;
	static String country;
	
	
	//compiler will firstly check static block after completing them
	//then it will starts execute the rest of code
	static {
		System.out.println("static block - 1");
		country = "Canada";
	}

	public Campus(String city) {
		System.out.println("Constructor");
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public  void campusInfo() {
		System.out.println("Welcome to campus "+city +" in "+country);
	}
	
	static {
		System.out.println("static block - 2");
		country = "USA";
	}
}
