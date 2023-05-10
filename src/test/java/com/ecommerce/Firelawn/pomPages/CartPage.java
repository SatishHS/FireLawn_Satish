package com.ecommerce.Firelawn.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	public WebDriver driver;
	
	@FindBy(id="cbuynow_flart_fl")
	private WebElement buynow;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public AddressPage buynowbutton()
	{
		buynow.click();
		return new AddressPage(driver);
	}

}
