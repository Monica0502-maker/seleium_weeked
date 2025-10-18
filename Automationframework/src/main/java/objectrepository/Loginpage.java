package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(id="Email")
	private WebElement emailtextfeild;
	
	@FindBy(id="Password")
	private WebElement Passwordtextfeild;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginlink;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailtextfeild() {
		return emailtextfeild;
	}

	public WebElement getPasswordtextfeild() {
		return Passwordtextfeild;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}
	
	
	
	
	
}
