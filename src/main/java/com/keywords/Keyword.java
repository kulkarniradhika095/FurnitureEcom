package com.keywords;

import org.apache.log4j.Logger;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {
	public static RemoteWebDriver driver;
	private static final Logger log = Logger.getLogger(Keyword.class);
	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("disable-notifications","start-maximized");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(option);
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		log.info(browserName+" browser has launched successfully..!");

	}
	
	public static void launchUrl(String url) {
		driver.get(url);
		log.info(url+" : url is launched");
	}

	public static void closeBrowser() {
		driver.close();
		log.info("Browser is closed");
	}
	
}
