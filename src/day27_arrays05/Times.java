package day27_arrays05;

public class Times {
	public static void main(String[] args) {
		int[] time1 = { 22, 30 };
		int[] time2 = { 22, 40 };
		if (time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		if (time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time1 has invalid minut");
			return;
		}
		if (time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time2 has invalid hour");
			return;
		}
		if (time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time2 has invalid minut");
			return;
		}
		if (time1[0] < time2[0]) {
			System.out.println("Time 1 is earlier");
		} else if (time1[0] > time2[0]) {
			System.out.println("Time 2 is earlier");
		} else if (time1[1] < time2[1]) {
			System.out.println("Time 1 is earlier");
		} else if (time1[1] > time2[1]) {
			System.out.println("Time 2 is earlier");
		} else {
			System.out.println("Times are equal");
		}
		
	}
}
