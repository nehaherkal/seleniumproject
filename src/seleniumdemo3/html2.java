package seleniumdemo3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class html2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait ww=new WebDriverWait(driver, 15);
		driver.get("file:///C:/Users/Kunal/Desktop/HTML/html2.html"); //loading url 
		WebElement ele=driver.findElement(By.xpath("//input[@name='textA']"));
		ele.sendKeys("What is your name");
		ww.until(ExpectedConditions.textToBePresentInElementValue(ele, "What is your name"));
	    driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("Ankur");
	    
	    
		
	
		
		
		
	}
}
