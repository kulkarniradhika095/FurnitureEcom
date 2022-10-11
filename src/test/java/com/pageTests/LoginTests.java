package com.pageTests;

import java.net.SocketException;



import java.net.SocketTimeoutException;

import org.testng.annotations.Test;

import com.base.BaseForTestNg;
import com.configuration.WaitFor;
import com.dataDriven.FileRead;
import com.keywords.Keyword;
import com.pages.LoginPage;


public class LoginTests extends BaseForTestNg{
	@Test
	public void verifyIfLoginIsTakingPlaceSuccessfully()throws SocketException, SocketTimeoutException {
		Keyword.launchUrl(FileRead.url);
		WaitFor.time(3);
		Keyword.Login();
	}
	@Test
	public void verifyIfFacebookAndGooglePageIsRedirecting() {
		Keyword.launchUrl(FileRead.url);
		LoginPage profile = new LoginPage();
		Keyword.Login();
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
		Keyword.launchUrl(FileRead.url);
		LoginPage profile = new LoginPage();
		Keyword.Login();
		profile.clickOnCloseButton();
	}
}
