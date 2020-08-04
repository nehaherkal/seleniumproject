package Org.qsp.testngdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo7TNG {
	@Test(dependsOnMethods = {"m2", "m3"})      //m2 n m3 is method       
	public void m1(){
		Reporter.log("Hiiiii...1",true);
		
	}
	
	@Test ()          
	public void m2(){
		Reporter.log("Hiiiii...2",true);
		
	}
	
	
	@Test()         
	public void m3(){
		Reporter.log("Hiiiii...3",true);
		
	}
}
