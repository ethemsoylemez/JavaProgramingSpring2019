package day48_inheritance01;

//this is an execution class
public class Company {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.name = "Marufjon";
		emp1.jobTitle = "Teacher";
		emp1.gender = 'm';
		emp1.age = 22;

		Employee emp2 = new Employee();
		emp2.name = "Kiki";
		emp2.jobTitle = "HR";
		emp2.gender = 'f';
		emp2.age = 26;

		emp1.work();
		emp2.work();

		emp1.eat("chicken kesadia");
		emp2.eat("salad");

		emp1.walk();
		emp2.walk();

		emp1.sleep(5);
		emp2.sleep(8);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
	}
}
