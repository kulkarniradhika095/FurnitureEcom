package com.pages;

import org.apache.log4j.Logger;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.configuration.WaitFor;
import com.keywords.Keyword;


public class LoginPage extends Keyword{
	
	private static final Logger log = Logger.getLogger(LoginPage.class);
	/*
	 * ===============================================================Constructor========================================================================
	 */
	public LoginPage() {
		PageFactory.initElements(driver, this);
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
	}
	public void verifyIfLoginIsProcessingSuccessfully(String Email , String Password) {
		profileIcon.click();
		WaitFor.time(3);
		loginIcon.click();
		log.info("Clicked On Login Button");
		WaitFor.time(3);
		username.sendKeys(Email);
		log.info("Username is entered");
		password.sendKeys(Password);
		log.info("Password is entered");
		WaitFor.time(3);
		loginButton.click();
		log.info("Login successful");
	}
	
	public void clickOnCloseButton() {
		close.click();
		log.info("Login/SignUp Window is closed");
	}
	
}
