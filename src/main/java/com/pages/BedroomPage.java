package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.configuration.WaitFor;
import com.keywords.Keyword;

public class BedroomPage {
	/*
	 * =====================================================Constructor=================================================================
	 */
	public BedroomPage() {
		PageFactory.initElements(Keyword.driver	, this);
	}
	/*
	 * ======================================================xpaths/css=================================================================
	 */
	@CacheLookup
	@FindBy(xpath = "//li[@class='topnav_item bedroomunit']") public WebElement Bedroom;
	@FindBy(xpath = "//li[@class='topnav_item bedroomunit']//div[@class='subnavlist_wrapper clearfix']") public WebElement BedroomDropDown;
	
	/*
	 * =====================================================methods=====================================================================
	 */
	public void clickOnBedroomTab() {
		Bedroom.click();
		WaitFor.time(3);
	}

	public void saveItems() {
		String bedroomItems = BedroomDropDown.getText();
		//System.out.println(bedroomItems);
		String actualBedroomItems = "Beds\r\n"
				+ "Beds with Storage\r\n"
				+ "Beds without Storage\r\n"
				+ "King Size Beds\r\n"
				+ "Queen Size Beds\r\n"
				+ "Single Beds\r\n"
				+ "Double Beds\r\n"
				+ "Bed-Mattress Sets\r\n"
				+ "Upholstered Beds\r\n"
				+ "Trundle Beds\r\n"
				+ "Sofa cum Beds\r\n"
				+ "Bedroom Sets\r\n"
				+ "All Beds\r\n"
				+ "Mattresses\r\n"
				+ "All Mattresses\r\n"
				+ "King Size Mattress\r\n"
				+ "Queen Size Mattress\r\n"
				+ "Single Bed Mattress\r\n"
				+ "Double Bed Mattress\r\n"
				+ "Mattress By Material\r\n"
				+ "Mattress by Brand\r\n"
				+ "Mattress By Range\r\n"
				+ "Mattress By Firmness\r\n"
				+ "Mattress Protectors\r\n"
				+ "Pillows\r\n"
				+ "Storage & Accessories\r\n"
				+ "Wardrobes\r\n"
				+ "Bedside Tables\r\n"
				+ "Chest of Drawers\r\n"
				+ "Dressers & Mirrors\r\n"
				+ "Bedroom Benches\r\n"
				+ "Storage Chests\r\n"
				+ "Bedroom Chairs\r\n"
				+ "Plastic Storage\r\n"
				+ "Kids Room\r\n"
				+ "Kids Beds\r\n"
				+ "Kids Tables\r\n"
				+ "Bunk Beds\r\n"
				+ "Kids Seating\r\n"
				+ "Kids Decor";
		Assert.assertEquals(bedroomItems, actualBedroomItems);
	}
	
}
