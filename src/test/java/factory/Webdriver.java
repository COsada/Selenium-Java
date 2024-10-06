package factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webdriver {
	  public static WebDriver driver;
	  
	  public Webdriver(){
	    driver = new EdgeDriver();
	  }
	  
	  /*If no webdriver exists, or the current one has been closed, 
	   * create a new webdriver and return that, otherwise return the current operable webdriver*/
	  public static WebDriver getWebDriver(){
	    try {
			if (driver == null || driver.toString().contains("null")){
			  driver = new EdgeDriver();
			  return driver;
			}else{
			  return driver;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	  }
}
