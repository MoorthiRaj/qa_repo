package week5.day1.assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitialActivity {
	
	public static ChromeDriver driver;

	@BeforeMethod
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
	}
	
	@AfterMethod
	public void finalActivity() {
		
		driver.close();

	}

}
