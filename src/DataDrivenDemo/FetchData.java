package DataDrivenDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchData {
	String path,username,pass;
	HSSFRow row;
	String message;
	WebDriver driver;
public void fetch() throws IOException
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	path=System.getProperty("user.dir")+"//Utilities//LoginData.xls";
	//Step - 1 Given path of Excel Workbook
	FileInputStream fis=new FileInputStream(path);
	
	//Step -2 MOve to Workbook
	HSSFWorkbook wb=new HSSFWorkbook(fis);
	
	//Step -3 Open the specific sheet
	HSSFSheet sheet=wb.getSheet("LoginSheet");
	//To count no of rows having data in excel sheet
	System.out.println(sheet.getLastRowNum());
	for(int i=1;i<=sheet.getLastRowNum();i++)
	{
		username=sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println("Username is:"+username);
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		
		pass=sheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println("Passwords are:"+pass);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
		
		
		//To write data into excel sheet
		FileOutputStream os=new FileOutputStream(path);//To write data in a file
		message="Data Imported Successfully";
		sheet.getRow(i).createCell(2).setCellValue(message);
		wb.write(os);
		os.close();
	}
//	//Step -4 fetch data from row
//	HSSFRow row=sheet.getRow(3);
//	
//	//Step -5 Fetch data from cell 1 of row 1
//	HSSFCell cell =row.getCell(0);
//	username=cell.getStringCellValue();
//	System.out.println("Username is:"+username);
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FetchData oo=new FetchData();
		oo.fetch();
	}

}
