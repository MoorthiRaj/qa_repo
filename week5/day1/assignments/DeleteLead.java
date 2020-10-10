package week5.day1.assignments;

import org.testng.annotations.Test;

public class DeleteLead extends InitialActivity{

	@Test
	public void deleteLead() throws InterruptedException {
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByPartialLinkText("Find").click();
		
		driver.findElementByXPath("//span[text()='Email']").click();
		//driver.findElementByXPath("//span[@class='x-tab-strip-inner']/span[text()='Phone']").click();
		
		driver.findElementByXPath("//div//input[@name='emailAddress']").sendKeys("moorthi.raj@testleaf.com");
		//driver.findElementByXPath("//div//input[@name='phoneNumber']").sendKeys("8754622376");
		
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		Thread.sleep(1000);
		
		String leadId = driver.findElementByXPath("//td//a[@class='linktext']").getText();
		System.out.println(leadId);
		
		driver.findElementByXPath("//td//a[@class='linktext']").click();
		
		driver.findElementByXPath("//div[@class='frameSectionExtra']/a[@class='subMenuButtonDangerous']").click();
		
		driver.findElementByPartialLinkText("Find").click();
		
		driver.findElementByXPath("//div[@class='x-form-element']/input[@name='id']").sendKeys(leadId);
		
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		String text = driver.findElementByXPath("//div//div[@class='x-paging-info']").getText();
		System.out.println(text);

	}

}
