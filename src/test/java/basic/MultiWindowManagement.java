package basic;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class MultiWindowManagement extends BaseTest{
	
	public void demo() {
		
		/*
		 * get the overall windows open
		 * driver.getWindowHandles();
		 * 
		 * get the current window id 
		 * driver.getWindowHandle();
		 * 
		 * switch between windows 
		 * driver.switchTo().window("<window id>");
		 *  
		 */
		
		System.out.println("***************Before opening the instagram window***********************************");
		System.out.println("page title - " + driver.getTitle());
		System.out.println("current window id - " + driver.getWindowHandle());
		System.out.println("total window ids - " + driver.getWindowHandles());
		
		System.out.println("\n********clicking on insta link**************");
		driver.findElement(By.partialLinkText("Instagram")).click();
		
		
		System.out.println("\n***************After opening the instagram window***********************************");
		System.out.println("page title - " + driver.getTitle());
		System.out.println("current window id - " + driver.getWindowHandle());
		System.out.println("total window ids - " + driver.getWindowHandles());
	
		
		System.out.println("\n***************switching to instagram window***********************************");
		ArrayList<String> tabs =  new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		System.out.println("page title - " + driver.getTitle());
		System.out.println("current window id - " + driver.getWindowHandle());
		System.out.println("total window ids - " + driver.getWindowHandles());
		
		
		System.out.println("\n***************closing the instagram window***********************************");
		driver.close();
		driver.switchTo().window(tabs.get(0));
		System.out.println("page title - " + driver.getTitle());
		System.out.println("current window id - " + driver.getWindowHandle());
		System.out.println("total window ids - " + driver.getWindowHandles());
		
		System.out.println("\n***************Quitting the browser window***********************************");
		driver.quit();
		
	}

	public static void main(String[] args) {
		MultiWindowManagement obj = new MultiWindowManagement();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.demo();

	}

}
