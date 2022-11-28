package com.keywords;

import java.awt.image.BufferedImage;
import java.io.File;


import java.io.IOException;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.configuration.WaitFor;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Keyword {
	public static WebDriver driver;
	private static final Logger log = Logger.getLogger(Keyword.class);

	public static WebDriver openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("disable-notifications", "start-maximized");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(option);
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		log.info(browserName + " browser has launched successfully..!");
		return driver;

	}

	public static void launchUrl(String url) {
		driver.get(url);
		log.info(url + " : url is launched");
	}

	public static void closeBrowser() {
		driver.quit();
		log.info("Browser is closed");
	}

	public static String getProductsList(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		return text;
	}

	public static void goToPage(WebElement element) {
		element.click();
		log.info("Reloaded to " + element.getText() + " page");
	}

	public static void sortBy(WebElement element, WebElement element1) throws InterruptedException {
		element.click();
		Thread.sleep(2000);
		element1.click();
	}

	public static String getScreenShot(String testCaseName) throws IOException {
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, destination);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
	}

	public static void checkIfTheElementIsDisplayed(WebElement element) {
		WaitFor.elementToBeClickable(element);
		element.isDisplayed();
		log.info("Logo is present on the page");
	}

	public static void switchToWindow(String byTitle) {
		Set<String> handles = driver.getWindowHandles();
		for (String pointedWindowHandle : handles) {
			String s = driver.switchTo().window(pointedWindowHandle).getTitle();
			if (s.contains(byTitle)) {
				break;
			}
		}
	}
	public static void wholePageScreenshot() throws IOException {
		AShot shot = new AShot();
		shot.shootingStrategy(ShootingStrategies.viewportPasting(1000));
		Screenshot sc = shot.takeScreenshot(driver);
		BufferedImage image = sc.getImage();
		ImageIO.write(image, "JPG", new File("SC1.jpg"));
	}
	
}
