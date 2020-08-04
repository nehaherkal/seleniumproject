package Org.qsp.TestPom;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Org.qsp.Pom.ActiTimeHome;

public class TestActiTimeHome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().window().maximize(); //maximizing browser dont max browser 
		driver.get("https://www.actitime.com"); //loading url\
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ActiTimeHome ah =new ActiTimeHome(driver);
		ah.sendUserName("admin");
		Thread.sleep(2000);
		
		ah.sendPassword("manager");
		Thread.sleep(2000);
		
		ah.clickLoginBtn();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		ah.clickLogoutBtn();
		
		
		/*TakesScreenshot ah=(TakesScreenshot) driver;
		File screenShot=ah.getScreenshotAs(OutputType.FILE); 
		
		File screenshotSave=new File("./ScreenShot/Demo.png");
		Files.copy(screenShot,screenshotSave);
		*/
		
		
		
		
}
}
