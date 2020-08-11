package TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	String path;
	WebDriver driver;
	SoftAssert ast=new SoftAssert();//SoftAssertion class
	@Test
public void Login()
{
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 //Assert.assertEquals(driver.getTitle(), "OrangeHRM");//Hard Assertion
		 ast.assertEquals(driver.getTitle(), "Orange");
		 System.out.println("You land on correct Home Page");
		 ast.assertAll();
}
}
