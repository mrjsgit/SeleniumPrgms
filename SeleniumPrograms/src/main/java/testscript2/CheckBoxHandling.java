package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class CheckBoxHandling extends Base

{

	public void checkbox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	WebElement chkbx = driver.findElement(By.xpath("//input[@id='gridCheck']"));	
	chkbx.click();
	System.out.println(chkbx.isSelected());
	
}
	
	
	
	public static void main(String[] args) 
	
	{
CheckBoxHandling checkbox = new CheckBoxHandling();
checkbox.initializeBrowser();
checkbox.checkbox();

	}

}
