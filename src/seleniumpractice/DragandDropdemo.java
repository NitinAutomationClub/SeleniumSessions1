package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropdemo {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		Actions action=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement trgt=driver.findElement(By.xpath("//div[@id='droppable']"));
				
		action.clickAndHold(src).moveToElement(trgt).release().build().perform();
	
	}

}
