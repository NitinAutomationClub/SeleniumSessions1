package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
/*		//Firefox
	System.setProperty("webdriver.gecko.driver", "c:\\driver\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();//Launch Browser
		driver.get("https:\\www.google.com");
*/
		
		//chrome
		
		/*1. Launch Browser
		 * 2. Open Google.com
		 * 3. Verify the title of page
		 * 
		 */
	System.setProperty("webdriver.chrome.driver", "c:\\driver\\chrome81\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//Launch Browser
		driver.manage().window().maximize();
			
		/*driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm="
				+ "false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl"
				+ "=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn"
				+ "&flowEntry=ServiceLogin");//URL hit 
		
		
		driver.findElement(By.name("Next")).click();
		
				
		*/
		/*driver.get("https://mail.google.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nitin.goyal64@gmail.com");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		
		*/
		
		/* Actual url : http://the-internet.herokuapp.com/basic_auth
		 * driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String msg=driver.findElement(By.cssSelector("p")).getText();
		System.out.println(msg);
		
		System.out.println("done");*/
		
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		boolean b=driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
		System.out.println(b);
		
	boolean b1=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		
		System.out.println(b1);//true
		boolean b2=driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
	System.out.println(b2);
	
	
	}

}
