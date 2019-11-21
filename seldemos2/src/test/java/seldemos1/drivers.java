package seldemos1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class drivers {
	 static WebDriver driver;
	public static WebDriver configureBrowser(String browserName) {
		if(browserName.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kumari\\chromedriver_win32\\chromedriver.exe");
		      driver=  new ChromeDriver();
		      return driver;
		}
		else if(browserName.equals("explore"))
		{
			 System.setProperty("webdriver.ie.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kumari\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		      driver=  new InternetExplorerDriver();
		      return driver;
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kumari\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=  new FirefoxDriver();
			return driver;
		}
		return null;
	}

}
