package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.close();
	}
}

//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().deleteAllCookies();
//	driver.get("http://demo.actitime.com/login.do");
//	driver.findElement(By.xpath("//input[contains(@id,'user']")).sendKeys("admin");
//	Thread.sleep(2000); .click();