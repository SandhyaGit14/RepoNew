package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.*;

public class AnotherloginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		WebElement uLabel = driver.findElement(By.xpath("//label[contains(text(), 'Username')]"));
		WebElement user = driver.findElement(RelativeLocator.with(By.tagName("input")).below(uLabel));
		user.sendKeys("student");
		Thread.sleep(3000);
		
		WebElement pLabel = driver.findElement(By.xpath("//label[contains(text(), 'Password')]"));
		WebElement pwd = driver.findElement(RelativeLocator.with(By.tagName("input")).below(pLabel));
		pwd.sendKeys("Password123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		Thread.sleep(3000);
		 
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
