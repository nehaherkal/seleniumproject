package seleniumdemo3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); //launching browser
	driver.manage().window().maximize(); //maximizing browser
	driver.get("https://www.selenium.dev/"); //loading url
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,1000)");// scroll down y axis

	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-500)");// scroll up y axis

	
	
}
	}
