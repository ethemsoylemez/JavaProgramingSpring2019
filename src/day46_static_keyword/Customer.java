package day46_static_keyword;


//if we make our method private than we can just call this method within this class, 
//but we can access from a different class by a public method if we call private method by a public method
public class Customer {
	private String name;
	//private static String name;
	private String email;
	int count1; //this variable changes for each object
	static int count;   //shared by everyone/all objects.
						//one central copy of this variable

	public Customer() {
		System.out.println("no arg cunstrocter");
		name = "undefined";
		email = "undefined";
		count1++;
		count++;
	}

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
		count1++;
		count++;
	}

	public  String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
