package genericutility;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility {
	
	public void maximize(WebDriver driver) {
		
		driver.manage().window().maximize();
	}

	public Dimension  getsize(WebDriver driver) {
		
	return driver.manage().window().getSize();
	
	}
	
	public void mousehover(WebDriver driver,WebElement element) {
		
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		
		}
	
public void draganddrop(WebDriver driver,WebElement element1,WebElement element2) {
		
		Actions a=new Actions(driver);
		a.dragAndDrop(element1, element2).perform();
}	
		
		public void clickandhold(WebDriver driver,WebElement element) {
			
			Actions a=new Actions(driver);
			a.clickAndHold(element).perform();
		
		}	
		
		
		public void SelectDropdown(WebElement element,int index) {
			
			Select s=new Select(element);
			s.selectByIndex(index);
			}
		
public void SelectDropdown(WebElement element,String value) {
			
			Select s=new Select(element);
			s.selectByValue(value);
}


public void SelectDropdown(String text,WebElement element) {
			
			Select s=new Select(element);
			s.selectByVisibleText(text);
}

public void SwitchtoFrame(WebDriver driver,int index) {
	
	driver.switchTo().frame(index);
}

public void SwitchtoFrame(WebDriver driver,String nameorID) {
	
	driver.switchTo().frame(nameorID);
}

public void SwitchtoFrame(WebDriver driver,WebElement element) {
	
	driver.switchTo().frame(element);
}

public void Switchbacktomainpage(WebDriver driver) {
	
	driver.switchTo().defaultContent();
}

public Alert switchtoAlert(WebDriver driver) {
	return driver.switchTo().alert();
}

public void getScreenshot(WebDriver driver) throws IOException {
	
	JavaUtility jutil=new JavaUtility();
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("./screenshots/"+jutil.getSystemTime()+".png");
	
	FileHandler.copy(temp, dest);
}

public void switchtowindow(WebDriver driver,String expurl  ) {
	
	Set<String> allwindowids = driver.getWindowHandles();
	for(String id:allwindowids) {
		driver.switchTo().window(id);
		if(driver.getCurrentUrl().contains(expurl)) {
			break;
		}
	}
}
}
