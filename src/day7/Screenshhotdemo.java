package day7;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import screenutility.TakeScreen;

public class Screenshhotdemo {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com");
//		//1. Take a screenshot
//		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//	//save the screenshot in memory
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		//copy the file from me
//		FileHandler.copy(src, new File ("./Screenshot/fb.jpeg"));
		
		TakeScreen.screenshot(driver, "fbscreenshot");
		
		driver.findElement(By.id("email")).sendKeys("username123");
		TakeScreen.screenshot(driver, "usernamesscreenshot");
		
		driver.findElement(By.id("pass")).sendKeys("pass123");
		TakeScreen.screenshot(driver, "passscreenshhot");
		System.out.println("done");
		
		
		
		
		
		
	
		
		
		
		
		
	

	}

}
