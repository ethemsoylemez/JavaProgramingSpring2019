package day42_customclasses_encapsulation;

public class Shoes {
	
	//instance variables
	String brand;
	double size;
	
	//methods
	
	public void setShoesData(String newBrand, double nSize) {
		brand = newBrand;
		size = nSize;
	}
	
	public String getShoesData() {
		return brand + " | " +size;
	}

}
