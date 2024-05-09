package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class Table extends Base
{

	public void tablePrinting()
	{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement tabledisplay = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
	System.out.println(tabledisplay.getText());	
	}
	
	public void singleRow()
	{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement rowdisplay = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[5]"));
     System.out.println(rowdisplay.getText());

	}
	public void elementDisplay()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement valuedisplay = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[5]"));
	     System.out.println(valuedisplay.getText());
	}
	
	public void columnDisplay()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column1 = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement option:column1)
		{
		System.out.println(option.getText());
		}
		
		}
	
	
	public static void main(String[] args) 
	{
Table table = new Table();
table.initializeBrowser();
table.tablePrinting();
System.out.println("***************************************************************");
System.out.println();
table.singleRow();
System.out.println("***************************************************************");
System.out.println();
table.elementDisplay();
System.out.println("***************************************************************");
System.out.println();
table.columnDisplay();

	}

}
