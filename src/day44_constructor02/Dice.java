package day44_constructor02;

import java.util.*;

public class Dice {
	public static void main(String[] args) {
		Job job1 = new Job();
		System.out.println(job1.toString());

		Job job2 = new Job("Java Developer");
		System.out.println(job2.toString());

		Job job3 = new Job("SDET", "Amazon", 130_000.0);
		System.out.println(job3.toString());

		// create a list of jobs and add 5 different jobs with company, title, salary

		ArrayList<Job> jobsList = new ArrayList<>();
		jobsList.add(job3);
		jobsList.add(new Job("Scrum Master", "Google", 123000));
		jobsList.add(new Job("SDET", "FreddieMac", 100000));
		jobsList.add(new Job("BA", "Leidos", 98000));
		jobsList.add(new Job("Senior QA Tester", "Delta", 150_000));

//		System.out.println(jobsList);
//		System.out.println();
		System.out.println(jobsList.toString());

		// find the highest paying job and print toString for that

		double max = Integer.MIN_VALUE;
		int highesIndex = -1;
		for (int i = 0; i < jobsList.size(); i++) {
			if (jobsList.get(i).getAnnualSalary() > max) {
				max = jobsList.get(i).getAnnualSalary();
				highesIndex = i;
			}
		}

		Job bestJob = jobsList.get(highesIndex);
		System.out.println("Highest Salary: " + bestJob.toString());
	}
}
