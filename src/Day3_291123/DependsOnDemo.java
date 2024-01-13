package Day3_291123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class Parent
{
	static WebDriver driver;
	@Test
	public void launchBrowser() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
}
public class DependsOnDemo extends Parent {
	
	@Test(dependsOnMethods = "launchBrowser", priority=1)
	public void login() throws InterruptedException
	{
		
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	}
    @Test(priority =2)
    public void logout () throws InterruptedException
    {
    	driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/descendant::a[4]")).click();
    }
}
