package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

public class LocatorStrategy extends BaseTest{

	public void locatorExample() {
		/*
		 * 1. id
		 * 2. name
		 * 3. className
		 * 4. tagname
		 * 5. linktext
		 * 6. partialLinktext
		 * 7. xpath
		 * 8. css
		 */
		
		//id
//		driver.findElement(By.id("email")).sendKeys("from id");
		
		//name
//		driver.findElement(By.name("email")).sendKeys("from name");
		
		//classname
//		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("from classname");//error
//		driver.findElement(By.className("inputtext")).sendKeys("from classname-1");
//		driver.findElement(By.className("_55r1")).sendKeys("from classname-2");
//		driver.findElement(By.className("_6luy")).sendKeys("from classname-3");
		
		//tagname
//		driver.findElement(By.tagName("button")).click();
		
		//linkText
//		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//partialLinkText
//		driver.findElement(By.partialLinkText("Forgotten password?")).click();
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		driver.findElement(By.partialLinkText("password?")).click();
//		driver.findElement(By.partialLinkText("For")).click();
//		driver.findElement(By.partialLinkText("rd?")).click();
//		driver.findElement(By.partialLinkText("F")).click();
//		driver.findElement(By.partialLinkText("?")).click();
//		driver.findElement(By.partialLinkText("gotten")).click();
//		driver.findElement(By.partialLinkText("passw")).click();
//		driver.findElement(By.partialLinkText("swo")).click();
//		driver.findElement(By.partialLinkText("got")).click();
//		driver.findElement(By.partialLinkText("en pas")).click();
		
		//xpath
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("from xpath");
		
		//absolute xpath
//		String path = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input";
//		driver.findElement(By.xpath(path)).sendKeys("from abs xpath");
		
		//relative
//		driver.findElement(By.xpath("//form/div[1]/div[1]/input")).sendKeys("from relative path");
//		driver.findElement(By.xpath("//body//div[1]/form/div[1]/div[1]/input")).sendKeys("from relative path-2");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("from relative path-3");
		
		//tagname
//		driver.findElement(By.xpath("//button")).click();
		
		//only attribute ==> not recommend
//		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("from only attribute");
		
		//tagname + attribute
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd");		
//		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("abcd");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd");
		
		$x("//input[@id='email']")
		$x("//input[@placeholder='Email address or phone number']")
		$x("//input[@aria-label='Email address or phone number']")
		$x("//input[@autofocus='1']")
		$x("//input[@data-testid='royal-email']")
		
		
		//and
		$x("//input[@id='email' and @name='email']")
		$x("//input[@id='email' and @name='email' and @placeholder='Email address or phone number']")
		
		//or
		$x("//button[text()='Log in' or text()='लॉग इन करें']")
		
		//and + or 
		$x("//input[@id='email' or @name='email' and @autofocus='1']")
		$x("//input[@id='email' and @name='email' or @autofocus='1']")
		
		//functions
		//starts-with
		$x("//input[starts-with(@id, 'email')]")
		$x("//input[starts-with(@id, 'emai')]")
		$x("//input[starts-with(@id, 'ema')]")
		$x("//input[starts-with(@id, 'em')]")
		$x("//input[starts-with(@id, 'e')]")
		
		//contains
		$x("//input[contains(@id, 'email')]")
		$x("//input[contains(@id, 'emai')]")
		$x("//input[contains(@id, 'ema')]")
		$x("//input[contains(@id, 'em')]")
		$x("//input[contains(@id, 'e')]")
		
		$x("//input[contains(@id, 'mail')]")
		$x("//input[contains(@id, 'ail')]")
		$x("//input[contains(@id, 'il')]")
		$x("//input[contains(@id, 'l')]")
		
		$x("//input[contains(@id, 'mai')]")
		$x("//input[contains(@id, 'ai')]")
		$x("//input[contains(@id, 'ma')]")
		$x("//input[contains(@id, 'i')]")
		$x("//input[contains(@id, 'm')]")
		
		//text
		$x("//button[text()='Log in']")
		$x("//h2[text()='Facebook helps you connect and share with the people in your life.']")
		$x("//a[text()='Forgotten password?']")
		
		//text + starts-with
		$x("//button[starts-with(text(),'Log in')]")
		$x("//button[starts-with(text(),'Log i')]")
		$x("//button[starts-with(text(),'Log ')]")
		$x("//button[starts-with(text(),'Log')]")
		$x("//button[starts-with(text(),'Lo)]")
		$x("//button[starts-with(text(),'L')]")
		
		//text + contains
		$x("//button[contains(text(),'Log in')]")
		$x("//button[contains(text(),'Log i')]")
		$x("//button[contains(text(),'Log ')]")
		$x("//button[contains(text(),'Log')]")
		$x("//button[contains(text(),'Lo')]")
		$x("//button[contains(text(),'L')]")
		
		$x("//button[contains(text(),'og in')]")
		$x("//button[contains(text(),'g in')]")
		$x("//button[contains(text(),' in')]")
		$x("//button[contains(text(),'in')]")
		$x("//button[contains(text(),'n')]")
		
		$x("//button[contains(text(),'og i')]")
		$x("//button[contains(text(),'g i')]")
		$x("//button[contains(text(),'og ')]")
		
		//index
		$x("//select[3]")
		
		//chained
		$x("//div[@class='_5k_5']/span/span")

		//css
//		driver.findElement(By.cssSelector("#email")).sendKeys("from css");
		
		//css -  id attribute
		$$("#email")
		
		//css - class attribute
		$$(".inputtext")
		$$("._55r1")
		$$("._6luy")
		$$(".inputtext._55r1")
		$$("._55r1._6luy")
		$$(".inputtext._6luy")
		
		//css ==> id and class attribute
		$$("#email.inputtext")
		$$("#email._55r1")
		$$("#email._6luy")
		$$("#email.inputtext._55r1")
		$$("#email.inputtext._6luy")
		$$("#email._55r1._6luy")
		$$(".inputtext#email._55r1._6luy")
		$$(".inputtext._55r1#email._6luy")
		$$(".inputtext._55r1._6luy#email")
		$$("._55r1#email")
		$$("._6luy#email")
		$$(".inputtext._55r1#email")
		$$(".inputtext._6luy#email")
		$$("._55r1._6luy#email")
		$$(".inputtext#email._55r1")
		$$(".inputtext#email._6luy")
		$$("._55r1#email._6luy")		
		$$("#email._55r1.inputtext._6luy")
		$$("#email._55r1._6luy.inputtext")
		$$("._55r1#email.inputtext._6luy")
		
		//css => html tagname
		$$("button")
		
		//css ==> html attribute ==> not recommended
		$$("[id='email']")
		$$("[data-testid='royal-email']")
		
		//css (id and class) + html (tagname + attributes)
		$$("input#email")
		$$("input.inputtext")
		$$("input.inputtext._55r1._6luy")
		$$("input[id='email']#email")
		$$("input[id='email']#email.inputtext")
		$$("input[id='email']#email.inputtext._55r1")
		$$("input[id='email']#email.inputtext._6luy")
		$$("input[id='email']#email._55r1._6luy")
		$$("input[id='email'].inputtext")
		$$("input[id='email']._55r1")
		$$("input[id='email']._6luy")
		$$("input[id='email'].inputtext._55r1")
		$$("input[id='email']._55r1._6luy")
		$$("input[id='email'].inputtext._6luy")
		$$("input[id='email']#email.inputtext._55r1._6luy")
		$$("input[id='email'].inputtext#email._55r1._6luy")
		$$("input[id='email'].inputtext._55r1#email._6luy")
		$$("input[id='email'].inputtext._55r1._6luy#email")
		
		//substring
		//starts-with ==> ^
		$$("input[id^=email]")
		$$("input[id^=emai]")
		$$("input[id^=ema]")
		$$("input[id^=em]")
		$$("input[id^=e]")
		
		//end-with ==> $
		$$("input[id$=email]")
		$$("input[id$=mail]")
		$$("input[id$=ail]")
		$$("input[id$=il]")
		$$("input[id$=l]")
		
		//contains ==> *
		$$("input[id*=email]")
		$$("input[id*=emai]")
		$$("input[id*=ema]")
		$$("input[id*=em]")
		$$("input[id*=e]")
		
		$$("input[id*=mail]")
		$$("input[id*=ail]")
		$$("input[id*=il]")
		$$("input[id*=l]")
		
		$$("input[id*=mai]")
		$$("input[id*=ai]")
		$$("input[id*=ma]")
		$$("input[id*=i]")
		$$("input[id*=m]")	
		
	}
	
	
	public static void main(String[] args) {
		LocatorStrategy obj = new LocatorStrategy();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.locatorExample();
	}

}
