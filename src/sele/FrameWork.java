package sele;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;



public class FrameWork {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///C:/Users/Aditi/html/from.html");
		
		String filepath="C:\\Users\\Aditi\\Documents\\data.xls";
	   	FileInputStream file=new FileInputStream(filepath);
	   	
	   	Workbook workbook=Workbook.getWorkbook(file);
	   	
	   	Sheet sheet=workbook.getSheet(0);
	   	
	   	int rowcount=sheet.getRows();
	   	
	   	for(int i=1;i<=rowcount;i++)
	   	{
	   		String firstName=sheet.getCell(0, i).getContents();
	   		String lastName=sheet.getCell(1, i).getContents();
	   		
	   		driver.findElement(By.name("fn")).clear();
	   		
	   		driver.findElement(By.name("fn")).sendKeys(firstName);
	   		
	   		driver.findElement(By.name("ln")).clear();
	   		driver.findElement(By.name("ln")).sendKeys(lastName);
	   		
	   		//driver.findElement(By.name("Submit")).click();
	   		
	   		System.out.println("Iteration "+i+" Completed Successfully!!");
	   		
	   		String actual_title=driver.getTitle();
	   	   		   	
	   		if(actual_title.equalsIgnoreCase("From"))
	   		{
	   			
	   			System.out.println("Test case is correct");
	   		}
	   		else
	   		{
	   			System.out.println("Test Case is incorrect");
	   		}
	   		Thread.sleep(2000);
	   		
	   		//driver.close();
	   	//	workbook.close();
	   		
	   				
	   		
	   		   		
	   			}
		

	}

}
