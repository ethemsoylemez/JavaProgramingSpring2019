package day47_blocks;

public class VariableAccess {
	
	//instance variable/attributes
	int myInstanceVar = 40;
	
	//static variable
	static int myStaticVar = 55;
	
	public static void main(String[] args) {
		//System.out.println(myInstanceVar); // can not access non-static from static method
		System.out.println(myStaticVar);
		
		//create object of VariableAccess class and print myInstanceVar
		VariableAccess myVar = new VariableAccess();
		System.out.println(myVar.myInstanceVar);
		System.out.println(myVar.myStaticVar);
		
		//access static variable using class name
		System.out.println(VariableAccess.myStaticVar);
		
	}

}
