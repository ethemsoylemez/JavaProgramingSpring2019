package day27_arrays05;

public class ClassTools {
	public static void main(String[] args) {
//		Java --> programming language
//		Selenium --> Test Automation
//		TestNG --> Unit Tests
//		JUnit --> Unit Tests
//		Cucumber --> BDD Style testing
//		Git --> Version control
//		Maven --> Building and execution for project
		String[] tools = { "Java", "Selenium", "TestNG", "JUnit", "Cucumber", "Git", "Maven" };

		for (String tool : tools) {
			switch (tool.toLowerCase()) {
			case "java":
				System.out.println(tool + ": programming language");
				break;
			case "selenium":
				System.out.println(tool + ": Test Automation");
				break;
			case "testng":
			case "junit":
				System.out.println(tool + ": Unit Tests");
				break;
			case "cucumber":
				System.out.println(tool + ": BDD Style testing");
				break;
			case "git":
				System.out.println(tool + ": Version control");
				break;
			case "maven":
				System.out.println(tool + ": Building and execution for project");
				break;
			default:
				System.out.println("Invalid tool");
			}
		}
	}
}
