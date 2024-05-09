package testscript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccessMethods extends Base //Syntax: //tagname[@attribute='value']//accessmethodname::tagname

{
public void parentAccessMethods()
{
WebElement parent1=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
WebElement parent2=driver.findElement(By.xpath("//input[@id='value-a']//parent::div"));
WebElement parent3=driver.findElement(By.xpath("//input[@id='value-b']//parent::div"));
WebElement parent4=driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div"));
WebElement parent5=driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));

}
	
	public void childAccessMethods()
	{
		WebElement child1=driver.findElement(By.xpath("//button[@class='navbar-toggler']//child::span"));
		WebElement child2=driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img"));

	}
	
	public void ancestorAccessMethods()
	{
		WebElement ances1=driver.findElement(By.xpath("//input[@id='single-input-field']//ancestor::div"));
		WebElement ances2=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));

	}
	
	public void descendentAccessMethods()
	{
		WebElement dec1=driver.findElement(By.xpath("//select[@id='single-input-field']//descendant::option"));

	}
	
	public void followingAccessMethods()
	{
		WebElement follow1=driver.findElement(By.xpath("//button[@id='button-first']//following::div"));
	
	}
	
	public void followingSiblingsAccessMethods()
	{
		WebElement followsib1=driver.findElement(By.xpath(""));

	}
	
	public void precedingAccessMethods()
	{
		WebElement preceding11=driver.findElement(By.xpath("//button[@id='button-all']//preceding::div"));

	}
	
	public void indexingAccessMethods()
	{
	WebElement index1=driver.findElement(By.xpath("//select[@id='single-input-field']//descendant::option[3]"));

	}
	
	public static void main(String[] args) 
	{

	}

}
