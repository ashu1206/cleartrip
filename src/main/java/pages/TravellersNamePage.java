package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TravellersNamePage {
	
	public static WebDriver driver;
	
	public TravellersNamePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
		
	@FindBy(id="AdultFname1")
	WebElement adultfName;
	
	@FindBy(id="AdultLname1")
	WebElement adultLastName;
	
	@FindBy(id="ChildFname1")
	WebElement childfName;
	
	@FindBy(id="ChildLname1")
	WebElement childLastName;
	
	
	@FindBy(id="InfantFname1")
	WebElement infantFName;
	
	@FindBy(id="InfantLname1")
	WebElement infantLastName;
		
	@FindBy(id="travellerBtn")
	WebElement contibtn;
	
	
	Select travSelect;
	
	
	public void adultDetails() {
		
		travSelect = new Select(driver.findElement(By.id("AdultTitle1")));
		travSelect.selectByValue("Mr");
		
		adultfName.sendKeys("Rahul");
		adultLastName.sendKeys("Modi");		
			
	}
	
	public void childDetails() {
		
		travSelect = new Select(driver.findElement(By.id("ChildTitle1")));
		travSelect.selectByValue("Mstr");
		
		childfName.sendKeys("Vikram");
		childLastName.sendKeys("Gandhi");
		
		travSelect = new Select(driver.findElement(By.id("ChildDobDay1")));
		travSelect.selectByValue("2");
		
		travSelect = new Select(driver.findElement(By.id("ChildDobMonth1")));
		travSelect.selectByValue("4");
		
		travSelect = new Select(driver.findElement(By.id("ChildDobYear1")));
		travSelect.selectByValue("2011");
		
	}
	
	public void infantDetails() {
		
		travSelect = new Select(driver.findElement(By.id("InfantTitle1")));
		travSelect.selectByValue("Miss");
		
		infantFName.sendKeys("Priti");
		infantLastName.sendKeys("Modi");
		
		travSelect = new Select(driver.findElement(By.id("InfantDobDay1")));
		travSelect.selectByValue("1");		
		
		travSelect = new Select(driver.findElement(By.id("InfantDobMonth1")));
		travSelect.selectByValue("7");
		
		travSelect = new Select(driver.findElement(By.id("InfantDobYear1")));
		travSelect.selectByValue("2020");
		
	}
	
	public void continueClick() {
		
		contibtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
