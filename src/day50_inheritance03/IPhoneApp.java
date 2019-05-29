package day50_inheritance03;

public class IPhoneApp extends App {
	//1 add a constructor
	//2 call super constructor
	public IPhoneApp(String name) {
		super(name);
	}

	public IPhoneApp() {
		super("IPhoneApp - unknown");
	}
}
