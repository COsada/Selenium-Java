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
import drivers.WebdriverSingelton; 

public class Homepage { 
	
   @Then("The different Selenium logos should be visible") 
   public void logosLoaded() { 
      if(seleniumLogo.isDisplayed() && 
    		  seleniumWebdriverLogo.isDisplayed() &&
    		  seleniumIDELogo.isDisplayed() &&
    		  seleniumGridLogo.isDisplayed()) { 
         System.out.println("Test 'Selenium homepage should load' Passed."); 
      } else {
         Assert.fail();
      } 
      driver.quit(); 
   }
   
   @Given("I can open the 'About' dropdown menu") 
   public void aboutDropdown() { 
      if(aboutDropdown.isEnabled()) {
    	  aboutDropdown.click();
      } else {
         Assert.fail();
      }
   }
   
   @And("I can choose the 'About Selenium' option") 
   public void aboutSelenium() { 
	      if(aboutSelenium.isEnabled()) {
	    	  aboutSelenium.click();
	      } else {
	         Assert.fail();
	      }
   }
   
   @Given("I click the 'Downloads' option from the navbar") 
   public void downloadsNavbar() { 
      if(downloadsNavbar.isEnabled()) {
    	  downloadsNavbar.click();
      } else {
         Assert.fail();
      }
   }
   
   @Given("I click the 'Documentation' option from the navbar") 
   public void documentationNavbar() { 
      if(documentationNavbar.isEnabled()) {
    	  documentationNavbar.click();
      } else {
         Assert.fail();
      }
   }
   
   //WebDriver retrieval
   WebDriver driver = WebdriverSingelton.getWebDriver(); 
   
   //PageElements
   WebElement seleniumLogo = driver.findElement(By.xpath("//nav/a/span"));
   WebElement seleniumWebdriverLogo = driver.findElement(By.xpath("//*[@id=\"selenium_webdriver\"]"));
   WebElement seleniumIDELogo = driver.findElement(By.xpath("//*[@id=\"selenium_ide\"]"));
   WebElement seleniumGridLogo = driver.findElement(By.xpath("//*[@id=\"selenium_grid\"]"));
   
   WebElement downloadsNavbar = driver.findElement(By.xpath("//nav/div/ul/li[2]"));
   WebElement documentationNavbar = driver.findElement(By.xpath("//nav/div/ul/li[3]"));
   
   WebElement aboutDropdown = driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]"));
   WebElement aboutSelenium = driver.findElement(By.xpath("//ul/li[1]/div/a[1]"));
}