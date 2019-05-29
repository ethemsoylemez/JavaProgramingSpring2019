package day48_inheritance01;

// Employee IS-A Person
public class Employee extends Person {
	
	String jobTitle;
	
	public void work() {
		System.out.println(name + " is working as "+ jobTitle);
	}
}
