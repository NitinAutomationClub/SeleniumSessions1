package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
	
		
		
		
		Actions action=new Actions(driver);
		action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")))
		.build()
		.perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		driver.close();
		//https://chercher.tech/practice/frames-example-selenium-webdriver
		
		
		
		
		
		
		
		
	}

}
