package Org.qsp.Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHome {
	@FindBy(name="search")//name is arg
	private WebElement search;
	@FindBy(xpath="//img[@class='search-icon']")
	private WebElement searchBtn;


	public SeleniumHome(WebDriver driver) { //creating construtor ri8 click-->source-->generate cons in Superclass
	PageFactory.initElements(driver, this); //this point to current obj
	}

	public void sendText(String text) {
		search.sendKeys(text,Keys.ENTER);//img so we wrote keys.ENTER
	}
	
	public void clickSearchBtn() {
		searchBtn.click();
	}

}
