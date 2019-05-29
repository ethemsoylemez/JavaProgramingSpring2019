package day42_customclasses_encapsulation;

public class Person {
	
	//declare and encapsulate data 
	private String name;
	//private int age;
	
	//public getter and setter methods for name
	// read only
	public String getName() {
		return name;
	}
	
	//write only - void 
	public void setName(String name) {
		this.name = name;
		System.out.println(this.name);
	}
	

}
