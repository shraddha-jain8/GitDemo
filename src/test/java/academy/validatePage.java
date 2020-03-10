package academy;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;
import Resource.Base;
import junit.framework.Assert;
public class validatePage extends Base {
	 LandingPage lpage;
	public static Logger log = LogManager.getLogger(Base.class.getName());
@BeforeTest
public void Init() throws IOException {
	
	driver = intializeDriver();
	log.info("Driver is intialized");
	driver.get(Prop.getProperty("url"));
	log.info("Navigated to home page");
}
	@Test
	public void validateContactTitle() throws IOException
	{
		//driver = intializeDriver();
		//driver.get(Prop.getProperty("url"));
		 lpage = new LandingPage(driver);
		Assert.assertEquals(lpage.getTitle().getText(),"FEATURED COURSES");
		Assert.assertEquals(lpage.getContact().getText(),"CONTACT");
		log.info("sucessfully validated home page");
	}
	//here first index represents how many different type test runs
	//columns stands for how many values per each test
	@Test
	public void validateHeader() throws IOException
	{
		//driver = intializeDriver();
		//driver.get(Prop.getProperty("url"));
		// lpage = new LandingPage(driver);
		Assert.assertEquals(lpage.getHeader().getText(),"AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		log.info("sucessfully validated header page");
	}
	
	
	@AfterTest
	public void Terminate()
	{
		driver.close();
		driver = null;
	}

}


