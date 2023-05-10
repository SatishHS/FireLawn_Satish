package com.ecommerce.Firelawn.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	@FindBy(id="search")
	private WebElement searchTB;
	
	@FindBy(id="search_prod")
	private WebElement searchBtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public ProductPage searchelements(String productname)
	{
		searchTB.sendKeys(productname);
		searchBtn.click();
		return new ProductPage(driver);
	}

	public WebElement getSearchTB() {
		return searchTB;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	


	
	
	
	
	

}
