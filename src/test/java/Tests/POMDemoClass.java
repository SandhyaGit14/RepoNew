package Tests;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POMDemoClass {
	
	public WebDriver driver;
	
	public POMDemoClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="asd")
	WebElement ele1;
	
	public void getHeader() {
		String header = ele1.getText();
		
	}
	
	/*
	 * Wait<WebDriver> wait = new FluentWait<>(driver)
	 * .withTimeout(Duration.ofSeconds(40)) .pollingEvery(Duration.ofSeconds(3))
	 * .ignoring(TimeoutException.class);
	 */
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
	
	
	Wait<WebDriver> wait1 = new FluentWait<>(driver)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(10))
			.ignoring(TimeoutException.class);
	
	WebElement foo = wait1.until(new Function<WebDriver, WebElement>(){
		public WebElement apply(WebDriver driver) {
			return driver.findElement(By.xpath(""));
		}
	});
	
	
	
	
	
	

}
