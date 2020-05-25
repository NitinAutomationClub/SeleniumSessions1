package selectdemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Demo {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);*/
	
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chrome81\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		String title= driver.getTitle();
		String url=driver.getCurrentUrl();
		
		System.out.println("Title is "+ title + " :URL :"+ url);
		
		WebElement day =driver.findElement(By.id("day"));
		//Select select= new Select(day);	
		//select.selectByIndex(3);
			
		WebElement  month=driver.findElement(By.name("birthday_month"));
		
		Select select= new Select(month);
		//select.selectByValue("8");
		//select.selectByVisibleText("Nov");
		/*WebElement year=driver.findElement(By.name("birthday_year"));
		
		Select select2= new Select(month);
		
		select2.selectByVisibleText(");
		
*/		
		List <WebElement>list=select.getOptions();
		int listsize=list.size();
		System.out.println("Size "+ listsize);
		
		for(int i=0;i<listsize;i++)
		{
			String m=select.getOptions().get(i).getText();
			System.out.println(m);
			
		}
		
		
	
	}
	

}
