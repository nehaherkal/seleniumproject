package seleniumdemo3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().window().maximize(); //maximizing browser
		driver.get("https://demo.actitime.com/login.do"); //loading url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("admin");//using id not xpath
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER); //without using login
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
		driver.findElement(By.xpath("//a[contains(., 'About your actiTIME')]")).click();
		System.out.println(driver.findElement(By.xpath("//td[@class='aboutCopyright']")).getText());
		
		driver.findElement(By.id("aboutPopupCloseButtonId")).click();
		//driver.findElement(By.xpath("//div[@id='aboutPopupCloseButtonId']")).click();
		driver.findElement(By.xpath("//td[@class='close-button']")).click();
		
	}
}
