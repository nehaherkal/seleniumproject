package seleniumdemo3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co); //launching browser//constructor overloading
		driver.manage().window().maximize(); //maximizing browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/"); //loading url
		
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("indore");;
		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("Poona");
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		
		
		for (int i=0; i<12; i++) 
		{
			driver.findElement(By.xpath("//td[@class='next']")).click();
			Thread.sleep(2000);
			WebElement Month2= driver.findElement(By.xpath("//td[@class='monthTitle']"));
			String Month3=Month2.getText();
			System.out.println(Month3);
			if ("Nov 2020"==Month3)
			{
				driver.findElement(By.xpath("//td[@class='curent day']")).click();
				break;
			}
		}
}
}