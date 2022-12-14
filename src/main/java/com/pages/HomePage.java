package com.pages;

import org.apache.log4j.Logger;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.keywords.Keyword;


public class HomePage extends Keyword{
	private static final Logger log = Logger.getLogger(HomePage.class);
	@FindBy(xpath = "//input[@class=\"typeahead tt-input\"]") public WebElement searchBar;
	@FindBy(xpath = "//span[@class=\"search-icon icofont-search\"]") public WebElement searchMagnifier;
	@FindBy(xpath = "//figure[@class=\"header__topBar_logo\"]") public WebElement websiteLogo;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void enterSymbol() {
		JavascriptExecutor jse = (JavascriptExecutor)Keyword.driver; 
		jse.executeScript("document.getElementById(\'search\').value=\'!@#$%\'");
		log.info("Entered symbols using JSE");
	}
	public void enterNumber() {
		JavascriptExecutor jse = (JavascriptExecutor)Keyword.driver; 
		jse.executeScript("arguments[0].value='123456'", searchBar);
		log.info("Entered numbers using JSE");
	}
	
	
}
