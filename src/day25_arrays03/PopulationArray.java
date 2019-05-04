package day25_arrays03;

public class PopulationArray {
	public static void main(String[] args) {

		int[] population = new int[5];

		population[0] = 5000;
		population[1] = 10000;
		population[2] = 7000;
		population[4] = 8907;
		population[3] = 4455;
		
		System.out.println("City 0 population: " + population[0]);
		System.out.println("City 1 population: " + population[1]);
		System.out.println("City 2 population: " + population[2]);
		System.out.println("City 3 population: " + population[3]);
		System.out.println("City 4 population: " + population[4]);
		
//		// short way to assign value to the array
//				int [] population2 = {5001, 10002, 7003, 8917, 4450};
//		int i = 0;
//		System.out.println("===============");
//		for (int pop : population2) {
//			System.out.println("City " + i++ + " population: " + pop);
//		}
//
//		System.out.println("===============");
//		for (int j = 0; j < population2.length; j++) {
//			System.out.println("City " + j + " population: " + population2[j]);
//
//		}
		System.out.println("===============");
		String [] cities = {"Miami", "London", "Tokyo", "Rome", "New York"};
		
		for(int i = 0; i<cities.length;i++) {
			System.out.println("Population of "+cities[i]+" is "+population[i]);
		}
		
	}
}
