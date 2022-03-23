package selenium;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutors {

	WebDriver driver;
	String browser;
	
	@Test
	public void Scenario() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avis\\OneDrive\\Desktop\\av\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(750);
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(750);
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(750);
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		driver.close();

	}
}