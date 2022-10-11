package com.pages;

import java.util.List;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.configuration.WaitFor;
import com.keywords.Keyword;


public class LivingRoomPage extends Keyword {
	private static final Logger log = Logger.getLogger(LivingRoomPage.class);
	public LivingRoomPage() {
		PageFactory.initElements(driver, this);
	}
	By LivingRoomProductsBy = By.xpath("//ul[@class=\\\"inline-list left\\\"]");
	@FindBy(xpath = "//li[@class=\"topnav_item livingunit\"]") public WebElement Living;
	@FindBy(xpath = "//a[@href=\"/coffee-table?src=g_topnav_living_tables_coffee-tables\"]") public WebElement coffeeTable;
	@FindBy(xpath = "//img[@class=\"product-img-default\"]") public WebElement coffeeTable1;
	@FindBy(xpath = "//a[@href=\"/products/kivaha-4-seater-coffee-table-set?sku=FNCFWLMB4003004&src=subcat\"]") public WebElement coffeeTable1Options;
	@FindBy(xpath = "//div[@class=\"item\"]")public WebElement sortBy;
	@FindBy(xpath = "//li[@class=\"option\"]")public WebElement recommeneded;
	@FindBy(xpath = "//li[contains(text(),'Discount')]")public WebElement discount;
	@FindBy(xpath = "//li[contains(text(),'New Arrivals')]")public WebElement newArrivals;
	@FindBy(xpath = "//li[contains(text(),'Price: Low to High')]")public WebElement lowToHigh;
	@FindBy(xpath = "//li[contains(text(),'Price: High to Low')]")public WebElement highToLow;
	
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
		coffeeTable1.click();
		Thread.sleep(3000);
	}
	public void clickOnViewOptions() throws InterruptedException {
		Thread.sleep(3000);
		coffeeTable1Options.click();
	}
	public void selectSortByRecommeneded() throws InterruptedException {
		sortBy.click();
		Thread.sleep(2000);
		recommeneded.click();
		log.info("Coffee-Table page is sorted according to recommeneded products");
	}
	public void selectSortByDiscount() throws InterruptedException {
		sortBy.click();
		Thread.sleep(2000);
		discount.click();
		log.info("Coffee-Table page is sorted according to discounted products");
	}
	public void selectSortByLowToHigh() throws InterruptedException {
		sortBy.click();
		Thread.sleep(2000);
		lowToHigh.click();
		log.info("Coffee-Table page is sorted according to low to high price");
	}
	public void selectSortByNewArrivals() throws InterruptedException {
		sortBy.click();
		Thread.sleep(2000);
		newArrivals.click();
		log.info("Coffee-Table page is sorted according to new arrivals");
	}
	public void selectSortByHighToLow() throws InterruptedException {
		sortBy.click();
		Thread.sleep(2000);
		highToLow.click();
		log.info("Coffee-Table page is sorted according to high to low price");
	}
	public List<String> getProductList() { 
		WaitFor.elementToBePresent(LivingRoomProductsBy);
		List<String> prod= Keyword.getListOfElementsSold(LivingRoomProductsBy);
		System.out.println(prod);
		return prod;
	}
	public void getProductByItsName() {
		
	}
	
	
}
