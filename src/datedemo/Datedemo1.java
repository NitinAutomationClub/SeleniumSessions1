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

public class Datedemo1 {

	public static void main(String[] args) throws ParseException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String month="September 2021";
		String date="18";
		
		driver.get("https://www.goibibo.com");
		driver.findElement(By.id("departureCalendar")).click();
		WebElement mon=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']"));
		
		while(true)
		{
			if(mon.getText().equalsIgnoreCase(month))
			{
					break;
			}
			else
			{
				//driver.findElement(By.xpath("//div[@class='rb-calendar hide']//td[@class='next']")).click();
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				Thread.sleep(1000);
			}

		}
		System.out.println("3");
		//driver.findElement(By.xpath("//div[@class='rb-calendar']//table//tbody//tr//td[contains(text(),'"+date+"')]")).click();
		
		//driver.findElement(By.xpath("//div[contains(text(),"'+date+"')]")).click();"
			//driver.findElement(By.xpath("//div[contains(text(),'25')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'"+date+"')]")).click();
		System.out.println("4");
	}

}
