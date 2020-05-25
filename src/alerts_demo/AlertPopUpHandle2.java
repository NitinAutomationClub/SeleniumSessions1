package alerts_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopUpHandle2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.name("email")).sendKeys("nitin.goyal64@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test0001");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(8000);
		
		
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		WebElement element = driver.findElement(By.xpath("//td[text()='Referred by1']//preceding-sibling::td/div[@class='ui fitted read-only checkbox']//input[@name='id']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		System.out.println("clicked");
		
	}	

		
		

	}


