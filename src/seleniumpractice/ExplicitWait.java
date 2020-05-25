package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("1");
		driver.get("https://www.facebook.com");
		System.out.println("2");
		
		WebElement firstName =driver.findElement(By.name("firstname"));
		System.out.println("3");
		WebElement lastName=driver.findElement(By.name("lastname"));
		System.out.println("4");
		sendKeys(driver,firstName,10,"aa");
		System.out.println("5");
		sendKeys(driver,lastName,20,"lname");
		System.out.println("6");
		
		

	}


public static void sendKeys(WebDriver driver , WebElement element , int timeout, String value)
{
	new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(value);
}

}