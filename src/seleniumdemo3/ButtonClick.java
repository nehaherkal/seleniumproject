package seleniumdemo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().window().maximize(); //maximizing browser
		driver.get("file:///C:/Users/Kunal/Desktop/HTML/ButtonClick.html"); //loading url //butn click
		
		WebElement button=driver.findElement(By.id("othrBtn"));
		WebDriverWait ww=new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		

}
}