package adminLoginAndUsermanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  
  

public class Sample_Scelinium {
	public static void main(String[] args) {  
        
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\Folder2\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	// Launch website  
	    driver.get("http://www.google.com/");  
	          
	    // Click on the search text box and send value  
	    driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("javatpoint tutorials");  
	    driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys(Keys.RETURN); 
	    driver.quit();
	    // Click on the search button  
//	    driver.findElement(By.name("btnK")).click();  
	    
	   
	      
	    }  

}
