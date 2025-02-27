package basic;

public class NavigationExample extends BaseTest{
	
	public void navDemo() throws InterruptedException {
		
		//Tread.sleep is used only for demo purpose
		
		//navigate to youtube
		System.out.println("Navigating from google to youtube page");
		Thread.sleep(5000);
		driver.navigate().to("https://www.youtube.com");
		
		//browser back button
		System.out.println("Navigating back from youtube to google page");
		Thread.sleep(5000);
		driver.navigate().back();
		
		//browser forward button
		System.out.println("Navigating forward from google to youtube page");
		Thread.sleep(5000);
		driver.navigate().forward();
		
		//browser refresh button
		System.out.println("Refreshing the youtube page");
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	

	public static void main(String[] args) {
		NavigationExample obj = new NavigationExample();
		obj.setupBrowser("chrome", "https://www.google.com");
		try {
			obj.navDemo();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
