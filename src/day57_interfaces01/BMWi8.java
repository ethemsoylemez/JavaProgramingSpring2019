package day57_interfaces01;

public class BMWi8 implements Electric{
	
	@Override
	public void charge() {
		System.out.println("BMWi8 is charging at home");
	}
	//variable is inherited
	int num = MAX_BATTERIES;
}
