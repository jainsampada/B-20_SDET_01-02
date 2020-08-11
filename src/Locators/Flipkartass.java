package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.manage().window().maximize();
		List<WebElement> first=driver.findElements(By.className("iUmrbN"));
		List<WebElement> second=driver.findElements(By.className("BXlZdc"));
		first.addAll(second);
		List<WebElement> third=driver.findElements(By.className("_3o3r66"));
		first.addAll(third);
		for(int i=0;i<first.size();i++)
		{
		System.out.println(first.get(i).getText());
		}
		driver.quit();
		}

	}


