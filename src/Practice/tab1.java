package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class tab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///E:/QE-index.html#");
	//	 List<WebElement> rows = driver.findElements(By.xpath("//*[@id='test-6-div']/div/table/tbody//tr"));
		//	System.out.println(rows.size());
			
//			List<WebElement> cols = driver.findElements(By.xpath("//*[@id='test-6-div']/div/table//tr[2]/td"));
//			System.out.println(cols.size());
			
			//Locate the webtable
			//WebElement reportTable = driver.findElement(By.xpath("//*[@id='pageContainer']/div/div[2]/table[2]")); 
		
		WebElement username = driver.findElement(By.id("inputEmail"));

		WebElement SignIn = driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]"));
		username.sendKeys("123");
		SignIn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;  
	    
	    //this will print the entire validity object shows which validity failed
	   Object abb =js.executeScript("return arguments[0].validity",username);
	   System.out.println(abb);
	    //shows true if no validity failed else false if any failed
	    System.out.println(js.executeScript("return arguments[0].validity.valid",username));
	    
	    //shows the validityErorMessage that would be shown
	    String abb1 = (String) js.executeScript("return arguments[0].validationMessage",username);
	    System.out.println(abb1);
		
	}

}
