package seldemos1;

import java.util.concurrent.TimeUnit;

//import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class COMPLEX {
	WebDriver driver;
	@Test
	public void testAboutUs() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		Actions act = new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span").
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]"))).
		moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Our\n" + 
				"												Offices')]"))).
		moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Bangalore')]"))).click().build().perform();
		
		
	}
	@BeforeTest
	  public void configureBrowser()
	  {
		driver = drivers.configureBrowser("chrome");
		//driver.manage().window().maximize();
	  }
	  
  @Test
  public void f() {
  }
}
