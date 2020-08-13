package Locators;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassDemo {
	String path;
	WebDriver driver;
public void check() {
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	//This is setproperty command
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	ArrayList<WebElement> arr=new ArrayList<WebElement>(driver.findElements(By.className("textInputContainer")));
	
	System.out.println(arr.size());
	for(int i=0;i<arr.size();i++)
	{
		System.out.println(arr.get(i).getText());
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDemo oo=new ClassDemo();
		oo.check();
	}

}
