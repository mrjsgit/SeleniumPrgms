package testscript2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class HandlingMultipleWindow extends Base

{
	public void multipleWindow()
	{
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement popup = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/obsqurazone/']"));
		popup.click();
		String parentwindow =driver.getWindowHandle(); //to get parent window handle
		Set<String> child = driver.getWindowHandles(); // both parent and child
		Iterator<String> li = child.iterator();
		while(li.hasNext())
		{
			String childwindow = li.next();
			if(!parentwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
			//	WebElement login = driver.findElement(By.xpath("//div[@class='x1c436fg']//child::div[@role='button']"));
				WebElement login = driver.findElement(By.xpath("//div[@class='x1c436fg']/div[contains(@class,'x1n2onr6')]"));
                login.click();
				
			}
		}
		
	}

	public static void main(String[] args) 
	{
		HandlingMultipleWindow handlingmultiplewindow = new HandlingMultipleWindow();
		handlingmultiplewindow.initializeBrowser();
		handlingmultiplewindow.multipleWindow();
	}

}
