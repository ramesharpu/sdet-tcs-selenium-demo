package basic;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExample {
	
	String browser = "chrome";
	WebDriver driver;
	String hubUrl = "http://localhost:4444";
	String appUrl = "https://www.facebook.com";
	
	public void gridDemo() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(browser);
		
		try {
			driver = new RemoteWebDriver(new URI(hubUrl).toURL(),cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		driver.get(appUrl);
	}
	
	public void titleValidation() {
		System.out.println("page title = " + driver.getTitle());
	}

	public static void main(String[] args) {
		GridExample obj = new GridExample();
		obj.gridDemo();
		obj.titleValidation();

	}

}
