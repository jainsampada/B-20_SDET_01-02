package Locators;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameDemo {
	String path;
	WebDriver driver;
public void checklinks()
{
	
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//Difference between findElement and FindElements
	ArrayList<WebElement> al=new ArrayList<WebElement>(driver.findElements(By.tagName("img")));
	System.out.println(al.size());
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i).getAttribute("src"));
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TagNameDemo oo=new TagNameDemo();
		oo.checklinks();
	}

}
