package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testClasses_tests {

	@Test
	public void assert1Test() {
		int a=10, b=20, c;
		c=a+b;
		Assert.assertEquals(c, Math.addExact(a, b));
	}
	
	@Test
	public void assert2Test() {
		int a=10, b=20, c;
		c=a*b;
		Assert.assertEquals(c, Math.multiplyExact(a, b));
	}
	
	
}
