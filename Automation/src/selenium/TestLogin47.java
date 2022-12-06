package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin47 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Loginpage46 l1 = new Loginpage46(driver);
	l1.setUsername("abcd");
	Thread.sleep(3000);
	l1.setPassword("1234");
	Thread.sleep(3000);
	l1.clickLogin();
	Thread.sleep(3000);
	l1.setUsername("wxyz");
	l1.setPassword("5678");
	Thread.sleep(3000);
	l1.clickLogin();
	Thread.sleep(3000);
	driver.close();
	}
}
