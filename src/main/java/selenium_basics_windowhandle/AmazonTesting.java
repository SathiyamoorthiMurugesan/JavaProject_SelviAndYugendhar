package selenium_basics_windowhandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTesting {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome",".\\src\\main\\resources\\Folder2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Vivo T3");
		search.sendKeys(Keys.RETURN);
		
		

	}

}
