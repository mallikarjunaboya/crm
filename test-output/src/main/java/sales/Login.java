package sales;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Login {
	WebDriver driver;

	@Test
	public void launch() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARJUN\\Downloads\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://test.salesforce.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("secondaryretainedcareview@cushwake.com.prod.staging");

		driver.findElement(By.id("password")).sendKeys("Testing@1234!");

		driver.findElement(By.id("Login")).click();
		
		
		

	}



	/*//Create a map to store  preferences 
	Map<String, Object> prefs = new HashMap<String, Object>();

	//add key and value to map as follow to switch off browser notification
	//Pass the argument 1 to allow and 2 to block
	prefs.put("profile.default_content_setting_values.notifications", 2);

	//Create an instance of ChromeOptions 
	ChromeOptions options = new ChromeOptions();

	// set ExperimentalOption - prefs 
	options.setExperimentalOption("prefs", prefs);

	//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
	WebDriver driver = new ChromeDriver(options);*/


}
