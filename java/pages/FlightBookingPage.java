package pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.MultiValueMap;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FlightBookingPage {

	List<String> airName = null;
	List<String> ticketPrice = null;
		
	public static WebDriver driver;
	
	public FlightBookingPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void listOfFlights() {
		airName = new ArrayList<String>();
		ticketPrice = new ArrayList<String>();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> airLines_name = driver.findElements(By.xpath("//*[@id='root']//span/div[contains(text(),'Flight details')]/../../../.."));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(airLines_name.size());
		for(WebElement ele: airLines_name) {
			WebElement fname = ele.findElement(By.xpath(".//div/img"));
			String nameaeroplane = fname.getAttribute("alt");
		//	String airl;
		//	WebElement aad = ele.findElement(By.xpath("//div/img[@alt='"+airl+"']"))
			
			
		    
			airName.add(fname.getAttribute("alt"));
			
					
		}
		
		System.out.println(airName);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(WebElement ele: airLines_name) {
			WebElement fname = ele.findElement(By.xpath("./div[3]//div/p"));
			String pricelist = fname.getText();
			
			ticketPrice.add(pricelist);
		
		}
		
		System.out.println(ticketPrice);
		System.out.println(airName);
		Map<String,Integer> priceAndFlight = new MultiValueMap();
		System.out.println(airName.size());
		for(int i=0;i<airName.size();i++) {
	    int a=Integer.parseInt((ticketPrice.get(i)).trim().substring(1,ticketPrice.get(i).length()).replace(",", ""));
			
			priceAndFlight.put(airName.get(i), a);
					}
		System.out.println(priceAndFlight);

	}
	
	public void bookFlight() throws InterruptedException {
		
		driver.findElement(By.xpath("//div/div/a/span[contains(text(),'Price')]")).click();
		
		List<WebElement> airLines_name = driver.findElements(By.xpath("//*[@id='root']//span/div[contains(text(),'Flight details')]/../../../.."));
		
			Thread.sleep(3000);
		
		System.out.println(airLines_name.size());
		for(WebElement ele: airLines_name) {
			WebElement fname = ele.findElement(By.xpath(".//div/img"));
			String nameaeroplane = fname.getAttribute("alt");
			if(nameaeroplane.equalsIgnoreCase("Vistara")) {
				ele.findElement(By.xpath("./div/button")).click();
				break;
			}
		
		
			}
	}
	
	
}
	


