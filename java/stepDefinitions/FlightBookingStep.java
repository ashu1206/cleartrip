package stepDefinitions;


import io.cucumber.java.en.Then;
import pages.Base;
import pages.FlightBookingPage;
import pages.ItineraryPage;
import utilityLib.ScreenshotUtility;

public class FlightBookingStep extends Base {

	FlightBookingPage flightBooking;
	
	@Then("^get the flight list with price$")
	public void get_the_flight_list_with_price()   {
		flightBooking = new FlightBookingPage(driver);
		flightBooking.listOfFlights();
		//ScreenshotUtility.takeScreenshot(driver, "ListOfFlights");
	  
	}

	@Then("^Booking the desired flight$")
	public void booking_the_desired_flight()  {
		
		flightBooking = new FlightBookingPage(driver);
		try {
			flightBooking.bookFlight();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ScreenshotUtility.takeScreenshot(driver, "Book");
	}
	
	
}
