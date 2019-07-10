package day63_exceptions02;

import java.io.IOException;

public class ThrowAndThrows {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World");
		//throw new RuntimeException("This is thrown using throw keyword");
		String username ="";//"user01";
		
		if(username.isEmpty()) {
			throw new RuntimeException("UserName cannot be empty");
			
		}else {
			System.out.println("Valid username");
		}
		
		//throwing checked exception.
		//handle - declare. otherwise it will not compile
		try {
		throw new IOException();
		}catch(IOException e){
			e.printStackTrace();
		}
	
		//declare the handle exception
		try {
			sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//throws handle
		sleep(3);

	}//main method ends
	
	//declare using throws keyword. whoever call this method MUST handle or declare the exception 
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds*1000);
	}

}
