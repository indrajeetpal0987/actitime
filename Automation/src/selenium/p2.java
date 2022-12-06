package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)   {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
//		String pageTitle = driver.getTitle();
//		System.out.println(pageTitle);
		System.out.println("Title: "+ driver.getTitle());//fetches the title
		System.out.println("URL: "+ driver.getCurrentUrl());//fetches the URL
		//Thread.sleep(3000);
		driver.close();
	}
}
