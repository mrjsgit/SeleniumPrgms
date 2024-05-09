package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class JavascriptPrg extends Base
{
	
	public void webPagescroll()
	{
		driver.navigate().to("https://www.firstcry.com/");	
		JavascriptExecutor exec = (JavascriptExecutor)driver;//builtin class
		WebElement searchbutton =driver.findElement(By.xpath("//span[@class='search-button']"));
		exec.executeScript("arguments[0].click();",searchbutton);
		searchbutton.click();	
	}

	public static void main(String[] args)
	{
		JavascriptPrg javascriptprg= new JavascriptPrg();
		javascriptprg.initializeBrowser();
		javascriptprg.webPagescroll();
	}

}
