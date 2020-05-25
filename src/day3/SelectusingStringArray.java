package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectusingStringArray {
	
	public static void selectMehtod(WebElement ele , String value)
	{
		Select select=new Select(ele);
		select.selectByVisibleText(value);
	}
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chrome81\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//Launch Browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();//to maximiz the window
		

		driver.get("https://www.facebook.com");
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		selectMehtod(day,"25");//day
		selectMehtod(month, "May");//month
		selectMehtod(year,"1940");//year
		
		
		
		
		
		
		
	}

}
