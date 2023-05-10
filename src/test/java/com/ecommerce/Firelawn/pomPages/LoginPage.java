package com.ecommerce.Firelawn.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	@FindBy(id="fl_email")
	private WebElement emailtf;
	
	@FindBy(id="fl_password")
	private WebElement pwdtf;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginbutton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public HomePage logindetails(String mail, String pwd)
	{
		emailtf.sendKeys(mail);
		pwdtf.sendKeys(pwd);
		loginbutton.click();
		return new HomePage(driver);
		
	}

	public WebElement getEmailtf() {
		return emailtf;
	}

	public WebElement getPwdtf() {
		return pwdtf;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	

}
