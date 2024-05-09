package testscript2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAFile           //UsingrobotClass
{

	public static void main(String[] args) throws AWTException
	{
		ChromeDriver driver = new ChromeDriver(); //to launch webdriver for chrome; variable 'driver' has the browser
		driver.get("https://selenium.qabible.in/"); //to launch the url 
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement span = driver.findElement(By.xpath("//span[text()='Select PDF file']"));
span.click();
StringSelection ss = new StringSelection("C:\\Users\\dell\\Desktop\\Inheritance.pdf"); 
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
Robot r=new Robot();
r.delay(250);
//pressing enter key
r.keyPress(KeyEvent.VK_ENTER);
//releasing enter
r.keyRelease(KeyEvent.VK_ENTER);  
//pressing ctrl+v
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
//releasing ctrl+v
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);
//pressing enter
r.keyPress(KeyEvent.VK_ENTER);
//releasing enter
r.delay(90);
r.keyRelease(KeyEvent.VK_ENTER);
	}
	}


