package com.syntax.class23;

public class WebDriverTest {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.open();

		WebDriver driver1 = new ChromeDriver();
		driver1.open();

		WebDriver driver2 = new InternetExplorerDriver();
		driver2.open();

	}
}
