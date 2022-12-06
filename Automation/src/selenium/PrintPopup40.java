package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopup40 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.fb.com");
	Thread.sleep(3000);
	Robot r1 = new Robot();
	r1.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(1000);
	r1.keyPress(KeyEvent.VK_P);
	Thread.sleep(1000);
	r1.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	for (int i = 1; i <= 10; i++) {
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
	}
	r1.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	driver.close();
	}
}
