package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class AlertHandling extends Base
{

public void alert1()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement alt1 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	alt1.click();
	driver.switchTo().alert().accept();
}
public void alert2()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement alt2 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	alt2.click();
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
}

public void alert3()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement alt3 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	alt3.click();
	driver.switchTo().alert().sendKeys("test");
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
}

	
public static void main(String[] args)
	{
AlertHandling alerthandling = new AlertHandling();
alerthandling.initializeBrowser();
alerthandling.alert1();
alerthandling.alert2();
alerthandling.alert3();
	}

}
