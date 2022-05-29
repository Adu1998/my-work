package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel {
  @Test
  
  public void chrome() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Aditi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://google.com/");
  }
  
  @Test
  public void firefox()
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aditi\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  
	  driver.get("https://google.com/");
  }
}
