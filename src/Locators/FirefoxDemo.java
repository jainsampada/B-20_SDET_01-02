package Locators;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {
	WebDriver driver;
	public void Launch()
	{
		//path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.gecko.driver", "C:\\Sel_Softwares\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDemo oo=new FirefoxDemo();
		oo.Launch();
		
	}

}
