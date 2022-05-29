package sele;

import org.testng.annotations.Test;

public class Parameters {
  @Test
  @org.testng.annotations.Parameters({"v1","v2"})
  public void f(int a,int b) {
	  
	  int add=a+b;
	  System.out.println("the addition is: "+add);
  }
  
 /**@org.testng.annotations.Parameters({"v3","v4"})
  public void s(int k,int l) {
	   int mul=k*l;
		  System.out.println("the mul is: "+mul);

  }**/
}
