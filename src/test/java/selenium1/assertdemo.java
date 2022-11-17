package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class assertdemo {
	WebDriver driver;
	@Test
	public void login() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("amit");
		driver.findElement(By.id("pass")).sendKeys("password");
		Thread.sleep(3000);
		SoftAssert softAssertion= new SoftAssert();
		String expected = "amit";
		String actual = "preeti";
		
		softAssertion.assertEquals(actual, expected);
		if(expected.equals(actual))
		{
			System.out.println("actual message is same");
		}
		else
		{
			System.out.println("actual message is different");
		}
		softAssertion.assertEquals(actual, expected);
		//Assert.assertTrue(actual.contains(s));
		//SoftAssert softAssertion= new SoftAssert();
		softAssertion.assertEquals(actual, expected);
		//when the assert will fail still it will execute the further lines in the test
		
		System.out.println("after asserton ");
		//softAssertion.assertAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@BeforeMethod
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");	
		driver = new ChromeDriver();
		System.out.println("i am in Before Method");
	}
	
	

}
