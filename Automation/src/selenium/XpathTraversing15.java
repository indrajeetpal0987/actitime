package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTraversing15 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vishwajeet/Desktop/selenium/E.html");
		Thread.sleep(2000);       ////////////
		driver.findElement(By.xpath("//a[.='java']/../../td[2]/a")).click();
		Thread.sleep(3000);      //////////
		driver.navigate().back();
		Thread.sleep(2000);       /////////
		driver.findElement(By.xpath("//a[.='SQL']/../../td[2]/a")).click();
		Thread.sleep(3000);      //////////
		driver.close();
}
}
