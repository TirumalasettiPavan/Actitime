package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustomer;
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement customerNameTbx;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescription;
	@FindBy(xpath = "//div[.='- Select Customer -']")
	private WebElement selectCustomerDD;
	@FindBy(xpath = "//div[.='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompany;
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createCustmerBtn;
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div")
	private WebElement actualCustomer;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getCustomerNameTbx() {
		return customerNameTbx;
	}

	public WebElement getCustomerDescription() {
		return customerDescription;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getOurCompany() {
		return ourCompany;
	}

	public WebElement getCreateCustmerBtn() {
		return createCustmerBtn;
	}

	public WebElement getActualCustomer() {
		return actualCustomer;
	}
	
}
