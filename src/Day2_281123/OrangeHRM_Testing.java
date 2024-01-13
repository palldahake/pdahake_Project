package Day2_281123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM_Testing {
	WebDriver driver;
	
	@Test 
	public void LaunchBrowser() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
	}
	@Test(priority = 1)
	public void login() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2 )
	public void  dashboard()
	{
		String dash=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		if(dash.equals("Dashboard"))
		{
			System.out.println("Test Case Pass");
		}
			
		else
		{
			System.out.println("Test Case Fail");
		}
	}
	@Test (priority = 3)
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/descendant::a[4]")).click();
	}

}
