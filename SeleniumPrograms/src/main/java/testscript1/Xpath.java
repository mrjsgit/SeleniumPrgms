package testscript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base
{

	public void contains()  		  //tag[contains(@attribute,'value')]

	{
	WebElement buttonone=driver.findElement(By.xpath("//button[contains(@id,'one')]"));
	WebElement buttontwo=driver.findElement(By.xpath("//button[contains(@id,'two')]"));
	WebElement chkbox =driver.findElement(By.xpath("//input[contains(@id,'one')]"));
	WebElement txtfield1 =driver.findElement(By.xpath("//input[contains(@id,'single')]"));
	WebElement txtfield2 =driver.findElement(By.xpath(" //div[contains(@id,'one')]"));


	}
	
	public void text()                   //tag[text()='value']
	{
		
		WebElement shwmsg =driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement entrmsg =driver.findElement(By.xpath("//label[text()=' Enter Message']"));
		WebElement getttl =driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement getresults =driver.findElement(By.xpath("//button[text()='Get Results']"));
		WebElement submitfrm =driver.findElement(By.xpath("//button[text()='Submit form']"));



		
	}
	
	public void startsWith()                   		//tag[starts-with(@attribute,'value')]

	{
		WebElement shwmsg =driver.findElement(By.xpath("//button[starts-with(@id,'button')]"));
		WebElement msg1 =driver.findElement(By.xpath("//div[starts-with(@id,'message')]"));
		WebElement chkbx1 =driver.findElement(By.xpath("//input[starts-with(@id,'gridCheck')]"));
		WebElement chkbx2 =driver.findElement(By.xpath("//button[starts-with(@class,'btn')]"));
		WebElement chkbx3 =driver.findElement(By.xpath("//span[starts-with(@id,'input')]"));

	}
	
	public void or()                                //tag[@attribute='value' or @attribute='value']
	{
		WebElement msg1 =driver.findElement(By.xpath(" //input[@class='form-control' or @id='single-input-field']"));
		WebElement msg2 =driver.findElement(By.xpath("//input[@class='form-control' or @id='value-a']"));
		WebElement msg3 =driver.findElement(By.xpath("//span[@class='input-group-text' or @id='inputGroupPrepend']"));
		WebElement msg4 =driver.findElement(By.xpath("//input[@class='input-check-input' or @id='invalidCheck']"));
		WebElement msg5 =driver.findElement(By.xpath("//input[@type='text' or @id='single-input-field']"));


	}
	public void and()                                  //tag[@attribute='value' and @attribute='value']
	{
        WebElement msg2 =driver.findElement(By.xpath(" //input[@type='text' and @id='value-b']"));
		WebElement msg3 =driver.findElement(By.xpath(" //input[@type='text' and @id='single-input-field']"));
		WebElement msg4 =driver.findElement(By.xpath("//input[@type='text' and @id='single-input-field2']"));
		WebElement msg5 =driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));

	}
	
	
	public void basicXpath() //tag[@attribte='value']
	{
		WebElement input1=driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement input2=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement input3=driver.findElement(By.xpath("//div[@id='message-one']"));
		WebElement input4=driver.findElement(By.xpath("//input[@id='single-input-field2']"));
		WebElement input5=driver.findElement(By.xpath("//button[@id='button-two']"));

		
		
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		
Xpath xpath = new Xpath();
xpath.initializeBrowser();
xpath.contains();
xpath.text();
xpath.startsWith();
xpath.or();
xpath.and();
xpath.driverQuitAndClose();

	}

}
