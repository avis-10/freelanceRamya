package TestNG_Inheritance;

import org.testng.annotations.Test;

public class inheritance_ChildClass extends inheritance_ParentClass{
	
	@Test
	public void childTestNgMethod()
	{
		System.out.println("TestNG method from Child Class");
	}
}
