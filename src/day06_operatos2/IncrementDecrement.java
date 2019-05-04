package day06_operatos2;

public class IncrementDecrement {
	public static void main(String[] args) {
		int employees = 50;
		System.out.println("Employees: " + employees);

		// all adds ones
		employees = employees + 1;
		System.out.println("Employees: " + employees);
		employees += 1;
		System.out.println("Employees: " + employees);
		employees++;
		System.out.println("Employees: " + employees);

		employees--;
		System.out.println("Employees: " + employees);
		--employees;
		System.out.println("Employees: " + employees);

	}

}
