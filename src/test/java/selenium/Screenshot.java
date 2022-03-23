package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {

	WebDriver driver;
	String browser;
	
	@Test
	public void Scenario() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avis\\OneDrive\\Desktop\\av\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File img = scrShot.getScreenshotAs(OutputType.FILE);
		File finalImg = new File("any location on drive \\screenShot.png");
		FileUtils.copyFile(img, finalImg);
		Thread.sleep(3000);
		driver.close();
		
	}
}