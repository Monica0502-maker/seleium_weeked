package books;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.ListenerUtility;
import genericutility.baseclass;
import objectrepository.Homepage;


@Listeners(ListenerUtility.class)
public class TC_DWS_001_TEST extends baseclass {
	
	@Test
	
	public void clickonBooks() {
		
		
		Homepage hp=new Homepage(driver);
		hp.getBookslink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop.books","Book page is not displayed");
		test.log(Status.PASS, "Book page is displayed");
		
	}
	

	
}
