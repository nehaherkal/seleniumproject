package seleniumdemo3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		//driver.manage().window().maximize(); //maximizing browser dont max browser 
		driver.get("https://www.flipkart.com/"); //loading url
		Thread.sleep(10000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(800,0)");// scroll ri8

		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-300,0)");// scroll left
		
		
	}
}
