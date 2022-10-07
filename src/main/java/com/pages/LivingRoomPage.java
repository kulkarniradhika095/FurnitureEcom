package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.keywords.Keywords;

public class LivingRoomPage {
	private static final Logger log = Logger.getLogger(LoginPage.class);
	public LivingRoomPage() {
		PageFactory.initElements(Keywords.driver, this);
	}
	@FindBy(xpath = "//li[@class=\"topnav_item livingunit\"]") public WebElement Living;
	@FindBy(xpath = "//a[@href=\"/coffee-table?src=g_topnav_living_tables_coffee-tables\"]") public WebElement coffeeTable;
	@FindBy(xpath = "//img[@class=\"product-img-default\"]") public WebElement coffeeTable1;
	@FindBy(xpath = "//a[@href=\"/products/kivaha-4-seater-coffee-table-set?sku=FNCFWLMB4003004&src=subcat\"]") public WebElement coffeeTable1Options;
	
	public void hoverOnLiving() throws InterruptedException {
		Thread.sleep(2000);
		Living.click();
		log.info("hovered on LivingRoom Tab");
	}
	public void clickOnCoffeeTable() throws InterruptedException {
		Thread.sleep(3000);
		coffeeTable.click();
		log.info("Coffee-Table page is opened");
	}
	public void hoveredOnImage() throws InterruptedException {
		Thread.sleep(3000);
		Keywords.hoverOnImage(coffeeTable1);
		Thread.sleep(3000);
	}
	public void clickOnViewOptions() throws InterruptedException {
		Thread.sleep(3000);
		coffeeTable1Options.click();
	}
}
