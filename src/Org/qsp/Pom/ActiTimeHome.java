package Org.qsp.Pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHome {
	
	@FindBy(name="username")//name is arg
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement passWord ;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	@FindBy(id="logoutLink")
	private WebElement logoutBtn;
	
	
	public ActiTimeHome(WebDriver driver) { //creating construtor ri8 click-->source-->generate cons in Superclass
	PageFactory.initElements(driver, this); //this point to current obj
	}
	
	public void sendUserName(String text) {
		username.sendKeys(text);
		
	}
	
	public void sendPassword(String text) {
		passWord.sendKeys(text);
		
	}
	
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public void clickLogoutBtn() {
		logoutBtn.click();
	}

}
