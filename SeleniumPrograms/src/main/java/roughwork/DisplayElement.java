package roughwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class DisplayElement extends Base
{

	public void displayValue()
	{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");	
	WebElement value1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[2]"));
    System.out.println(value1.getText());
	}
	
	public void displayAColumn()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");	
		List<WebElement> value2 = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement txt: value2)
		{
			System.out.println(txt.getText());
		}
		
	}
	
	public static void main(String[] args) 
	{
		DisplayElement displayelement = new DisplayElement();
		displayelement.initializeBrowser();
		displayelement.displayValue();
		System.out.println("***************************************");
		displayelement.displayAColumn();
	}

}
