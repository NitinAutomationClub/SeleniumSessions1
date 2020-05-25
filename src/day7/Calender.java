package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String month="September 2021";
		String date="20";
		
		driver.get("https://www.goibibo.com");
		
		
		driver.findElement(By.id("departureCalendar")).click();
		System.out.println("1"); 
		
		
		WebElement mon=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']"));
		
		//span[@class='DayPicker-NavButton DayPicker-NavButton--next']
		System.out.println("2");
		while(true)
		{
			//mon.getText() : April 2020, May 2020 , June 2020 
			if(mon.getText().equalsIgnoreCase(month))
			{
				break;
			
			}
			else
			{
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
		}
		System.out.println("outside the while loop");
		System.out.println("3");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'"+date+"')]")).click();
		System.out.println("4");
		Thread.sleep(3000);


		
		

	}

}
