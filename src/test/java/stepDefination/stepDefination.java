package stepDefination;

import PageObject.LandingPage;
import PageObject.LoginPage;
import PageObject.portalPage;
import Resource.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stepDefination extends Base {


		// TODO Auto-generated method stub
		@Given("^intialize the browser with chrome$")
		public void intialize_the_browser_with_chrome() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver = intializeDriver();
		}

		@Given("^Navigate to \"([^\"]*)\" Site$")
		public void navigate_to_Site(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			// driver.get(Prop.getProperty("url"));
			driver.get(arg1);
		}

		@Given("^Click on login link in home page to secure sign in page$")
		public void click_on_login_link_in_home_page_to_secure_sign_in_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			LandingPage lpage = new LandingPage(driver);
			lpage.Login().click();
			if (lpage.getPopupSize().size()> 0) 
			{
				lpage.getpopup().click();
			}
		}
		
		/* @When("^User enter \"([^\"]*)\" and \"([^\"]*)\" and login$")
		public void user_enter_and_and_login(String arg1, String arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			LoginPage loginpage = new LoginPage(driver);
			loginpage.InputEmail().sendKeys(arg1);
			loginpage.InputPassword().sendKeys(arg2);
			loginpage.GoClick().click();
		}*/


	    @When("^User enter (.+) and (.+) and login$")
	    public void user_enter_and_and_login(String username, String password) throws Throwable {
	    	  // Write code here that turns the phrase above into concrete actions
			LoginPage loginpage = new LoginPage(driver);
			loginpage.InputEmail().sendKeys(username);
			loginpage.InputPassword().sendKeys(password);
			loginpage.GoClick().click();
	    }

		@Then("^Verify user is successfully logged in$")
		public void verify_user_is_successfully_logged_in() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			portalPage pg = new portalPage(driver);
			Assert.assertTrue(pg.GetSearchBox().isDisplayed());
		}
		
		  @And("^Close the Browser$")
		    public void close_the_browser() throws Throwable {
		     driver.close();  
		    }
		public static void main(String[] args) {

	}

}
