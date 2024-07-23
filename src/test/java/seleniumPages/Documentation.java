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
import io.cucumber.datatable.DataTable; 

public class Documentation { 
	
   @Then("The 'Documentation' page should load") 
   public void documentationPage() {
	   if (driver.getCurrentUrl().equals("https://www.selenium.dev/documentation/")) {
	   } else {
		   Assert.fail();
	   }
   }
   
   @Then("The different subsection should be accessible") 
   public void documentationSubsectionsLoaded(DataTable table) {
	   for (int i = 0; i < table.height(); i++) {
		   
		   refreshElements();
		   String tableString = table.row(i).toString();
		   //Text from table has brackets around it without this
		   String subsection = tableString.substring(1, tableString.length()-1);
		   
		   switch (subsection) {
		   case "Selenium Overview":
			   overviewTab.click();
			   refreshElements();
			   if(subsectionHeader.getText().startsWith(subsection)) {
			   } else {
				   driver.quit();
				   Assert.fail();
			   }
		     break;
		   case "WebDriver":
			   webdriverTab.click();
			   refreshElements();
			   if(subsectionHeader.getText().startsWith(subsection)) {
			   } else {
				   driver.quit();
				   Assert.fail();
			   }
		     break;
		   case "Selenium Manager":
			   seleniumManagerTab.click();
			   refreshElements();
			   if(subsectionHeader.getText().startsWith(subsection)) {
			   } else {
				   driver.quit();
				   Assert.fail();
			   }
		     break;
		   case "Grid":
			   gridTab.click();
			   refreshElements();
			   if(subsectionHeader.getText().startsWith(subsection)) {
			   } else {
				   driver.quit();
				   Assert.fail();
			   }
		     break;
		   case "IE Driver Server":
			   ieDriverServerTab.click();
			   refreshElements();
			   if(subsectionHeader.getText().startsWith(subsection)) {
			   } else {
				   driver.quit();
				   Assert.fail();
			   }
		     break;
		   case "Selenium IDE":
			   ideTab.click();
			   refreshElements();
			   if(subsectionHeader.getText().startsWith(subsection)) {
			   } else {
				   driver.quit();
				   Assert.fail();
			   }
		     break;
		   case "Test Practices":
			   testPracticiesTab.click();
			   refreshElements();
			   if(subsectionHeader.getText().startsWith(subsection)) {
			   } else {
				   driver.quit();
				   Assert.fail();
			   }
		     break;
		   case "Legacy":
			   legacyTab.click();
			   refreshElements();
			   if(subsectionHeader.getText().startsWith(subsection)) {
			   } else {
				   driver.quit();
				   Assert.fail();
			   }
		     break;
		   case "About":
			   aboutTab.click();
			   refreshElements();
			   if(subsectionHeader.getText().startsWith(subsection)) {
			   } else {
				   driver.quit();
				   Assert.fail();
			   }
		     break;
		   default:
		     System.out.println("No matching case for tab name given.");
		 }
	   }
	   System.out.println("Test 'Can navigate to the 'Documentation' page and access the different subsections' Passed.");
	   driver.quit();
   }
   
   @Then("The language used for the documentation can be changed to \"([^\\\"]*)\\\"") 
   public void documentationLanguageChange(String language) {
	   
   }
   
   public void refreshElements() {
	   subsectionHeader = driver.findElement(By.xpath("//div/h1"));
	   
	   overviewTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[1]"));
	   webdriverTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[2]"));
	   seleniumManagerTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[3]"));
	   gridTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[4]"));
	   ieDriverServerTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[5]"));
	   ideTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[6]"));
	   testPracticiesTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[7]"));
	   legacyTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[8]"));
	   aboutTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[9]"));
   }
   
   //WebDriver retrieval
   WebDriver driver = WebdriverSingelton.getWebDriver(); 
   
   //PageElements
   WebElement subsectionHeader = driver.findElement(By.xpath("//div/h1"));
   
   WebElement overviewTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[1]"));
   WebElement webdriverTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[2]"));
   WebElement seleniumManagerTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[3]"));
   WebElement gridTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[4]"));
   WebElement ieDriverServerTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[5]"));
   WebElement ideTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[6]"));
   WebElement testPracticiesTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[7]"));
   WebElement legacyTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[8]"));
   WebElement aboutTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[9]"));
}