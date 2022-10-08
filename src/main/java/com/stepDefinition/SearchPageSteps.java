package com.stepDefinition;

import com.dataDriven.FileRead;

import com.keywords.Keyword;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class SearchPageSteps {
	@Given("Open urbanLadder")
	public void launchUrbanladder() {
		Keyword.launchUrl(FileRead.url);
	}
	@And("Click On Search Window")
	public void clickOnSearchIcon() {
		
	}
}
