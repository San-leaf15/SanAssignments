package homeassignwk3;

public class SubCls extends TestDataSuperClsInher
{

	public void enterUsername()
	{
		System.out.println("enterUsername() method in - SubCls");
	}
	
	public void enterPassword() 
	{
		System.out.println("enterPassword() method in - SubCls");
	}
	
	public static void main(String[] args) 
	{
		SubCls sub = new SubCls();
		sub.enterUsername();
		sub.enterPassword();
		sub.enterCredentials();
		sub.navigateToHomePage();
		
		

	}

	

}
