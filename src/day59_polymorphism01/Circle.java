package day59_polymorphism01;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("    * * *    \n" +
	               " *         * \n" +
	               "*           *\n" +
	               "*           *\n" +
	               "*           *\n" +
	               " *         * \n" +
	               "    * * *  ");
	}
}
