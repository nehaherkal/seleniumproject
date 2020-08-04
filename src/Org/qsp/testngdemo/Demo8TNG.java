package Org.qsp.testngdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo8TNG {

	@Test(dependsOnMethods = "m2")      //m2 is method       
	public void m1(){
		Reporter.log("Hiiiii...1",true);
		
	}
	
	@Test (enabled = false)          
	public void m2(){
		Reporter.log("Hiiiii...2",true);
		
	}
	
	
	@Test()      //m2 is method       
	public void m3(){
		Reporter.log("Hiiiii...3",true);
		
	}
}
