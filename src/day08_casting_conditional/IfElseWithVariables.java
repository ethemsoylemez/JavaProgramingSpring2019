package day08_casting_conditional;

public class IfElseWithVariables {
	public static void main(String[] args) {

		int temperature = 75;

		if (temperature >= 65) {

			System.out.println("Temperature is " + temperature + ", It is a nice day! Lets code java");
		} else {
			System.out.println("Temperature is " + temperature + ", Stay home and code Java");
			
		}
		System.out.println("==================");
		int teamAscore = 2;
		int teamBscore = 4;

		if (teamAscore > teamBscore) {
			System.out.println("Team A won!");
			System.out.println("Go team A!");

		} else if (teamAscore < teamBscore) {
			System.out.println("Team B won");
			System.out.println("Go team B!");

		} else {
			System.out.println("It was a draw");

		}

	}

}
