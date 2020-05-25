package alerts_demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chrome81\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	driver.findElement(By.name("proceed")).click();
	Alert alert =driver.switchTo().alert();
	String text=alert.getText();
	System.out.println(text);
	if (text.equals("Please enter a valid user name"))
	{
		Thread.sleep(5000);
		alert.accept();
		driver.close();
	}
	else
	{
		System.out.println("Text is incorrect ");
	}
	
	}

}
