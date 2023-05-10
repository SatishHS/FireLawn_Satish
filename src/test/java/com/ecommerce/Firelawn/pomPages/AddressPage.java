package com.ecommerce.Firelawn.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	public WebDriver driver;
	
	@FindBy(xpath="//span[text()='Add New Address']")
	private WebElement addaddress;
	
	@FindBy(name="address")
	private WebElement addressradiobtn;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedbtn;
	
	public AddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public AddressForm addnewaddress()
	{
		addaddress.click();
		return new AddressForm(driver);
	}
	
	public void selectaddress()
	{
		addressradiobtn.click();
		proceedbtn.click();
		
	}

	public WebElement getAddressradiobtn() {
		return addressradiobtn;
	}

	public WebElement getProceedbtn() {
		return proceedbtn;
	}



}

