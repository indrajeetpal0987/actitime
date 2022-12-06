package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class p7 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/browser-windows");
		Thread.sleep(10000);    // open 2-3 child browsers manually
		//driver.close();
		String address = driver.getWindowHandle();
		Thread.sleep(10000);
		System.out.println(address);
		Thread.sleep(10000);
		java.util.Set<String> allAddresses = driver.getWindowHandles();
		System.out.println(allAddresses);
		//driver.cloese();  //closes only parent browser
		driver.quit();    //closes all the browsers

	}

}
