package InheritanceDemo;

public class TestClass3 extends TestClass2  {

	public static void main(String[] args) {
	
		method1();//method1 is Override 
		TestClass3 c3=new TestClass3();
		TestClass3.method1();
		System.out.println("a value is : "+c3.a);//multilevel inheritance
	}

}
