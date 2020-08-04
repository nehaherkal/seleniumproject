package Org.qsp.testngdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GoogleDemoTestNG {

	@Test
	public void M1(){
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().window().maximize(); //maximizing browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.Google.com/"); //loading url
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		driver.close();
		Reporter.log("M1",true);
		
	}
	
	@Test
	public void M2(){
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().window().maximize(); //maximizing browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.Google.com/"); //loading url
		driver.findElement(By.name("N")).sendKeys("qspider",Keys.ENTER);//here name is not N so test is failed
		driver.close();
		Reporter.log("M2",true);
		
	}
	
	
	
	
	
}
