package day06_operatos2;

public class MinutesToHours {
	public static void main(String[] args) {
		int second = 7270;
		int division = 60;
		int hours = second / (division * division);
		int minutes = second / division;
		int remaininigMinutes = minutes % division;
		int remainingSecond = second % division;
		System.out.println("\"" + hours + "\" hours \"" + remaininigMinutes + "\" minutes and \"" + remainingSecond + "\" second");

	}

}
