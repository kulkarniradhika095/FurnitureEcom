package com.pageTests;

import java.net.SocketException;
import java.net.SocketTimeoutException;

import org.testng.annotations.Test;

import com.base.BaseForTestNg;
import com.dataDriven.FileRead;
import com.keywords.Keywords;
import com.pages.CartPage;

public class CartTests extends BaseForTestNg{
	@Test
	public void verifyCartPageLogin() throws InterruptedException, SocketTimeoutException, SocketException {
		Keywords.launchUrl(FileRead.url);
		LoginTests login = new LoginTests();
		login.verifyIfLoginIsTakingPlaceSuccessfully();
		CartPage cart = new CartPage();
		cart.clickOnCartIcon();
		Thread.sleep(3000);
		cart.clickOnContinueShopping();
		LivingRoomTests living = new LivingRoomTests();
		living.verifyIfLivingRoomDropBoxOpensAndComparesSelectedItems();
	}
}
