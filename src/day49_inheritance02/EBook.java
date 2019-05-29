package day49_inheritance02;

			// IS-A
public class EBook extends Book{
	
	private double size;
	private int pages;
	
	public void readEBook(int pageNum) {
		//reading java book by Savitch at page10
		//since method also is inherited we can access method directly
		System.out.println("Reading "+ getTitle()+" by "+getAuthor()+ " at page "+pageNum);
	}
	
	public double getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
}
