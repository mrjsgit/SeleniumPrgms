package testscript1;

public class BrowserCommands extends Base

{
	
	public void browserCommands()
	{
		String title = driver.getTitle();//used to get the title of the current pg
	//	System.out.println(title);
		String url=driver.getCurrentUrl();
		String pagesource=driver.getPageSource();
	    //System.out.println(url);
	    //System.out.println(pagesource);

		
		
	}
	
	
	

	public static void main(String[] args) 
	{
	BrowserCommands browsercommands = new BrowserCommands();
	browsercommands.initializeBrowser();
	browsercommands.browserCommands();
	browsercommands.driverQuitAndClose();
	
	
	}
	

}
