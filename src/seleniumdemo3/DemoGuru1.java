package seleniumdemo3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  //AOTOIT PROGRAM

public class DemoGuru1 {
	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().window().maximize(); //maximizing browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/upload/"); //loading url 
		Thread.sleep(2000);
	
		
		 WebElement upload= driver.findElement(By.xpath("//div[@id='file_wraper0']"));//By.id("file_wraper0")//u cannot click on input tag so use div
		// WebElement upload= driver.findElement(By.id("file_wraper0"));
		 upload.click();
		 Runtime r= Runtime.getRuntime();//RT is clas and  getRT
		 r.exec("C:\\Users\\Kunal\\Desktop\\upload.exe");//first ri8 click do compile script on desktop and then give path of exe file here// exec is ns method of runtime
}			//exec is method

}
