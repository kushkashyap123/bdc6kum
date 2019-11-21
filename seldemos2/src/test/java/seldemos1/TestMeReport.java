package seldemos1;
import static org.testng.AssertJUnit.assertTrue;

import java.io.File;
import java.io.IOException;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.annotations.BeforeTest;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;


@Test
public class TestMeReport {
WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;
  @BeforeTest
  public void beforeTest() {
 htmlReporter=
 new ExtentHtmlReporter(System.getProperty("user.dir")+"/extentreports/"+
 new SimpleDateFormat("hh-mm-ss-ms-dd-MM-yyyy").format(new Date())+".html");
 extent = new ExtentReports();
 extent.attachReporter(htmlReporter);
 htmlReporter.config().setDocumentTitle("TestMeReport");
 htmlReporter.config().setReportName("TestMe end to end test report");
 htmlReporter.config().setTheme(Theme.DARK);
 extent = new ExtentReports();
 extent.attachReporter(htmlReporter);
 extent.setSystemInfo("host name:", "TestMe Application");
 extent.setSystemInfo("Environment:", "selinium Automated testing");
 
 driver = drivers.configureBrowser("chrome");
	driver.manage().window().maximize();
	
  }
  @Test(priority=1)
  public void testRegistration() {
 logger=extent.createTest("testing the registration page");
 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
driver.findElement(By.id("userName")).sendKeys("Khushboo");
driver.findElement(By.id("firstName")).sendKeys("kumari");
driver.findElement(By.id("lastName")).sendKeys("Khushboo");
driver.findElement(By.id("password")).sendKeys("Khushboo123");
driver.findElement(By.name("confirmPassword")).sendKeys("Khushboo123");
driver.findElement(By.xpath("//input[@value='Female']")).click();
driver.findElement(By.id("emailAddress")).sendKeys("kumari@gmail.com");
driver.findElement(By.name("mobileNumber")).sendKeys("8892994795");

driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
Select drop1 = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
drop1.selectByIndex(7);
Select drop2 = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
drop2.selectByIndex(7);  
driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]/a")).click();
driver.findElement(By.name("address")).sendKeys("abcd");
Select drop3 = new Select(driver.findElement(By.id("securityQuestion")));
drop3.selectByIndex(2);
driver.findElement(By.id("answer")).sendKeys("blue");
driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
 Assert.assertTrue(true);
  }
  @Test(priority=2)
  public void logintest() {
	  logger=extent.createTest("testing the login page");
 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
 driver.findElement(By.id("userName")).sendKeys("Lalitha");
 driver.findElement(By.id("pass")).sendKeys("Password123");
 driver.findElement(By.name("Login")).click();
 Assert.assertTrue(true);
  }
  @Test(priority=3)
  public void addcat() {
	  logger=extent.createTest("testing the add to cart page");
 Actions act=new Actions(driver);
 WebElement search=driver.findElement(By.id("myInput"));
	act.sendKeys(search,"b").pause(1000).sendKeys("a").pause(1000).sendKeys("g").build().perform();
	act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
	driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();		
	driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
 Assert.assertTrue(true);
  }
  @Test(priority=4)
  public void payment() {
	  logger= extent.createTest("testing the payment page");

	WebDriverWait w = new WebDriverWait(driver,20);
	w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'HDFC Bank')]")));
	driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
	driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
	 driver.findElement(By.name("username")).sendKeys("123457");
	driver.findElement(By.name("password")).sendKeys("Pass@457");
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	 driver.findElement(By.name("transpwd")).sendKeys("Trans@457");
	 driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	Assert.assertTrue(true);
 //throw new SkipException("test payment is not yet ready");
  }
 

  @AfterMethod
  public void getResult(ITestResult result) throws IOException {
	  if(result.getStatus()==ITestResult.SUCCESS)
	  {
		  logger.log(Status.PASS,MarkupHelper.createLabel("test method passed:"+result.getName(),ExtentColor.GREEN));
	  }
	  else if(result.getStatus()==ITestResult.FAILURE)
	  {
		  logger.log(Status.FAIL,MarkupHelper.createLabel("test method failed:"+result.getName(),ExtentColor.RED));
	  }
	  else if(result.getStatus()==ITestResult.SKIP)
	  {
		  logger.log(Status.SKIP,MarkupHelper.createLabel("test method SKIP:"+result.getName(),ExtentColor.BLUE));
	  }
	  TakesScreenshot capture =(TakesScreenshot)driver;
	  File captureTofile = capture.getScreenshotAs(OutputType.FILE);
	 String imPath= System.getProperty("user.dir")+"/extentreports/snapshots/"+result.getName()+".png";
	 FileUtils.copyFile(captureTofile,new File(imPath));
	 logger.addScreenCaptureFromPath(imPath);
  }
  @AfterTest
  public void afterTest() {
	  extent.flush();
  }

}


