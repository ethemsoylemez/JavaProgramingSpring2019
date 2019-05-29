package day48_inheritance01;


//this is execution class
public class School {

	public static void main(String[] args) {
		Person person = new Person();//object of parent class
		Student student = new Student(); // object of child class

		person.name = "Obama";
		person.age = 57;
		person.gender = 'm';

		student.name = "Roman";
		student.age = 30;
		student.gender = 'm';
		student.clazz = "Ping pong";

		person.eat("steak");
		student.eat("grechka");

		person.walk();
		student.walk();

		person.sleep(8);
		student.sleep(7);

		Student student2 = new Student();
		student2.name = "Orhan";
		student2.age = 40;
		student2.gender = 'm';
		student2.studentID = 4040;
		student2.clazz = "Agile Scrum";

		student2.code("Java");
		student2.attendClass();
		student2.eat("kebab");
		student2.walk();

		student.code("python");
		student.attendClass();

	}
}
