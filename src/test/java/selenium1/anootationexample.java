package selenium1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class anootationexample {
	
	@BeforeClass
	public void beforeclassexample()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterClass
	public void afterclassexample()
	{
		System.out.println("Example Class e");
	}
	
	@BeforeSuite
	public void beforesuiteexample()
	{
		System.out.println("Before suite example");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test example");
	}
	
	@Test
	public void testcase()
	{
		System.out.println("Inside testcase ");
	}
	@Test
	public void testcase2()
	{
		System.out.println("Inside testcase 2");
	}
	
	
	@AfterMethod
	public void aftermethodexample()
	{
		System.out.println("after method example");
	}
	

	@AfterSuite
	public void aftersuiteexample()
	{
		System.out.println("after suite example");
	}
	
	@AfterTest
	public void aftertestexample()
	{
		System.out.println("after test example");
	}
	
	

}
