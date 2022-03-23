package selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Implicit_Explicit_PageLoad_FluentWait {

	WebDriver driver;
	String browser;
	

	@Test
	public void scenario1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avis\\OneDrive\\Desktop\\av\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Implicit wait implementation
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'How Search works')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);                //Explicit wait implementation
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div/div/div[2]/a")));
		driver.findElement((By.xpath("/html/body/div[2]/header/div/div/div[2]/a"))).click();
		Thread.sleep(2000);
		
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);                         //Fluent wait implementation
		wait1.withTimeout(5000, TimeUnit.MILLISECONDS);
		wait1.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait1.ignoring(NoSuchElementException.class);
		
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.MILLISECONDS);                  //PageLoad wait implementation
		driver.close();

	}
}