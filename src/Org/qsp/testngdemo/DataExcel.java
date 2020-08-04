package Org.qsp.testngdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataExcel {
	@Test(dataProviderClass =  ReadData.class, dataProvider = "getData")
	public void m1(String un, String pwd){
		Reporter.log(un + " " + pwd, true);
	}
	
}
