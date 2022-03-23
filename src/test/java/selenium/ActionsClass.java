package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass {

	WebDriver driver;
	String browser;
	
	@Test
	public void Scenario() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avis\\OneDrive\\Desktop\\av\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions ac = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
		ac.moveToElement(ele).build().perform();
		System.out.println("We performed Actions by moving mouse to flag");
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
		System.out.println("We performed Actions by moving mouse from flag to Account & lists");
		Thread.sleep(2000);
		
		driver.close();
	}
}