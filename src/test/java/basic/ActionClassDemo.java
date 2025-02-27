package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo extends BaseTest{

	public void amazonExample() {
		setupBrowser("chrome", "https://www.amazon.in/" );
		WebElement navIcon = driver.findElement(By.xpath("//span[text()='Account & Lists']/span"));
		
		Actions act = new Actions(driver);
		act.moveToElement(navIcon).build().perform();
		
		driver.findElement(By.partialLinkText("Create a Wish List")).click();
	}
	
	public void dragDropExample() {
		setupBrowser("chrome", "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement norway = driver.findElement(By.id("box101"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(oslo, norway).perform();
	}
	
	public static void main(String[] args) {
		ActionClassDemo obj = new ActionClassDemo();
//		obj.amazonExample();
		obj.dragDropExample();

	}

}
