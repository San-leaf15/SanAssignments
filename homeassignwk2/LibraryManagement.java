package homeassignwk2;

public class LibraryManagement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Library l2 = new Library();
		String b2 = l2.addBook("book2");
		System.out.println(b2);
		
		l2.issueBook();
		
	}

}
