package com.pageTests;

import org.testng.annotations.Test;

import com.base.BaseForTestNg;
import com.dataDriven.Environment;
import com.keywords.Keyword;
import com.pages.BedroomPage;
import com.pages.LoginPage;

public class BedroomTests extends BaseForTestNg {
	@Test
	public void checkBedroomDropdownItems() {
		Keyword.launchUrl(Environment.url);
		BedroomPage bedroom = new BedroomPage();
		bedroom.clickOnBedroomTab();
		bedroom.saveItems();
	}

	@Test
	private void addBedroomProductsToCart() {
		Keyword.launchUrl(Environment.url);
		LoginPage login = new LoginPage();
		login.verifyIfLoginIsProcessingSuccessfully();
		BedroomPage bedroomItems = new BedroomPage();
		bedroomItems.addProductsToCart();
		bedroomItems.clickOnCheckOut();
	}
}
