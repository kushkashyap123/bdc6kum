package cucumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demowebshop1 {
	WebDriver driver = null;
	@Given("user will open the creditional")
	public void user_will_open_the_creditional() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kumari\\chromedriver_win32\\chromedriver.exe");
	    driver = new  ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    //driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();	
	    
	}

	@When("user click on login")
	public void user_click_on_login() {
		 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	   
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		driver.close();
		
	    
	}

	@Then("message displyaed login successfully")
	public void message_displyaed_login_successfully() {
		System.out.println("");
	   
	}

	

}
