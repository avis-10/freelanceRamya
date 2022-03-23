package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	WebDriver driver;
	String browser;
	
	@Override
	public void onTestStart(ITestResult result){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avis\\OneDrive\\Desktop\\av\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.example.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("Random element")).click();
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avis\\OneDrive\\Desktop\\av\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.example.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("Random element")).click();
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avis\\OneDrive\\Desktop\\av\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.example.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("Random element")).click();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avis\\OneDrive\\Desktop\\av\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.example.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("Random element")).click();
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}