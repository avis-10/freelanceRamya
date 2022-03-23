package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window_switching {

	WebDriver driver;
	String browser;
	

	@Test
	public void Scenario() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avis\\OneDrive\\Desktop\\av\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("windowButton")).click();
        System.out.println("We switched to the new Window");
        Thread.sleep(3000);
		driver.quit();
	}
}
