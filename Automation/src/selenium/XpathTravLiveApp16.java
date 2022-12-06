package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTravLiveApp16 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org");
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		driver.findElement(By.xpath("//p[contains(.,'stable version')]")).click();
		//Thread.sleep(2000);
		driver.close();
}
}
