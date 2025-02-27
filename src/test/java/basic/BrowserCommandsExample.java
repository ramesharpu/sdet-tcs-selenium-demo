package basic;

import org.jspecify.annotations.Nullable;

public class BrowserCommandsExample extends BaseTest{
	
	
	public void demo() {
		//opening url
//		driver.get("https://www.facebook.com");
		
		//get the page title
//		String pageTitle = driver.getTitle();
//		System.out.println("page title = " + pageTitle);
		
		//get the current url
//		String url = driver.getCurrentUrl();
//		System.out.println("page url = " + url);
		
		//get the page source
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
//		Thread.sleep is used only for demo purpose
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//closing the tab
//		driver.close();
		
		//quit the browser instance
		driver.quit();
		
	}

	public static void main(String[] args) {
		BrowserCommandsExample obj = new BrowserCommandsExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.demo();
	}

}
