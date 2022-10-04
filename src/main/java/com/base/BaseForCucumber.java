package com.base;

import org.apache.log4j.Logger;

import com.dataDriven.FileReading;
import com.keywords.UIKeywords;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseForCucumber {
	private static final Logger log = Logger.getLogger(BaseForCucumber.class);
	String browserName = FileReading.Browser;
	@Before
	public void setUp() throws Exception {
		if (browserName == null) {
			browserName = "Chrome";
		}
		if (browserName.isEmpty()) {
			browserName = "Chrome";
			log.info("Setting Default browser as : "+browserName);
		}
		UIKeywords.launchBrowser(browserName);
	}
	@After
	public void tearDown() throws Exception {
		UIKeywords.closeBrowser();
	}
}
