package selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDate24 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Indrajeet");
		//Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("pal");
		//Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("7304705993");
		//Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("chana@2022");
		//Thread.sleep(2000);
		WebElement dateLB = driver.findElement(By.id("day"));
		Select s1 = new Select(dateLB);
		s1.selectByVisibleText("9");
		//Thread.sleep(2000);
		WebElement monthLB = driver.findElement(By.id("month"));
		Select s2 = new Select(monthLB);
		s2.selectByVisibleText("May");
		//Thread.sleep(2000);
		WebElement yearLB = driver.findElement(By.id("year"));
		Select s3 = new Select(yearLB);
		s3.selectByVisibleText("2012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
//		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		driver.findElement(By.xpath("(//button[.='Sign Up'])[1]")).click();
		Thread.sleep(4000);
		driver.close();
	}
}
