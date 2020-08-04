package seleniumdemo3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		//driver.manage().window().maximize(); //maximizing browser dont max browser 
		driver.get("https://www.flipkart.com/"); //loading url
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(10000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver; 
		//SCROLL Full Down
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");// scroll full top to down
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");// scroll full down to top
		
		
	}

}
