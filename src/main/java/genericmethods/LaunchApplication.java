package genericmethods;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public  class LaunchApplication {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public  void launchApplication(String url,String app,int impwaittime) throws Exception
	{
		FileInputStream fis=new FileInputStream(".\\src\\main\\resources\\Folder2\\Project.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.setProperty(app, prop.getProperty(app));
		app.toLowerCase();
		if(app.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();	
		}
		else if (app.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();	
		}
		else if (app.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();	
			
		}
		else {
			System.out.println("Invalid");
			
		}		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(impwaittime));
		
			
		
	}
	
	//Find Elements
	
	public WebElement findElementByXpath(String xpath)
	{
		return driver.findElement(By.xpath(xpath)) ;
		
	}
	public WebElement findElementById(String id)
	{
		return driver.findElement(By.id(id)) ;
		
	}
	public WebElement findElementByClassName(String name)
	{
		return driver.findElement(By.className(name)) ;
		
	}
	public WebElement findElementByClassame(String name)
	{
		return driver.findElement(By.name(name));
		
	}
	
	//click
	public WebDriver findwindowsHandles()
	{
		ArrayList<String> sessionId=new ArrayList<String>();
		ArrayList<String> titleName=new ArrayList<String>();
		Set<String> allWindows =driver.getWindowHandles();
		for(String each:allWindows)
		{
			driver.switchTo().window(each);
			sessionId.add(each);
			titleName.add(driver.getTitle());
			System.out.println("Session_Id: " + each +"    " +"Windows Title = " +driver.getTitle());	
		}
		
		return null;
	
		
	}

}
