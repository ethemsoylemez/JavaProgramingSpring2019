package day51_inheritance04;

public class Yoga extends Exercise{
	
	@Override
	public int perform(int minutes) {
		System.out.println("Yoga");
		return minutes * 5;
	}
}
