package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BestPractices {

	WebDriver driver;
	String browser;
	

	@Test
	public void scenario1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avis\\OneDrive\\Desktop\\av\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.example.com/");
		driver.manage().window().maximize();
		
		//All elements used below are random elements used as examples
		//using basic xpaths
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//label[@id='message23']")).click();
		driver.findElement(By.xpath("//input[@value='RESET']")).click();
		driver.findElement(By.xpath("//*[@class='barone']")).click();
		
		//using contains
		driver.findElement(By.xpath("//*[contains(@name,'btn')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'text')]")).click();
		
		//using OR & AND
		driver.findElement(By.xpath("//*[@type='submit' or @name='btnReset']")).click();
		
		
		
	}
}