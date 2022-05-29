package sele;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {
 
	 @DataProvider(name="inputs")
  public Object[][] dataProvider1()
  {
		 
	return new Object[][] {{5,4}};
  }
	 @DataProvider(name="fr")
	 public Object[][] dataProvider()
	 {
		return new Object[][] {{"welcome"}};
		 
	 }
	 
	 @Test(dataProvider="inputs")
	 public void add(int a, int b)
	 {
		 System.out.println("the addition is: "+(a+b));
	 }
	 
	 @Test(dataProvider="fr")
	 public void display(String val)
	 {
		 System.out.println(val);
	 }
	 
	 @Test(dataProvider="inputs")
	 public void sub(int a, int b)
	 {
		 System.out.println("the subtraction is: "+(a-b));
	 }
}
