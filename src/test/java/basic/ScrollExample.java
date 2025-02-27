package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollExample extends BaseTest{
	
	public void youtubeExample() {
		setupBrowser("chrome", "https://www.youtube.com/watch?v=es4x5R-rV9s");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 3000)");
	}
	
	public void githubExample() {
		setupBrowser("chrome", "https://github.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void amazonExample() {
		String url = "https://www.amazon.in/iPhone-16e-128-Intelligence-Supersized/dp/B0DXQHMRCP/ref=sr_1_3?sr=8-3";
		setupBrowser("chrome", url);
		driver.manage().window().maximize();
		
		WebElement elem = driver.findElement(By.xpath("//h1[contains(text(),'About this item')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", elem);
	}
	

	public static void main(String[] args) {
		ScrollExample obj = new ScrollExample();
//		obj.youtubeExample();
//		obj.githubExample();
		obj.amazonExample();
	}

}
