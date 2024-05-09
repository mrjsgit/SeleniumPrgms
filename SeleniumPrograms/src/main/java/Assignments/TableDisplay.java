package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class TableDisplay extends Base

{
public void lastRow()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement rowdisplay = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[10]"));
    System.out.println(rowdisplay.getText());
}
	
public void column5Display()
              {
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	List<WebElement> rowdisplay = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[5]"));
           for(WebElement value:rowdisplay)
             {
    	     System.out.println(value.getText());
              }}

public void displayAnElement()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement value = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[9]/td[2]"));
System.out.println(value.getText());
	
}

public void valueSearch()
{
	String input = "Ashton Cox";
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	List<WebElement> txt = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
	for (WebElement element:txt)
	{
		if(input.equals(element.getText()))
		{
			System.out.println(element.getText());
		}
	}

	
}
	public static void main(String[] args)
	
	
	{
		TableDisplay tabledisplay = new TableDisplay();
		tabledisplay.initializeBrowser();
		tabledisplay.lastRow();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();
		tabledisplay.column5Display();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();
		tabledisplay.displayAnElement();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();
		tabledisplay.valueSearch();
	}

}
