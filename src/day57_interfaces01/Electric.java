package day57_interfaces01;

public interface Electric {
	
	//variables of interface are public static final by default
	//public static final boolean HAS_BATTERIES = true;
	boolean HAS_BATTERIES = true;
	public static final int MAX_BATTERIES = 100_000;

	void charge();// public abstract void charge(); same

}
