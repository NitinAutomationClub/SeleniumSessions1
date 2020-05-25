package datedemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickrHandle {

    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		
		
       
       
    //String journerDate = "10/22/2017";
       
        String journerDate = "04/28/2020";
       
    String[] allDayValue=journerDate.split("/");
   
    String addValue =allDayValue[2]+allDayValue[0]+allDayValue[1];
       
    System.out.println(addValue);
   
   
	Date date = new Date(journerDate);
   
    SimpleDateFormat simpleFormate = new SimpleDateFormat("MMMM/dd/yyyy");
   
    String udpadtedDate = simpleFormate.format(date);
       
    System.out.println(udpadtedDate);
   
    String[] actualDate = udpadtedDate.split("/");
       

    System.out.println(actualDate[0]);
    System.out.println(actualDate[1]);
    System.out.println(actualDate[2]);
   
    System.out.println(actualDate[0]+" "+actualDate[2]);
   
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	
    driver.get("https://www.goibibo.com/");
    
    driver.findElement(By.xpath("//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[1]/div/i")).click();
    //driver.findElement(By.xpath("//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[1]/div/i")).click();
   
    //driver.findElement(By.xpath("//*[@id='fare_"+addValue+"']")).click();
   
    while(true){
       
        try{
        driver.findElement(By.xpath("//*[@id='fare_"+addValue+"']")).click();
        break;
        }
        catch(Throwable t){
            driver.findElement(By.xpath("//span[contains(@class,'NavButton--next')]")).click();
        }
       
    }
   
   
   
    }

}

