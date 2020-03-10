
package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	
	By signin = By.xpath("//a[contains(@href,'sign_in')]");
	By title = By.cssSelector("div.text-center");
	By contact = By.xpath("//a[text()='Contact']");
	By header = By.cssSelector("[class*='video-banner'] h3");
	
	// how to handle the scenario when you get popup
	By popup = By.xpath("//button[text()='NO THANKS']");
	//By contact = By.cssSelector("nav.navbar-nav.navbar-right>li>a");
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement Login()
	{
	
		return driver.findElement(signin);
	}
	
	public WebElement getTitle()
	{
	
		return driver.findElement(title);
	}
	
	public WebElement getContact()
	{
	
		return driver.findElement(contact);
	}
	
	public WebElement getHeader()
	{
	
		return driver.findElement(header);
	}
	
	public List<WebElement> getPopupSize()
	{
	
		return driver.findElements(popup);
	}
	
	public WebElement getpopup()
	{
	
		return driver.findElement(popup);
	}
}

