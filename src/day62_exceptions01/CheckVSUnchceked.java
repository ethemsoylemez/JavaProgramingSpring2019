package day62_exceptions01;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckVSUnchceked {

	public static void main(String[] args) {
		// checked exception - InterruptedException
		// HANDLE OR DECLEARE

		try {
			System.out.println("Sleeping");
			Thread.sleep(2000); // checked exception
		} catch (InterruptedException e) {
			System.out.println("Thread is interrupted");
		}

		System.out.println("Woke up");

		try {
			URL url = new URL("https://google.com");
			System.out.println(url.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
