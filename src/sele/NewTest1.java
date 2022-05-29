package sele;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test(description="performance test")
  public void f() {
	  System.out.println("performace test");
  }
  
  @Test(priority=2)
  public void f1() {
	  System.out.println("test");
  }
  
  @Test(priority=1)
  public void f2() {
	  System.out.println("test1");
  }
  
  @Test(priority=0)
  public void f3() {
	  System.out.println("test3");
  }
  
  @Test(priority=-2)
  public void f4() {
	  System.out.println("test4");
  }
}
