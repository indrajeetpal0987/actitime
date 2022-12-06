package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass43 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://vtiger.com");
		
		// to do mouse hover action      
	WebElement resources = driver.findElement(By.xpath("(//a[contains(.,'Resources')])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(resources).build().perform();

	driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[1]"));
	//driver.findElement(By.xpath("//h1[.='Contact Us']"));
	Thread.sleep(2000);
	WebElement phNo = driver.findElement(By.xpath("//p[contains(.,'Bengaluru')]/../p[2]"));
	System.out.println(phNo.getText());
	Thread.sleep(4000);
	driver.close();
	}
}
