
package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	

	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//By email = By.xpath("//input[@id ='user_email']");
	
	
	@FindBy(xpath = "//input[@id ='user_email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id ='user_password']")
	WebElement password;

	
	@FindBy(xpath = "//input[@type ='submit']")
	WebElement Go;
	
	public WebElement InputEmail()
	{
	
		return email;
	}
	
	public WebElement InputPassword()
	{
	
		return password;
	}
	
	public WebElement GoClick()
	{
	
		return Go;
	}
}
