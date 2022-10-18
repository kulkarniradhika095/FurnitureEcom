package com.pageTests;

import java.net.SocketException;




import java.net.SocketTimeoutException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseForTestNg;
import com.configuration.ScreenshotUtility;
import com.dataDriven.Environment;
import com.keywords.Keyword;
import com.pages.WishlistPage;
@Listeners({ScreenshotUtility.class})
public class WishlistTests extends BaseForTestNg{
	
	@Test
	public void verifyIfTheCartPageIsLoading() throws InterruptedException, SocketException,SocketTimeoutException {
		Keyword.launchUrl(Environment.url);
		WishlistPage cart = new WishlistPage();
		cart.clickOnwishlistIcon();
		cart.clickOnBottonLogin();
		cart.enterEmail();
		cart.enterPassword();
		cart.clickLogin();
	}
}
