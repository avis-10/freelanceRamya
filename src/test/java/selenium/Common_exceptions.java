package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Common_exceptions {

	WebDriver driver;
	String browser;
	

	@Test
	public void scenario1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avis\\OneDrive\\Desktop\\av\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		try {
			driver.findElement(By.id("Random_xpath")).click();
		}
		catch (NoSuchElementException ex) 
		{	System.out.println("We caught NoSuchElementException ");	}
		
		try {
			driver.switchTo().window(driver.getWindowHandle());
		}
		catch (NoSuchWindowException ex) 
		{	System.out.println("We caught NoSuchWindowException ");	}
		
		try {
			driver.switchTo().frame("frame_11");
		}
		catch (NoSuchFrameException ex) 
		{	System.out.println("We caught NoSuchFrameException ");	}
		
		try {
			driver.switchTo().alert().accept();
		}
		catch (NoAlertPresentException ex) 
		{	System.out.println("We caught NoAlertPresentException ");	}
		
		try {
			driver.findElement(By.id("Random_xpath")).click();
		}
		catch (ElementNotVisibleException ex) 
		{	System.out.println("We caught ElementNotVisibleException ");	}
		
		try {
			Select dropdown = new Select(driver.findElement(By.id("swift")));
			System.out.println("dropdown elements are : "+dropdown);
		}
		catch (WebDriverException ex) 
		{	System.out.println("We caught WebDriverException ");	}
		
		driver.close();			
	}	
}
