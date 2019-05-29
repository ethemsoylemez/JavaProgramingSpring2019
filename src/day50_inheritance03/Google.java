package day50_inheritance03;

public class Google extends SearchEngine{
	
	public int Serach(String word) {
		System.out.println("Google searching for: "+word);
		int resultsCount = word.length();
		return resultsCount;
	}
	
	//protected
	public void Serach(String item, String item2) {
		System.out.println("Searching for 2 items: "+item+", "+item2);
		int resultsCount = item.length() + item2.length();
		System.out.println("Total count: "+resultsCount);
	}
	
	//default, protected
	String clickResult() {
		System.out.println("Click result");
		return "Search result";
	}

}
