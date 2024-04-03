package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators  extends Base

{
	public void locatorid()
	{
		//WebElement elementname =driver.findElements(By.locator("locatorvalue"));
         WebElement showmessagebutton	= driver.findElement(By.id("button-one"));
         WebElement entermsgfield	= driver.findElement(By.id("single-input-field"));
         WebElement entervaluea	= driver.findElement(By.id("value-a"));
         
         WebElement gettotalbutton	= driver.findElement(By.id("button-two"));
         WebElement abtotalmsg	= driver.findElement(By.id("message-two"));
         WebElement inputselectedcolour	= driver.findElement(By.id("message-one"));





	}
	
	public void locatorClassName()
	{
        WebElement headertopname	= driver.findElement(By.className("header-top"));
        
        WebElement formsubmit	= driver.findElement(By.className("input-group-text"));
        WebElement frmsubmitchkbox	= driver.findElement(By.className("form-check-input"));
        WebElement chkbxdemosingle	= driver.findElement(By.className("form-check-input"));



	}
	
	public static void main(String[] args)
	{
		
	}

}
