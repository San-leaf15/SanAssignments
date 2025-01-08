package homeassignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
				
		int n = 13;
		boolean isPrime = true;
		
		for (int i = 2; i < n-1; i++)
		{
			if (n%i==0)     
			{
				isPrime = false;
				break;
				
			}
		}
		
		if(isPrime)
			{
				System.out.println("Num is prime");
			}
			
			else 
				
			{
				 System.out.println("Num is not prime");
			}
			
		}
	}


