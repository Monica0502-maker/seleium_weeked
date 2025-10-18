package computers;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.baseclass;
import objectrepository.Homepage;

public class TC_DWS_002_Test extends baseclass {
	
@Test
	
	public void clickoncomputers() {
	
	
	Homepage hp=new Homepage(driver);
	hp.getComputerlink().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop.computers","computer page is not displayed");
	test.log(Status.PASS, "computer page is displayed");
	
		
		
	}

}
