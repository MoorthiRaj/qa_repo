package week5.day1.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends InitialActivity{

	@Test
	public void createLead() {
		
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
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8754622376");
		
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("moorthi.raj@testleaf.com");
		
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropDown4 = new Select(country);
		dropDown4.selectByVisibleText("India");
		
		driver.findElementByName("submitButton").click();
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

	}

}
