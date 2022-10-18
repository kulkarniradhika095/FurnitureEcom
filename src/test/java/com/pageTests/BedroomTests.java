package com.pageTests;

import org.testng.annotations.Test;

import com.base.BaseForTestNg;
import com.dataDriven.Environment;
import com.keywords.Keyword;
import com.pages.BedroomPage;

public class BedroomTests extends BaseForTestNg {
	@Test
	public void checkBedroomDropdownItems() {
		Keyword.launchUrl(Environment.url);
		BedroomPage bedroom = new BedroomPage();
		bedroom.clickOnBedroomTab();
		bedroom.saveItems();
		
	}
}
