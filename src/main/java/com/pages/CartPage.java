package com.pages;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.keywords.Keyword;

public class CartPage {
	private static final Logger log = Logger.getLogger(CartPage.class);
	
	public CartPage() {
		PageFactory.initElements(Keyword.driver, this);
	}
	
	@FindBy(xpath = "//div[@id=\"cart-badge\"]") public WebElement cartIcon;
	@FindBy(xpath = "//a[@href=\"/?src=cart_contshop\"]") public WebElement continueShopping;
	
	public void clickOnCartIcon() {
		cartIcon.click();
		log.info("Clicked on cart icon");
	}
	public void clickOnContinueShopping() {
		continueShopping.click();
		log.info("Clicked on continue shopping icon");
	}
}
