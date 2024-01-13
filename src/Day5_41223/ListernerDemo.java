package Day5_41223;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import graphql.Assert;
@Listeners(Day5_41223.ListernerTest.class)

public class ListernerDemo {

	@Test
	public void login() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void testToBeFail()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void testToBeSkipped()
	{
		throw new SkipException("We are Skipping it deleberatly");
		
	}
	

}
