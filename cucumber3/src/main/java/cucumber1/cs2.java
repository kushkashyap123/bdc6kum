package cucumber1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cs2 {
	WebDriver driver;
	
	@Given("Login page is available")
	public void login_page_is_available() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Desktop\\kumari\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		    driver.findElement(By.linkText("SignIn")).click();
		      
	}
@When("User enter  {string} and  {string}")
public void user_enter_and(String string, String string2) {
	 driver.findElement(By.name("userName")).sendKeys("lalitha");
	 driver.findElement(By.name("password")).sendKeys("password123");
   
}

@When("User click on login button")
public void user_click_on_login_button() {
	 driver.findElement(By.name("Login")).click();
   
}

@Then("TestMeApp Homepage is open")
public void testmeapp_Homepage_is_open() {
	 System.out.println("the page title is:"+driver.getTitle());
	 Assert.assertTrue(driver.getTitle().contains("Home"));
}
}


