package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertExample extends BaseTest{
	
	public void alertDemo() {
		WebElement alertButton = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		alertButton.click();
		
		//error
//		alertButton.click();
		
		//get the text
		String msg = driver.switchTo().alert().getText();
		System.out.println("msg = " + msg);
		
		//accept or submit or OK
//		driver.switchTo().alert().accept();
		
		//cancel or close or dismiss or keyboard esc key
//		driver.switchTo().alert().dismiss();

		//type
//		driver.switchTo().alert().sendKeys("test@gmail.com");
	}

	public static void main(String[] args) {
		AlertExample obj = new AlertExample();
		obj.setupBrowser("firefox", "https://the-internet.herokuapp.com/javascript_alerts");
		obj.alertDemo();
	}

}
