package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest2 {
  
	@Test(timeOut=20000)
  public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demoqa.com/");
		
		String title=driver.getTitle();
		
		int len=title.length();
		 System.out.println("the title is: "+title);
		 System.out.println("the lenght is: "+len);
		
  }
}
