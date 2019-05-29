package day53_inheritance06;

public class Cities {
	public static void main(String[] args) {
		City baku = new City(123, "Baku");
		System.out.println(baku.toString());
		
		City istanbul = new City(444, "Istanbul");
		City anotherCity = new City(444, "Istanbul");
		
		if(istanbul.equals(anotherCity)) {
			System.out.println("Both are Istanbul");
		}else {
			System.out.println("Does not equal");
		}
		System.out.println(istanbul.toString());
		System.out.println(anotherCity.toString());
		
		System.out.println(baku.hashCode());
		System.out.println(istanbul.hashCode());
		System.out.println(anotherCity.hashCode());
		
		Capital cap = new Capital(101, "Washington DC", 800_000L);
		System.out.println(cap.toString());
	}

}
