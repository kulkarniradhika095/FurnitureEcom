package com.configuration;

import java.io.File;

import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.BaseForTestNg;



public class ScreenshotUtility implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result) {
	}
	@Override
	public void onTestSuccess(ITestResult result) {

	}
	@Override
	public void onTestSkipped(ITestResult result) {

	}
	@Override
	public void onTestStart(ITestResult result) {

	}
		
	public String getScreenshot(String testCaseName) throws IOException {
		BaseForTestNg base = new BaseForTestNg();
		TakesScreenshot ts = (TakesScreenshot)base.thread.get();
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+"//reports//"+testCaseName+".png");
		FileUtils.copyFile(source, destination);
		return System.getProperty("user.dir")+"//reports//"+testCaseName+".png";
	}
}
