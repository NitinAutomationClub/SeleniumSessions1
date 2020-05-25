package radio_checkbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List <WebElement> radio_list=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		
		for(int i=0;i<radio_list.size();i++)
		{
			WebElement radio_value=radio_list.get(i);
			String radio_text=radio_value.getAttribute("value");
			System.out.println("Radio Values are "+ radio_text);
		}
		
		
		
		
		
	

	}

}
