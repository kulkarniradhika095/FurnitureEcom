package com.pages;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dataDriven.FileRead;
import com.keywords.Keyword;

public class WishlistPage{
	private static final Logger log = Logger.getLogger(LoginPage.class);
	
	
	@FindBy(xpath = "//div[@id=\"shortlist-badge\"]") public WebElement wishlistIcon;
	@FindBy(xpath = "//a[@class=\"login-link link-color\"]") public WebElement loginBottom;
	@FindBy(xpath = "//input[@class=\"email required input_authentication\"]") public WebElement cartUsername;
	@FindBy(xpath = "//input[@class=\"required input_authentication\"]") public WebElement cartPassword;
	@FindBy(xpath = "//input[@class=\"button primary\"]") public WebElement Login;
	@FindBy(xpath = "//a[@class=\"show-password link-color small\"]") public WebElement showPassword;
	@FindBy(xpath = "//a[@class=\"hide-password link-color small\"]") public WebElement hidePassword;
	
	public WishlistPage() {
		PageFactory.initElements(Keyword.driver, this);
	}
	public void clickOnwishlistIcon() throws InterruptedException {
		wishlistIcon.click();
		log.info("Clicked on Wishlist Icon");
		Thread.sleep(3000);
	}
	public void enterEmail() {
		cartUsername.sendKeys(FileRead.EMAIL);
		log.info("Entered Email");
	}
	public void enterPassword() {
		cartPassword.sendKeys(FileRead.PASSWORD);
		log.info("Entered Password");
	}
	public void clickOnShowPassword() {
		showPassword.click();
		log.info("Clicked on show password");
	}
	public void clickOnHidePassword() {
		hidePassword.click();
		log.info("Clicked on hide password");
	}
	public void clickOnBottonLogin() {
		loginBottom.click();
		log.info("Switched to login page");
	}
	public void clickLogin() {
		Login.click();
		log.info("Clicked on final login");
	}
}
