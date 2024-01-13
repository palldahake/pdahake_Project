package Day3_291123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	@BeforeSuite
	public void launchBrowser() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
	}
	@DataProvider(name = "searchDataSet")
	public Object [][] searchMobile()
	
	{
		Object [][] searchMobile=new Object[3][2];
		searchMobile[0][0]="Oppo";
		searchMobile[0][1]="Reno 2z";
		searchMobile[1][0]="Oneplus";
		searchMobile[1][1]="11R";
		searchMobile[2][0]="iphone";
		searchMobile[2][1]="15 plus";
		
		return searchMobile;
		
	}
	@Test(dataProvider = "searchDataSet")
	public void searchPhones(String brand, String model) throws InterruptedException
	{
		try {
			WebElement loginPop=driver.findElement(By.xpath("//span[@class='_30XB9F']"));
			if(loginPop.isDisplayed())
			{
				loginPop.click();
				Thread.sleep(2000);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		driver.findElement(By.name("q")).sendKeys(brand+""+model);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.navigate().back();
		Thread.sleep(2000);
	}

}
