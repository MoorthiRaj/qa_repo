package week2.day1.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class acmeLogin {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.manage().window().maximize();
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElementById("password").sendKeys("leaf@12");
		
		driver.findElementByXPath("//button[@type='submit']").click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElementByPartialLinkText("Out").click();
		
		driver.close();

	}

}

