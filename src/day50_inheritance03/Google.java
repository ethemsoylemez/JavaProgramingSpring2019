package day50_inheritance03;

public class Google extends SearchEngine{
	
	@Override
	public int Serach(String word) {
		System.out.println("Google searching for: "+word);
		int resultsCount = word.length();
		return resultsCount;
	}
	
	@Override
	//access type can be protected, public since it was protected
	public void Serach(String item, String item2) {
		System.out.println("Searching for 2 items: "+item+", "+item2);
		int resultsCount = item.length() + item2.length();
		System.out.println("Total count: "+resultsCount);
	}
	
	@Override
	//access type can be default, protected, public since it was default
	String clickResult() {
		System.out.println("Click result");
		return "Search result";
	}

}
