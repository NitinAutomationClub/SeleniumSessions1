package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
public static void selectValue(WebElement ele , String value)
{
	Select select=new Select(ele);
	select.selectByVisibleText(value);
	
}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chrome81\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement day=driver.findElement(By.id("day"));
		//Select selectDate= new Select(day);
		//selectDate.selectByIndex(7);
		
	
		WebElement month=driver.findElement(By.name("birthday_month"));
		//Select selectMonth=new Select(month);
		//selectMonth.selectByValue("11");
		
		WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
		
		//Select selectYear=new Select(year);
		
		//selectYear.selectByVisibleText("1940");
		String dob="20-Jun-2000";
		String dobArr[]=dob.split("-");
		selectValue(day, dobArr[0]);
		selectValue(month, dobArr[1]);
		selectValue(year, dobArr[2]);
		System.out.println("Done");
		
		
		
		
	}

}
