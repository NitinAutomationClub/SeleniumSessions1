package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		Actions action=new Actions(driver);
		
		WebElement ele=driver.findElement(By.id("highlight-addons"));
		
		action.moveToElement(ele).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("MyFlexiPlan")).click();
		
		System.out.println("moved");
		
		
		

	}

}
