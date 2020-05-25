package day6;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.get("http://popuptest.com/goodpopups.html");
		String parentID=driver.getWindowHandle();
		System.out.println("Parent ID : "+ parentID);
		
		System.out.println("Parent Title "+ driver.getTitle());
		
		driver.findElement(By.xpath("//a[@class='black']")).click();
		
		
		Set<String> allWindowsID=driver.getWindowHandles();//Return all Browser ID
		
		int count=allWindowsID.size();
		System.out.println(count);
		System.out.println("All Windows ID "+ allWindowsID);
		Thread.sleep(5000);
		for(String child : allWindowsID)
		{
			if(!parentID.equalsIgnoreCase(child))
			{
			
			driver.switchTo().window(child);
			driver.manage().window().maximize();
			System.out.println("Child ID: "+ child);
			System.out.println("Child Title : "+driver.getTitle());
			Thread.sleep(5000);
			driver.close();
			
		
			}
		}
		driver.switchTo().window(parentID);
		System.out.println("Parent Title "+ driver.getTitle());
		driver.close();
		

	}

}
