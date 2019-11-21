package cucumber1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testmelogin {
	WebDriver driver =null;
	
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kumari\\chromedriver_win32\\chromedriver.exe");
	    driver = new  ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
	    
	}

	@When("user enter lalitha as username")
	public void user_enter_lalitha_as_username() {
		 driver.findElement(By.name("userName")).sendKeys("lalitha");
		    
		
	    
	}

	@When("user enters password{int}")
	public void user_enters_password(Integer int1) {
		 driver.findElement(By.name("password")).sendKeys("password123");
	 
	}

	@Then("user will find a testmeapp homepage")
	public void user_will_find_a_testmeapp_homepage() {
		 driver.findElement(By.name("Login")).click();
		 System.out.println("the page title is:"+driver.getTitle());
		 Assert.assertTrue(driver.getTitle().contains("Home"));
	  
	}
	

}
