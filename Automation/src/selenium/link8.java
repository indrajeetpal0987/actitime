package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class link8 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vishwajeet/Desktop/selenium/A.html");
		//Thread.sleep(2000);    //////
		driver.findElement(By.linkText("Google")).click();
        //Thread.sleep(2000);    ///////
        driver.navigate().back();
        //Thread.sleep(2000);     ///////
        driver.findElement(By.linkText("Facebook")).click();
        //Thread.sleep(2000);      ///////////
        driver.navigate().back();
       // Thread.sleep(2000);      /////////////ssamme as ,p-10
        driver.close();
}
}
