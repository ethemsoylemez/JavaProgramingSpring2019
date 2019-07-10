package day57_interfaces01;

// className extends parentClassName implement interfaceName, interfaceName, ..
public class Tesla extends Vehicle implements Electric, Autonomous{

	@Override
	public void charge() {
		System.out.println("Tesla is charging at charging station.");		
	}

	@Override
	public void selfDrive() {
		System.out.println("Tesla is in auto pilot mode, Driving aotonomously");	
	}
}
