package homePractice;

public class WebDriverTest {

	public static void main(String[] args) {
		
	   WebDriver fi=new FireFoxWebDriver();
		fi.open();
		
		
		WebDriver ch=new ChromeWebDriver();
		ch.open();
		
		WebDriver ie=new IEWebDriver();
		ie.open();
		
		FireFoxWebDriver fi1=new FireFoxWebDriver();
		fi1.access();

	}

}
