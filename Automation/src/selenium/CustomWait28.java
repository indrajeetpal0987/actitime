package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait28 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	int i = 1;
	while (true) {
		try {
			driver.findElement(By.xpath("//a[@href='/logout.do']")).click();
			break;
		} catch (Exception e) {
			System.out.println("searching again for "+(i++)+"th time");
		}
	}
	driver.close();
	}

}
