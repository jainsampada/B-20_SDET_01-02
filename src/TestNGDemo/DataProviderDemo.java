package TestNGDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@DataProvider(name="Logindata")
	public Object[][] demo()
	{
		Object[][] userdata=new Object[3][2];
		userdata[0][0]="admin";
		userdata[0][1]="ad";
		
		userdata[1][0]="admin";
		userdata[1][1]="a123";
		
		userdata[2][0]="Admin";
		userdata[2][1]="admin123";
		
		return userdata;
		
	}
	@Test(dataProvider="Logindata")
	public void Login(String uname,String pass)
	{
		System.out.println("Username is:"+uname);
		System.out.println("Password is:"+pass);
		
	}
	
}
