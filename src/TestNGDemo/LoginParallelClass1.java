package TestNGDemo;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginParallelClass1 {
	String path;
	WebDriver driver;
@Test
public void Logindata()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
}
}
