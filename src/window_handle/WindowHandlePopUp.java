package window_handle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[@class='black']")).click();
		
		
		Set <String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String Parent_ID=it.next();
		System.out.println("Parent ID "+ Parent_ID);
		
		String Child_ID=it.next();
		System.out.println("Child ID "+ Child_ID);
		driver.switchTo().window(Child_ID);
		System.out.println("Child Window Pop up Title "+driver.getTitle());
		
		
		driver.close();
		driver.switchTo().window(Parent_ID);
		
		System.out.println("Parent Title ID"+ driver.getTitle());
				
		

		
		
		
		
		
		
		
		
	}

}
