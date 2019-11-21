package org.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import seldemos1.drivers;
import seldemos1.morecomTest;

public class NewTest {
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() {
		  driver = drivers.configureBrowser("chrome");
			driver.manage().window().maximize();
	  }

	
  @Test(dataProvider="inputCredentials")
  public void testLogin(String uname,String pwd)
  {
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  driver.findElement(By.id("userName")).sendKeys(uname);
	  driver.findElement(By.id("password")).sendKeys(pwd);
	  driver.findElement(By.name("Login")).click();
	  
	  
  }
  @DataProvider
  public Object[][] inputCredentials() throws IOException{
  Object[][] data =morecomTest.readData();
  return data;
  		
  
}
}
