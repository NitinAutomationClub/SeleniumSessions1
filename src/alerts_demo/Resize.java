package alerts_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		WebElement resizable=driver.findElement(By.xpath("//div[@id='resizable']//div[3]"));
		
		int xAxis=resizable.getLocation().getX();
		
		int yAxix=resizable.getLocation().getY();
		
		System.out.println("X co-ordinnates "+xAxis + " "+ "Y co-ordinates"+yAxix);
		
		action.dragAndDropBy(resizable, 70, 70).release().perform();
		int xAxisUpdated=resizable.getLocation().getX();
		
		int yAxisUpdated=resizable.getLocation().getY();
		
		System.out.println("Updated X co-ordinate"+ " "+xAxisUpdated );
		System.out.println("Updated Y coordinate"+ " " +yAxisUpdated);
		

	}

}
