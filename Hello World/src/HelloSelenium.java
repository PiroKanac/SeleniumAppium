import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

	public class HelloSelenium {
		public static WebDriver driver;
	
		@Before
		public void setUp() throws MalformedURLException {
	         DesiredCapabilities capabilities = new DesiredCapabilities();
	         capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
	         capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

	         driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	        
		}
	    
		
	   @Test
	   public void OpenUrl() {
	        driver.get("https://google.com");


	        driver.findElement(By.name("q")).sendKeys("Hello Selenium!");
	        Actions enter = new Actions(driver);
	        enter.sendKeys(Keys.ENTER).perform();
	   }
	   @After
	   public void tearDown() {
	        driver.quit();

	}

}
