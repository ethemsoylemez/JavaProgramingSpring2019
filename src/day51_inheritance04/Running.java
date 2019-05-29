package day51_inheritance04;

public class Running extends Exercise{
	int calories;
	@Override
	public int perform(int minutes) {
		System.out.println("Running");
		this.calories = minutes * 10;
		return minutes * 10;
	}
}
