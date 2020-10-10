package week5.day1.assignments;

import org.testng.annotations.Test;

public class EditLead extends InitialActivity {

	@Test
	public void editLead() throws InterruptedException {
				
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByPartialLinkText("Find").click();
		
		//parent to child xpath
		driver.findElementByXPath("(//div[@class='x-form-element']/input[@name='firstName'])[3]").sendKeys("T");
		
		//partial match using attribute
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		Thread.sleep(1000);
		
		//select the first lead from the list
		driver.findElementByXPath("(//table[@class='x-grid3-row-table']//tr/td//a[@class='linktext'])[1]").click();
		
		String actualTitle = driver.getTitle();	
		
		String expectedTitle = "View Lead | opentaps CRM";
		
		//verifying the page title
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title is matching");
		}
				
		  driver.findElementByXPath("//div[@class='frameSectionExtra']/a[text()='Edit']").click();
		  driver.findElementById("updateLeadForm_companyName").clear();
		  
		  String coName = "Company name changed";
		  driver.findElementById("updateLeadForm_companyName").sendKeys(coName);
		  
		  driver.findElementByXPath("//input[@name='submitButton']").click();
		  
		  String updatedName = driver.findElementById("viewLead_companyName_sp").getText();
		  
		  //Printing the changed name 
		  System.out.println(updatedName);

	}

}
