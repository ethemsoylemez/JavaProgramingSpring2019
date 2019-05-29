package day49_inheritance02;

public class AudioBook extends Book {
	
	private double length;
	private String narrator;
	
	public void listen() {
		//listen to java book by savitch and narrated by Marufjon
		System.out.println("Listening "+ getTitle()+" written by "+getAuthor()+ " and narrated by "+narrator);
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getNarrator() {
		return narrator;
	}
	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}
}
