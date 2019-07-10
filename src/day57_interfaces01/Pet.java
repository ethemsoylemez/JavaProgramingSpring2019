package day57_interfaces01;

public interface Pet {

	public static final boolean FRIENDLY = true;

	void keepAsPet(); // public abstract void respond();
	
	public default void play() {
		System.out.println("playing hide-and-seak with pet");
	}
	
	//static methods in interface are not inherited to other classes
	public static void feed(String food) {
		System.out.println("Feeding a pet with "+food);
	}

}
