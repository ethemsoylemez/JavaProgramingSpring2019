package day59_polymorphism01;

public class Triangle extends Shape {

	@Override
	public void draw() {
		{
			System.out.println(	"    * \n" +
								"   * * \n" +
								"  *   * \n" +
								" *     * \n" +
								"* * * * *");
		}
	}
}
