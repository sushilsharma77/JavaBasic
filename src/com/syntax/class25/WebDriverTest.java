package com.syntax.class25;

public class WebDriverTest {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.openBrowser();
		cd.closeBrowser();
		cd.maximizeWindow();
		cd.findElement();
		System.out.println("--------same result-------------");
		WebDriver web=new ChromeDriver();
		web.openBrowser();
		web.closeBrowser();
		web.maximizeWindow();
		web.findElement();
		
		WebDriver fire=new FirefoxDriver();
		fire.openBrowser();
		fire.closeBrowser();
		fire.maximizeWindow();
		fire.findElement();

	}

}
