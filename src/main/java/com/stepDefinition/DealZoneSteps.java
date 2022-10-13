package com.stepDefinition;

import com.dataDriven.Environment;


import com.keywords.Keyword;
import com.pages.DealZonePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealZoneSteps {
	
	@Given("Open urbanLadder")
	public void launchUrbanladder() {
		Keyword.launchUrl(Environment.url);
	}
	@When("hover on Deal Zone")
	public void hoverOnDealZone() throws InterruptedException {
		DealZonePage deal = new DealZonePage();
		deal.hoverOnDeal();
	}
	@Given("Click on Irresistibly Good Deals")
	public void clickOnIrresistiblyGoodDeals() {
		DealZonePage deal = new DealZonePage();
		deal.clickOnIrresistiblyGoodDeals();
	}
	@And("Click on Exclude Out Of Stock")
	public void clickOnExcludeOutOfStock() {
		DealZonePage deal = new DealZonePage();
		deal.tickExcludeCheckBox();
	}
	@Then("Check If In Stock Option is Displayed")
	 public void checkIfInStockOptionIsDisplayed() {
		DealZonePage deal = new DealZonePage();
		deal.checkIfInStockOptionIsDisplayed();
	}
}
