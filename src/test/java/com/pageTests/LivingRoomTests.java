package com.pageTests;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.base.BaseForTestNg;
import com.configuration.WaitFor;
import com.dataDriven.Environment;
import com.keywords.Keyword;
import com.pages.LivingRoomPage;

//@Listeners({ScreenshotUtility.class})
public class LivingRoomTests extends BaseForTestNg {
	
	@Test(priority = 1)
	public void verifyIfLivingRoomDropBoxOpens() throws InterruptedException, SocketTimeoutException, SocketException {
		Keyword.launchUrl(Environment.url);
		LoginTests login = new LoginTests();
		login.verifyIfLoginIsTakingPlaceSuccessfully();
		LivingRoomPage living = new LivingRoomPage();
		living.hoverOnLiving();
		living.clickOnCoffeeTable();
		
	}
	@Test(priority = 9)
	public void checkIfTheProductPageOperationsArePerformed() throws SocketTimeoutException, SocketException, InterruptedException {
		verifyIfLivingRoomDropBoxOpens();
		LivingRoomPage living = new LivingRoomPage();
		living.openKivahaSquareTablePage();
		living.clickNextButtonKivaha();
		WaitFor.time(5);
		living.clickOnBeige();
		WaitFor.time(3);
		living.clickOnMorroco();
		WaitFor.time(3);
		WaitFor.time(2);
		living.addToCart();
		WaitFor.time(5);
		living.clickCheckout();
		WaitFor.time(30);
	}
	@Test(priority = 3)
	public void loadCoffeeTablePage() throws SocketTimeoutException, SocketException, InterruptedException {
		Keyword.launchUrl(Environment.url);
		WaitFor.time(3);
		LivingRoomPage living = new LivingRoomPage();
		living.hoverOnLiving();
		living.clickOnCoffeeTable();
	}
	@Test(priority = 4)
	public void sortByLowToHigh() throws SocketTimeoutException, SocketException, InterruptedException {
		loadCoffeeTablePage();
		LivingRoomPage living = new LivingRoomPage();
		living.selectSortByLowToHigh();
		
	}
	@Test(priority = 5)
	public void sortByDiscount() throws SocketTimeoutException, SocketException, InterruptedException {
		loadCoffeeTablePage();
		LivingRoomPage living = new LivingRoomPage();
		living.selectSortByDiscount();
	}
	@Test(priority = 6)
	public void sortByHighToLow() throws SocketTimeoutException, SocketException, InterruptedException {
		loadCoffeeTablePage();
		LivingRoomPage living = new LivingRoomPage();
		living.selectSortByHighToLow();
	}
	@Test(priority = 7)
	public void sortByRecommended() throws SocketTimeoutException, SocketException, InterruptedException {
		loadCoffeeTablePage();
		LivingRoomPage living = new LivingRoomPage();
		living.selectSortByRecommeneded();
	}
	@Test(priority = 8)
	public void sorByNewArrivals() throws SocketTimeoutException, SocketException, InterruptedException {
		loadCoffeeTablePage();
		LivingRoomPage living = new LivingRoomPage();
		living.selectSortByNewArrivals();
	}
	@Test(priority = 2)
	public void verifyIfLivingCatalogProductListIsDisplayed() throws InterruptedException, IOException {
		Keyword.launchUrl(Environment.url);
		LivingRoomPage living = new LivingRoomPage();
		living.hoverOnLiving();
		WaitFor.time(5);
		String products = living.getProductList();
		String actualList = "Seating & Chairs\r\n"
				+ "Lounge Chairs\r\n"
				+ "Accent Chairs\r\n"
				+ "Ottomans & Stools\r\n"
				+ "Bean Bags\r\n"
				+ "Benches\r\n"
				+ "Bar Stools\r\n"
				+ "Rocking Chairs\r\n"
				+ "Gaming Chairs\r\n"
				+ "Tables\r\n"
				+ "Coffee Tables\r\n"
				+ "Side & End Tables\r\n"
				+ "Console Table\r\n"
				+ "Nested Tables\r\n"
				+ "Coffee Table Sets\r\n"
				+ "Living Storage\r\n"
				+ "TV Units\r\n"
				+ "Bookshelves\r\n"
				+ "Shoe Racks\r\n"
				+ "Prayer Units\r\n"
				+ "Showcases\r\n"
				+ "Wall Shelves\r\n"
				+ "Entryway & Foyer\r\n"
				+ "Corner Storage\r\n"
				+ "Room Divider\r\n"
				+ "Living Room Sets";
		Assert.assertEquals(products, actualList);
		Keyword.wholePageScreenshot();
	}
	@Test
	public void selectDropdownCheckbox() {
		
	}
}
