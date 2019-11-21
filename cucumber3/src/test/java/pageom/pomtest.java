package pageom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import runner.PageClass;

public class pomtest {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kumari\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new  ChromeDriver();
	    PageClass pobj = new PageClass(driver);
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    pobj.clicklink();
	    String username=null;
	    pobj.typeuname(username);
	    String password=null;
	    pobj.typepassword(password);
	    pobj.clicklogin();
	    System.out.println("title of page is"+driver.getTitle());
	    
	}
	

}
