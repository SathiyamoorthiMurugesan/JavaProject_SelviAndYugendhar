package selenium_basics_windowhandle;

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
	static ArrayList<String> sessionId=new ArrayList<String>();
	static ArrayList<String> titleName=new ArrayList<String>();
	static String parentWindow ="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void launchApplication(String url,String app,int impwaittime) throws Exception
	{
		FileInputStream fis=new FileInputStream(".\\src\\main\\resources\\Folder2\\Project.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.setProperty(app, prop.getProperty(app));
		if(app.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if (app.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if (app.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else {
			System.out.println("Invalid");
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(impwaittime));
		
		parentWindow=driver.getWindowHandle();
		
		
			
		
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
	
	//
	public void findwindowsHandles()
	{
		
		Set<String> allWindows =driver.getWindowHandles();
		for(String each:allWindows)
		{
			driver.switchTo().window(each);
			sessionId.add(each);
			titleName.add(driver.getTitle());
//			System.out.println("Session_Id: " + each +"    " +"Windows Title = " +driver.getTitle());	
		}
		driver.switchTo().window(parentWindow);
	
		
	}
	public void switchTo(String SessionId)
	{
		driver.switchTo().window(SessionId);
	}
	
	public String getSessionId(String pageTitle)
	{
		String sessionid1="";
		for(int i=0;i<titleName.size();i++)
		{
			if(titleName.contains(pageTitle))
			{
				sessionid1=sessionId.get(i);
				
			}
			
		}
		
		
		return sessionid1;
		
	}
	public void switchToWindow(String Sessionid2)
	{
		driver.switchTo().window(Sessionid2);
	}
	

}
