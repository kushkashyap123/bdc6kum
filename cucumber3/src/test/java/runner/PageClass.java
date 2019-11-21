package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {
	WebDriver driver;
	By lnc = By.linkText("Log in");
	By uname = By.name("Email");
	By pass = By.name("Password");
	By lin = By.xpath("//input[@value='Log in']");
	public PageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clicklink()
	{
		driver.findElement(lnc).click();
	}
	public void typeuname(String username)
	{
		driver.findElement(uname).sendKeys("aravindkumarguggilla@gmail.com");
	}
	public void typepassword(String password)
	{
		driver.findElement(pass).sendKeys("Aravind@123");
	}
	
    public void clicklogin()
    {
    	
    		driver.findElement(lin).click();
    
    }
}
