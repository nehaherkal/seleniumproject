package Org.qsp.testngdemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNg {
	
	@Test
	public void m1(){
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().window().maximize(); //maximizing browser dont max browser 
		driver.get("http://www.google.com"); //loading url\
		
		Reporter.log("HEYYY !", true);
	}
	@Test
	public void m2(){
		System.out.println("Hiiii");
	}
}
