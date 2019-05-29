package day50_inheritance03;

public class Company {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		FullTimeEmployee ft = new FullTimeEmployee();
		Contructor ct = new Contructor();
		
		emp.calculatePay(40, 40);
		ft.calculatePay(40, 45);
		ct.calculatePay(40, 55);
		
	}

}
