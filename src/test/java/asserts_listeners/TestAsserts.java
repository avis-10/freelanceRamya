package asserts_listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAsserts {

	@Test
	public void test1() {
		int a=10, b=20, c;
		c=a+b;
		Assert.assertEquals(c, Math.addExact(a, b));
	}
	
	@Test
	public void test2() {
		int a=10, b=20, c=25;
		Assert.assertEquals(c, Math.addExact(a, b));
	}
}
