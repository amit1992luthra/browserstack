package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class seleniumpratice {
	
	WebDriver driver;

	@Test(groups = {"smoke"})
	public void login() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("amit");
		driver.findElement(By.id("pass")).sendKeys("password");
		Thread.sleep(3000);
		System.out.println("part of Smoke group");
		Thread.sleep(5000);
	}
	
	@Test(groups = {"regression"})
	public void testcase1() throws InterruptedException
	{
		System.out.println("in Regression group");
		Thread.sleep(5000);
	}
	
	@Test(groups = {"regression"})
	public void testcase2() throws InterruptedException
	{
		System.out.println("in Regression group test case 2");
		Thread.sleep(5000);
	}
	
	@Test()
	public void testcase3() throws InterruptedException
	{
		System.out.println("part of both smoke and regression");
		Thread.sleep(5000);
	
	}
	
	
	
	
	@BeforeMethod(alwaysRun = true)
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");	
		driver = new ChromeDriver();
		System.out.println("i am in Before Method");
	}
	
	@AfterMethod(alwaysRun = true)
	public void aftermethod()
	{
		driver.quit();	
		System.out.println("i am in After Method" );
	}
	
	
	
	

}
