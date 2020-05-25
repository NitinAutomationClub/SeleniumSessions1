package alerts_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		/*driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		if (alert.getText().equalsIgnoreCase("Please enter a valid user name"))
		{
			Thread.sleep(5000);
			alert.accept();
		}
		else
		{
			System.out.println("End "); 
			
		}
*/
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alert=driver.switchTo().alert();
		
		String alertMsg=alert.getText();
		System.out.println(alertMsg);
		String actualOutput="Please enter a valid user name";
		if(alertMsg.equalsIgnoreCase(actualOutput))
		{
			Thread.sleep(5000);
			alert.accept();
			
			System.out.println("OK Button Clcked");
		}
		driver.findElement(By.id("remember")).click();
		
		boolean b=driver.findElement(By.id("remember")).isSelected();
		System.out.println(b);
		driver.findElement(By.id("remember")).click();
		boolean b1=driver.findElement(By.id("remember")).isSelected();
		System.out.println(b1);
	}	

		
		

	}


