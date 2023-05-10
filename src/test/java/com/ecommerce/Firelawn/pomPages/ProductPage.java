package com.ecommerce.Firelawn.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public WebDriver driver;
	
	@FindBy(xpath="(//button[text()='add to cart'])[1]")
	private WebElement addtocart1;
	
	@FindBy(xpath="(//button[text()='add to cart'])[2]")
	private WebElement addtocart2;
	
	@FindBy(id="cart_fl")
	private WebElement cartBtn;
	
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public CartPage addtocartbutton()
	{
		addtocart1.click();
		addtocart2.click();
		cartBtn.click();
		return new CartPage(driver);
	}

	public WebElement getAddtocart1() {
		return addtocart1;
	}

	public WebElement getAddtocart2() {
		return addtocart2;
	}

	public WebElement getCartBtn() {
		return cartBtn;
	}

	
	
	
	

}
