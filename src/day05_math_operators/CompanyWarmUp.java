package day05_math_operators;

public class CompanyWarmUp {
	public static void main(String[] args) {
		String companyName, address;
		int numberOfEmployees, revenue;
		boolean isTechCompany;
		companyName = "Facebook";
		address = "Montain View, CA";
		numberOfEmployees = 1000;
		revenue = 4000000;
		isTechCompany = true;

		System.out.println("Company name is " + companyName);
		System.out.println("Company address is " + address);
		System.out.println("Number of employees are " + numberOfEmployees);
		System.out.println("Annual revenue is " + revenue);
		System.out.println("Is it tech company? " + isTechCompany);
		System.out.println("===========");

		String aboutCompany = companyName + " is a tech company located in " + address + ".\nIt has "
				              + numberOfEmployees + " employees and it's annual revenue is " + revenue + ".";
		System.out.println(aboutCompany);

	}

}
