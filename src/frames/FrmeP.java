package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrmeP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		int size=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(size);
		String textValue=driver.findElement(By.xpath("//div[@class='card mb-3']//span")).getText();
		
		driver.switchTo().frame("frame1");
		WebElement textBox=driver.findElement(By.xpath("//input[@type='text']"));
		textBox.sendKeys(textValue);
		driver.switchTo().frame("frame3");
		
		WebElement checkBox=driver.findElement(By.xpath("//input[@id='a']"));
		if(!checkBox.isSelected())
		{
			checkBox.click();
			driver.switchTo().parentFrame();
		
			textBox.clear();
			Thread.sleep(5000);
			textBox.sendKeys("DONE");
		}
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='animals']"));
		
		Select select=new Select(dropDown);
		
		select.selectByIndex(3);
		
		
		

		
		
		
		
		
		
		
		
	}

}
