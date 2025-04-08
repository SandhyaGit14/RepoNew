package Tests;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class TestExamples {
	
	private static WebDriver driver;
	
	public static void main(String args[]) {
		/*
		 * System.out.println("Jai Ganesh");
		 * 
		 * Wait<WebDriver> fluent = new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofSeconds(10)) .pollingEvery(Duration.ofSeconds(5))
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * WebElement foo=fluent.until(new Function<WebDriver, WebElement>() {
public WebElement applyy(WebDriver driver) {
return driver.findElement(By.id("foo"));
}
});
		 * 
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		 * driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(5));
		 * 
		 * driver.switchTo().newWindow(WindowType.TAB);
		 */
		
		 int i,m=0,flag=0;      
		  int n=7;//it is the number to be checked    
		  m=n/2;   // quotient   
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      //2<=3
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
	}

}
