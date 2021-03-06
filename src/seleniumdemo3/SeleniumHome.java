package seleniumdemo3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); //launching browser
	driver.manage().window().maximize(); //maximizing browser dont max browser 
	driver.get("https://www.selenium.dev/"); //loading url\
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement search= driver.findElement(By.name("search"));
	search.sendKeys("java",Keys.ENTER);
	driver.navigate().back();
	search.sendKeys("testNg",Keys.ENTER);
	
}
}
