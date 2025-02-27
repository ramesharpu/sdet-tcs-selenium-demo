package basic;

import java.time.Duration;

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
		
		//implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//page load timeout ==> pom
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		//script load timeout
//		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
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
