package Misc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Job {
	public static String path;
	public static WebDriver driver;
	public void Launch_Driver()
	{
	path=System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	public void Login()
	{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	}
	public void Home_Page()
	{
	driver.findElement(By.className("firstLevelMenu")).click();
	driver.findElement(By.id("menu_admin_Job")).click();
	driver.findElement(By.linkText("Job Categories")).click();
	}
	public void Job_Add()
	{
	driver.findElement(By.name("btnAdd")).click();
	driver.findElement(By.id("btnCancel")).click();
	// driver.findElement(By.name("jobCategory[name]")).sendKeys("SDET");
	// driver.findElement(By.name("btnSave")).click();
	}
	public void Delete_Job()
	{
	driver.findElement(By.id("ohrmList_chkSelectAll")).click();
	//driver.findElement(By.id("ohrmList_chkSelectRecord_11")).click();
	driver.findElement(By.id("btnDelete")).click();
	//driver.findElement(By.className("btn")).click();
	//driver.findElement(By.className("btn reset")).click();//Not Working
	//driver.findElement(By.className("close")).click();//not working
	 //Alert al=driver.switchTo().alert();//Not Working
	 //al.dismiss();
	driver.findElement(By.xpath("//*[@id=\'deleteConfModal\']/div[3]/input[2]")).click();
	}
	public void Close_Browser()
	{
	driver.close();
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	OrangeHRM_Job oo=new OrangeHRM_Job();
	oo.Launch_Driver();
	oo.Login();
	oo.Home_Page();
	oo.Job_Add();
	oo.Delete_Job();
	oo.Close_Browser();
	}

}
