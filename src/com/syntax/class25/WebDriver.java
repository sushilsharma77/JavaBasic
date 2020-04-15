package com.syntax.class25;
//Create a WebDriver Interface that will have the following unimplemented behaviour:
//openBrowser(), closeBrowser(), maximizeWindow(), findElement().
//Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
public interface WebDriver {
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}
class ChromeDriver implements WebDriver{

	
	public void openBrowser() {
		System.out.println("ChromeDriver opens chrome driver");
		
	}

	
	public void closeBrowser() {
		System.out.println("ChromeDriver closes chrome driver");
		
	}

	
	public void maximizeWindow() {
		System.out.println("chorome driver can maximize the window");
		
	}

	
	public void findElement() {
		System.out.println("chrome driver can find the elements");
		
	}
	
}
class FirefoxDriver implements WebDriver{

	
	public void openBrowser() {
		System.out.println("firefox web driver opens firefox browser");
		
	}

	
	public void closeBrowser() {
		System.out.println("firefox web driver closes firefox browser");
	}

	
	public void maximizeWindow() {
		System.out.println("firefox driver can maximize the window");
		
	}

	
	public void findElement() {
		System.out.println("firefox driver can find the elements");
		
	}
	
}
 
