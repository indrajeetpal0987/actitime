package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BHANU11 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		//<a href='http://www.google.com'>BHANUPRAKASHA</a>
		driver.findElement(By.partialLinkText("BHA")).click();
		driver.close();
}
}
