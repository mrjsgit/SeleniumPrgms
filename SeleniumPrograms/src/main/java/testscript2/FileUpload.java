package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class FileUpload extends Base        //using sendkey
{

	public void sendKeyMethod()
	{
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement upload = driver.findElement(By.xpath("//input[@id='file-upload']"));
		upload.sendKeys("C:\\Users\\dell\\Downloads\\QA Sign Off.docx (2).pdf");	
	}
	
	
	
	public static void main(String[] args) 
	{
FileUpload fileupload = new FileUpload();
fileupload.initializeBrowser();
fileupload.sendKeyMethod();

	}

}
