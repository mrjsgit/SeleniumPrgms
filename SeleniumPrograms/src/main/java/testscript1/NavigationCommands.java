package testscript1;

public class NavigationCommands extends Base
{

	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");//driver.navigate().to()
	    driver.navigate().back();
               	    driver.navigate().forward();
	    driver.navigate().refresh();
		
	}
	
	public static void main(String[] args) 
	{
		NavigationCommands navigationcommands = new NavigationCommands();
		navigationcommands.initializeBrowser();
		navigationcommands.navigationCommands();
		navigationcommands.driverQuitAndClose();
	}

}
