package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseForTestNg;
import com.keywords.Keyword;

public class DealZone extends Keyword {
	/*
	 * =======================Xpaths/css=================
	 */
	@CacheLookup
	@FindBy(xpath = "//li[@class=\"topnav_item dealzoneunit\"]")public WebElement DealZone;
	@FindBy(xpath = "//ul[@class='inline-list left']")public WebElement DealZoneDropdown;
	@FindBy(xpath = "//a[@href=\"/Irresistibly-good-deals?src=g_topnav_deal-zone_top-deals_irresistibly-good-deals\"]")public WebElement IrresistiblyGoodDeals;
	@FindBy(xpath = "//input[@id=\"filters_availability_In_Stock_Only\"]")public WebElement ExcludeCheckbox;
	@FindBy(xpath = "//a[@class='close-reveal-modal hide-mobile']")public WebElement close;
	@FindBy(xpath = "//span[@class=\"text\"]")public WebElement InStock;
	/*
	 * ==========================Methods==================
	 */
	public DealZone() {
		PageFactory.initElements(driver,this);
	}
	public void hoverOnDeal() throws InterruptedException {
		Keyword.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		DealZone.click();
	}
	public String getData() {
		String list  = DealZoneDropdown.getText();
		System.out.println(list);
		return list;
	}
	public void clickOnIrresistiblyGoodDeals() {
		IrresistiblyGoodDeals.click();
		Keyword.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	public void tickExcludeCheckBox() {
		Keyword.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		close.click();
		ExcludeCheckbox.click();
		Keyword.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	public void checkIfInStockOptionIsDisplayed() {
		Boolean result = InStock.isDisplayed();
		System.out.println("In Stock Option is Displayed? : "+result);
	}
}
