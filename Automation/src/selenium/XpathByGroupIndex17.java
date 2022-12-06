package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByGroupIndex17 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vishwajeet/Desktop/selenium/F.html");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Text box 4");
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Text box 1");
		driver.close();
	}
}
