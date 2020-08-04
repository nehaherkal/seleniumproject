package seleniumdemo3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().window().maximize(); //maximizing browser
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth"); //loading url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
}