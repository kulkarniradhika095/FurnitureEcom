package com.pageTests;

import java.net.SocketException;




import java.net.SocketTimeoutException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseForTestNg;
import com.configuration.WaitFor;
import com.dataDriven.Environment;
import com.keywords.Keyword;
import com.onTestFailure.AllureListners;
import com.pages.LoginPage;

@Listeners({AllureListners.class})
public class LoginTests extends BaseForTestNg{
	@Test(groups = {"loginTests"},priority = 1)
	public void verifyIfLoginIsTakingPlaceSuccessfully()throws SocketException, SocketTimeoutException {
		Keyword.launchUrl(Environment.url);
		WaitFor.time(3);
		LoginPage profile = new LoginPage();
		profile.verifyIfLoginIsProcessingSuccessfully();
	}
	@Test(groups = {"loginTests"})
	public void verifyIfFacebookAndGooglePageIsRedirecting() {
		Keyword.launchUrl(Environment.url);
		LoginPage profile = new LoginPage();
		profile.loadLoginPage();
		String Page = "Facebook";
		//String Page = "Google";
		switch (Page) {
		case "Facebook":
			profile.facebookLogin.click();
			break;
		case "Google":
			profile.googleLogin.click();
			break;
		}
	}
	@Test(groups = {"loginTests"})
	public void verifyIfCloseButtonIsWorking() {
		Keyword.launchUrl(Environment.url);
		LoginPage profile = new LoginPage();
		profile.loadLoginPage();
		profile.clickOnCloseButton();
	}
	@Test(groups = {"loginTests"})
	public void getTextOfSignUpPage() {
		Keyword.launchUrl(Environment.url);
		LoginPage profile = new LoginPage();
		profile.printSignupText();
	}
	@Test(groups = {"loginTests"})
	public void getTextOfLoginPage() {
		Keyword.launchUrl(Environment.url);
		LoginPage profile = new LoginPage();
		profile.printLoginText();
	}
}
