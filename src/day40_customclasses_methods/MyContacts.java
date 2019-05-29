package day40_customclasses_methods;

public class MyContacts {
	
	public static void main(String[] args) {
		
		//create Contact object
		Contact evgenia = new Contact();
		evgenia.name = "Evgenia Jalilova";
		evgenia.phoneNumber = "(202) 333-4444";
		evgenia.email = "evgenia@thorlabs.com";
		
		evgenia.call();
		evgenia.sendMessage();
		evgenia.sendEmail();
		System.out.println("====================");
		Contact orhan = new Contact();
		orhan.name = "Orhan Sultanov";
		orhan.phoneNumber = "(571) 991-322";
		orhan.email = "orhan@google.com";
		
		System.out.println("Name: "+orhan.name);//we can access to attributes by objects
		System.out.println("Phone Number: "+orhan.phoneNumber);
		System.out.println("Email: "+orhan.email);
		System.out.println("====================");

		orhan.call();
		orhan.sendMessage();
		orhan.sendEmail();
	
	}
}
