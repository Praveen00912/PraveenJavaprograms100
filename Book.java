public class Book {
	String title;
	String author;
	double price;
	int pages;
	public void displayInfo() {
		System.out.println("===== BOOK INFO =====");
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: Rs. " + price);
		System.out.println("Pages: " + pages);
		System.out.println("====================");
	}
	public void checkPrice() {
		if (price > 500) {
			System.out.println(title + " is expensive.");
		} else {
			System.out.println(title + " is affordable.");
		}
	}
	public static void main(String[] args){
		Book book1 = new Book();
		book1.title = "Java Programming";
		book1.author = "Herbert Schildt";
		book1.price = 650.00;
		book1.pages = 1200;

		book1.displayInfo();
		book1.checkPrice();
	}

}