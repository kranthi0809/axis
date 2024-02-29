package testNG.axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelTesting {	
	@Test 
	public void invokeChrome() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jagadeshwar reddy\\Downloads\\manipal\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(1000);
		
	}
}