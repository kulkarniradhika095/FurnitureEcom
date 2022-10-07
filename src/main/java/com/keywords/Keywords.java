package com.keywords;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keywords {
	public static RemoteWebDriver driver;
	private static final Logger log = Logger.getLogger(Keywords.class);

	public static void launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		log.info(browserName+" : browser has been launched successfully");
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
		log.info(url+" : url is launched");
	}

	public static void closeBrowser() {
		driver.close();
		log.info("Browser is closed");
	}
	public static void hoverOnImage(WebElement WebElement) {
		Actions act = new Actions(Keywords.driver); 
		act.moveToElement(WebElement);
		log.info("Product is highlighted");
	}
	public static void keyPress() throws AWTException, InterruptedException {
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}
	
	
}
