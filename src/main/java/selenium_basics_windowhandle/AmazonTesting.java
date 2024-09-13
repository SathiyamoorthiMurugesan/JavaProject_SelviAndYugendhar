package selenium_basics_windowhandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTesting {
	static LaunchApplication a =new LaunchApplication();

	public static void main(String[] args) throws Exception {
		
		String app="firefox";
		int time=10;
		String url="https://www.geeksforgeeks.org/python-programming-examples/";
		a.launchApplication(url, app, time);
		a.findElementByXpath("//strong[contains(text(),'Strings')]").click();
		a.findElementByXpath("//strong[contains(text(),'List')]").click();
//		LaunchApplication.driver.quit();
		a.findwindowsHandles();
		Thread.sleep(5000);
		a.switchToWindow(a.getSessionId("Python Programs - Python Programming Example"));
		
		
		
		
	
		
		
		

	}

}
