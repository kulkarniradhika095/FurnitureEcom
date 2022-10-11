package com.keywords;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.dataDriven.FileRead;
import com.pages.LoginPage;

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
	public static void Login() {
		launchUrl(FileRead.url);
		LoginPage login = new LoginPage();
		login.verifyIfLoginIsProcessingSuccessfully(FileRead.EMAIL, FileRead.PASSWORD);
	}
	public static String getProductsList(WebElement element) {
		return element.getText();
	}
	public static void goToPage(WebElement element) {
		element.click();
		log.info("Reloaded to "+element.getText()+" page");
	}
	public static void sortBy(WebElement element, WebElement element1) throws InterruptedException {
		element.click();
		Thread.sleep(2000);
		element1.click();
	}
}
