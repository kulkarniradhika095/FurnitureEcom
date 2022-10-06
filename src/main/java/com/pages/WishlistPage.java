package com.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dataDriven.FileRead;
import com.keywords.Keywords;

public class WishlistPage{

	public WishlistPage() {
		PageFactory.initElements(Keywords.driver, this);
	}
	
	@FindBy(xpath = "//div[@id=\"shortlist-badge\"]") public WebElement wishlistIcon;
	@FindBy(xpath = "//a[@class=\"login-link link-color\"]") public WebElement loginBottom;
	@FindBy(xpath = "//input[@class=\"email required input_authentication\"]") public WebElement cartUsername;
	@FindBy(xpath = "//input[@class=\"required input_authentication\"]") public WebElement cartPassword;
	@FindBy(xpath = "//input[@class=\"button primary\"]") public WebElement Login;
	@FindBy(xpath = "//a[@class=\"show-password link-color small\"]") public WebElement showPassword;
	@FindBy(xpath = "//a[@class=\"hide-password link-color small\"]") public WebElement hidePassword;
	

	public void clickOnwishlistIcon() throws InterruptedException {
		wishlistIcon.click();
		Thread.sleep(3000);
	}
	public void enterEmail() {
		cartUsername.sendKeys(FileRead.EMAIL);
	}
	public void enterPassword() {
		cartPassword.sendKeys(FileRead.PASSWORD);
	}
	public void clickOnShowPassword() {
		showPassword.click();
	}
	public void clickOnHidePassword() {
		hidePassword.click();
	}
	public void clickOnBottonLogin() {
		loginBottom.click();
	}
	public void clickLogin() {
		Login.click();
	}
}
