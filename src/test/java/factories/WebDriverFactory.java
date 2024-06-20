package factories;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {
	  public static WebDriver wdriver;
	  
	  public WebDriverFactory(){
	    wdriver = new EdgeDriver();
	  }
	  
	  public static WebDriver getWebDriver(){
	    try {
			if (wdriver == null){
			  wdriver = new EdgeDriver();
			  return wdriver;
			}else{
			  return wdriver;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	  }
}
