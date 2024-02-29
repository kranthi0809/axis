package testNG.axis;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class softAssert {
@Test
	public void testsoftassert() throws InterruptedException{
		
		SoftAssert st = new SoftAssert();
		
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\jagadeshwar reddy\\Downloads\\manipal\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(500);
				
		driver.manage().window().maximize();
				
		String actualTitle = driver.getTitle();
		String expectedTitle = "Orange";
				
		st.assertEquals(actualTitle, expectedTitle);
				
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				
		//driver.close();
							
	}
}