package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame_Demo {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		int totalFrame=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames are "+ totalFrame);	
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test12");
		//driver.switchTo().defaultContent();
		//System.out.println(driver.findElement(By.xpath("//h1[@class='breadcrumb-item']")).getText());
	//	String str=driver.findElement(By.xpath("//h1[@class='breadcrumb-item']")).getText();
		//System.out.println(str);
		driver.switchTo().frame("frame3");
	
		driver.findElement(By.xpath("//input[@id='a']")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@id='animals']"));
		driver.switchTo().frame(ele);
		Select select=new Select(ele);
		select.selectByIndex(2);
		
		
		
	}

}
