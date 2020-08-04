package seleniumdemo3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleNext {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().window().maximize(); //maximizing browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.Google.com/"); //loading url
		
		
		driver.findElement(By.xpath("//input[@aria-autocomplete='both']")).sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scroll full down
		
		WebElement next=driver.findElement(By.xpath("//a[@id='pnnext']/descendant::span[contains(., 'Next')]"));//path of next
		while (next.isDisplayed()) {
			next.click();
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			next=driver.findElement(By.xpath("//a[@id='pnnext']/descendant::span[contains(., 'Next')]"));
			Thread.sleep(2000);
		}
		
	}
}
