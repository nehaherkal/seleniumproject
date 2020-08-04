package Org.qsp.testngdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo6TNG {

	@Test(groups ="functional")            
	public void m1(){
		Reporter.log("Hiiiii...1",true);
		
	}
	
	@Test (groups ="integration", dependsOnGroups = "functional"  )      
	public void m2(){
		Reporter.log("Hiiiii...2",true);
		
	}
	
	@Test (groups ="functional")
	public void m3(){
		Reporter.log("Hiiiii...3",true);
		
	}
	
	@Test(groups ="integration", dependsOnGroups = "functional")            
	public void m4(){
		Reporter.log("Hiiiii...4",true);
		
	}
	
	@Test (groups ="functional")      
	public void m5(){
		Reporter.log("Hiiiii...5",true);
		
	}
	
	@Test (groups ="unit")      
	public void m6(){
		Reporter.log("Hiiiii...6",true);
		
	}
	
	
	
	
}// output--> hi 1 
//hi 3 
//hi 5 
//hi 2 
//hi 4
