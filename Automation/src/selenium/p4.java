package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.switchTo().activeElement().sendKeys("dinga");
		driver.switchTo().activeElement().clear();
		driver.close();
	}
}
