package testNGSample1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassFive {
	
	@BeforeTest
	public void testModule() 
	{
		System.out.println("Excutes before  all tests related to testng.xml test modules");
	}
	
	@AfterTest
	public void testModule1() 
	{
		System.out.println("Excutes after all tests related to testng.xml test modules");
	}
	
	
	@Test
	public void testFive() 
	{
		System.out.println("I am in ClassFive method ");
	}

}
