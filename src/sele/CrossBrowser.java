package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
  @Test
  @Parameters("browser")
  public void cb(String browser) 
  {
	  if(browser.equalsIgnoreCase("chrome"))
			  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  
		  driver.get("https://google.com/");
			  }
	  
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\Aditi\\\\Downloads\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  
		  driver.get("https://google.com/");
	  }
	  
	  else
	  {
		  System.out.println("pls try again!!");
	  }
  }
}
