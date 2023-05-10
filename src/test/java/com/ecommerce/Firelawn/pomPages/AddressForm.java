package com.ecommerce.Firelawn.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressForm {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='John Doe']")
	private WebElement nameTB;
	
	@FindBy(xpath="//input[@placeholder='eg-142/87, ABC Apartment']")
	private WebElement houseTB;
	
	@FindBy(xpath="//input[@placeholder='eg-4th streetInfo']")
	private WebElement streetTB;
	
	@FindBy(xpath="//input[@placeholder='eg-near This and That']")
	private WebElement landmarkTB;
	
	@FindBy(xpath="//option[text()='Country']")
	private WebElement countrydd;
	
	@FindBy(xpath="//option[text()='State']")
	private WebElement statedd;
	
	@FindBy(xpath="//option[text()='City']")
	private WebElement citydd;
	
	@FindBy(id="outlined-adornment-pincode")
	private WebElement pincodeTB;
	
	@FindBy(id="outlined-size-small")
	private WebElement phonenumTB;
	
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addaddressbtn;
	
	public AddressForm(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	
	public AddressPage addressdetails(String name,String house,String street,String landmark,String pin,String phone) 
	{
		nameTB.sendKeys(name);
		houseTB.sendKeys(house);
		streetTB.sendKeys(street);
		landmarkTB.sendKeys(landmark);
		pincodeTB.sendKeys(pin);
		phonenumTB.sendKeys(phone);
		addaddressbtn.click();
		return new AddressPage(driver);
		
	}



	public WebElement getNameTB() {
		return nameTB;
	}



	public WebElement getHouseTB() {
		return houseTB;
	}



	public WebElement getStreetTB() {
		return streetTB;
	}



	public WebElement getLandmarkTB() {
		return landmarkTB;
	}



	public WebElement getCountrydd() {
		return countrydd;
	}



	public WebElement getStatedd() {
		return statedd;
	}



	public WebElement getCitydd() {
		return citydd;
	}



	public WebElement getPincodeTB() {
		return pincodeTB;
	}



	public WebElement getPhonenumTB() {
		return phonenumTB;
	}



	public WebElement getAddaddressbtn() {
		return addaddressbtn;
	}
	
	
}
