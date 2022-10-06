package com.pageTests;

import java.net.SocketException;

import java.net.SocketTimeoutException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.base.BaseForTestNg;
import com.dataDriven.FileRead;
import com.keywords.Keywords;
import com.pages.LoginPage;


public class LoginTests extends BaseForTestNg{
	private static final Logger log = Logger.getLogger(LoginTests.class);
	@Test
	public void verifyIfLoginIsTakingPlaceSuccessfully()throws SocketException, SocketTimeoutException {
		Keywords.launchUrl(FileRead.url);
		LoginPage profile = new LoginPage();
		profile.clickOnProfileIcon();
		profile.clickOnLoginButton();
		profile.enterEmail();
		profile.enterPassword();
		profile.login();
	}
	@Test
	public void verifyIfFacebookAndGooglePageIsRedirecting() {
		Keywords.launchUrl(FileRead.url);
		LoginPage profile = new LoginPage();
		profile.clickOnProfileIcon();
		profile.clickOnLoginButton();
		//String Page = "Facebook";
		String Page = "Google";
		switch (Page) {
		case "Facebook":
			profile.facebookLogin.click();
			break;
		case "Google":
			profile.googleLogin.click();
			break;
		}
	}
	@Test
	public void verifyIfCloseButtonIsWorking() {
		Keywords.launchUrl(FileRead.url);
		LoginPage profile = new LoginPage();
		profile.clickOnProfileIcon();
		profile.clickOnLoginButton();
		profile.clickOnCloseButton();
	}
}
