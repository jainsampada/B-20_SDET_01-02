package TestNGDemo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	@BeforeSuite
	public void Driver()
	{
		System.out.println("Driver Code");
	}
	
	@BeforeTest
	public void Bef_Test()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void After_Test()
	{
		System.out.println("After Test");
	}
	@BeforeClass
	public void bef_Class()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void Bef_Method()
	{
		System.out.println("before Method");
	}
	@AfterSuite
	public void Close_Browser()
	{
		System.out.println("Close Browser Code");
	}
	@AfterMethod
	public void Aft_Method()
	{
		
		System.out.println("After Method");
	}
	@AfterClass
	public void aft_Class()
	{
		System.out.println("After Class");
	}
	@Test(priority=0)
	public void Login()
	{
		System.out.println("Login Code");
	}
	@Test(priority=2)
	public void ForgetPassword()
	{
		System.out.println("Forget Password Code");
	}
	@Test(priority=1)
	public void Logout()
	{
		System.out.println("Logout Code");
	}

}
