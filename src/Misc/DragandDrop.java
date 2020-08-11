package Misc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragandDrop {
	String path;
	WebDriver driver;

	public void Launch() throws InterruptedException
	{
		path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
		// System.out.println(path);

		// Setting the path of ChromeDriver
		System.setProperty("webdriver.chrome.driver", path);
		// Initialize Chrome Driver
		driver = new ChromeDriver();
		// Launch application
		driver.get("https://jqueryui.com/droppable/");
		//Switching to the frame of Web Page
		driver.switchTo().frame(0);
		Actions act=new Actions(driver);
//		act.clickAndHold(driver.findElement(By.id("draggable")))
//		.moveToElement(driver.findElement(By.id("droppable"))).release()
//		.build().perform();
		Thread.sleep(5000);
		act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")))
		.release().build().perform();
		//Select slt=new Select(driver.findElement(""))
			//	slt.selectByValue(2);
		
		}
	public static void main(String[] args) 	throws InterruptedException {
		// TODO Auto-generated method stub
		DragandDrop oo=new DragandDrop();
		oo.Launch();
	}

}
