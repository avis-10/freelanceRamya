package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Groups_Priorities_Parameterized_Tests {

	@Test(groups = { "group1", "group2" })
	public void test_method1() {
		System.out.println("This is Test method under group1 and group2");
	}

	@Test(groups = { "group2" })
	public void test_method2() {
		System.out.println("This is Test method under group2");
	}

	@Test(groups = { "group1" })
	public void test_method3() {
		System.out.println("This is Test method under group1");
	}
	
	@Test(priority=2)
	public void priority_method2() {
		System.out.println("This is Test method with priority 2");
	}
	
	@Test(priority=1)
	public void priority_method1() {
		System.out.println("This is Test method with priority 1, This will be executed first and then priority 2 method will be executed.");
	}
	
	@Parameters("Hello World")
	@Test
	public void parameterizedTest(@Optional("OptionalParameter")String str) {
		System.out.println("This is Test method with parameters used in it.");
		System.out.println("Parameter given in this method is : " + str);
	}
	
}
