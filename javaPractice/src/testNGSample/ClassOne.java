package testNGSample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassOne {
	
	@BeforeTest
	public void testModule() 
	{
		System.out.println("Excutes Before all tests related to testng.xml test modules");
	}
	
	@AfterTest
	public void testModule1() 
	{
		System.out.println("Excutes after all tests related to testng.xml test modules");
	}
	

	@Test
	public void testOne() 
	{
		System.out.println("I am in ClassOne method ");
	}
}
