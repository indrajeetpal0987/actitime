package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions21 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new ChromeDriver();
		// go to google
		driver.get("http://www.cleartrip.com");
		Thread.sleep(8000);
		String popupXpath = "avg[class=' c-pointer c-neutra-900']";
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(popupXpath)).click();
		Thread.sleep(3000);
		String fromTFXpath = "(//input[@placeholder='Any worldwide city or airport'])[1]";
	driver.findElement(By.xpath(fromTFXpath)).sendKeys("ban");
		Thread.sleep(1000);
		String suggs = "//p[contains(.,'Ban') and not(contains(.,'Bank'))]";
		List<WebElement> allAutosugg = driver.findElements(By.xpath(suggs));
		System.out.println("Tota Autosuggestions: " + allAutosugg.size());
		for (int i = 0; i < allAutosugg.size(); i++) {
			System.out.println(allAutosugg.get(i).getText());
		}
		Thread.sleep(3000);
		allAutosugg.get(1).click();
		Thread.sleep(3000);
		driver.close();
	}
}
