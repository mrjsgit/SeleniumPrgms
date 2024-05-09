package testscript3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class JavaScriptExecutorPrg  extends Base
{

	public void javaScriptExecutor()
	{
	driver.navigate().to("https://www.amazon.in/");	
	JavascriptExecutor executor = (JavascriptExecutor)driver;//builtin class
	//executor.executeScript("window.scrollBy(0,5000)","");
	//executor.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	WebElement searchbutton =driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	executor.executeScript("arguments[0].click();",searchbutton);
	searchbutton.click();
	}
	
	public static void main(String[] args) 
	{
		JavaScriptExecutorPrg javascriptexecutorprg = new JavaScriptExecutorPrg();
		javascriptexecutorprg.initializeBrowser();
		javascriptexecutorprg.javaScriptExecutor();
	}

}
