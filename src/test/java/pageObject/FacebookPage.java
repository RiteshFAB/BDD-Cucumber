package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

	WebDriver remoteDriver;
	
	public FacebookPage(WebDriver localDriver) {	
		remoteDriver=localDriver;	
		PageFactory.initElements(localDriver, this);	
	}
	
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pass;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement button;
	
	public void loginPage() throws Throwable {
		remoteDriver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		username.sendKeys("riteshk402@gmail.com");
		pass.sendKeys("Samsung@12");
		button.click();
		Thread.sleep(5000);
	}
	
	public void validationHome() {

	String title=	remoteDriver.getTitle();
	System.out.println(title);
	}
}
