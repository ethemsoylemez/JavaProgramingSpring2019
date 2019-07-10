package day54_InheritanceReviw;

 class Lion {

	public Lion(double b) {

	}

	public Lion(int a) {
		System.out.println("A");
	}
}

 public class ConstructorPractice2 extends Lion {

//	constructor_Practice2(){   }   reason: #12

	 ConstructorPractice2(boolean b) {
		super(9.0); //super(9)
	}
}
