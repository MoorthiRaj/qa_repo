package week2.day1.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Accounts").click();
		
		driver.findElementByLinkText("Create Account").click();
		
		driver.findElementByXPath("//input[@id='accountName']").sendKeys("Debit Limited Account - Moorthi");
		
		driver.findElementByName("description").sendKeys("Selenium Automation Tester");
		
		driver.findElementByXPath("//input[@id='groupNameLocal']").sendKeys("QA");
		
		driver.findElementByXPath("//input[@id='officeSiteName']").sendKeys("Guindy");
		
		driver.findElementByXPath("(//input[@class='inputBox'])[5]").sendKeys("5000");
		
		driver.findElementByName("industryEnumId").sendKeys("ComputerSoftware");
				
		WebElement ownership = driver.findElementByName("ownershipEnumId");
		Select dropDown1 = new Select(ownership);
		dropDown1.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElementByName("dataSourceId");
		Select dropDown2 = new Select(source);
		dropDown2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement campaign = driver.findElementById("marketingCampaignId");
		Select dropDown3 = new Select(campaign);
		dropDown3.selectByIndex(6);
		
		WebElement state = driver.findElementByName("generalStateProvinceGeoId");
		Select dropDown4 = new Select(state);
		dropDown4.selectByValue("TX");
		
		driver.findElementByXPath("//input[@type='submit']").click();		

	}

}

