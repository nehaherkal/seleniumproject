package Org.qsp.testngdemo;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2TestNG {
	
	
	@BeforeMethod
		public void BM(){
			Reporter.log("BM",true);
	}

	@Test(invocationCount = 3)             //to print Hiii in 3 times
	public void m1(){
		Reporter.log("Hiiiii...",true);
		
	}
	
	@AfterMethod
	public void AM(){
		Reporter.log("After method",true);
	}
	
	
}
