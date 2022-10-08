package com.base;

import org.apache.log4j.Logger;

import com.keywords.Keyword;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseForCucumber {
	public static final Logger log = Logger.getLogger(BaseForCucumber.class);
	@Before
	public void setUp(String browserName) throws Exception {
		if (browserName == null) {
			browserName = "Chrome";
		}
		if (browserName.isEmpty()) {
			browserName = "Chrome";
			log.info("Setting Default browser as : "+browserName);
		}
		Keyword.openBrowser(browserName);
	}
	@After
	public void tearDown() throws Exception {
		Keyword.closeBrowser();
	}
}
