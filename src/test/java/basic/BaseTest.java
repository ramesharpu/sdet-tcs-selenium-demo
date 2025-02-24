package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	//instance variable
	public WebDriver driver;
	
	public void setupBrowser(String browser, String url) {
		//Open browser
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else {
			System.out.println("valid browser was not provided, hence quitting the automation run");
			System.exit(0);
		}
		
		//url ==> start with http:// or https:// , ip:port or fqdn:port or www.<name>.com
		if(url!="")
			driver.get(url);
		else
			driver.get("about:blank");
	}

	public void quitBrowser() {
		//quit browser
		driver.quit();
	}

}
