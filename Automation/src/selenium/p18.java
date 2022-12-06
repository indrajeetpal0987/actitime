package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p18 {
	private static int i;
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("Total links: "+allLinks.size());
		// to print all the links
		for(int i=0;i<allLinks.size();i++);
		System.out.println(allLinks.get(i).getText());

	driver.close();
}
}
