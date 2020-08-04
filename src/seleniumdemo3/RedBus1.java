package seleniumdemo3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus1 {
	public static void main(String[] args) {
		System.getProperty("webdriver.chromedriver", "\\Software\\chromedriver");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co); //launching browser//constructor overloading
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https\\www.redbus.in");
		
		
		
	}
		

}
