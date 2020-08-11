package Locators;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {
	String path,text;
	WebDriver driver;
	
public void Launch()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("admin");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSSSelectorDemo oo=new CSSSelectorDemo();
		oo.Launch();

	}

}
