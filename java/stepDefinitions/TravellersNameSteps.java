package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.Base;
import pages.TravellersNamePage;

public class TravellersNameSteps extends Base{
	
	TravellersNamePage travellersPage;
	
	
	
	@Then("^fill the adult salutation and first name and last name$")
	public void fill_the_adult_salutation_and_first_name_and_last_name() throws Throwable {
		
		travellersPage = new TravellersNamePage(driver);
		travellersPage.adultDetails();
		//ScreenshotUtility.takeScreenshot(driver, "AdultsDetails");
	}

	@Then("^fill the child salutation and first name and last name and date of birth$")
	public void fill_the_child_salutation_and_first_name_and_last_name_and_date_of_birth() throws Throwable {
		
		travellersPage = new TravellersNamePage(driver);
		travellersPage.childDetails();
		//ScreenshotUtility.takeScreenshot(driver, "ChildDetails");
	    
	}

	@Then("^fill the infant salutation and first name and last name and date of birth$")
	public void fill_the_infant_salutation_and_first_name_and_last_name_and_date_of_birth() throws Throwable {
		
		travellersPage = new TravellersNamePage(driver);
		travellersPage.infantDetails();
		//ScreenshotUtility.takeScreenshot(driver, "InfantDetails");
	 
	}

	@Then("^click on continue$")
	public void click_on_continue() throws Throwable {
		
		travellersPage = new TravellersNamePage(driver);
		travellersPage.continueClick();
		//ScreenshotUtility.takeScreenshot(driver, "ContinueOn");
	    
	}


}
