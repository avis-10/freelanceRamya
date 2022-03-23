package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpath_css {

	WebDriver driver;
	String browser;
	

	@Test
	public void scenario1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avis\\OneDrive\\Desktop\\av\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.epam.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/header/div/nav/ul/li[1]/span[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div/div/header/div/nav/ul/li[2]/span/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='header__logo']")).click();
		Thread.sleep(3000);
		driver.close();			
	}	
}
