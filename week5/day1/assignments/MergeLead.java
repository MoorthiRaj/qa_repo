package week5.day1.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MergeLead extends InitialActivity{

	@Test
	public void mergeLead() throws InterruptedException {
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Click Leads link
		driver.findElementByLinkText("Leads").click();
		
		//Click Merge leads
		driver.findElementByLinkText("Merge Leads").click();
		
		//Click on Icon near From Lead
		driver.findElementByXPath("//img[@src='/images/fieldlookup.gif'][1]").click();
		
		//Window references
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<String>(windowHandles);
		
		//main window reference
		String mainWindow = allWindows.get(0);
		
		//new window reference
		String newWindow = allWindows.get(1);
		
		//Move to new window
		System.out.println("From Lead Window: " + newWindow);
		driver.switchTo().window(newWindow);
		
		//getting my first lead id and enter as 'First Lead ID' input
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("Moorthi");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(1000);
		
		WebElement fromLeadID = driver.findElementByXPath("(//table[@class='x-grid3-row-table']//tr/td//a[@class='linktext'])[1]");
		String _fromLeadID = fromLeadID.getText();
		fromLeadID.click();
		
		/*
		 * //Click Find Leads button
		 * driver.findElementByXPath("//button[text()='Find Leads']").click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //Click First Resulting lead driver.findElementByXPath(
		 * "(//table[@class='x-grid3-row-table']//tr/td//a[@class='linktext'])[1]").
		 * click();
		 */
		Thread.sleep(1000);
		
		//Switch back to primary window
		System.out.println("Main Window: " + mainWindow);
		driver.switchTo().window(mainWindow);
		
		//Click on Icon near To Lead
		driver.findElementByXPath("//a/following::img[@src='/images/fieldlookup.gif'][2]").click();
		
		//Window references
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> allWindows1 = new ArrayList<String>(windowHandles1);
		
		//main window reference
		String mainWindow1 = allWindows1.get(0);
		
		//new window reference
		String newWindow1 = allWindows1.get(1);
		
		//Move to new window
		System.out.println("To Lead Window: " + newWindow1);
		driver.switchTo().window(newWindow1);
		
		//getting my second lead id and enter as 'To Lead ID' input
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("Moorthi");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[2]//tr/td//a[@class='linktext'])[1]").click();
		
		/*
		 * //Click Find Leads button
		 * driver.findElementByXPath("//button[text()='Find Leads']").click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //Click First Resulting lead driver.findElementByXPath(
		 * "(//table[@class='x-grid3-row-table']//tr/td//a[@class='linktext'])[1]").
		 * click();
		 */
		
		//Switch back to primary window
		driver.switchTo().window(mainWindow1);
		
		//Click Merge
		driver.findElementByXPath("//a[text()='Merge']").click();
		
		//Accept Alert
		driver.switchTo().alert().accept();
		
		//Click Find Leads link
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		//Enter From Lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys(_fromLeadID);
		
		//Click Find Leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		//Verify message "No records to display" in the Lead List. This message confirms that the successful merge of leads
		String searchResult = driver.findElementByXPath("//table/following::div[@class='x-paging-info']").getText();
		System.out.println(searchResult);

	}

}
