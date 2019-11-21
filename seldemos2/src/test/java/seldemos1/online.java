package seldemos1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class online {
	WebDriver driver;
	  @Test
	  public void login() {
		  driver.get("http://10.232.237.143:443//TestMeApp//fetchcat.htm");
		  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		  driver.findElement(By.id("userName")).sendKeys("dubey");
		  driver.findElement(By.id("firstName")).sendKeys("subham");
		  driver.findElement(By.id("lastName")).sendKeys("dubey1");
		  driver.findElement(By.id("password")).sendKeys("Khushboo123");
		  driver.findElement(By.name("confirmPassword")).sendKeys("Khushboo123");
		  driver.findElement(By.xpath("//input[@value='Female']")).click();
		  driver.findElement(By.id("emailAddress")).sendKeys("kumari@gmail.com");
		  driver.findElement(By.name("mobileNumber")).sendKeys("8892994795");
		  
		  
	  }
	  @AfterMethod
	  public void afterMethod() {
	  }

	  @BeforeTest
	  public void beforeTest() {
		  driver = drivers.configureBrowser("chrome");
			driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest() {
	  }

	}