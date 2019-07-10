package day61_polymorphism03;

 class Phone {

	String phoneNumber = "123456789";

	void setNumber() {
		String phoneNumber = "987654321";
		System.out.println(phoneNumber);
	}
}

public class TestPhone {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.setNumber();
		System.out.println(p1.phoneNumber);
	}
}
