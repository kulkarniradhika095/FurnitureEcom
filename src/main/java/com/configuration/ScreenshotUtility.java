package com.configuration;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.BaseForTestNg;

import io.qameta.allure.Attachment;

public class ScreenshotUtility implements ITestListener{
	
	@Attachment(value = "Screenshot", type = "image/png")
	@Override
	public void onTestFailure(ITestResult result) {
		BaseForTestNg base = new BaseForTestNg();
		TakesScreenshot ts = (TakesScreenshot)base.thread.get();
		byte[] data = ts.getScreenshotAs(OutputType.BYTES);
		try {
			FileUtils.writeByteArrayToFile(new File("/screenshots/sc1.png"), data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
