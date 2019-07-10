package day50_inheritance03;


//practice override
public class Employee {
	
	public void calculatePay(int hours, double rate) {
		System.out.println("Employee total pay: "+(hours*rate));
	}

}
