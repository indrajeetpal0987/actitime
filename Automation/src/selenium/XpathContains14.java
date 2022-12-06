package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains14 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("admin");
		//Thread.sleep(2000);                 /////////////
		driver.findElement(By.xpath("//input[contains(@name,'pw')]")).sendKeys("manager");
		//Thread.sleep(2000);               //////////
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();    ////Type-2] By Text Function
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[contains(@class,'logout')]")).click(); //////\\\\\\\\\\\\\\
		//Thread.sleep(2000);       ///////////////
		driver.close();    
}
}
