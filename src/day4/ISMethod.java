package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
	boolean b=	driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
	System.out.println(b);//true
	
	boolean b1=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	System.out.println(b1);//true
	driver.findElement(By.xpath("//input[@type='radio']")).click();
	boolean b2=driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
	
	System.out.println(b2);
	
	
	
	

	}

}
