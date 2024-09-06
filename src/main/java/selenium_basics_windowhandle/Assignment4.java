package selenium_basics_windowhandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// Close rest of the window which  does not  have the given title/name
		System.setProperty("WebDriver.ChromeDriver",".\\src\\test\\resources\\Folder2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/python-programming-examples/");
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent Window = "+parentWindow);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//strong[contains(text(),'Strings')]")).click();
		driver.findElement(By.xpath("//strong[contains(text(),'List')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Dictionary')]")).click();
		driver.findElement(By.xpath("//strong[contains(text(),'Tuple')]")).click();
		Set <String> allWindow=driver.getWindowHandles();
		
		for (String a:allWindow)
		{
			driver.switchTo().window(a);
			if(!driver.getTitle().contains("Python Tuples - GeeksforGeeks"))
			{
				System.out.println("Closed the Window Session ID= "+a+" "+" Window Title = "+driver.getTitle() );
				driver.close();
				
			}
		}
		
	}

}
