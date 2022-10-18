package com.pageTests;

import java.net.SocketException;


import java.net.SocketTimeoutException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseForTestNg;
import com.dataDriven.Environment;
import com.keywords.Keyword;
import com.onTestFailure.AllureListners;
import com.pages.CartPage;

@Listeners({AllureListners.class})
public class CartTests extends BaseForTestNg{
	@Test
	public void verifyCartPageLogin() throws InterruptedException, SocketTimeoutException, SocketException {
		Keyword.launchUrl(Environment.url);
		LoginTests login = new LoginTests();
		login.verifyIfLoginIsTakingPlaceSuccessfully();
		CartPage cart = new CartPage();
		cart.clickOnCartIcon();
		Thread.sleep(3000);
		cart.clickOnContinueShopping();
		LivingRoomTests living = new LivingRoomTests();
		living.verifyIfLivingRoomDropBoxOpens();
	}
}
