package day53_inheritance06;

public class Capital extends City {

	private long population;
	
	//variable hiding 
	public int count = 1;

	public Capital(int id, String name, long population) {
		super(id, name);
		this.population = population;

	}
	
	//method hiding
	public static void buildARoad() {
		System.out.println("Capital city - building a road");
	}

	public void displayCount() {
		System.out.println("City count: " + super.count); //100
		System.out.println("Capital count: " + count); //1
	}

	@Override
	public String toString() {
		return super.toString() + " popultion:" + population + " countCap:" + count;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}
