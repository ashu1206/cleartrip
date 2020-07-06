package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

import org.junit.Assert;

public class ItineraryPage {
	
	public static WebDriver driver;
	
	public ItineraryPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
				
	}
	
	


	
	@FindBy(id="itineraryBtn")
	WebElement bookContinue;
	
	
	
	public void verifyItinerary() {
		
		String parent = driver.getWindowHandle();
		System.out.println("Parent window title is "+driver.getTitle());
		System.out.println("Parent window id is "+parent);
		
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("The Window Count is "+count);
		System.out.println(allWindows);
		for(String child:allWindows) {
			
			if(!parent.equalsIgnoreCase(child)) {
				
				driver.switchTo().window(child);
				String actual = driver.getTitle();
				System.out.println(actual);
				
				/*String expected = "Cleartrip | Book your flight securely in simple steps";
				Assert.assertEquals(expected, actual);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace(); */
				}
			}
		}
		
		
				

	public void clickOnContinue() {
		
		bookContinue.click();
	}

}
