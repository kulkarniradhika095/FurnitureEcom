package com.pageTests;

import java.awt.AWTException;


import java.io.IOException;

import org.testng.annotations.Test;

import com.base.BaseForTestNg;
import com.dataDriven.Environment;
import com.keywords.Keyword;
import com.pages.HomePage;

public class HomeTests extends BaseForTestNg{
	@Test(groups = {"loginTests"})
	public void checkIfInvalidSymbolsDeniedBySearchBar() throws AWTException, InterruptedException, IOException {
		Keyword.launchUrl(Environment.url);
		HomePage search = new HomePage();
		search.enterSymbol();
		search.searchMagnifier.click();
	}
	@Test(groups = {"loginTests"})
	public void checkIfNumbersDeniedBySearchBar() throws AWTException, InterruptedException {
		Keyword.launchUrl(Environment.url);
		HomePage search = new HomePage();
		search.enterNumber();
		search.searchMagnifier.click();
	}
	@Test
	public void checkLogo() {
		Keyword.launchUrl(Environment.url);
		HomePage page = new HomePage();
		Keyword.checkIfTheElementIsDisplayed(page.websiteLogo);
	}
	
}
