package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import factories.WebDriverFactory;

public class Background {
	   WebDriver driver = null; 

	   @Given("^I open the browser$") 
	   public void openBrowser() { 
	      driver = WebDriverFactory.getWebDriver(); 
	   } 
		
	   @When("^I navigate to the websites homepage$") 
	   public void goToFacebook() { 
	      driver.navigate().to("https://www.facebook.com/"); 
	   }
	
}
