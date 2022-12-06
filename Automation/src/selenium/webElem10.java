package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElem10 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vishwajeet/Desktop/selenium/A.html");
		WebElement googlelink = driver.findElement(By.tagName("a"));
		googlelink.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//webElement fblink = driver.findElement(By.tagName("a")); //click on google
		WebElement fblink = driver.findElement(By.linkText("Facebook"));
		fblink.click();
		Thread.sleep(4000);
		driver.close();     ////////samme as ,p-8
}
}
