package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//Locators 1. id ,2. name ,3. xpath , 4.linktext ,5. partiallinktext,6. classname 7 cssselector 8.tagname

public class Loc {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chrome81\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//Launch Browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();//to maximiz the window
		
		//1. id
		driver.get("https://www.facebook.com");
		
	//	driver.findElement(By.id("email")).sendKeys("nitin.kr@gmail.com");
			
		//2.name
		//driver.findElement(By.name("email")).sendKeys("abc@yahoo.com");
		
		//3. xpath
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@test.com");
		
		//4. linktext
	//	driver.findElement(By.linkText("Forgotten account?")).click();
		
		//5  Partial Link Text : Not Recommended
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//6 class name : Non Recommended
		
		//driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("password");
		
		//7. CSS Selector
		//driver.findElement(By.cssSelector("#email")).sendKeys("email");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		

}
}