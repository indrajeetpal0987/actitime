package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");    //fb also used save compelsary
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("dinga");
		Thread.sleep(3000);
		driver.switchTo().activeElement().clear();
		Thread.sleep(3000);
		driver.close();
	}

}
