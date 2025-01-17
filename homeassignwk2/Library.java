package homeassignwk2;

public class Library {

		String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
		void issueBook()
		{
			System.out.println("Book issued successfully");
			
		}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Library lib = new Library();
		String book = lib.addBook("Harry potter");
		System.out.println(book);
		
		lib.issueBook();

	}

}
