package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup35 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(1000);
		//To handle this popup
		Thread.sleep(5000);
		String parentwindow = driver.getWindowHandle();//fetches the address of parent browser
		System.out.println(parentwindow);
		Set<String> allWindos = driver.getWindowHandles();
		System.out.println(allWindos);
		for (String v : allWindos) {
			if (v.equals(parentwindow)) {
			} else {
            Thread.sleep(2000);
            driver.switchTo().window(v).close();
			}
		}
	}
}
