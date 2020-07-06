package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSearchPage{

	public static WebDriver driver;
	
	public FlightSearchPage(WebDriver driver) {
	
		this.driver=driver;
		

	PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(xpath="//*[@id=\"FromTag\"]")
	WebElement from;
	
	@FindBy(xpath="//*[@id=\"ToTag\"]")
	WebElement to;
	
	@FindBy(xpath="//*[@id=\"DepartDate\"]")
	WebElement departure;
	
	@FindBy(xpath="//*[@id=\"Adults\"]")
	WebElement countadults;
	
	@FindBy(xpath="//*[@id=\"Childrens\"]")
	WebElement countchildren;
	
	@FindBy(xpath="//*[@id=\"Infants\"]")
	WebElement countinfants;
	
	@FindBy(xpath="//*[@id=\"SearchBtn\"]")
	WebElement search;
	
	
	
	public void fromBoard(String board) throws InterruptedException
	{
		
		Thread.sleep(1000);
		
		from.sendKeys(board);
	}
	
	public void toDeboard(String deboard) throws InterruptedException
	{
		Thread.sleep(1000);
		
		to.sendKeys(deboard);
	}
	
	public void dateDepart(String yearto,String monthto,String dateto) throws InterruptedException
	{
		Thread.sleep(1000);
		
        driver.findElement(By.xpath("//*[@id=\"ORtrip\"]/section[2]/div[1]/dl/dd/div/a/i")).click();
		
		boolean a = true;

		System.out.println(yearto);
		while(a)
		{
			WebElement years = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
			String year = years.getText();
			
			if(year.equals(yearto))
			{
				boolean m = true;
				
				
				while(m)
				{
					WebElement months = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
					String month = months.getText();
					
					if(month.equals(monthto))
					{
						List<WebElement> dates = driver.findElements(By.xpath("//*[@class='monthBlock first']//td"));
						int total_dates = dates.size();
						
						for(int k=0;k<total_dates;k++)
						{
							String date = dates.get(k).getText();
							
							if(date.equalsIgnoreCase(dateto))
							{
								dates.get(k).click();
								break;
							}
						}
						m=false;
					}
					else
					{
						driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
											}
				}
				
				a=false;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
							}						
		}
		
	}
	
	public void noOfAdults(String adults) throws InterruptedException
	{
		Thread.sleep(1000);
		countadults.sendKeys(adults); 
	}
	
	public void noOfChildren(String children) throws InterruptedException
	{
		Thread.sleep(1000);
		countchildren.sendKeys(children);
	}
	public void noOfInfants(String infants) throws InterruptedException
	{
		Thread.sleep(1000);
		countinfants.sendKeys(infants);
	}
	public void flightsearch()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		search.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	
}
