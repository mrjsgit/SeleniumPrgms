package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript1.Base;

public class HandlingDropDown extends Base
{
	public void dropDown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown =driver.findElement(By.xpath("//select[@class='form-control'and @id='single-input-field']"));
       //syntax:   Select select = new Select(WebElement);

		Select select = new Select(dropdown);
		select.selectByVisibleText("Red"); //first method: select by visible text
		select.selectByIndex(3);
		select.selectByValue("Yellow");
	}

	public static void main(String[] args)
	{

		HandlingDropDown handlingdropdown = new HandlingDropDown();
		handlingdropdown.initializeBrowser();
		handlingdropdown.dropDown();
		//handlingdropdown.driverQuitAndClose();
	}

}
