package seleniumPages;

import org.junit.Assert;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import drivers.WebdriverSingelton;

public class Documentation { 
	
   @Then("The 'Documentation' page should load") 
   public void documentationPage() {
	   if (driver.getCurrentUrl().equals("https://www.selenium.dev/documentation/")) {
	   } else {
		   Assert.fail();
	   }
   }
   
   /*This method is overall a bit sloppy for my tastes due to the stale element exception. Would be a lot cleaner 
    * if I took sometime to figure out a better solution for that, but it works for now and I can always come back.*/
   @Then("The \"(.*)\" section should be accessible through the index") 
   public void documentationSubsectionsLoaded(String sectionName) {
	   
	   /*The 'click' and ''refresh' actions are outside the method block as they cause stale element 
	   issues due to being passed the elements rather then holding the actual ones*/
	   switch(sectionName) {
	   case "Overview":
		   overviewTab.click();
		   refreshElements();
		   checkHeaderThenQuit(sectionHeader,  sectionName);
	     break;
	   case "WebDriver":
		   webdriverTab.click();
		   refreshElements();
		   checkHeaderThenQuit(sectionHeader,  sectionName);
	     break;
	   case "Selenium Manager":
		   seleniumManagerTab.click();
		   refreshElements();
		   checkHeaderThenQuit(sectionHeader,  sectionName);
	     break;
	   case "Grid":
		   gridTab.click();
		   refreshElements();
		   checkHeaderThenQuit(sectionHeader,  sectionName);
	     break;
	   case "IE Driver Server":
		   ieDriverServerTab.click();
		   refreshElements();
		   checkHeaderThenQuit(sectionHeader,  sectionName);
	     break;
	   case "Selenium IDE":
		   ideTab.click();
		   refreshElements();
		   checkHeaderThenQuit(sectionHeader,  sectionName);
	     break;
	   case "Test Practices":
		   testPracticiesTab.click();
		   refreshElements();
		   checkHeaderThenQuit(sectionHeader,  sectionName);
	     break;
	   case "Legacy":
		   legacyTab.click();
		   refreshElements();
		   checkHeaderThenQuit(sectionHeader,  sectionName);
	     break;
	   case "About":
		   aboutTab.click();
		   refreshElements();
		   checkHeaderThenQuit(sectionHeader,  sectionName);
	     break;
	   default:
		   System.out.println("Given section was not recognized.");
		   Assert.fail();
		   driver.quit();
	 }
   }
   
   @And("The language used for the documentation can be changed to \"(.*)\"") 
   public void documentationLanguageChange(String language) {
	   languageMenu.click();
	   languageSelect = driver.findElement(By.linkText(language));
	   languageSelect.click();
   }
   
   @And("Displays the new header \"(.*)\"") 
   public void documentationLanguageChangeHeaderCheck(String newHeader) {
	   refreshElements();
	   System.out.println(sectionHeader.getText());
	   System.out.println(newHeader);
	   
	   if (sectionHeader.getText().contains(newHeader)) {
		   System.out.println("Test 'Can navigate to the 'Documentation' page and change the selected language to " + newHeader + "' Passed.");
	   } else { Assert.fail(); }
	   driver.quit();
   }
   
   
   
//This section holds methods used by the tests above.
   
   /*Refreshes elements on the page to avoid stale element error, admittedly I am being a bit lazy stuffing them together like this.
    * However, that is a future me problem, not present me.*/
   public void refreshElements() {
	   sectionHeader = driver.findElement(By.xpath("//div/h1"));
	   
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
   
   //Navigates to a given section of the Documentation using the index then compares the Header against a given string
   public void checkHeaderThenQuit(WebElement compareThis, String toThis) {
	   if (compareThis.getText().contains(toThis)) {
		   System.out.println("Test 'Access "+ toThis + " section of Documentation page' Passed.");
	   } else { Assert.fail(); }
	   
	   //This is included so it has a fresh window every time for each test
	   driver.quit();
   }
   
   //WebDriver retrieval
   WebDriver driver = WebdriverSingelton.getWebDriver(); 
   
   //PageElements
   WebElement sectionHeader = driver.findElement(By.xpath("//div/h1"));
   
   WebElement overviewTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[1]"));
   WebElement webdriverTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[2]"));
   WebElement seleniumManagerTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[3]"));
   WebElement gridTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[4]"));
   WebElement ieDriverServerTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[5]"));
   WebElement ideTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[6]"));
   WebElement testPracticiesTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[7]"));
   WebElement legacyTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[8]"));
   WebElement aboutTab = driver.findElement(By.xpath("//aside[1]/div/nav/ul/li/ul/li[9]"));
   
   WebElement languageMenu = driver.findElement(By.xpath("//li[7]/div[contains(@class,'dropdown')]"));
   WebElement languageSelect;
}