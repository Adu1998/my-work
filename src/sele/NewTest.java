package sele;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	@BeforeTest
	public void bt() {
		System.out.println("before test");
	}
	
	@AfterSuite
	  public void as() {
			System.out.println("after suite");
		}
	  
	@AfterMethod
	public void am() {
		System.out.println("after method");
	}
	
	@AfterTest
	public void at() {
		System.out.println("after test");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("after class");
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("before class");
	}
	
  @Test
  public void f() {
	  System.out.println("welcome to testng");
  }
  
  
  @BeforeSuite
  public void bs() {
		System.out.println("before suite");
	}
  
  @BeforeMethod
  public void bm() {
		System.out.println("before method");
	}
  
  
  
}
