
package Tests;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class SeleniumWOLocators {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://ssolive.myclassboard.com/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3DZI2SYT2MTEQV9IU3YKGD%26redirect_uri%3Dhttps%253A%252F%252Farbor.myclassboard.com%252Fsso%252FCallback%26response_type%3Dcode%26scope%3Dopenid%2520profile%2520offline_access");
		driver.manage().window().maximize();
		
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebElement name = driver.findElement(By.xpath("//div//label[text()='Username']"));
		WebElement user = driver.findElement(RelativeLocator.with(By.tagName("input")).below(name));
		user.sendKeys("P_17AIS0161");
		Thread.sleep(3000);
		
		WebElement pwd = driver.findElement(By.xpath("//div//label[contains(text(),'Remember')]"));
		WebElement pass = driver.findElement(RelativeLocator.with(By.tagName("input")).above(pwd));
		pass.sendKeys("Dhruva5c");
		Thread.sleep(3000);
		  
		 driver.findElement(By.xpath("//div//button[contains(text(),'Login')]")).click();
		
		 Thread.sleep(3000);
		 
		 System.out.println(driver.getTitle());
		
		 
		driver.close();
		driver.quit();
	}

}
