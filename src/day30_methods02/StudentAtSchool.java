package day30_methods02;

public class StudentAtSchool {
	public static void main(String[] args) {
		study("Selenium");
		study("SQL");
		study("Java");
		study("Agile");
		sleep(10);
	}
	public static void study(String topic) {
		System.out.println("Student is studying "+topic);
	}
	public static void sleep(int hours) {
		System.out.println("Student has been sleeping for "+hours+" hours");
	}

}
