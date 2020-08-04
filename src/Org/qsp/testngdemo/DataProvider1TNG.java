package Org.qsp.testngdemo;


import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1TNG {
	
	@DataProvider
	public String[][] getData(){             // getData is method
		String st [][] = new String [3] [3];
		st [0][0] ="Ankur";
		st [0][1] = "ankur123";
		st [0][2] = "ankur@gmail.com";
		
		st [1][0] ="Neha";
		st [1][1] = "neha123";
		st [1][2] = "neha@gmail.com";
		
		st [2][0] ="Akshay";
		st [2][1] = "akshay";
		st [2][2] = "akshay@gmail.com";
		
		return st;
	}
	
	@Test(dataProvider = "getData")            //manadatory to write getData here
	public void m1(String un, String pw, String email){
		Reporter.log(un + "  " + pw + " " +email , true);
	}

}

