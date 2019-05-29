package day51_inheritance04;

public class Exercise {
	
	public int perform(int minutes) {
		System.out.println("Performing general exercise");
		return minutes * 4;
	}
}
/** multiple classes can be stored in same file, but only one
of them needs to be public, and file name must match the 
public class.
class Running extends Exercise {
	
}
*/
