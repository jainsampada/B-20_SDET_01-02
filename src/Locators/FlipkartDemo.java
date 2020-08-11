package Locators;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDemo {
	WebDriver driver;
	String path;
	int size;
	public void launch()
	{
		path = System.getProperty("user.dir")+"/Driver/chromedriver.exe";
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=sanitizers&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		driver.manage().window().maximize();
		
	}
	public void locate_products()
	{
		ArrayList<WebElement> all_products = new ArrayList<WebElement>(driver.findElements(By.xpath(".//*[starts-with(@class, '_2cLu-l')]")));
		size = all_products.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			String s = all_products.get(i).getText().toString();
			System.out.println(s);
		}
	}
	public void browser_close()
	{
		driver.close();
	}
	public static void main(String[] args) {
		FlipkartDemo obj = new FlipkartDemo();
		obj.launch();
		obj.locate_products();
		obj.browser_close();
	}
}
