package selenium1;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Gridexample {
public static final String USERNAME = "amitluthra_lKo647";
public static final String AUTOMATE_KEY = "fDLRUYzzZwg48qjCbjLU";
public static final String URL = "https://"+USERNAME+":"+AUTOMATE_KEY+"@hub-cloud.browserstack.com/wd/hub";
	
	@Test
	public void test1() throws MalformedURLException{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browser", "chrome");
		cap.setCapability("browser_version", "107.0");
		cap.setCapability("os", "Windows");
		cap.setCapability("os_version","10");
		cap.setCapability("resolution","1024x768");
		
		
		WebDriver driver = new RemoteWebDriver(new URL(URL),cap);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("amit");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.quit();
	}

}
