package testNG.axis;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
 
public class testNG {
	WebDriver driver;
	@Test
	public void configLogin()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("http://tutorialsninja.com/demo/");	
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("rutu5113@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}




