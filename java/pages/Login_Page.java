package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page  {
	
	public static WebDriver driver;
	
	public Login_Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="userAccountLink")
WebElement yourTrip;

@FindBy(id="SignIn")
WebElement signIn;

@FindBy(id="email")
WebElement username;

@FindBy(id="password")
WebElement password;

@FindBy(id="signInButton")
WebElement submit;


public void clickOnYourTrip() {
	
	yourTrip.click();
}


public void clickOnSignIn() {
	
	signIn.click();
}

public void launchUrl(String url) {
	driver.get(url);
}

public void usernameAndPassword(String user,String pass) throws InterruptedException {
	
	Thread.sleep(2000);
	username.sendKeys(user);
	Thread.sleep(2000);
	password.sendKeys(pass);
}

public void clickOnSubmit() throws InterruptedException {
	
	Thread.sleep(2000);
	submit.click();
}

}
