package day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
/*
 * 1. Wait : Static and Dynamic
 * Static : Thread.sleep(10000)//10 sec
 * 
 * 
 * 2. Dynamic : Implicit , Explicit and Fluent Wait 
 */
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		/*driver=20 element , 10 sec =20*10=200 secs
		 * 1 elem=3 sec- save 7 sec====10 sec
		 * 2 elemt-4 sec-6 sec=====10 sec 
		 * 3. elemtn -10 sec-=====10 sec\
		 * 
		 * 
		 * explicit
		 * element 1-5 sec
		 * element 2-10 sec
		 * element 3 -3 sec wait 
		 */
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		driver.get("https://www.facebook.com");
		
		WebElement userEmail=driver.findElement(By.id("email"));
		
		WebElement userPass=driver.findElement(By.id("pass"));
		
		sendKeys(driver,userEmail,5,"email1234" );
		sendKeys(driver, userPass, 10, "pss12345");
		
		
		}
	
	
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.
				visibilityOf(element));
		element.sendKeys(value);
	}
	
	
	
	
	
	

}
