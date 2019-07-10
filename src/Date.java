import java.time.*;


public class Date {

	LocalDate ld = LocalDate.of(2019, 06, 22);
	LocalDate ldm = LocalDate.of(2019, Month.JUNE, 22);
	LocalDate ldp = LocalDate.parse("2019-06-22");

	LocalTime hm = LocalTime.of(4, 3);
	LocalTime hms = LocalTime.of(4, 3, 22);
	LocalTime hmss = LocalTime.of(4, 3, 22, 100);

	LocalTime ltn = LocalTime.now();
	LocalDate ldn = LocalDate.now();

	LocalTime ltp = LocalTime.parse("04:09:22");

	public static void main(String[] args) {

		Date dt = new Date();
		System.out.println(dt.hm);
		System.out.println(dt.hms);
		System.out.println(dt.hmss);
		System.out.println(dt.ltp);
		System.out.println(dt.ldn);
		System.out.println(dt.ltn);
	
	}	
}
