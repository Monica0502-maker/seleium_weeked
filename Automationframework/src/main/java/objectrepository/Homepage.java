package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(linkText="Log out")
	private WebElement logoutlink;
	
	@FindBy(partialLinkText="Books")
	private WebElement Bookslink;
	
	@FindBy(partialLinkText="COMPUTERS")
	private WebElement Computerlink;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getBookslink() {
		return Bookslink;
	}

	public WebElement getComputerlink() {
		return Computerlink;
	}
	
	
	
	
	
	
}
