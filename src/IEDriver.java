import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\driver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		

	}

}
