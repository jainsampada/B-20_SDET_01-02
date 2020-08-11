package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsDemo {
	String path;
	WebDriver driver;
	
public void Launch()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//input[contains(@id,'u_0')]")).click();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainsDemo oo=new ContainsDemo();
		oo.Launch();
	}

}
