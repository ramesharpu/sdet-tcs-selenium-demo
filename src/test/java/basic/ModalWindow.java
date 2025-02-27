package basic;

import org.openqa.selenium.By;

public class ModalWindow extends BaseTest{

	public void modalDemo() {
		driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
		driver.findElement(By.id("loginFormEmail")).sendKeys("test@gmail.com");
		
	}
	
	
	public static void main(String[] args) {
		ModalWindow obj = new ModalWindow();
		obj.setupBrowser("chrome", "https://edureka.co");
		obj.modalDemo();
	}

	

}
