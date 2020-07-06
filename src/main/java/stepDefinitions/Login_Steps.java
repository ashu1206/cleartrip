package stepDefinitions;

import org.junit.Assert;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Base;
import pages.Login_Page;
import utilityLib.ScreenshotUtility;

public class Login_Steps extends Base{
	
	
	Login_Page loginPage;
	
    Scenario scn;
	
	@Before
	public void setUp(Scenario s) {
		
		initialize();
		
		this.scn = s;
	}
	@AfterStep
	public void tearDown(Scenario s) {
		String Failed = "FailedScreenShots";
		String Pass = "PassedScreenshot";
		System.out.println("AfterSTEPSSSSSSSSSS");
		
		if(s.isFailed()) {
			
			ScreenshotUtility.takeScreenshot(driver, Failed+".png");
		}
			
		else {
			System.out.println("Passssssssseddddddddd");
			ScreenshotUtility.takeScreenshot(driver, Pass+".png");
			
		}
	}
	

	
	@Given("^user is launching the browser go to \"([^\"]*)\"$")
	public void user_is_launching_the_browser_go_to(String url)  {
		
		initialize();
		//ScreenshotUtility.takeScreenshot(driver, "LaunchBrowser");
	}

	@When("^clicks on Your trip option$")
	public void clicks_on_Your_trip_option()  {
		
		loginPage = new Login_Page(driver);
		loginPage.clickOnYourTrip();
		//ScreenshotUtility.takeScreenshot(driver, "ClickOnTrip");
	   
	}

	@Then("^clicks on Sigin option$")
	public void clicks_on_Sigin_option()  {
		loginPage = new Login_Page(driver);
		loginPage.clickOnSignIn();
		//ScreenshotUtility.takeScreenshot(driver, "ClickOnSignIn");
	  
	}

	@Then("^enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String arg1, String arg2) throws InterruptedException  {
		
		driver.switchTo().frame("modal_window");
		
		loginPage = new Login_Page(driver);
		loginPage.usernameAndPassword(arg1,arg2);
		//ScreenshotUtility.takeScreenshot(driver, "EnterUserPass");
	    
	}

	@Then("^click on sign in button$")
	public void click_on_sign_in_button() throws InterruptedException  {
		loginPage = new Login_Page(driver);
		loginPage.clickOnSubmit();
		//ScreenshotUtility.takeScreenshot(driver, "ClickSignIn");
	    
	}

	@Then("^verify that user is able to successfuly logged in$")
	public void verify_that_user_is_able_to_successfuly_logged_in() {
		
		driver.switchTo().parentFrame();
		
	   String expectedtitle = "#1 Site for Booking Flights, Hotels, Packages, Trains & Local activities.";
	   String actualTitle =  driver.getTitle();
	   System.out.println(actualTitle);
	  
	  
	  Assert.assertEquals(expectedtitle, actualTitle);
	  //ScreenshotUtility.takeScreenshot(driver, "VerifyTitle");
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws InterruptedException {
		
		Thread.sleep(10000);
		
		//driver.close();
	    
	}


}
