package seleniumdemo3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Acti4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().window().maximize(); //maximizing browser
		driver.get("https://demo.actitime.com/login.do"); //loading url
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("admin");//using id not xpath
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER); //without using login
		
		WebElement logout=driver.findElement(By.id("logoutLink"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.titleContains("Enter"));//1st way
		
		//wait.until(ExpectedConditions.visibilityOf(logout));2nd way
		//wait.until(ExpectedConditions.elementToBeClickable(logout));//3rd way
		
		
		System.out.println("login done");
		logout.click();
		}
}