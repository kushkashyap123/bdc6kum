package seldemos1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
//import org.testng.Assert;
import org.testng.annotations.AfterTest;
public class sss {
	WebDriver driver;
	@BeforeTest
	  public void configureBrowser()
	  {
		 // System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kumari\\chromedriver_win32\\chromedriver.exe");
	      driver=  drivers.configureBrowser("chrome");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  }
	  
	  @Test
	  public void testLogin()
	  {
		  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		 /* driver.findElement(By.id("userName")).sendKeys("Lalitha");
		  driver.findElement(By.id("password")).sendKeys("password123");
		  driver.findElement(By.name("Login")).click();
		  Assert.assertEquals(driver.getTitle(),"Home");
		  driver.findElement(By.linkText("SignOut")).click();
		  
		  
		  //Assert.assertEquals(driver.getTitle(),"Home");*/
		  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password456");
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		 
		 driver.findElement(By.xpath("/html/body/main/div/div/div/div[4]/button")).click();
		 ///*driver.findElement(By.xpath("//input[@id='catgName']")).sendKeys("tv");
		// driver.findElement(By.xpath("//input[@id='catgDesc']")).sendKeys("hd tv");
		 //driver.findElement(By.xpath("//input[@type='submit']")).click();
		 //driver.findElement(By.xpath("//input[@type='reset']")).click();*/
		 Select catgDropDown = new Select(driver.findElement(By.id("categorydropid")));
				 catgDropDown.selectByVisibleText("Home Appliances");	
		 Select catgDropDown1 = new Select(driver.findElement(By.id("subcategorydropid")));
		
				 //catgDropDown.selectByVisibleText("");	
				 
		 catgDropDown1.selectByIndex(2);
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		// catgDropDown.selectByValue("11292");
	  }
	  
	@AfterTest
	  public void closeapp()
	 {
		 // driver.close();
	  }

}
