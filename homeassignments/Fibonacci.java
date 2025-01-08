package homeassignments;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0, b = 1, c; 
		
		System.out.println(a);   // print 1st no... a = 0
		System.out.println(b);   // print 2nd no... b = 1
		
		for (int i = 2; i < 8; i++)
		{
			c = a + b;
			System.out.println(""+ c);
			a = b;  
			b = c;
			
		}
	}

}
