package com.stepDefinition;

import com.dataDriven.Environment;


import com.keywords.Keyword;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class SearchPageSteps {
	@Given("Open urbanLadder")
	public void launchUrbanladder() {
		Keyword.launchUrl(Environment.url);
	}
	@And("Click On Search Window")
	public void clickOnSearchIcon() {
		
	}
}
