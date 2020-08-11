package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DimpleAss {
	String path;
	WebDriver driver;
	//WebDriverWait wait;//Explicit wait

	public void launch() throws InterruptedException {
	path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver = new ChromeDriver();
	//Implicit wait
	
	//another way Implicit wait
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	//wait=new WebDriverWait(driver,20);//Explicit wait
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("firstname")).sendKeys("Dimple");
	driver.findElement(By.name("lastname")).sendKeys("Sharma");
	driver.findElement(By.name("reg_email__")).sendKeys("9653255153");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Dimple123");
	Select slt = new Select(driver.findElement(By.id("day")));
	slt.selectByValue("27");
	Select sl = new Select(driver.findElement(By.id("month")));
	sl.selectByValue("4");
	Select s = new Select(driver.findElement(By.id("year")));
	s.selectByValue("1996");
	driver.findElement(By.id("u_0_7")).click();
	//Explicit wait
	// WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.name("websubmit")));
	// ele.click();
	//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/button[1]")).click();
	driver.findElement(By.cssSelector("button#u_0_12")).click();
	//Thread.sleep(9000);
	//System.out.println("Heel");
	driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	DimpleAss oo = new DimpleAss();
	oo.launch();

	}

}
