package Org.qsp.testngdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3TestNG {

	@Test(priority = 5)             
	public void m1(){
		Reporter.log("Hiiiii...1",true);
		
	}
	
	@Test (priority = 0)          //Default value of priority is 0
	public void m2(){
		Reporter.log("Hiiiii...2",true);
		
	}
	
	@Test(priority = -2)         //negative and Lower priority gets executed first
	public void m3(){
		Reporter.log("Hiiiii...3",true);
		
	}
}
