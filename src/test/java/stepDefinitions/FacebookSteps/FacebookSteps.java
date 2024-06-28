package stepDefinitions.FacebookSteps;

import org.junit.Assert;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.WebdriverSingelton; 

public class FacebookSteps { 
   WebDriver driver = WebdriverSingelton.getWebDriver(); 
	
   @Then("^Login button should exits$") 
   public void loginButton() { 
      if(driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).isEnabled()) { 
         System.out.println("Test 1 Pass"); 
      } else { 
         System.out.println("Test 1 Fail");
         Assert.fail();
      } 
      driver.close(); 
   } 
}