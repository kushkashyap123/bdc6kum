package casestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cs1 {
	WebDriver driver ;
	@Given("Signup link is available")
	public void signup_link_is_available() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kumari\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");  
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("User enter username as kumari")
	public void user_enter_username_as_kumari() {
		driver.findElement(By.name("userName")).sendKeys("kumari1");
		
	  
	}

	@When("User enter firstname as ku and")
	public void user_enter_firstname_as_ku_and() {
		driver.findElement(By.name("firstName")).sendKeys("ku");
	}

	@When("User enter lastname as  khu")
	public void user_enter_lastname_as_khu() {
		driver.findElement(By.name("lastName")).sendKeys("khu");
	}

	@When("User enter password as kum@{int}")
	public void user_enter_password_as_kum(Integer int1) {
		driver.findElement(By.name("password")).sendKeys("kum@123");
	    
	}

	@When("user enter conform password as kum@{int}")
	public void user_enter_conform_password_as_kum(Integer int1) {
		driver.findElement(By.name("confirmPassword")).sendKeys("kum@123");
	   
	}

	@When("Select gender as Female")
	public void select_gender_as_Female() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]")).click();
		
	}

	@When("user enter email as kushkashyap{int}@gmail.com")
	public void user_enter_email_as_kushkashyap_gmail_com(Integer int1) {
		driver.findElement(By.name("emailAddress")).sendKeys("kush123@gmail.com");
	   
	}

	@When("enter mobile no as {string}")
public void enter_mobile_no_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("9934287464");
	}
	
	
	@When("enter dob as {string}")
	public void enter_dob_as(String string) {
		driver.findElement(By.name("dob")).sendKeys("11/23/2019");
	 
	}
	@When("address as {string}")
	public void address_as(String string) {
		driver.findElement(By.name("address")).sendKeys("mokama");
	}
	@When("enter selects {string} as security question")
	public void enter_selects_as_security_question(String string) {
		driver.findElement(By.name("securityQuestion")).sendKeys("What is your Pet Name?");
	   
	}

	@When("user enter {string} as answer")
	public void user_enter_as_answer(String string) {
		driver.findElement(By.name("answer")).sendKeys("dog");
	   
	}

	@When("User clicks on Register")
	public void user_clicks_on_Register() {
		
	   driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}
	@Then("TestMeApp login page open")
	public void testmeapp_home_page_open() {
		System.out.println("the page title is:"+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("login"));
	   
	}

}
