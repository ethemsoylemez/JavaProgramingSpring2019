package day49_inheritance02;

public class PaperBack extends Book {

	private int pages;

	public int getPages() {
		return pages;
	}

	public String toString() {
		// title, author, price, type, pages
		return getTitle() + " | " + getAuthor() + " | " + getPrice() + " | " + getType() + " | " + pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
}
