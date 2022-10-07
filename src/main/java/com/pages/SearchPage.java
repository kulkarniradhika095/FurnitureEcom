package com.pages;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.keywords.Keywords;


public class SearchPage {
	private static final Logger log = Logger.getLogger(SearchPage.class);
	public SearchPage() {
		PageFactory.initElements(Keywords.driver, this);
	}
	@FindBy(xpath = "//input[@class=\"typeahead tt-input\"]") public WebElement searchBar;
	@FindBy(xpath = "//span[@class=\"search-icon icofont-search\"]") public WebElement searchMagnifier;
	
	public void enterSymbol() {
		JavascriptExecutor jse = (JavascriptExecutor)Keywords.driver; 
		jse.executeScript("document.getElementById(\'search\').value=\'!@#$%\'");
		log.info("Entered symbols using JSE");
	}

	public void enterNumber() {
		JavascriptExecutor jse = (JavascriptExecutor)Keywords.driver; 
		jse.executeScript("arguments[0].value='123456'", searchBar);
		log.info("Entered numbers using JSE");
	}
	
}
