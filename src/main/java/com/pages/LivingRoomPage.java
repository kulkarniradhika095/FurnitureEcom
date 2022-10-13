package com.pages;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.configuration.WaitFor;
import com.keywords.Keyword;

public class LivingRoomPage extends Keyword {
	private static final Logger log = Logger.getLogger(LivingRoomPage.class);

	public LivingRoomPage() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Close')]")
	public WebElement closeButtonLoginPage;
	@FindBy(xpath = "//div[@class=\"subnavlist_wrapper clearfix\"]")
	public WebElement LivingRoomProductsBy;
	@FindBy(xpath = "//li[@class=\"topnav_item livingunit\"]")
	public WebElement Living;
	@FindBy(xpath = "//a[@href=\"/coffee-table?src=g_topnav_living_tables_coffee-tables\"]")
	public WebElement coffeeTable;
	@FindBy(xpath = "//a[@href=\"/products/kivaha-4-seater-coffee-table-set?sku=FNCFWLMB4003004&src=subcat\"]")
	public WebElement coffeeTable1;
	@FindBy(xpath = "//div[@class=\"item\"]")
	public WebElement sortBy;
	@FindBy(xpath = "//li[@class=\"option\"]")
	public WebElement recommeneded;
	@FindBy(xpath = "//li[contains(text(),'Discount')]")
	public WebElement discount;
	@FindBy(xpath = "//li[contains(text(),'New Arrivals')]")
	public WebElement newArrivals;
	@FindBy(xpath = "//li[contains(text(),'Price: Low to High')]")
	public WebElement lowToHigh;
	@FindBy(xpath = "//li[contains(text(),'Price: High to Low')]")
	public WebElement highToLow;
	@FindBy(xpath = "(//a[@href=\"#\"])[2]")
	public WebElement kivahaPageNextButton;
	@FindBy(xpath = "//a[@class=\"orbit-prev\"]")
	public WebElement kivahaPagePreviousButton;
	@FindBy(xpath = "//span[contains(text(), 'Beige')]")
	public WebElement kivahaBeigeTable;
	@FindBy(xpath = "//span[contains(text(),'Morocco Lattice Rust')]")
	public WebElement kivahaMoroccoTable;
	@FindBy(xpath = "//button[@class=\"primary action-button  add-to-cart\"]")
	public WebElement kivahaAddToCart;
	@FindBy(xpath = "(//button[contains(text(),'Checkout')])[2]")
	public WebElement checkout;
	

	public void hoverOnLiving() throws InterruptedException {
		WaitFor.time(5);
		Keyword.goToPage(Living);
		log.info("hovered on LivingRoom Tab");
	}

	public void clickOnCoffeeTable() throws InterruptedException {
		Thread.sleep(3000);
		coffeeTable.click();
		log.info("Coffee-Table page is opened");
	}

	public void openKivahaSquareTablePage() throws InterruptedException {
		WaitFor.time(3);
		coffeeTable1.click();
		WaitFor.time(2);
		Keyword.switchToWindow("Kivaha Square Solid");
		WaitFor.time(5);
	}

	public void selectSortByRecommeneded() throws InterruptedException {
		Keyword.sortBy(sortBy, recommeneded);
		log.info("Coffee-Table page is sorted according to recommeneded products");
	}

	public void selectSortByDiscount() throws InterruptedException {
		Keyword.sortBy(sortBy, discount);
		log.info("Coffee-Table page is sorted according to discounted products");
	}

	public void selectSortByLowToHigh() throws InterruptedException {
		Keyword.sortBy(sortBy, lowToHigh);
		log.info("Coffee-Table page is sorted according to low to high price");
	}

	public void selectSortByNewArrivals() throws InterruptedException {
		Keyword.sortBy(sortBy, newArrivals);
		log.info("Coffee-Table page is sorted according to new arrivals");
	}

	public void selectSortByHighToLow() throws InterruptedException {
		Keyword.sortBy(sortBy, highToLow);
		log.info("Coffee-Table page is sorted according to high to low price");
	}

	public void getProductList() {
		Keyword.getProductsList(LivingRoomProductsBy);
	}

	public void clickOnCloseButton() {
		WaitFor.time(5);
		closeButtonLoginPage.click();
	}
	public void clickNextButtonKivaha() {
		kivahaPageNextButton.click();
		WaitFor.time(2);
		kivahaPageNextButton.click();
		WaitFor.time(2);
		kivahaPageNextButton.click();
		WaitFor.time(2);
		kivahaPageNextButton.click();
		WaitFor.time(2);
		kivahaPageNextButton.click();
		WaitFor.time(2);
	}
	public void clickPreviousButtonKivaha() {
		kivahaPagePreviousButton.click();
		WaitFor.time(2);
		kivahaPagePreviousButton.click();
		WaitFor.time(2);
		kivahaPagePreviousButton.click();
		WaitFor.time(2);
		kivahaPagePreviousButton.click();
		WaitFor.time(2);
		kivahaPagePreviousButton.click();
		WaitFor.time(2);
	}
	public void addToCart() {
		WaitFor.time(5);
		kivahaAddToCart.submit();
	}
	public void exploreOptions(WebElement element) {
		WaitFor.time(3);
		element.click();
		WaitFor.time(3);
	}

	public void clickOnBeige() {
		kivahaBeigeTable.click();
		WaitFor.time(3);
	}

	public void clickOnMorroco() {
		WaitFor.time(3);
		kivahaMoroccoTable.click();
	}

	public void clickCheckout() {
		checkout.click();
	}

}
