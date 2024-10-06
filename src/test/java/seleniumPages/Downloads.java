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

public class Downloads { 
	
   @Then("The 'Downloads' page should load") 
   public void downloadPage() {
	   if (driver.getCurrentUrl().equals("https://www.selenium.dev/downloads/")) {
	   } else {
		   Assert.fail();
	   }
   }
   
   @Then("The different 'Downloads' titles should have the right text") 
   public void downloadsTitlesLoaded() { 
	   
      if(languageBindingsTitle.getText().equals("Selenium Clients and WebDriver Language Bindings") && 
    		  gridtitle.getText().equals("Selenium Server (Grid)") &&
    		  ieTitle.getText().equals("The Internet Explorer Driver Server") &&
    		  ideTitle.getText().equals("Selenium IDE") && 
      		  nightlyTitle.getText().equals("Selenium Nightly Builds") &&
      		  nugetTitle.getText().equals("C# NuGet") &&
      		  previousReleaseTitle.getText().equals("Previous Releases") && 
      		  mavenTitle.getText().equals("Maven Information") &&
      		  ecosystemTitle.getText().equals("Ecosystem") &&
      		  platformsTitle.getText().equals("Platforms Supported by Selenium") &&
      		  sourceCodeTitle.getText().equals("Source Code")){ 
         System.out.println("Test 'Can navigate to the 'Download' page and the titles have the right text' Passed."); 
      } else {
         Assert.fail();
      } 
      driver.quit(); 
   }
   
   //WebDriver retrieval
   WebDriver driver = Webdriver.getWebDriver(); 
   
   //PageElements
   WebElement languageBindingsTitle = driver.findElement(By.xpath("//main/div[2]/div/div[1]/h2"));//good
   WebElement ieTitle = driver.findElement(By.xpath("//main/div[5]/div[1]/div/div/p[1]"));//good
   WebElement gridtitle = driver.findElement(By.xpath("//main/div[4]/div[1]/div/div/p[1]"));//good
   WebElement ideTitle = driver.findElement(By.xpath("//main/div[6]/div/div/h2"));//good
   WebElement nightlyTitle = driver.findElement(By.xpath("//*[@id=\"nightly\"]"));//good
   WebElement nugetTitle = driver.findElement(By.xpath("//main/div[8]/div/div/h2"));//good
   WebElement previousReleaseTitle = driver.findElement(By.xpath("//main/div[9]/div/div/h2"));//good
   WebElement mavenTitle = driver.findElement(By.xpath("//main/div[10]/div/div/h2"));//good
   WebElement ecosystemTitle = driver.findElement(By.xpath("//main/div[11]/div/div/h2"));//good
   WebElement platformsTitle = driver.findElement(By.xpath("//main/div[12]/div/div/h2"));//good
   WebElement sourceCodeTitle = driver.findElement(By.xpath("//main/div[13]/div/div/h2"));//good
}