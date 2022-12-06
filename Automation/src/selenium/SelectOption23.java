package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOption23 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vishwajeet/Desktop/selenium/G.html");
		WebElement tajLB = driver.findElement(By.id("taj"));
		Select s1 = new Select(tajLB);
		s1.selectByIndex(0);//butter chicken
		Thread.sleep(1000);
		s1.selectByValue("ka");//kavva biryani
		Thread.sleep(1000);
		s1.selectByVisibleText("Jhinga Fry");//Jhinga fry
		Thread.sleep(1000);
		System.out.println("Selected Options: ");
		List<WebElement> SelectOptions = s1.getAllSelectedOptions();
		for (int i = 0; i < SelectOptions.size() ; i++) {
			System.out.println(SelectOptions.get(i).getText());
		}
		System.out.println("====================================");
		System.out.println("First Selected Option: ");
		WebElement firstOption = s1.getFirstSelectedOption();
		System.out.println(firstOption.getText());
		System.out.println("=======================================");
		
		System.out.println("All Option: ");
		List<WebElement> AllOptions = s1.getOptions();
		for (int i = 0; i <AllOptions.size(); i++) {
			System.out.println(AllOptions.get(i).getText());
		}
		System.out.println("========================================");
		System.out.println("Printin All OPtions using getWrappedElement: ");
		WebElement options = s1.getWrappedElement();
		System.out.println(options.getText());
		System.out.println("==========================================");
		System.out.println(s1.isMultiple());  //true
		Thread.sleep(2000);
		driver.close();
}
}
