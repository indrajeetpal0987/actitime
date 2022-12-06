package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopup39 {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	Runtime.getRuntime().exec("notepad");
	Robot r1 = new Robot();
	r1.keyPress(KeyEvent.VK_CONTROL);
	r1.keyPress(KeyEvent.VK_S);
	r1.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(1000);
	r1.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	r1.keyPress(KeyEvent.VK_LEFT);
	Thread.sleep(2000);
	r1.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	driver.close();
	}
}
