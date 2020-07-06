package pages;

//System is edited

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base {
	
	public static  WebDriver driver;
	
	
	public void initialize() {
		
	
		
		String expath = "./driver/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", expath);
		
		driver = new ChromeDriver();
		
	   driver.get("https://www.cleartrip.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		
	}
	
	
	public void closeBrowser() {
		
		driver.quit();
	}

}
