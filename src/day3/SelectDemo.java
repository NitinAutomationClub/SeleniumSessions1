package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chrome81\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//Launch Browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();//to maximiz the window
		

		driver.get("https://www.facebook.com");
		//day dropdown
		WebElement day=driver.findElement(By.id("day"));
		
		Select selectDay=new Select(day);//Select is a class 
		//month dropdown
		WebElement month=driver.findElement(By.id("month"));
		Select selectmonth=new Select(month);
		
		//year dropdown
		WebElement year=driver.findElement(By.id("year"));
		Select selectyear=new Select(year);
		
		
		selectDay.selectByIndex(10);//date
		selectmonth.selectByValue("8");//month
		selectyear.selectByVisibleText("1985");//year

	}

}
