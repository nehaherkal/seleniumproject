package seleniumdemo3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollEle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("disable-extensions");
		WebDriver driver = new ChromeDriver(co); // launching browser
		driver.manage().window().maximize(); // maximizing browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/"); // loading url

		// SCROLL TILL ELEMENT
		WebElement ele = driver.findElement(By.xpath("//h2[contains(., 'News')]")); // SCROLLING
																					// TILL
																					// NEWS
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);// everytime
																// write
																// arguments[0]

	}
}