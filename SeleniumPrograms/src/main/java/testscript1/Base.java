package testscript1;

import java.time.Duration;

import org.openqa.selenium.WebDriver; //dependency added in pom
import org.openqa.selenium.chrome.ChromeDriver;

public class Base
{
	
    public WebDriver driver; //declaring the variable 'driver' globally
	
    //method1 To Load chrome Web Driver
    public void initializeBrowser()
	{
	driver = new ChromeDriver(); //to launch webdriver for chrome; variable 'driver' has the browser
	driver.get("https://selenium.qabible.in/"); //to launch the url 
	//driver.manage().window().maximize(); //to maximize the window
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));//implicit wait
	
	}
	
	
	public void driverQuitAndClose()
	{
		//driver.close();//to close the parent window only
		driver.quit();//to close all the associated open windows 
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Base base = new Base(); //base is the object variable
		base.initializeBrowser();
        base.driverQuitAndClose();
	}
		
}
