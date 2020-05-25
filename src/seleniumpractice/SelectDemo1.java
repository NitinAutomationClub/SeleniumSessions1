package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chrome81\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
	//	WebElement month=driver.findElement(By.id("month"));
		
		List<WebElement>listMonth=driver.findElements(By.xpath("//select[@id='month']//option"));
		
		System.out.println(listMonth.size());
		
		for(int i=0;i<listMonth.size();i++)
		{
			
			System.out.println(listMonth.get(i).getText());
		}
		

	}

}
