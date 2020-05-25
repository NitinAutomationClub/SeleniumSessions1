package screenshotlib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	
	public static  void  Screenshotlib(WebDriver driver,String screenshotName )
	{
		try {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("./ScreenShot/"+screenshotName+ ".png"));
		} 
		catch (Exception e) {
		
			e.printStackTrace();
		}	
	}
	
	
	

}
