
package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class portalPage {
	public WebDriver driver;
	
	

	
	public portalPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//By email = By.xpath("//input[@id ='user_email']");
	
	
	@FindBy(xpath = "//input[@id ='search-courses']")
	WebElement SearchBox ;
	

	
	public WebElement GetSearchBox()
	{
	
		return SearchBox ;
	}
	

}
