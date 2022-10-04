package com.base;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.keywords.UIKeywords;

public class BaseForTestNg {
	private static final Logger log = Logger.getLogger(BaseForCucumber.class);
	@BeforeClass
	public void setUp(String browserName) throws Exception {
		if (browserName == null) {
			browserName = "Chrome";
		}
		if (browserName.isEmpty()) {
			browserName = "Chrome";
			log.info("Setting Default browser as : "+browserName);
		}
		UIKeywords.launchBrowser(browserName);
	}
	@AfterClass
	public void tearDown() throws Exception {
		UIKeywords.closeBrowser();
	}
}
