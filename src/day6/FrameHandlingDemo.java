package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FrameHandlingDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		String text=driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(text);
		driver.switchTo().frame("frame1");
		WebElement textBox=driver.findElement(By.xpath("//input[@type='text']"));
		
		textBox.sendKeys(text);
		
		driver.switchTo().frame("frame3");
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		if(!checkbox.isSelected())
		{
			checkbox.click();
			driver.switchTo().parentFrame();//Navgate to immedaite Parent Frame
			Thread.sleep(3000);
			textBox.clear();
			Thread.sleep(3000);
			textBox.sendKeys("Leaning Selenium");
			Thread.sleep(3000);
			//driver.quit();
		
		}
		driver.switchTo().defaultContent();//Navigate to Default Webpage 
		driver.switchTo().frame("frame2");
		
		WebElement dropDown= driver.findElement(By.xpath("//select[@id='animals']"));
		
		Select select=new Select(dropDown);
		select.selectByIndex(2);
		
		
	
		
		
		
		
		
		
		
		
	
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
