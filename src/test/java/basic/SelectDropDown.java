package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown extends BaseTest{

	public void dropDownDemo() {
		Select month = new Select(driver.findElement(By.id("month")));
		
		//multiple select
//		System.out.println("is the month drop down multiple select - " + month.isMultiple());
		
		//deselecting
//		month.deselectAll();
		
		//select by index
//		month.selectByIndex(4);
		
		//select by value
//		month.selectByValue("8");
		
		//select by visible text
//		month.selectByVisibleText("Oct");
		
		//select by contains visible text
//		month.selectByContainsVisibleText("De");
		
		//first selected option
//		WebElement firstOption = month.getFirstSelectedOption();
//		System.out.println("first selected option - " + firstOption.getText());
		
		//get all selected values - multi select drop drown
//		List<WebElement> allSelctedOptions = month.getAllSelectedOptions();
//		for(int i=0; i<allSelctedOptions.size(); i++) {
//			System.out.println(allSelctedOptions.get(i).getText());
//		}
//		for (WebElement elem : allSelctedOptions) {
//			System.out.println(elem.getText());
//		}
		
		List<WebElement> allOptions = month.getOptions();
		for (WebElement elem : allOptions) {
			System.out.println(elem.getText());
		}
		
	
	}
	
	
	public static void main(String[] args) {
		SelectDropDown obj = new SelectDropDown();
		obj.setupBrowser("chrome", "https://www.facebook.com/reg/");
		obj.dropDownDemo();
	}

}
