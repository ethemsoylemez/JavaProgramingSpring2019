package day45_encapsulation_practice;

import java.util.ArrayList;

public class Canvas {
	
	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.setName("Java Programing");
		System.out.println(course1.toString());
		
		ArrayList<String> javaTeachers = new ArrayList<>();
		javaTeachers.add("Vasly");
		javaTeachers.add("Muradil");
		javaTeachers.add("Marufjon");
		javaTeachers.add("Muhtar");
		
		course1.setTeachers(javaTeachers);
		System.out.println(course1.toString());
		
		ArrayList<String> javaStudents = new ArrayList<>();
		javaStudents.add("Burak");
		javaStudents.add("Roman");
		javaStudents.add("Gulnar");
		javaStudents.add("Ethem");
		javaStudents.add("Sung");
		
		course1.setStudents(javaStudents);
		System.out.println(course1.toString());
		
		course1.addTeacher("Maria");
		course1.addStudent("Ekaterina");
		
		if(course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is added to java teachers");
		}else {
			System.out.println("Maria is not a java teacher");
		}
		
		if(course1.getStudents().contains("Ekaterina")) {
			System.out.println("Ekaterina is added to java students");
		}else {
			System.out.println("Ekaterina is not a java student");
		}
		
		course1.removeTeacher("Muradil");
		course1.removeStudent("Roman");
		
		if(!course1.getTeachers().contains("Muradil")) {
			System.out.println("Muradil is removed successfully");
		}else {
			System.out.println("Muradil is still a teacher");
		}
		
		if(!course1.getStudents().contains("Roman")) {
			System.out.println("Roman is removed successfully");
		}else {
			System.out.println("Roman is still a student");
		}
		
		
	}

}
