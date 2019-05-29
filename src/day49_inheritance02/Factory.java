package day49_inheritance02;

//Factory is a non-sub class, but in the same package
public class Factory {

	public static void main(String[] args) {
		Device dv = new Device();
		dv.brand = "LG"; // public
		dv.model = "3300"; // protected
		dv.price = 1000; // default
		// dv.country = "USA"; // private
	}
}
