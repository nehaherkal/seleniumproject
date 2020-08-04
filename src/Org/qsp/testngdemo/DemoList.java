package Org.qsp.testngdemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListDemo.class)//Write ListDemo program name here // RUN ListDemo
public class DemoList {
	@Test
	public void m1(){
		Reporter.log("Hiii...1", true);// name=m1 status=SUCCESS method=DemoList.m1()
	}
	
	@Test
	public void m2(){					
		Reporter.log("Hiii...2", true);//get printed bcoz it is written befor assert
		Assert.fail(); // name=m2 status=FAILURE method=DemoList.m2()
		Reporter.log("Hiii....3", true);
	}
}
