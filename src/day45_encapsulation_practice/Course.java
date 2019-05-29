package day45_encapsulation_practice;

import java.util.ArrayList;

public class Course {
	
	private String name;
	private ArrayList<String> teachers = new ArrayList<>();
	private ArrayList<String> students = new ArrayList<>();

	
	public void addStudent(String stName) {
		students.add(stName);
	}
	
	public void addTeacher(String thName) {
		teachers.add(thName);
	}
	
	public void removeStudent(String stName) {
		students.remove(stName);
	}
	
	public void removeTeacher(String thName) {
		teachers.remove(thName);
	}
	
	public String toString() {
		return "Course [name = " + name + ", teachers = " + teachers + ", students = " + students + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getTeachers() {
		return teachers;
	}

	public void setTeachers(ArrayList<String> teachers) {
		this.teachers = teachers;
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<String> students) {
		this.students = students;
	}
	

}
