package com.stepDefinition;

import com.dataDriven.FileRead;

import com.keywords.Keywords;
import com.pages.DealZone;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealZoneSteps {
	
	@Given("Open urbanLadder")
	public void launchUrbanladder() {
		Keywords.launchUrl(FileRead.url);
	}
	@When("hover on Deal Zone")
	public void hoverOnDealZone() throws InterruptedException {
		DealZone deal = new DealZone();
		deal.hoverOnDeal();
	}
	@Given("Click on Irresistibly Good Deals")
	public void clickOnIrresistiblyGoodDeals() {
		DealZone deal = new DealZone();
		deal.clickOnIrresistiblyGoodDeals();
	}
	@And("Click on Exclude Out Of Stock")
	public void clickOnExcludeOutOfStock() {
		DealZone deal = new DealZone();
		deal.tickExcludeCheckBox();
	}
	@Then("Check If In Stock Option is Displayed")
	 public void checkIfInStockOptionIsDisplayed() {
		DealZone deal = new DealZone();
		deal.checkIfInStockOptionIsDisplayed();
	}
}
