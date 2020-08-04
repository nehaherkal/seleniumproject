package Org.qsp.testngdemo;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo10TNG {
	
	@Test      
	public void m1(){
		
		Reporter.log("Hiiiii...1",true);
	}
	
	@Test(dependsOnMethods = "m3")
	public void m2(){
		
		Reporter.log("Hiiii...2",true);
	}
	
	
	@Test     
	public void m3(){
	
		Reporter.log("Hiiiii...3",true);
	}
}
