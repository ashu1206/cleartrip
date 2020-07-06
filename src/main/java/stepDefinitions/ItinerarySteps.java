package stepDefinitions;


import io.cucumber.java.en.Then;
import pages.Base;
import pages.ItineraryPage;
import utilityLib.ScreenshotUtility;

public class ItinerarySteps extends Base{
	
	ItineraryPage itinerary;
	
	@Then("^verify the Itinerary page$")
	public void verify_the_Itinerary_page() throws Throwable {
		
		
		
		itinerary = new ItineraryPage(driver);
		itinerary.verifyItinerary();
		//ScreenshotUtility.takeScreenshot(driver, "VerifyItinerary");
	    
	}


	@Then("^click on continue booking$")
	public void click_on_continue_booking() throws Throwable {
		
		itinerary = new ItineraryPage(driver);
		itinerary.clickOnContinue();
		//ScreenshotUtility.takeScreenshot(driver, "Continue");
	}


}
