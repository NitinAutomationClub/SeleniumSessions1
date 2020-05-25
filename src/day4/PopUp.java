package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//http://username:password@the-internet.herokuapp.com/basic_auth
			
			driver.get("http://admin:admin123@the-internet.herokuapp.com/basic_auth");
			
		
	}

}
