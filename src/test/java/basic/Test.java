package basic;

public class Test extends BaseTest{

	public void m1() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void main(String[] args) {
		Test  obj = new Test();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.m1();
	}

}
