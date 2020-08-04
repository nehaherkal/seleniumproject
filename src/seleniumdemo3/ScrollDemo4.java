package seleniumdemo3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		//driver.manage().window().maximize(); //maximizing browser dont max browser 
		
		driver.get("https://www.flipkart.com/"); //loading url
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(10000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver; 
		//SCROLL FULL RIGHT
		js.executeScript("window.scrollTo(0,document.body.scrollWidth)");// scroll right 
		Thread.sleep(2000);
		//js.executeScript("window.scrollTo(0,-document.body.scrollWidth)");// scroll left bcoz negative
		
		
	}

}
