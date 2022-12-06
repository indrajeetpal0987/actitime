package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class Loginpage46 {
	@FindBy(id="username")
private WebElement untb;// declaration
	@FindBy(name="pwd")
private WebElement pwtb;
	@FindBy(xpath ="//div[.='Login ']")
private WebElement loginbtn;

Loginpage46(WebDriver driver) {
//	untb = driver.findElement(By.id("username"));
//	pwtb = driver.findElement(By.name("pwd"));
//	loginbtn = driver.findElement(By.xpath("//div[.='Login ']"));
	PageFactory.initElements(driver, this);
}
public void setUsername(String un) {
	untb.sendKeys(un); //utilization
}
public void setPassword(String pw) {
	pwtb.sendKeys(pw);
}
public void clickLogin() {
	loginbtn.click();
}
}
