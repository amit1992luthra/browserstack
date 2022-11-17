package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	WebDriver driver;
	@DataProvider(name = "datasets")
	public Object[][] testdataprovider2()
	{
		Object[][] data = new Object[1][6];
		data[0][0]="firstname";
		data[0][1]="last name";
		data[0][2]="Phone number";
		data[0][3]="Email";
		data[0][4]="last name";
		data[0][5]="last name";
		data[0][6]="last name";
		
		return data;
		

	}
	
	@BeforeMethod
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");	
		driver = new ChromeDriver();
		System.out.println("i am in Before Method");
	}
	
	@Test(dataProvider="datasets")
	public void testcase1(String fname, String lname,String phone, String Email, String a)
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(fname);
		driver.findElement(By.id("pass")).sendKeys(lname);
		//System.out.println(id);
	}

}
