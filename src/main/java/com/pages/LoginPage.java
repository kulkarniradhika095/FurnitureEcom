package com.pages;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.configuration.WaitFor;
import com.dataDriven.FileRead;
import com.keywords.Keywords;


public class LoginPage {
	
	private static final Logger log = Logger.getLogger(LoginPage.class);
	/*
	 * ===============================================================Constructor========================================================================
	 */
	public LoginPage() {
		PageFactory.initElements(Keywords.driver,this);
	}
	/*
	 * ==================================================================Xpaths==========================================================================
	 */
	@CacheLookup
	@FindBy(xpath = "//span[@class=\"header-icon-link user-profile-icon\"]") public WebElement profileIcon;
	@FindBy(xpath = "//a[@class=\"login-link authentication_popup\"]")public WebElement loginIcon;
	@FindBy(xpath = "//a[@class=\"signup-link authentication_popup\"]")public WebElement signUp;
	@FindBy(xpath = "//input[@class=\"email required input_authentication\"]") public WebElement username;
	@FindBy(xpath = "//input[@class=\"required input_authentication\"]") public WebElement password;
	@FindBy(xpath = "//input[@class=\"button primary\"]") public WebElement loginButton;
	@FindBy(xpath = "//a[@id=\"facebook_login\"]") public WebElement facebookLogin;
	@FindBy(xpath = "//a[@id=\"google_login\"]")public WebElement googleLogin;
	@FindBy(xpath = "//a[@class=\"forget-password link-color\"]")public WebElement forgotPassword;
	@FindBy(xpath = "//a[@class=\"close-reveal-modal hide-mobile\"]")public static WebElement close;
	
	
	
	
	/*
	 * =================================================================Methods==========================================================================
	 */
	public void clickOnProfileIcon() {
		profileIcon.click();
		log.info("Hovered on Profile Icon");
		WaitFor wait = new WaitFor();
	}
	public void clickOnLoginButton() {
		WaitFor wait = new WaitFor();
		loginIcon.click();
		log.info("Clicked On Login Button");
		wait.time(3);
	}
	public void enterEmail() {
		username.sendKeys(FileRead.EMAIL);
		log.info("Username is entered");
	}
	public void enterPassword() {
		password.sendKeys(FileRead.PASSWORD);
		log.info("Password is entered");
	}
	public void login() {
		loginButton.click();
		log.info("Login successful");
	}
	public void clickOnCloseButton() {
		close.click();
		log.info("Login/SignUp Window is closed");
	}
	
}
