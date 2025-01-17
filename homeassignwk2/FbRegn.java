package homeassignwk2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbRegn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//a[text()='Create new account'])")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("first");
		driver.findElement(By.name("lastname")).sendKeys("sur");
		
		WebElement datedd = driver.findElement(By.id("day"));
		Select dt = new Select(datedd);
		dt.selectByIndex(5);
		
		WebElement monthdd = driver.findElement(By.id("month"));
		Select mon = new Select(monthdd);
		mon.selectByValue("3");
			
		WebElement yeardd = driver.findElement(By.id("year"));
		Select yr = new Select(yeardd);
		yr.selectByVisibleText("2000");
		

	}

}
