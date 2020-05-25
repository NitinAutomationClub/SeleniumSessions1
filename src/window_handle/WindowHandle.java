package window_handle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://popuptest.com/goodpopups.html");
		String ParentID=driver.getWindowHandle();
		System.out.println("Parent Window "+  ParentID);
		driver.findElement(By.xpath("//a[@class='black']")).click();
		
		Set<String>allWindowsID=driver.getWindowHandles();
			int count =allWindowsID.size();
			System.out.println("Size "+count);
			
			
			for(String child : allWindowsID)
			{
				if(!ParentID.equalsIgnoreCase(child))
				{
					driver.switchTo().window(child);
					System.out.println("Child ID :"+child);
					System.out.println("Child Title :"+driver.getTitle());
					Thread.sleep(5000);
					driver.close();
				}
			}
			driver.switchTo().window(ParentID);
			System.out.println("Parent Titlle : "+driver.getTitle());
		
		
		
		

	}

}
