package com.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.keywords.Keyword;


public class BaseForTestNg {
	public WebDriver driver;
	public ThreadLocal<WebDriver> thread = new ThreadLocal<>();
	public static final Logger log = Logger.getLogger(BaseForTestNg.class);
	
	@Parameters("browser-name")
	@BeforeTest(alwaysRun = true)
	public void setUp(@Optional String browserName) throws Exception {
		if (browserName == null) {
			browserName = "Chrome";
		}
		if (browserName.isEmpty()) {
			browserName = "Chrome";
			log.info("Setting Default browser as : "+browserName);
		}
		this.driver = Keyword.openBrowser(browserName);
		thread.set(driver);
	}
	@AfterTest(alwaysRun = true)
	public void tearDown() throws Exception {
		thread.get().quit();
		log.info("Browser is closed");
	}
}
