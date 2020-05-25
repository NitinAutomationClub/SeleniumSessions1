package datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datedemo {

	public static void main(String[] args) throws ParseException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String month="May 2020";
		String date="20";
		
		driver.get("https://www.redbus.in");
		Thread.sleep(5000);
		/*Alert alert=driver.switchTo().alert();
		alert.accept();
		System.out.println("0");*/
		
		
		
		Thread.sleep(5000);
	driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
	System.out.println("1");
	WebElement mon=driver.findElement(By.xpath("//div[@class='rb-calendar hide']//td[@class='monthTitle']"));
	System.out.println("2");
		while(true)
		{
			if(mon.getText().equalsIgnoreCase(month))
			{
					break;
			}
			else
			{
				driver.findElement(By.xpath("//div[@class='rb-calendar hide']//td[@class='next']")).click();
				Thread.sleep(1000);
			}

		}
		System.out.println("3");
		driver.findElement(By.xpath("//div[@class='rb-calendar']//table//tbody//tr//td[contains(text(),'"+date+"')]")).click();
		System.out.println("4");
	}

}
