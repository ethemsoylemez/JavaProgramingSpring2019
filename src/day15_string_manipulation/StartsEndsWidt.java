package day15_string_manipulation;

public class StartsEndsWidt {
	
	public static void main(String[] args) {
		String word1 = "eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ecli"));
		System.out.println("=============");
		System.out.println(word1.startsWith("Ec"));
		System.out.println("=============");
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("java"));
		
		String word = "selenium";
		System.out.println("=============");
		
		System.out.println(word.toUpperCase().endsWith("IUM"));//true
		
		System.out.println(word.toUpperCase().startsWith("SEL"));//true
		
		//Mr. man
		//Mrs. married women
		//Ms. some women
		//Dr. Doctor man or women
		
		String name = "Dr. Jackson";
		if (name.startsWith("Mr.")) {
			System.out.println(name+" is man");
		}else if(name.startsWith("Mrs.")) {
			System.out.println(name+" is married women");
		}else if (name.startsWith("Ms.")) {
			System.out.println(name+" is some women");
		}else if (name.startsWith("Dr.")) {
			System.out.println(name+" is doctor man or women");
		}else {
			System.out.println("Unknown status");
		}
	}

}
