package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tableWith2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(arry(2,2));
		
		
	}
	
	
	
	public static String arry(int a,int b) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("file:///E:/QE-index.html#");
				int rowCount = driver.findElements(By.xpath("//*[@id='test-6-div']/div/table/tbody//tr")).size();  //Get number of rows
				System.out.println("Number of rows : " +rowCount); 
				 int columnCount = driver.findElements(By.xpath("//*[@id='test-6-div']/div/table//tr[2]/td")).size();  //Get number of columns
				 System.out.println("Number of columns : " +columnCount);
					

				String[][] reportMatrix = new String[rowCount][columnCount];    
					                              
				for(int i=0;i<=rowCount-1;i++)  
					{
					    for(int j=0;j<=columnCount-1;j++)    
					    {
					        String text = driver.findElement(By.xpath("//*[@id='test-6-div']/div/table//tr["+(i+1)+"]/td["+(j+1)+"]")).getText();  

					      System.out.print(text+" ");

					      reportMatrix[i][j] = text;  
					       
					    }
					 System.out.println();
					}
				return reportMatrix [a][b];
				}
	
	
	

	}


