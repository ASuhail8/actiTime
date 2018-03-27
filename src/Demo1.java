import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 

{	
	public static void main(String[] args) throws InterruptedException
	{

		
		String key = "webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/unisys/login.do");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//div[.='Login ']"));
			boolean	x=			login.isDisplayed();
		
			if(x)
			{
				System.out.println("Displayed");
			}
			else
			{
				System.out.println("not Displayed");
			}
		
		WebElement user = driver.findElement(By.id("username"));
				boolean answer =		user.isEnabled();
				if(answer)
				{
					System.out.println("Enabled");
				}
				else
				{
					System.out.println("not Enabled");
				}
		
		WebElement CB = driver.findElement(By.id("keepLoggedInCheckBox"));
		boolean y=				CB.isSelected();
				if(y)
				{
					System.out.println("selected");
				}
				else
				{
					System.out.println("not selected");
				}
	}
	}

