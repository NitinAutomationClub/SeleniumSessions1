package screenutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreen {
	
	public static void screenshot(WebDriver driver, String name )
	{
		try {
		
				TakesScreenshot ts=(TakesScreenshot)driver;
		
				File src=ts.getScreenshotAs(OutputType.FILE);
				
					FileHandler.copy(src, new File ("./Screenshot/"+name+".jpeg"));
				} 
		
				catch (IOException e) {
					
					e.printStackTrace();
				}
	}

}
