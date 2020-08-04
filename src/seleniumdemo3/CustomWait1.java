package seleniumdemo3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait1 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().window().maximize(); //maximizing browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Kunal/Desktop/HTML/ButtonClick.html"); //loading url //buttonclick
		
		new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
			@Override 
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.id("otherBtn")).isEnabled();
			}
			
		} );
		driver.findElement(By.id("otherBtn")).click();
}
}
