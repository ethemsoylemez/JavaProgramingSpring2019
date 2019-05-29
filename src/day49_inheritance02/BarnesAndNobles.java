package day49_inheritance02;

public class BarnesAndNobles {
	
	public static void main(String[] args) {
		EBook ebook = new EBook();
		//those methods inherited from parent class
		ebook.setTitle("Introduction to Java");
		ebook.setAuthor("Savitch");
		ebook.setType("Tech Book");
		ebook.setPrice(170);
		
		//those methods defined within class
		ebook.setPages(1016);
		ebook.setSize(500);
		
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		
		ebook.readEBook(10);
		ebook.readEBook(621);
		
		AudioBook aBook = new AudioBook();
		aBook.setTitle("OCA prepration");
		aBook.setAuthor("Jeanne");
		aBook.setNarrator("Marufjon");
		aBook.listen();
		
		PaperBack pBook = new PaperBack();
		pBook.setAuthor("Malcolm Gladwell");
		pBook.setTitle("Outliers");
		pBook.setType("Biography");
		pBook.setPrice(20);
		pBook.setPages(304);
		
		System.out.println(pBook.toString());
	}
}
