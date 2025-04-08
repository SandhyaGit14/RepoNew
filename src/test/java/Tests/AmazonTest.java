package Tests;

import java.time.Duration;
import java.util.*;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		
		List<String> values = new ArrayList<String>();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class, 'LeftFooter')]//a"));
		
		for(WebElement l : list) {
			if(l.getText().startsWith("F")) {
				values.add(l.getText());
			}
		}
		
		for(String s: values) {
			System.out.println(s);
		}
		
		driver.close();
		driver.quit();

	}

}
