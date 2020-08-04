package seleniumdemo3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AmazScrollSshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		//driver.manage().window().maximize(); //maximizing browser dont max browser 
		driver.get("https://www.amazon.com/"); //loading url
		Thread.sleep(10000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver; 
		//SCROLL Full Down
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");// scroll full top to down
		Thread.sleep(2000);

		//TAKING SSHOT
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenShot=ts.getScreenshotAs(OutputType.FILE); 
	
		File screenshotSave=new File("./ScreenShot/Demo.png");
		Files.copy(screenShot,screenshotSave);
		
}
}