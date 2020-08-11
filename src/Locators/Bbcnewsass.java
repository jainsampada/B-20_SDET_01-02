package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bbcnewsass {
//This is main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		
		List<WebElement> head=driver.findElements(By.cssSelector("a.media__link" ));
		for(int i=0;i<head.size();i++)
		{
		//String Line=head.get(i).getAttribute("href");
		// System.out.println(Line);
		String Linee=head.get(i).getText();
		System.out.println(Linee);
		}


		}
	}

