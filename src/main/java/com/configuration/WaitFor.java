package com.configuration;

import java.time.Duration;
import org.openqa.selenium.support.ui.FluentWait;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.keywords.Keyword;

public class WaitFor {
private static FluentWait<WebDriver> wait = null;
	
	static{
		wait = new FluentWait<WebDriver>(Keyword.driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withMessage("Wait is finished and element is not loaded or available..!");
		
	}
	
	public static void elementToBePresent(By locator) {
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

	public static void elementToBeClickable(WebElement element) {
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void time(int durationInSeconds) {
		long startTime = System.currentTimeMillis();
		long endTime = startTime+(durationInSeconds*1000);
		while (startTime<=endTime) {
			startTime = System.currentTimeMillis();
		}
	}
}
