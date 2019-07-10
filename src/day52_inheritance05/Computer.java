package day52_inheritance05;

public class Computer {

	private String model;
	private String color;

	
	@Override
	public boolean equals(Object other) {
		Computer that = (Computer) other;
		if (this.model.equals(that.model) && this.color.equals(that.color)) {
			return true;
		} else {
			return false;
		}
	}

	public Computer() {
		
	}

	public Computer(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
