package day36_wrapperclasses_arraylistintro;

public class Boxing {
	
	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {
		
		//AUTOBOXING --> Primitive --> object
		
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		
		//UNBOXING --> object --> primitive
		
		Double d1 = new Double(34.2);
		double d2 = d1;
		System.out.println("d1: "+d1);
		System.out.println("d2: "+d2);
		
		Long l1 = new Long(6000000); //unboxing
		Long l2 = new Long(345657623L); // no boxing
		Long l3 = l2; //outo-unboxing
		Long l4 = l3; //outo-boxing
		
		Integer num3 = Integer.valueOf(3345);
		//Double d3 = num3; casting is not possible with wrapper classes
}

}
