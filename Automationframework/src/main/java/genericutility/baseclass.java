package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.Homepage;
import objectrepository.Loginpage;
import objectrepository.welcomePage;

public class baseclass {
	
	public JavaUtility jutil=new JavaUtility();
	public WebdriverUtility wtil=new WebdriverUtility();
	public FileUtility Ftil=new FileUtility();
   public ExcelUtility Etil=new ExcelUtility();;
	
	public static ExtentReports ereport;
	public static WebDriver driver;
	public static ExtentTest test;
	
	@BeforeSuite
	
	public void reportconfig() {
		
		ExtentSparkReporter spark=new  ExtentSparkReporter("'/HTML_reports/ExtentReport_"+jutil.getSystemTime()+".html");
		ereport=new ExtentReports();
		ereport.attachReporter(spark);
	}

	@BeforeClass
	
	public void openBrowser() throws IOException {
	driver=new ChromeDriver();
	wtil.maximize(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(Ftil.getDatafromproperty("url"));
	}
	
	
	@AfterClass
	
	public void closeBrowser() {
		driver.quit();
	}
	
	@BeforeMethod
	
	public void login() throws IOException {
		welcomePage wp=new welcomePage(driver);
		wp.getLoginlink();
		
		Loginpage lp=new Loginpage(driver);
		lp.getEmailtextfeild().sendKeys(Ftil.getDatafromproperty("email"));
		lp.getPasswordtextfeild().sendKeys(Ftil.getDatafromproperty("password"));
		lp.getLoginlink().click();
		
		}
	
	@AfterMethod
	
	public void logout() {
		Homepage hp=new Homepage(driver);
		hp.getLogoutlink();
		}
	
	@AfterSuite
	public void reportBackup() {
		ereport.flush();
	}
}
