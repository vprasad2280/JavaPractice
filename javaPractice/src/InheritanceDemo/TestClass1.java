package InheritanceDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass1 {
      int a=10;
	 @BeforeClass
      static  void method1() {
		System.out.println("I am in method 1");
	}
	
}
