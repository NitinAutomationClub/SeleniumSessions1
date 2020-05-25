package day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo1 {
	
	public static void selectMehtod(WebElement ele , String value)
	{
		Select select=new Select(ele);
		select.selectByVisibleText(value);
	}
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chrome81\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//Launch Browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();//to maximiz the window
		

		driver.get("https://www.facebook.com");
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		Select selectmonth=new Select(month);
		System.out.println(selectmonth.isMultiple());

		//How we can select any value without using select method
		
		List<WebElement> list=selectmonth.getOptions();
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)//i=0 1 2 3
		{
			String value=list.get(i).getText();
			
			
			System.out.println(value);//month Jan Feb Mar
			
			if(value.equalsIgnoreCase("Mar"))
			{
				list.get(i).click();
				break;//Get loss /exit
			}
		}
		
		
		
		
		
		
		
		
	}

}
