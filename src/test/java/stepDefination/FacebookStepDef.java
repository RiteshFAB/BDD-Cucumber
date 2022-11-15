package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.FacebookPage;

public class FacebookStepDef {

	WebDriver driver;
	FacebookPage Facebook;
	
	@Given("User launch Url")
	public void user_launch_Url() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   
	   Facebook=new FacebookPage(driver);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@When("User enters the Credentials")
	public void user_enters_the_Credentials() throws Throwable {
	   Facebook.loginPage();
	}

	@Then("User Validate Home Page of the Application")
	public void user_Validate_Home_Page_of_the_Application() {
	Facebook.validationHome();  
	}
}
