package Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.internal.AbstractParallelWorker.Arguments;

public class IndexText {

	 static String tabledata ;
	 WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///E:/QE-index.html#");
//		List<WebElement> l =driver.findElements(By.xpath("//li[contains(@class,'list-group-item')]"));
//		System.out.println(l.size());
//		
//		String l2 = l.get(1).getText();
		 WebElement child = driver.findElement(By.xpath("//li[contains(@class,'list-group-item')][2]/span")); 
//		      l2 = l2.replaceFirst(child.getText(), "");
//		    
//		System.out.println(l2);
//		String l3 = driver.findElement(By.xpath("//li[contains(@class,'list-group-item')][2]/span")).getText();
//		System.out.println(l3);
//		
//		geNodeText(l.get(1));
		
//		 WebElement en = driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[1]"));
//		JavascriptExecutor jse  = (JavascriptExecutor)driver;
//		boolean s = en.isEnabled();
//		System.out.println(s);
////		document.querySelector("#test-4-div > button.btn.btn-lg.btn-secondary")
////		//*[@id="test-4-div"]/button[2]
		    //*[@id="test-6-div"]/div/table
		 tabledata(driver);
		     
			
	}
	public static String[] tabledata(WebDriver driver) {
	    
		
		 List<WebElement> rows = driver.findElements(By.xpath("//*[@id='test-6-div']/div/table/tbody//tr"));
			System.out.println(rows.size());
			
			List<WebElement> cols = driver.findElements(By.xpath("//*[@id='test-6-div']/div/table//tr[2]/td"));
			System.out.println(cols.size());
			
			for(int i=1;i<=rows.size();i++) {
				
				for(int j=1;j<=cols.size();j++) {
					
				tabledata = driver.findElement(By.xpath("//*[@id='test-6-div']/div/table/tbody//tr["+i+"]/td["+j+"]")).getText()+"    ";
					System.out.print(tabledata);
				}
				System.out.println();
				
			}
			String[] tab = tabledata.split(" ");
			System.out.println(tab);
			return tab;
			
//			 String[][] t= new String[tab.length][tab.length];
//			 for(int i=0;i<tab.length;i++) {
//				 
//				 
//			 }
	}
}
