package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTests {

	@DataProvider(name = "data")
	public String[] dataProviderMethod() {
		return new String[] {"Apple","Ball","Cat"}  ;
	}
	//The test case will run 3 times with different set of values
	@Test(dataProvider = "data")
	public void sampleTest(String str) {
		System.out.println("This is the String from Data provider: "+str);
	}
	
}
