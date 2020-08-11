package TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginParallelClass2 {
	String path;
	WebDriver driver;
	@Test
public void Login()
{
	path=System.getProperty("user.dir")+"//Driver//geckodriver.exe";
	System.setProperty("webdriver.gecko.driver", path);
	driver=new FirefoxDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
}
}
