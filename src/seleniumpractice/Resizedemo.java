package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizedemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		
		Actions action=new Actions(driver);
		
		WebElement resizable=driver.findElement(By.xpath("//div[@id='resizable']"));
		int xAxis=resizable.getLocation().getX();
		int yAxis=resizable.getLocation().getY();
		System.out.println(xAxis +" " + yAxis);
		
		WebElement icon=driver.findElement(By.xpath("//div[@id='resizable']//div[3]"));
		
		action.dragAndDropBy(icon, 150,50).release().perform();
		System.out.println("done");
				
		

	}

}
