package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IframeExample extends BaseTest {
	
	public void iframeDemo() {
		
		//index
//		driver.switchTo().frame(0);
		
		//id or name
//		driver.switchTo().frame("mce_0_ifr");
		
		//webelement
		WebElement elem = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(elem);
		
		
		WebElement txt = driver.findElement(By.xpath("//p[contains(text(),'goes')]"));
		System.out.println(txt.getText());
		
		//switch to parent frame
//		driver.switchTo().parentFrame();
		
		//switch to base page
//		driver.switchTo().defaultContent();
		
		WebElement baseElem = driver.findElement(By.xpath("//h3[contains(text(), 'Editor')]"));
		System.out.println("base page text = " + baseElem.getText());
		
	}

	public static void main(String[] args) {
		IframeExample obj = new IframeExample();
		obj.setupBrowser("chrome", "https://the-internet.herokuapp.com/iframe");
		obj.iframeDemo();

	}

}
