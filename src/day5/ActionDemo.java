package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com");
		WebElement ele =driver.findElement(By.id("highlight-addons"));
		
		Actions action=new Actions(driver);
		action.moveToElement(ele).build().perform();//
		driver.findElement(By.linkText("MyFlexiPlan")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
