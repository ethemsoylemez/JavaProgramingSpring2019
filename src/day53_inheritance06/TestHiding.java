package day53_inheritance06;

public class TestHiding {
	
	public static void main(String[] args) {
		City city = new City(345,"London");
		Capital cap = new Capital(433, "Paris", 3457439L);
		
		
		System.out.println(city.count);
		System.out.println(cap.count);
		
		System.out.println(city.toString());
		System.out.println(cap.toString());
		cap.displayCount();
		
		//call static method
//		city.buildARoad();
//		cap.buildARoad();
		
		City.buildARoad(); // static method
		Capital.buildARoad(); // hidden method
		
		City city2 = new City(3344,"Fairfax");
		Capital cap2 = new Capital(6544, "Richmond", 5423934L);
		
		city2.letsBuildARoad();
		cap2.letsBuildARoad();
		
		

	}

}
