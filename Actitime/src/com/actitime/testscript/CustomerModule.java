package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
import com.actitme.generic.BaseClass;
import com.actitme.generic.FileLibClass;
@Listeners(com.actitme.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("Create Customer", true);
		FileLibClass f=new FileLibClass();
		String customerName = f.getExcelData("Sheet1", 1, 2);
		String customerDescription = f.getExcelData("Sheet1", 1, 3);
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustomer().click();
		t.getCustomerNameTbx().sendKeys(customerName);
		t.getCustomerDescription().sendKeys(customerDescription);
		t.getSelectCustomerDD().click();
		t.getOurCompany().click();
		t.getCreateCustmerBtn().click();
		Thread.sleep(5000);
		String actualText = t.getActualCustomer().getText();
		Assert.assertEquals(actualText, customerName);
		
		
	}

}
