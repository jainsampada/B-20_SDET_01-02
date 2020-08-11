package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
	String path,text;
	WebDriver driver;
public void Launch()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//driver.findElement(By.xpath("//input[@id='txtUsername' and @name='txtUsername']")).sendKeys("admin");
	//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
//	driver.findElement(By.xpath("//input[contains(@type,'sub')]")).submit();
//	driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?') and @href='/index.php/auth/requestPasswordResetCode\']")).click();
//	text=driver.findElement(By.xpath("//div[@id='logInPanelHeading']")).getText();
//	System.out.println(text);
	//Starts with Function
	//driver.findElement(By.xpath("//input[starts-with(text(),'Forgot')]")).click();
	//driver.findElement(By.xpath("//input[@id='txtUsername' and @name='txtUsername']")).sendKeys("admin");
	//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	//driver.findElement(By.xpath("//input[starts-with(@type,'sub')]")).submit();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XPathDemo oo=new XPathDemo();
		oo.Launch();
	}

}
