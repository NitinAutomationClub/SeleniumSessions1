package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chrome81\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();//facebook
		System.out.println(driver.getTitle());
		driver.navigate().forward();//google
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();//to refresh the page
		
		driver.navigate().to("https://www.yahoo.com");//to navigate to particluar page
		
		
		
		
		
		
		
		
		
		
		

	}

}
