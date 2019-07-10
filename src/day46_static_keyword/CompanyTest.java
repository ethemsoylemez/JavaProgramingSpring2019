package day46_static_keyword;

public class CompanyTest {
	

	public static void main(String[] args) {

		// print cname variable value
		System.out.println(Company.cname);
		System.out.println(Company.cname.toUpperCase());
		
		Company c = new Company();
		System.out.println(c);
		System.out.println(Company.cname);
		Company.companyInfo(); //
		Company.companyInfo(); // calling static method by class
		
	}

}