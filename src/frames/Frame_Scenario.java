package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame_Scenario {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			/*Scenario :

1. Check the checkbox present in the iframe 3; iframe 3 is present inside iframe 1
2. After checking the checkbox, move back to iframe 1 and enter "selenium" text in the topic text bar
3. Now move back to page level and compare the topic(header) text is not equal to "selenium webdriver" */
		
		WebElement Frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(Frame1);
		WebElement Frame3=driver.findElement(By.id("frame3"));
		driver.switchTo().frame(Frame3);
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='a']"));
		if(!checkbox.isSelected())
		{
			checkbox.click();
		}
		else
		{
			System.out.println("No Checkbox is present");
		}
	//driver.switchTo().frame("frame1");
		driver.switchTo().parentFrame();
	WebElement textBox=driver.findElement(By.xpath("//input[@type='text']"));
	
	textBox.sendKeys("Selenium");
	driver.switchTo().parentFrame();
	String text=driver.findElement(By.xpath("//h1[@class='breadcrumb-item']")).getText();
	System.out.println(text);
	if(text.equals("Selenium WebDriver"))
	{
		System.out.println("String are Equal");
	}
	else
	{
		System.out.println("String are Not Equal");
	}
	}
	
}
