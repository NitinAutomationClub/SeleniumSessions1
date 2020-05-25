package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert=driver.switchTo().alert();
		String actualOutput=alert.getText();
		System.out.println(actualOutput);
		if(actualOutput.equalsIgnoreCase("Please enter a valid user name"))
		{
			Thread.sleep(5000);//to pause your script for 5 sec
			alert.accept();//click on OK button
			System.out.println("OK button clicked");
			 
		}
		else
		{
			//actualOutput.alert.dismiss();click on cancel button
			
			System.out.println("Test Script failed");
		}
	
		
		
	}

}
