package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts_messageBox_Frames {

	WebDriver driver;
	String browser;
	

	@Test
	public void AlertMessages() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avis\\OneDrive\\Desktop\\av\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
        driver.findElement(By.name("cusid")).sendKeys("12345");	
        Thread.sleep(2000);
        driver.findElement(By.name("submit")).submit();			
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
		alert.accept();
		Thread.sleep(3000);
		System.out.println("We accepted the Alert !");
		driver.close();
	}
	
	@Test
	public void Frames() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avis\\OneDrive\\Desktop\\av\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(2000);
		WebElement iframeElement = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframeElement);
		System.out.println("Switched to a different frame !");
		Thread.sleep(3000);
		driver.quit();
	}
}