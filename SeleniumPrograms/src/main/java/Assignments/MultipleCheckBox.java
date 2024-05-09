// program to click the selectall button under multiple check box demo section of the pg
package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class MultipleCheckBox extends Base

{
	public void multipleSelection()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement chk = driver.findElement(By.xpath("//input[@id='button-two' and @type='button']"));
		chk.click();
	}
	

	public static void main(String[] args)
	{
		MultipleCheckBox multiplecheckbox = new MultipleCheckBox();
		multiplecheckbox.initializeBrowser();
		multiplecheckbox.multipleSelection();

	}

}
