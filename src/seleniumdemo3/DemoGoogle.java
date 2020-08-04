package seleniumdemo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGoogle {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().window().maximize(); //maximizing browser
		driver.get("https://www.Google.com/"); //loading url
		WebElement search=driver.findElement(By.name("q"));
		System.out.println(search.isDisplayed());//op at bottom
		System.out.println(search.isEnabled());//op at bottom
	}

}
