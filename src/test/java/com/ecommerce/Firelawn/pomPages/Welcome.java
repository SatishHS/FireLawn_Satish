package com.ecommerce.Firelawn.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome {
	public WebDriver driver;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginbtn;
	
	public Welcome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public LoginPage loginBtn()
	{
		loginbtn.click();
		return new LoginPage(driver);
	}
	
	

}
