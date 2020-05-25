package screenshotdemo;

import java.io.File;
import java.io.IOException;
//import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import screenshotlib.ScreenshotUtility;

public class Screenshotdemo1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		/*driver.get("https://www.facebook.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src,new File("./ScreenShot/aa.png"));
		*/
		driver.get("https://www.facebook.com");
	
		ScreenshotUtility.Screenshotlib(driver, "a");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc");
		ScreenshotUtility.Screenshotlib(driver, "b");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pswd");
		ScreenshotUtility.Screenshotlib(driver, "c");
		
		

	}

}
