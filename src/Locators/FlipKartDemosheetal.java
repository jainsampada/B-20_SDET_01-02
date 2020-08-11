package Locators;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartDemosheetal {
//	WebDriver driver;
//	String path;
//	int size;
//	public void launch()
//	{
//		path = System.getProperty("user.dir")+"/Drivers/chromedriver.exe";
//		System.out.println(path);
//		System.setProperty("webdriver.chrome.driver", path);
//		driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/search?q=sanitizers&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
//		driver.manage().window().maximize();
//	}
//	public void locate_products()
//	{
//		ArrayList<WebElement> all_products = new ArrayList<WebElement>(driver.findElements(By.xpath(".//*[starts-with(@class, '_2cLu-l')]")));
//		size = all_products.size();
//		System.out.println(size);
//		for(int i=0;i<size;i++)
//		{
//			String s = all_products.get(i).getText().toString();
//			System.out.println(s);
//		}
//	}
//	public void browser_close()
//	{
//		driver.close();
//	}
//	public static void main(String[] args) {
//		FlipkartDemo obj = new FlipkartDemo();
//		obj.launch();
//		obj.locate_products();
//		obj.browser_close();
//	}



		public static void main(String[] args) throws InterruptedException {
			int size;
			// TODO Auto-generated method stub
			String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sanitizer");
			
			driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
			Thread.sleep(7000);
			//ArrayList<WebElement> all=new ArrayList<WebElement>(driver.findElements(By.xpath("//a[starts-with(@class, '_2cLu-l')]")));

			ArrayList<WebElement> all_products = new ArrayList<WebElement>(driver.findElements(By.xpath(".//*[starts-with(@class, '_2cLu-l')]")));
			size = all_products.size();
			System.out.println(size);
			for(int i=0;i<size;i++)
			{
				String s = all_products.get(i).getText().toString();
				System.out.println(s);
			}
			//Thread.sleep(5000);
		//	System.out.println(all_products.size());
//			for(int i=0;i<count.size();i++)
//			{
//			String countt=count.get(i).getText();
//			System.out.println(countt);
//			}
	}

}
