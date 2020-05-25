package brokenlinks;

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

public class BrokenLinksDemo {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://amazon.com");
	List<WebElement> link=	driver.findElements(By.tagName("a"));
	
	System.out.println("Total Link in a Page"+ link.size());
	
	List<WebElement> activeLinks=new ArrayList<WebElement>();
	
	for(int i=0;i<link.size();i++)
	{
		if(link.get(i).getAttribute("href")!=null && (!link.get(i).getAttribute("href").contains("javascript")))
		{
			activeLinks.add(link.get(i));
			
		}
		
	}
	
	System.out.println("Active Links are "+ activeLinks.size());
	int brokenLinks=link.size()-activeLinks.size();
	System.out.println("Total Broken Links are "+ brokenLinks);
	for(int j=0;j<activeLinks.size();j++)
	{
	
		HttpURLConnection connection=(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
	String response=connection.getResponseMessage();
		/*int response=connection.getResponseCode();klklkl098
		if(response>400)
		{
			System.out.println(activeLinks.get(j).getAttribute("href")+"-----"+"Valid URL");
		}
		else
		{
			System.out.println(activeLinks.get(j).getAttribute("href")+"-----"+"In Valid URL");
		}
		*/
		System.out.println(activeLinks.get(j).getAttribute("href")+"------"+ response);
		
	}
	
	}

}
