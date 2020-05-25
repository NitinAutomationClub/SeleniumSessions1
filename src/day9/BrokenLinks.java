package day9;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.com/");
		
		List<WebElement>totalLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("Link Size "+ totalLinks.size());//108
		
		List<WebElement> activeLinks=new ArrayList<WebElement>();
		
		List<WebElement> brokenLinks=new ArrayList<WebElement>();
		
		//2. Iterate the link list and get active links which doesn't have href
		//href-attribute and "a" HTML tag
	
		for(int i=0;i<totalLinks.size();i++)
		{
			if(totalLinks.get(i).getAttribute("href")!=null && 
			
			(! totalLinks.get(i).getAttribute("href").contains("javascript")))
			
			{
				activeLinks.add(totalLinks.get(i));
			}
			else
			{
				brokenLinks.add(totalLinks.get(i));
				
			}
		}
		
		System.out.println("Active Links "+ activeLinks.size());
		System.out.println("Broken Links "+ brokenLinks.size());
	
		//3. Check the href URL is correct ot not ?
		for(int j=0;j<activeLinks.size();j++)
		{
			//to establish a connection
			
		HttpURLConnection connection=(HttpURLConnection)new URL(activeLinks.get(j).
									getAttribute("href")).
									openConnection();
		int response=connection.getResponseCode();
		/*connection.connect();
		String response=connection.getResponseMessage();//ok
		*/
		//200->OK 
		//400->Not found
		if(response>400)
		{
			
			System.out.println(activeLinks.get(j).getAttribute("href")+"-------> Valid URL");
		}
		else
		{
			System.out.println(activeLinks.get(j).getAttribute("href")+"-------> InValid URL ");
		}
			
		
		
		
		
		//System.out.println(activeLinks.get(j).getAttribute("href")+"------->"+ response);
			
			
		}
	}
	
	
	
}
