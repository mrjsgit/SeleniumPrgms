package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class RadioButtonHandling extends Base
          {

	public void radioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement msg1 =driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
        msg1.click();
        System.out.println(msg1.isSelected());
		WebElement msg2 =driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
		msg2.click();
		WebElement msg3 =driver.findElement(By.xpath("//div[@id='message-one']"));
String txt = msg3.getText();
System.out.println(txt);

	}
	
	
	public static void main(String[] args) 
	
	{
RadioButtonHandling radiobutton = new RadioButtonHandling();
radiobutton.initializeBrowser();
radiobutton.radioButton();
	}

}
