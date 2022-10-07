package com.pageTests;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.base.BaseForTestNg;
import com.dataDriven.FileRead;
import com.keywords.Keywords;
import com.pages.SearchPage;

public class SearchTests extends BaseForTestNg{
	@Test
	public void checkIfInvalidSymbolsDeniedBySearchBar() throws AWTException, InterruptedException, IOException {
		Keywords.launchUrl(FileRead.url);
		SearchPage search = new SearchPage();
		search.enterSymbol();
		search.searchMagnifier.click();
	}
	@Test
	public void checkIfNumbersDeniedBySearchBar() throws AWTException, InterruptedException {
		Keywords.launchUrl(FileRead.url);
		SearchPage search = new SearchPage();
		search.enterNumber();
		search.searchMagnifier.click();
	}
	
}
