package homeassignwk3;

import java.util.Arrays;

public class ArrayIntersection 
{
	
	public static void main(String[] args) 
	{
		int a[] = {3,2,11,4,6,7}; 
		int b[] = {1,2,8,4,9,7};
		
		int len1 = a.length;
		System.out.println("array a length: " + len1);
		Arrays.sort(a);
		
		int len2 = b.length;
		System.out.println("array b length: " + len2);
		Arrays.sort(b);
				
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < b.length; j++) 
			{
				if (a[i]==b[j])
				{
					System.out.println("Match found: " + a[i]);
				}
				
			}
		}

	}

}
