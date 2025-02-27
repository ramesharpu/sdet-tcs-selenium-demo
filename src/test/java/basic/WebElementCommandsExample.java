package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommandsExample extends BaseTest{
	
	public void demo() {
		WebElement email = driver.findElement(By.id("email"));
		WebElement loginBtn = driver.findElement(By.tagName("button"));
		WebElement welMsg = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		WebElement hiddenElem = driver.findElement(By.name("jazoest"));
		WebElement signupLink = driver.findElement(By.partialLinkText("Sign Up"));
		
		
		//fetch the values
		//get attribute
//		System.out.println(email.getDomAttribute("placeholder"));
		
		//get text
//		System.out.println(loginBtn.getText());
//		System.out.println(welMsg.getText());
		
		//get tagname
//		System.out.println("email id textbox tagname = " + email.getTagName());
		
		//get location
//		System.out.println("login button location (point) - " + loginBtn.getLocation());
//		System.out.println("login button location (point - x) - " + loginBtn.getLocation().x);
//		System.out.println("login button location (point - y) - " + loginBtn.getLocation().y);

		//get size
//		System.out.println("login button size (dimension) - " + loginBtn.getSize());
//		System.out.println("login button size (dimension - width) - " + loginBtn.getSize().width);
//		System.out.println("login button size (dimension - height) - " + loginBtn.getSize().height);
		
		//get css value
//		System.out.println("login button, font size = " + loginBtn.getCssValue("font-size"));
		
		
		//actions
		//click
//		loginBtn.click();
		
		//type
//		email.sendKeys("ramesh@gamil.com");
		
		//clear
//		email.clear();
//		email.sendKeys("john@gmail.com");
		
		//status
		//is displayed
//		System.out.println("is email textbox visible - " + email.isDisplayed());
//		System.out.println("is the hidden element visible - " + hiddenElem.isDisplayed());
		
		//is enabled
//		System.out.println("is the email text box enable = " + email.isEnabled());
		
		//is selected
		signupLink.click();
		
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='2']"));
		System.out.println("Before clicking - is the male radio button selected - " + maleRadioButton.isSelected());
		
		maleRadioButton.click();
		System.out.println("After clicking - is the male radio button selected - " + maleRadioButton.isSelected());
		
	}

	public static void main(String[] args) {
		WebElementCommandsExample obj = new WebElementCommandsExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.demo();

	}

}
