package day56_abstraction;

public class TestBrowser {

public static void main(String[] args) {
	
	//Browser obj = new Browser(); abstract classes don't have object
	
	Browser.id = 100;
	System.out.println(Browser.id);
	
	Chrome objc = new Chrome("Chrome", 12345);
	
	System.out.println(objc.name);
	System.out.println(Browser.id);
	objc.navigate("https://www.google.com/chrome/");
	objc.displayWebpage();
	objc.launch();
	objc.close();
	
	Netscape objn = new Netscape();
	
	System.out.println(objn.name);
	
}

}
