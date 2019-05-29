package day44_constructor02;

public class Job {

	/*
	 * Job class
	 * 
	 * title , company , annualSalary
	 * 
	 * Encapsulate above private instance fields 
	 * Create no arg constructor to set title, company to "undefined"
	 * 
	 * Create 1 arg constructor to set title 
	 * Create 3 arg constructor to set all 3 fields
	 * 
	 * create a method called toString
	 */
	private String title;
	private String company;
	private double annualSalary;
	
	public String toString() {
		return "Job [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}

	public Job() {
		System.out.println("No-arg constructor");
		this.title = "undefined";
		this.company = "undefined";
	}

	public Job(String title) {
		System.out.println("\nOne-arg constructor");
		this.title = title;
		this.company = "undefined";
	}

	public Job(String title, String company, double annualSalary) {
		System.out.println("\nThree-arg constructor");
		//this.title = title;
		setTitle(title);   //we can't call cons method in another method, but we can call another method in cons method
		this.company = company;
		this.annualSalary = annualSalary;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

}
