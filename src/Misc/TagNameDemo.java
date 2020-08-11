package Misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameDemo {
	String path;
	WebDriver driver;

	public void checklinks() {
	// STEP 1
	path = System.getProperty("user.dir") + "//Driver//Chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);

	// STEP 2
	driver = new ChromeDriver();

	// STEP 3
	driver.get("https://opensource-demo.orangehrmlive.com/");

	// ArrayList<WebElement> al=new
	// ArrayList<WebElement>(driver.findElements(By.tagName("a")));
	// System.out.println(al.size());
	// for(int i=0;i<al.size();i++)
	{
	// Login to the orangehrm demo
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();

	// click on Admin linkText
	driver.findElement(By.linkText("Admin")).click();
	// click on Job linkText
	driver.findElement(By.linkText("Job")).click();
	// click on JobTitles linkText
	driver.findElement(By.linkText("Job Titles")).click();
	// click on Add Button
	driver.findElement(By.id("btnAdd")).click();
	// click on Cancel Button
	driver.findElement(By.id("btnCancel")).click();
	// Again click on Add Button
	driver.findElement(By.id("btnAdd")).click();
	// Entering details of job title
	driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Software Tester");
	// Entering details of jobDescription
	driver.findElement(By.id("jobTitle_jobDescription")).sendKeys(
	" System quality by identifying issues and common patterns, and developing standard operating procedures  improvement, making designing and implementing systems");
	// Add the file
	 WebElement UploadElement = driver.findElement(By.id("jobTitle_jobSpec"));
	 UploadElement.sendKeys("C:\\Users\\admin\\Desktop\\Tulips.jpg");
	 //driver.findElement(By.id("file")).click();
	// driver.findElement(By.name("jobTitle[jobSpec]")).click(); 

//	// Entering Note
//	driver.findElement(By.id("jobTitle_note")).sendKeys("Devlopers always giver our Best");
//	// Click on Save Button
//	driver.findElement(By.id("btnSave")).click();
//
//	// Tick
//	driver.findElement(By.id("ohrmList_chkSelectAll")).click();
//	// click randomly
//	driver.findElement(By.linkText("CEO")).click();
//	// Edit the existing information
//	driver.findElement(By.id("btnSave")).click();
//	driver.findElement(By.id("jobTitle_note")).clear();
//	driver.findElement(By.id("btnSave")).click();
	}
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	TagNameDemo o = new TagNameDemo();
	o.checklinks();
	}
}
