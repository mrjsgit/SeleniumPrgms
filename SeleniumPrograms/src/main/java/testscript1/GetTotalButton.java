package testscript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetTotalButton extends Base
{

	public void getTotal()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement value1 = driver.findElement(By.id("value-a"));
		value1.sendKeys("10");
		WebElement value2 = driver.findElement(By.id("value-b"));
		value2.sendKeys("15");
		WebElement result = driver.findElement(By.id("button-two"));
        result.click();
		}
	
	
	
	
	public static void main(String[] args) 
	{
		GetTotalButton gettotalbutton = new GetTotalButton();
		gettotalbutton.initializeBrowser();
		gettotalbutton.getTotal();
	
	}

}
