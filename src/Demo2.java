import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 {
	
	public static void main(String[] args)
	{
		
		String key = "webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/unisys/login.do");
	}
}



