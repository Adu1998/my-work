package sele;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sub {
  @Test
  
  @Parameters({"v1","v2"})
  public void f(int c,int d) {
	  
	  int sub=c-d;
	  System.out.println("the substraction is: "+sub);
	  
  }
}
