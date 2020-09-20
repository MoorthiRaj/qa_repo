package week2.day1.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Moorthi");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Raj");
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown = new Select(source);
		dropDown.selectByVisibleText("Employee");
		
		WebElement campaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown1 = new Select(campaign);
		dropDown1.selectByValue("9001");
		
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropDown2 = new Select(industry);		
		List<WebElement> options = dropDown2.getOptions();
		int size = options.size();
		dropDown2.selectByIndex(size-2);
		
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropDown3 = new Select(ownership);
		dropDown3.selectByIndex(5);
		
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropDown4 = new Select(country);
		dropDown4.selectByVisibleText("India");
		
		driver.findElementByName("submitButton").click();
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

	}

}

