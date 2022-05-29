package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asser {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://google.com/");
		
		String actual_title=driver.getTitle();
		System.out.println("the actual is "+actual_title);
		
		String expected_title="Google";
		
		Assert.assertEquals(actual_title, expected_title);
		System.out.println("successfull!");
  }
}
