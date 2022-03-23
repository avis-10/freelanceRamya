package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Forms_TextBox_Radio_CheckBox {

	WebDriver driver;
	String browser;
	

	@Test
	public void scenario1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avis\\OneDrive\\Desktop\\av\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Ramya Tatta");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ramya.tatta@gmail.com");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(3000);
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		driver.findElement(By.id("vfb-7-1")).click(); Thread.sleep(500);
		driver.findElement(By.id("vfb-7-2")).click(); Thread.sleep(500);
		driver.findElement(By.id("vfb-7-3")).click(); Thread.sleep(500);
		Thread.sleep(2000);
		driver.findElement(By.id("vfb-6-0")).click(); Thread.sleep(500);
		driver.findElement(By.id("vfb-6-1")).click(); Thread.sleep(500);
		driver.findElement(By.id("vfb-6-2")).click(); Thread.sleep(500);
		Thread.sleep(3000);
		driver.close();
	}
}

