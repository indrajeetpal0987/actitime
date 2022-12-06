package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait27 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("http://demo.actitime.com/login.do");
		String firstPageTitle = driver.getTitle();
		System.out.println("First page Title: "+firstPageTitle);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		wait.until(ExpectedConditions.titleContains("Enter"));
		String SecondPageTitle = driver.getTitle();
		System.out.println("Second page Title: "+SecondPageTitle);
		driver.findElement(By.xpath("//a[@href='/logout.do']")).click();
		wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
		String thirdPageTitle = driver.getTitle();
		System.out.println("Third page Title: "+thirdPageTitle);
		if(firstPageTitle.equals(thirdPageTitle)) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
		driver.close();
		}
		
}

