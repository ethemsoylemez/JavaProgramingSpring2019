package day43_encapsulation_constructor;

public class Tesla {

	// instance variables
	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;

	public void setTeslaInfo(String model, int range, double zeroTo60, double price, boolean selfDriving) {
		// call setter methods for each parameter
		// since we call methods than we don't need this.model = model
		setModel(model);
		setRange(range);
		setZeroT060(zeroTo60);
		setPrice(price);
		setSelfDriving(selfDriving);
	}

	public boolean isValidModel(String model) {

		// 1. solution

//		if (model.equalsIgnoreCase("model s") || model.equalsIgnoreCase("model 3") || model.equalsIgnoreCase("model x")
//				|| model.equalsIgnoreCase("model y") || model.equalsIgnoreCase("roadster")) {
//			return true;
//		}
//		return false;
		// 2. solution
//		return model.equalsIgnoreCase("model s") || model.equalsIgnoreCase("model 3") || model.equalsIgnoreCase("model x")
//			|| model.equalsIgnoreCase("model y") || model.equalsIgnoreCase("roadster");
// 3. solution
		switch (model.toLowerCase()) {
		case "model s":
		case "model 3":
		case "model x":
		case "model y":
		case "roadster":
			return true;
		default:
			return false;
		}
	}

	// toStrign is ready method right click ==> go to source ==> click to generate
	// toString()
	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}

	// public getters and setters
	public void setModel(String model) {
		// call isValidModel here then assign if true
		// if false: Invalid model -
		// assign unknown
		if (isValidModel(model)) {
			this.model = model;
		} else {
			System.out.println("Invalid model - " + model);
			this.model = "Unknown";
		}

	}

	public String getModel() {
		return model;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getRange() {
		return range;
	}

	public void setZeroT060(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}

	public double getZeroTo60() {
		return zeroTo60;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}

	public boolean isSelfDriving() {
		return selfDriving;
	}

}
