import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import library.Utility;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		Utility.captureScreenshot(driver, "BeforeLogin");
		driver.findElement(By.cssSelector("input#email")).sendKeys("Test1");
		Utility.captureScreenshot(driver, "AfterLogin");

		//Code for taking Screenshot
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("./Screenshot/Facebook_Login.png"));
		
		System.out.println("ScreenShot Taken");*/
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
