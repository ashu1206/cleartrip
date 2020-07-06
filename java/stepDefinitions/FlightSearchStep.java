package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import pages.Base;
import pages.FlightSearchPage;
import utilityLib.ScreenshotUtility;

public class FlightSearchStep extends Base{
	
	FlightSearchPage flight_search=new FlightSearchPage(driver);

	@Then("^Fills the From which is boarding placeFrom$")
	public void fills_the_From_which_is_boarding_placeFrom() throws InterruptedException {
		
		flight_search.fromBoard("Pune, IN - Lohegaon (PNQ)");
		//ScreenshotUtility.takeScreenshot(driver, "Board");
	}

	@Then("^Fills the To which is deboarding placeTo$")
	public void fills_the_To_which_is_deboarding_placeTo() throws InterruptedException{
		flight_search.toDeboard("New Delhi, IN - Indira Gandhi Airport (DEL)");
		//ScreenshotUtility.takeScreenshot(driver, "DeBoard");
	  
	}

	@Then("^Selects the date of departure \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void selects_the_date_of_departure_and_and(String yearto, String monthto, String dateto) throws InterruptedException {
	  
		flight_search.dateDepart(yearto, monthto, dateto);
		//ScreenshotUtility.takeScreenshot(driver, "Date");
	}


	@Then("^Fills the number of Adults and Children and Infants$")
	public void fills_the_number_of_Adults_and_Children_and_Infants() throws InterruptedException {
	   flight_search.noOfAdults("1");
	   flight_search.noOfChildren("1");
	   flight_search.noOfInfants("1");
	  // ScreenshotUtility.takeScreenshot(driver, "Travellers");
	}

	@Then("^Clicks on Search Flights$")
	public void clicks_on_Search_Flights() throws InterruptedException {
	   
		flight_search.flightsearch();
		//ScreenshotUtility.takeScreenshot(driver, "FlightSearch");
	}

	@Then("^verify that user is on flight booking page with selected search$")
	public void verify_that_user_is_on_flight_booking_page_with_selected_search() {
		System.out.println(driver.getTitle());
		//ScreenshotUtility.takeScreenshot(driver, "PageTitle");
	  // Assert.assertEquals("#1 Site for Booking Flights, Hotels, Packages, Trains & Local activities.",driver.getTitle());
	}

	
	
}
