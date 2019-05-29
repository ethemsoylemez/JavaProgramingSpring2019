package day44_constructor02;

public class Email {
	String message;
	public Email(String message) {
		System.out.println("Sending email with messages: "+message);
		this.message = message;
	}
}
