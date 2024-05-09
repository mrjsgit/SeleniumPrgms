package roughwork;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript1.Base;

public class DragAndDrop extends Base

{
public void dragDrop()
{
driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
WebElement drag1 = driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
WebElement drop1 = driver.findElement(By.xpath("//div[@id='mydropzone']"));
Actions action = new Actions(driver);
action.moveToElement(drag1).build().perform();
action.doubleClick(drag1).build().perform();
action.dragAndDrop(drag1, drop1).build().perform();

}
	
	public static void main(String[] args)
	{
		DragAndDrop draganddrop = new DragAndDrop();
		draganddrop.initializeBrowser();
		draganddrop.dragDrop();
	}

}
