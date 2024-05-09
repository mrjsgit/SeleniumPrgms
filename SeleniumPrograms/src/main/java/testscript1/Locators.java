package testscript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators  extends Base

{
	public void locatorid()
	{
		/*   WebElement elementname =driver.findElements(By.locator("locatorvalue"));
       html:  <button type="button" class="btn btn-primary" id="button-one">Show Message</button>  */

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
        //<div class="header-top">
      
        WebElement formsubmit	= driver.findElement(By.className("input-group-text"));
        WebElement frmsubmitchkbox	= driver.findElement(By.className("form-check-input"));
        WebElement chkbxdemosingle	= driver.findElement(By.className("form-check-input"));



	}
	
	public void locatorName()
	{
        WebElement nameviewport	= driver.findElement(By.name("viewport"));
        //<meta name="viewport" content="width=device-width, initial-scale=1.0">
        WebElement metaname2	= driver.findElement(By.name("description"));
        WebElement metaname3	= driver.findElement(By.name("author"));

	}
	
	
	public void locatorLinkText()
	{
		
		//   <div class="card-header">Single Input Field </div>      (black colour field in the dom)
        WebElement simpleformtext	= driver.findElement(By.linkText("Simple Form Demo"));
        WebElement checkboxtext	= driver.findElement(By.linkText("Checkbox Demo"));
        WebElement selectinputtext	= driver.findElement(By.linkText("Select Input"));

	}
	
	public void partialLinkText()
	{
		//   <div class="card-header">Single Input Field </div>      (partial txt in the black colour field in the dom)

        WebElement simpleformdemo	= driver.findElement(By.partialLinkText("Simple Form"));
        WebElement checkbox	= driver.findElement(By.partialLinkText("Checkbox"));
        WebElement radiobuttons	= driver.findElement(By.partialLinkText("Radio Buttons "));
        WebElement ajaxform	= driver.findElement(By.partialLinkText("Ajax Form"));

	}

	
	
	
	public static void main(String[] args)
	{
		Locators locators = new Locators();
		locators.initializeBrowser();
		locators.locatorid();
		locators.locatorClassName();
		locators.driverQuitAndClose();
	}

}
