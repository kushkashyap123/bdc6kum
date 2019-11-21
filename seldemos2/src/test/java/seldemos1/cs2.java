package seldemos1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class cs2 {
	WebDriver driver;

  @Test
  public void testcart()
  {
	 

  }
  @BeforeTest
  public void beforeTest() {
	  driver = drivers.configureBrowser("chrome");
	driver.manage().window().maximize();
}
}
