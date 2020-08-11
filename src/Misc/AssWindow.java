package Misc;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssWindow {
	String path;
	WebDriver driver;
	String  istid,secondid;
	//WebDriverWait wait;//Explicit Wait
	public void launch() throws InterruptedException 
	{
		path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		 driver = new ChromeDriver();
		// wait=new WebDriverWait(driver, 10);//Explicit Wait
		// driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);//Implicit wait
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//Implicit Wait
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		//WebElement ele= wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Open New Seperate Windows")));//Explicit Wait
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		
		//ele.click();
		driver.findElement(By.className("btn-primary")).click();
		 Set<String> all=driver.getWindowHandles();
         Iterator<String> it=all.iterator();
        istid=it.next();
         System.out.println("First window Id is:"+istid);

         secondid=it.next();
		System.out.println("Second window Id is:"+secondid);
         driver.switchTo().window(secondid);
         Thread.sleep(2000);
         System.out.println(driver.getTitle());
         Actions act=new Actions(driver);
         
         act.moveToElement(driver.findElement(By.linkText("Documentation"))).build().perform();
         
         //driver.close();
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AssWindow obb=new AssWindow();
		obb.launch();

}
}
