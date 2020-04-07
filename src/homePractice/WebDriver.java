package homePractice;

public class WebDriver {
	void open(){
		System.out.println("opeaning the browser");
	}
}
class FireFoxWebDriver extends WebDriver{
	void open(){
		System.out.println("opeaning the firefox browser");
	}
	void access() {
		super.open();
	}
}
class ChromeWebDriver extends WebDriver{
	void open(){
		System.out.println("opeaning the chrome browser");
	}
}
class IEWebDriver extends WebDriver{
	void open(){
		System.out.println("opeaning the Internet Explorer browser");
	}
}
