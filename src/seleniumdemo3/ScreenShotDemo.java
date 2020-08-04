package seleniumdemo3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotDemo {
	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().window().maximize(); //maximizing browser
		driver.get("https://www.Google.com/"); //loading url
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenShot=ts.getScreenshotAs(OutputType.FILE); 
	
		File screenshotSave=new File("./ScreenShot/Demo.png");
		Files.copy(screenShot,screenshotSave);
		

}
}
