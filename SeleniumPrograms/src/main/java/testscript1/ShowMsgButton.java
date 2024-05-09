package testscript1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShowMsgButton extends Base
{

public void shwMsgButton()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
        WebElement entermsgfield	= driver.findElement(By.id("single-input-field"));
        entermsgfield.sendKeys("testing automation");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));   //explicit wait
        WebElement showmsg	= driver.findElement(By.id("button-one"));
        wait.until(ExpectedConditions.elementToBeClickable(showmsg));
        showmsg.click(); 
}

	public static void main(String[] args)
	{
	ShowMsgButton assignmnt1 = new ShowMsgButton();
	assignmnt1.initializeBrowser();
	assignmnt1.shwMsgButton();
	}

}
