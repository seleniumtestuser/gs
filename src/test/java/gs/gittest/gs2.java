package gs.gittest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class gs2 {
	public WebDriver driver;

	@BeforeClass
	public void atbefore() {
		
	}
	
	@Test
	public void attest() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Karthikeyan\\Desktop\\eclipse-java-2019-06-R-win32-x86_64\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
	
	}
	
}
