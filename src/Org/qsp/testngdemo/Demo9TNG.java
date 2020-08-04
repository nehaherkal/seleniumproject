package Org.qsp.testngdemo;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Demo9TNG {

	
	@Test(dependsOnMethods = "m2")      //m2 is method       
	public void m1(){
		Reporter.log("Hiiiii...1",true);//m1 gets skipped
	}
	
	@Test       
	public void m2(){
		Reporter.log("hiiii...2",true);//gets printed bcoz it is present before assert
		Assert.fail();
		
		Reporter.log("abcdefg",true);//not get printed  bcoz of assert fail
	}
	
	
	@Test     
	public void m3(){
		Reporter.log("Hiiiii...3",true);
	}
}
