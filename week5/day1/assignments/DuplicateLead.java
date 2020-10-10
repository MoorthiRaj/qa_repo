package week5.day1.assignments;

import org.testng.annotations.Test;

public class DuplicateLead extends InitialActivity{

	@Test
	public void duplicateLead() throws InterruptedException {
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByPartialLinkText("Find").click();
		
		driver.findElementByXPath("//span[text()='Email']").click();
		
		driver.findElementByXPath("//div//input[@name='emailAddress']").sendKeys("moorthi.raj@testleaf.com");
		
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("//td//a[@class='linktext']").click();
		
		driver.findElementByXPath("//div[@class='frameSectionExtra']/a[@class='subMenuButton']").click();
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Duplicate Lead | opentaps CRM";
		
		//verifying the page title
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title is matching");
		}
		
		String duplicatedName = driver.findElementByXPath("//input[@id='createLeadForm_companyName']").getAttribute("value");
		
		driver.findElementByXPath("//input[@name='submitButton']").click();
		  
		String coName = driver.findElementById("viewLead_companyName_sp").getText();
		
		String[] str = coName.split(" ");
		String str1 = str[0];
		
		if (str1.equals(duplicatedName)) {
		
			System.out.println("Duplicated lead name is same as captured name");
		  
		}
		 
	}

}
