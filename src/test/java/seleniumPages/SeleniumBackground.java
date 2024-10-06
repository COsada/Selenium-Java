package seleniumPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import factory.Webdriver;

public class SeleniumBackground {
	   WebDriver driver = null; 


	   @Given("I open the browser") 
	   public void openBrowser() { 
	      driver = Webdriver.getWebDriver(); 
	   } 
		
	   @When("I navigate to the websites homepage") 
	   public void goToFacebook() { 
	      driver.navigate().to("https://www.facebook.com/"); 
	   }
	   
	   
	   @When("I navigate to the Selenium homepage$") 
	   public void goToSelenium() { 
	      driver.navigate().to("https://www.selenium.dev/"); 
	   }
	
}
