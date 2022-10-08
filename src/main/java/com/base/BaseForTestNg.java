package com.base;

import org.apache.log4j.Logger;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.keywords.Keyword;


public class BaseForTestNg {
	public static final Logger log = Logger.getLogger(BaseForTestNg.class);
	
	@Parameters("browser-name")
	@BeforeMethod
	public void setUp(@Optional String browserName) throws Exception {
		if (browserName == null) {
			browserName = "Chrome";
		}
		if (browserName.isEmpty()) {
			browserName = "Chrome";
			log.info("Setting Default browser as : "+browserName);
		}
		Keyword.openBrowser(browserName);
	}
	@AfterMethod
	public void tearDown() throws Exception {
		Keyword.closeBrowser();
	}
}
