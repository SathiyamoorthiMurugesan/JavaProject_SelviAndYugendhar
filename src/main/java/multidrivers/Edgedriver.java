package multidrivers;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Edgedriver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub     
		
		System.setProperty("Webdriver.Edge",".\\src\\main\\resources\\Folder2\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Vivo T3");
		search.sendKeys(Keys.RETURN);
		Thread.sleep(2500);
//		driver.quit();
		Actions actions= new Actions(driver);
		
//		actions.scrollByAmount(1000, 1000).perform();
		WebElement Secondresult=driver.findElement(By.xpath("//span[text()='Vivo T3 Lite 5G Smartphone (Vibrant Green, 4GB Ram 128GB Storage)']"));
		
		actions.scrollToElement(Secondresult).perform();
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CAPS_LOCK);
		
		
		
		
		
		

	}

}
