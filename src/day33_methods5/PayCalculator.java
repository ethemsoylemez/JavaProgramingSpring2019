package day33_methods5;

public class PayCalculator {
	public static void main(String[] args) {

		int pay = getHourlyPay(40, 50);
		System.out.println("Total pay: " + pay);
		System.out.println("===============");
		int noPay = getHourlyPay(0, 10);
		System.out.println("No pay "+noPay);
		System.out.println("===============");
		int noPay1 = getHourlyPay(10, 0);
		System.out.println("No pay "+noPay1);
	}

	public static int getHourlyPay(int hours, int rate) {

		if (hours <= 0) {
			System.out.println("Invalid hours");
			return 0;
		} else {
			System.out.println("You worked " + hours + " hours");
		}
		if (rate <= 0) {
			System.out.println("Invalid rate");
			return 0;
		} else {
			System.out.println("Your rate is " + rate);
		}
		int total = hours * rate;

		return total;
	}

}
