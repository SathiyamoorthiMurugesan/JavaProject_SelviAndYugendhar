package selenium_basics_windowhandle;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assignment1 {

	public static void main(String[] args) {
	// get all Windows titles
		
		ArrayList<String> sessionId=new ArrayList<String>();
		ArrayList<String> titleName=new ArrayList<String>();		
		System.setProperty("webdriver.chromedriver",".\\src\\test\\resources\\Folder2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/python-programming-examples/");
		String parentWindow=driver.getWindowHandle();
		System.out.println("parentWindow = "+parentWindow);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//strong[contains(text(),'Strings')]")).click();
		driver.findElement(By.xpath("//strong[contains(text(),'List')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Dictionary')]")).click();
		driver.findElement(By.xpath("//strong[contains(text(),'Tuple')]")).click();
		Set<String> allWindows =driver.getWindowHandles();
		for(String each:allWindows)
		{
			driver.switchTo().window(each);
			sessionId.add(each);
			titleName.add(driver.getTitle());
//			System.out.println("Session_Id: " + each +"    " +"Windows Title = " +driver.getTitle());	
		}
		
		
		
				
/*
 * Close all the windows except the window which has given title
		for(String eachHandle: allWindowHandles) {
			driver.switchTo().window(eachHandle);
//			if(driver.getTitle().contains("Window Handles")) {
			if(!driver.getTitle().contains("Basic Controls")) {
				driver.close();
			}
		}
 *    
 */
		


		
		
	}

}
