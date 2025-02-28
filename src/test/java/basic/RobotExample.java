package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;



public class RobotExample  extends BaseTest{
	
	public void robotExample() throws AWTException, InterruptedException {
//		driver.findElement(By.xpath("//section[@id='upload-dropbox-zone']")).click();
		driver.findElement(By.id("upload-dropbox-zone")).click();
		Robot robot = new Robot();
		
		//copy the file location
		String fileName = "D:\\selenium\\wallpaper.jpg";
		StringSelection stringSelection = new StringSelection(fileName);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);
		
		//pasting ==> using "control + v" operation
		
		//Thread.sleep is used only for demonstration purpose
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	public static void main(String[] args)  {
		RobotExample obj = new RobotExample();
		obj.setupBrowser("chrome", "https://tinypng.com/");
		
		try {
			obj.robotExample();
		} catch (Exception e) {
			System.out.println("exception occured while performing the file upload operation. For more details check the below error");
			e.printStackTrace();
		}
		

	}

}
