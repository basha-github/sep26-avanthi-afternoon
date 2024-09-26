class Cinema{
	
	private static Cinema cinema = null;
	
	private Cinema(){
		
	}
	
	public static  Cinema getInstance(){
		if(cinema == null) {
			cinema = new Cinema();
		}
		
		return cinema;
	}
}

class Book{
	
	private static Book book = null;
	
	int id;
	String name;
	private Book(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static Book createNewBook() {
		if(book == null) {
			book = new Book(123,"Java Complete Ref");
		}
		return book;
	}
	
	
	
	
	
}



public class SingletonDemo {

	public static void main(String[] args) {

	Cinema c1 = Cinema.getInstance();
	Cinema c2 = Cinema.getInstance();
	Cinema c3 = Cinema.getInstance();
	
	if(c2 == c3) {
		System.out.println("same");
	}
	else {
		System.out.println("not");
	}
	
	
	Book book1 = Book.createNewBook();
	Book book2 = Book.createNewBook();
	Book book3 = Book.createNewBook();
	
	if(book1 == book3) {
		System.out.println("same");
	}
	else {
		System.out.println("not");
	}
	
	
	
	
	
	
	
	}

}
