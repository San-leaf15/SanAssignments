package homeassignwk2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelCreateLead {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Comp1 Test");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Firstname1 Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lastname1 Test");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
