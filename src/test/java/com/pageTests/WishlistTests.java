package com.pageTests;

import java.net.SocketException;



import java.net.SocketTimeoutException;

import org.testng.annotations.Test;

import com.base.BaseForTestNg;
import com.dataDriven.FileRead;
import com.keywords.Keyword;
import com.pages.WishlistPage;

public class WishlistTests extends BaseForTestNg{
	
	@Test
	public void verifyIfTheCartPageIsLoading() throws InterruptedException, SocketException,SocketTimeoutException {
		Keyword.launchUrl(FileRead.url);
		WishlistPage cart = new WishlistPage();
		cart.clickOnwishlistIcon();
		cart.clickOnBottonLogin();
		cart.enterEmail();
		cart.enterPassword();
		cart.clickLogin();
	}
}
