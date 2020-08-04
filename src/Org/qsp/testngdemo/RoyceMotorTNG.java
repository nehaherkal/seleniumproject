package Org.qsp.testngdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class RoyceMotorTNG {
	WebDriver driver;//declaring globally
	
	@Test
	public void M1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().window().maximize(); //maximizing browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rolls-roycemotorcars.com/"); //loading url
		driver.findElement(By.xpath("//span[@class='rrmc-primary-nav-copy-open js-primary-nav-open']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@data-section='Models']")).click();
		
		//driver.findElement(By.xpath("//span[contains(., 'Models')]/parent::button[@type='button']")).click();
		//driver.findElement(By.xpath("//div[@class='js-menu-link rrmc-menu-link-anim']/preceding::span[contains(., 'Models')]")).click();
		//driver.findElement(By.xpath("//span[text()='Models']/ancestor::div[@data-section='Models']")).click();
		
		//driver.findElement(By.xpath("//button[@class='rrmc-cta rrmc-menu-link js-menu-section-link']")).click();
		
	
	}
}
