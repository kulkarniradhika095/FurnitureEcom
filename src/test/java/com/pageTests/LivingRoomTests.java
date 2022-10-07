package com.pageTests;

import java.net.SocketException;
import java.net.SocketTimeoutException;

import org.testng.annotations.Test;

import com.base.BaseForTestNg;
import com.configuration.WaitFor;
import com.dataDriven.FileRead;
import com.keywords.Keywords;
import com.pages.LivingRoomPage;

public class LivingRoomTests extends BaseForTestNg {
	
	@Test
	public void verifyIfLivingRoomDropBoxOpensAndComparesSelectedItems() throws InterruptedException, SocketTimeoutException, SocketException {
		Keywords.launchUrl(FileRead.url);
		LoginTests login = new LoginTests();
		login.verifyIfLoginIsTakingPlaceSuccessfully();
		LivingRoomPage living = new LivingRoomPage();
		living.hoverOnLiving();
		living.clickOnCoffeeTable();
		WaitFor wait = new WaitFor();
		wait.time(2);
		living.hoveredOnImage();
		wait.time(2);
		living.clickOnViewOptions();
		wait.time(2);
	}
	@Test
	public void loadCoffeeTablePage() throws SocketTimeoutException, SocketException, InterruptedException {
		Keywords.launchUrl(FileRead.url);
		LoginTests login = new LoginTests();
		login.verifyIfLoginIsTakingPlaceSuccessfully();
		LivingRoomPage living = new LivingRoomPage();
		living.hoverOnLiving();
		living.clickOnCoffeeTable();
	}
	@Test
	public void sortByLowToHigh() throws SocketTimeoutException, SocketException, InterruptedException {
		loadCoffeeTablePage();
		LivingRoomPage living = new LivingRoomPage();
		living.selectSortByLowToHigh();
		
	}
	@Test
	public void sortByDiscount() throws SocketTimeoutException, SocketException, InterruptedException {
		loadCoffeeTablePage();
		LivingRoomPage living = new LivingRoomPage();
		living.selectSortByDiscount();
	}
	@Test
	public void sortByHighToLow() throws SocketTimeoutException, SocketException, InterruptedException {
		loadCoffeeTablePage();
		LivingRoomPage living = new LivingRoomPage();
		living.selectSortByHighToLow();
	}
	@Test
	public void sortByRecommended() throws SocketTimeoutException, SocketException, InterruptedException {
		loadCoffeeTablePage();
		LivingRoomPage living = new LivingRoomPage();
		living.selectSortByRecommeneded();
	}
	@Test
	public void sorByNewArrivals() throws SocketTimeoutException, SocketException, InterruptedException {
		loadCoffeeTablePage();
		LivingRoomPage living = new LivingRoomPage();
		living.selectSortByNewArrivals();
	}
}
