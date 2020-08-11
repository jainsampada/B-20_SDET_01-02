package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends Driver {
	
@Test(groups= {"Smoke"},enabled=false)
	//@Test
public void Login()
{
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
}
@Test(dependsOnMethods="Login",groups= {"Sanity"})
	//@Test()
public void Logout()
{
	driver.findElement(By.linkText("Welcome Admin")).click();
	driver.findElement(By.linkText("Logout")).click();
}
}
