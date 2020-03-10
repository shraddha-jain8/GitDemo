package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;
import Resource.Base;
public class HomePage extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void Init() throws IOException {
	driver = intializeDriver();
	
	}
	
	@Test(dataProvider="getData")
	public void validateLoginPage(String Username,String Password) throws IOException
	{
		
		  driver.get(Prop.getProperty("url"));
		//System.out.println();
		LandingPage lpage = new LandingPage(driver);
		lpage.Login().click();
		
		LoginPage loginpage = new LoginPage(driver);
		//loginpage.InputEmail().sendKeys("Shraddha@gmail.com");
		//loginpage.InputPassword().sendKeys("abc123");
		loginpage.InputEmail().sendKeys(Username);
		System.out.println(Username);
		loginpage.InputPassword().sendKeys(Password);
		loginpage.GoClick().click();
		
	}
	//here first index represents how many different type test runs
	//columns stands for how many values per each test
	
	@DataProvider
	public Object[][] getData()
	
	{
		Object[] [] data = new Object[2][2];
		data[0][0] = "shraddha@gmail.com";
		data[0][1] = "abc123";
		data[1][0] = "ronak@gmail.com";
		data[1][1] = "def123";
		return data;
	}
	
	@AfterTest
	public void Terminate()
	{
		driver.close();
		driver = null;
	}
	
}
