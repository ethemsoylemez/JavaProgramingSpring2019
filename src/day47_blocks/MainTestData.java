package day47_blocks;

public class MainTestData {

	public static void main(String[] args) {
	System.out.println(TestData.url);
	String briteErpUrl = TestData.url;
	System.out.println(briteErpUrl);
	
	System.out.println(TestData.email);//access a static instance variable by Class name
	TestData td = new TestData();
	System.out.println(td.email); //access a static instance variable by object
	
}

}
