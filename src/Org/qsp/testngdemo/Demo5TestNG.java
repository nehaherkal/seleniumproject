package Org.qsp.testngdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5TestNG {

	@Test(priority = 2)            
	public void m1(){
		Reporter.log("Hiiiii...1",true);
		
	}
	
	@Test (priority = 0, invocationCount = 3)  //not get printed as it is enabled false       
	public void m2(){
		Reporter.log("Hiiiii...2",true);
		
	}
	
	@Test (priority = -5)
	public void m3(){
		Reporter.log("Hiiiii...3",true);
		
	}
}
