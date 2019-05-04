package day27_arrays05;

import java.util.Arrays;

public class CanvasCourses {
	public static void main(String[] args) {

		// 143 --> Welcome Kit
		// 144 --> Team activity
		// 147 --> Java programming
		// 149 --> SDLC
		// 152 --> QA Testing
		// 204 --> Mentoring session

		// --> split by "/" and get the last value from array
		// --> convert it to integer. Integer.parseInt(...) -> int value
		// --> switch statement and find the matching
		String url = "https://learn.cybertekschool.com/courses/152";
		String[] urlArr = url.split("/");
		System.out.println(Arrays.toString(urlArr));
		System.out.println(urlArr.length);
		int coureId = Integer.parseInt(urlArr[urlArr.length - 1]);

		switch (coureId) {
		case 143:
			System.out.println("Welcome Kit");
			break;
		case 144:
			System.out.println("Team Activity");
			break;
		case 147:
			System.out.println("Java Programming");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("QA Testing");
			break;
		case 204:
			System.out.println("Mentoring Session");
			break;
		default:
			System.out.println("Invalid Class!");
			break;
		}
	}
}
