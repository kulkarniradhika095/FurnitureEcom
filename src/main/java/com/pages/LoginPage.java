package com.pages;

import org.apache.log4j.Logger;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.configuration.WaitFor;
import com.dataDriven.Environment;
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
	@FindBy(xpath = "//div[@class=\"popup-text text-center vert large-6 columns\"]")public WebElement signUpLoginText;
	@FindBy(xpath = "//span[@class=\"header-icon-link user-profile-icon\"]") public WebElement profileIcon;
	@FindBy(xpath = "//a[normalize-space()='Log In']")public WebElement loginIcon;
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")public WebElement signUp;
	@FindBy(xpath = "//input[@class=\"email required input_authentication\"]") public WebElement username;
	@FindBy(xpath = "//input[@class=\"required input_authentication\"]") public WebElement password;
	@FindBy(xpath = "//input[@class=\"button primary\"]") public WebElement loginButton;
	@FindBy(xpath = "//a[@id=\"facebook_login\"]") public WebElement facebookLogin;
	@FindBy(xpath = "//a[@id=\"google_login\"]")public WebElement googleLogin;
	@FindBy(xpath = "//a[@class=\"forget-password link-color\"]")public WebElement forgotPassword;
	@FindBy(xpath = "//a[@class=\"close-reveal-modal hide-mobile\"]")public static WebElement close;
	@FindBy(xpath = "//a[@id=\"logout\"]")public static WebElement logout;
	
	/*
	 * =================================================================Methods==========================================================================
	 */
	public void clickOnProfileIcon() {
		profileIcon.click();
		log.info("Hovered on Profile Icon");
	}
	public void verifyIfLoginIsProcessingSuccessfully() {
		profileIcon.click();
		WaitFor.time(3);
		loginIcon.click();
		log.info("Clicked On Login Button");
		WaitFor.time(5);
		username.sendKeys(Environment.EMAIL);
		log.info("Username is entered");
		password.sendKeys(Environment.PASSWORD);
		log.info("Password is entered");
		WaitFor.time(3);
		loginButton.click();
		log.info("Login successful");
	}
	
	public void clickOnCloseButton() {
		close.click();
		log.info("Login/SignUp Window is closed");
	}
	public void loadLoginPage() {
		profileIcon.click();
		log.info("Hovered on Profile Icon");
		WaitFor.time(3);
		loginIcon.click();
		log.info("Clicked On Login Button");
		WaitFor.time(5);
	}
	public void loadSignUpPage() {
		profileIcon.click();
		log.info("Hovered on Profile Icon");
		WaitFor.time(3);
		signUp.click();
		log.info("Clicked On SignUp Button");
		WaitFor.time(5);		
	}
	public void printSignupText() {
		loadSignUpPage();
		WaitFor.time(3);
		String text= signUpLoginText.getText();
		System.out.println(text);
	}
	public void printLoginText() {
		loadLoginPage();
		WaitFor.time(3);
		String text= signUpLoginText.getText();
		log.info(text);
	}
	public void logout() {
		logout.click();
		log.info("User logged out successfully");
	}
	
	
}
