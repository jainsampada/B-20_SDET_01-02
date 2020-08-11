package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDemo {
	String path,getheading;
	WebDriver driver;
public void forget_Pass()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("http://203.134.202.19/hrm/login.php");
	driver.findElement(By.linkText("Forgot your password?")).click();
	getheading=driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]")).getText();
	if(getheading.equals("Forgot Your Password?"))
	{
		System.out.println("you are on correctpage");
	}
	else
	{
		System.out.println("Forget password page not opened");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkDemo oo=new LinkDemo();
	oo.forget_Pass();
	}

}
