package seleniumPages;

import org.junit.Assert;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import factory.Webdriver; 

public class About { 

   @Then("The 'About Selenium' page should load") 
   public void aboutPage() {
	   if (driver.getCurrentUrl().equals("https://www.selenium.dev/about/")) {
	   } else {
		   Assert.fail();
	   }
   }
   
   @Then("The different 'About Selenium' titles should be displayed") 
   public void aboutTitlesLoaded() {
	      if(seleniumHistory.isDisplayed() && 
	    		  seleniumEcosystem.isDisplayed() &&
	    		  seleniumSupport.isDisplayed() &&
	    		  seleniumInvolved.isDisplayed()) { 
	         System.out.println("Test 'Can navigate to the 'About Selenium' page and titles display' page' Passed."); 
	      } else {
	         Assert.fail();
	      } 
	      driver.quit(); 
   }
   
   //WebDriver retrieval
   WebDriver driver = Webdriver.getWebDriver(); 
   
   //PageElements
   WebElement seleniumHistory = driver.findElement(By.xpath("//main/div[1]/div/div[1]/h2"));
   WebElement seleniumEcosystem = driver.findElement(By.xpath("//main/div[2]/div/div[1]/h2"));
   WebElement seleniumSupport = driver.findElement(By.xpath("//div[3]/div[1]/div/div[1]/h2"));
   WebElement seleniumInvolved = driver.findElement(By.xpath("//div[3]/div[2]/div/div[1]/h2"));
}