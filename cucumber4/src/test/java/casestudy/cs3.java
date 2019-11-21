package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cs3 {
	WebDriver driver;
	@Given("TeatmeApp Login page is available")
	public void teatmeapp_Login_page_is_available() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Desktop\\kumari\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		    driver.findElement(By.linkText("SignIn")).click();
	}

	@When("Alex enter {string} and {string}")
	public void alex_enter_and(String string, String string2) {
		 driver.findElement(By.name("userName")).sendKeys("lalitha");
		 driver.findElement(By.name("password")).sendKeys("password123");
		 driver.findElement(By.name("Login")).click();
	    
	}

	@When("Alex srearch for headphone")
	public void alex_srearch_for_headphone() {
		
		driver.findElement(By.id("myInput")).sendKeys("head");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();

		//driver.findElement(By.xpath("//*[@id=\"swit\"]/div[2]/div/label/i")).click();
		
	
	}
	    

	@Then("User will be able to buy headphone")
	public void user_will_be_able_to_buy_headphone() {
		WebDriverWait w = new WebDriverWait(driver,20);
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'HDFC Bank')]")));
		driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
		driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		 driver.findElement(By.name("username")).sendKeys("123457");
		driver.findElement(By.name("password")).sendKeys("Pass@457");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		 driver.findElement(By.name("transpwd")).sendKeys("Trans@457");
		 driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		
	}
}
