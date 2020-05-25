package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		
			
	System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://jqueryui.com/droppable/");
	
	driver.switchTo().frame(0);
	
	Actions action=new Actions(driver);
	
	WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
	
	WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
	
	action.clickAndHold(drag).moveToElement(drop).release().build().perform();
	
	
	
	
	
	
	
	}

}
