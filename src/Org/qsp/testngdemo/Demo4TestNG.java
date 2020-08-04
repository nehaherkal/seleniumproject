package Org.qsp.testngdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4TestNG {

	@Test            
	public void m1(){
		Reporter.log("Hiiiii...1",true);
		
	}
	
	@Test (enabled = false)  //not get printed as it is enabled false       
	public void m2(){
		Reporter.log("Hiiiii...2",true);
		
	}
	
	@Test 
	public void m3(){
		Reporter.log("Hiiiii...3",true);
		
	}
	
}
