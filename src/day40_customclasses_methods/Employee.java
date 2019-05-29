package day40_customclasses_methods;

//this is a custom class with its attributes and custom methods
public class Employee {
	
	//instance variables/attributes
	public String name; //with public keyword this name variable can be used anywhere in the project
	public String jobTitle;
	double salary; // can only be used in same package
	
	//Methods
	public void work() {
		System.out.println(name+" is working hard ...");
	}

	public void attendMeeting() {
		System.out.println(name+" is attending a meeting ...");
	}
	
	public void introduce() {
		System.out.println("Name[" + name +"], jobTitle[" + jobTitle 
				+"], salary[" + salary + "]");
	}
}
