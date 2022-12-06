package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class p6 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  // delete all the cookie memory
		driver.get("https://www.myntra.com");
		driver.navigate().to("https://www.youtube.com");
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().back();    //amazon to youtube
		driver.navigate().back();    //youtube to myntra
		driver.navigate().forward();     //myntra to youtube
		driver.navigate().refresh();      //refreshes the youtube page
		driver.close();
}
}
