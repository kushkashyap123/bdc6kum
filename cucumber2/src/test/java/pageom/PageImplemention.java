package pageom;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class PageImplemention {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kumari\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("http://demowebshop.tricentis.com/");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  PageClass1 localelements = PageFactory.initElements(driver, PageClass1.class);
  localelements.loginMethod("aravindkumarguggilla@gmail.com","Aravind@123");
  }
}
