package homeassignwk3;

public class TestDataSuperClsInher 
{
	//--Demonstrating Inheritance in Java
	
	public void enterCredentials()
	{
		System.out.println("enterCredentials() method in - TestDataSuperClsInher");
	}
	
	public void navigateToHomePage()
	{
		System.out.println("navigateToHomePage() method in - TestDataSuperClsInher");
	}
	
	public static void main(String[] args) 
	{
		TestDataSuperClsInher sup = new TestDataSuperClsInher();
		sup.enterCredentials();
		sup.navigateToHomePage();

	}

}
