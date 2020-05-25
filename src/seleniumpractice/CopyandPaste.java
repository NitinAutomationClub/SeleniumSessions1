package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyandPaste {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		Actions action=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//label[@for='pass']"));
		
		WebElement trg=driver.findElement(By.xpath("//input[@type='email']"));
		
		
		//action.doubleClick(src).build().perform();
		/*
		action.sendKeys(Keys.chord(Keys.LEFT_CONTROL+"C")).perform();
		action.sendKeys(trg, Keys.chord(Keys.LEFT_CONTROL+"V")).perform();*/

		
	
	}

}
