package day58_interfaces02;

public class CloneTest {

	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		Object a2 = a.clone();
		System.out.println(a2);
		
	}
}
