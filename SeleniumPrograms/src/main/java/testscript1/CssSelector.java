package testscript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base
{

	
	
	public void tagAndId()
	{
		//Syntax: CSS=tag#id
        WebElement buttoncheck1	= driver.findElement(By.cssSelector("button#button-one"));
        WebElement buttoncheck2	= driver.findElement(By.cssSelector("button#button-two"));
        WebElement singleinput	= driver.findElement(By.cssSelector("input#single-input-field"));
        WebElement valuea	= driver.findElement(By.cssSelector("input#value-a"));
        WebElement valueb	= driver.findElement(By.cssSelector("input#value-b"));

	}
	
	
	public void tagAndClass()
	{
		//Syntax: CSS=tag.class
        WebElement formcntlchk = driver.findElement(By.cssSelector("input.form-check-input"));
        WebElement formcntl2 = driver.findElement(By.cssSelector("span.input-group-text"));
        WebElement formcntl3 = driver.findElement(By.cssSelector("section.clearfix"));
        WebElement formcntl4 = driver.findElement(By.cssSelector("input.form-control"));
        WebElement formcntl5 = driver.findElement(By.cssSelector("textarea.form-control"));


	}
	
	
	public void tagAndAttribute()
	{
		//Syntax: CSS=tag[attribute=value]
        /*<button type="button" class="btn btn-primary" id="button-one">Show Message</button>   */

        WebElement tagatt1 = driver.findElement(By.cssSelector("button[id='button-one']"));
        WebElement tagatt2 = driver.findElement(By.cssSelector("button[id='button-two']"));
        WebElement tagatt3 = driver.findElement(By.cssSelector("input[id='single-input-field']"));
        WebElement tagatt4 = driver.findElement(By.cssSelector("input[id='value-a']"));
        WebElement tagatt5 = driver.findElement(By.cssSelector("input[id='value-b']"));



	}
	
	
	public void tagClassAndAttribute()
	{
		//Syntax: CSS=tag.className[attribute="value"]
        WebElement tagclassatt1 = driver.findElement(By.cssSelector("input.form-check-input[id='invalidCheck']"));
        WebElement tagclassatt2 = driver.findElement(By.cssSelector("span.input-group-text[id='inputGroupPrepend']"));
        WebElement tagclassatt3 = driver.findElement(By.cssSelector("input.form-check-input[id='gridCheck']"));
        WebElement tagclassatt4 = driver.findElement(By.cssSelector("input.form-control[id='validationCustom01']"));
        WebElement tagclassatt5 = driver.findElement(By.cssSelector("input.form-check-input[id='invalidCheck']']"));

	}
	
	
	public static void main(String[] args) 
	{
CssSelector cssselector=new CssSelector();
cssselector.initializeBrowser();
cssselector.tagAndId();
cssselector.tagAndClass();
cssselector.tagAndAttribute();
cssselector.tagClassAndAttribute();
cssselector.driverQuitAndClose();
	}

}
