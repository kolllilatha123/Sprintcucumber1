package com.stepdefinition;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import com.PageObject.PageObjectManager;
import com.base.LibGlobel;
import com.pages.BookingHotel;
import com.pages.ChooseSearch;
import com.pages.LoginsPage;
import com.pages.OrderId;
import com.pages.SearchHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends LibGlobel {

	PageObjectManager pageObjectManager;
	LoginsPage LoginsPage;
	SearchHotel SearchHotel;
	ChooseSearch ChooseSearch;
	BookingHotel BookingHotel;
	OrderId OrderId;

	@Given("User should entert adactin details")
	public void userShouldEntertAdactinDetails() throws MalformedURLException {
		getDriver();
		loadUrl("http://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("User should login using {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldLoginUsingAnd(String username, String password, String location, String hotel,
			String roomtype, String roonnos, String datepickin, String datepickout, String adultroom, String childroom,
			String fn, String ln, String address, String ccno, String cctype, String ccmonth, String ccyear,
			String cvv) {
		pageObjectManager = pageObjectManager.getInstance();
		LoginsPage = pageObjectManager.getLoginsPage();
		LoginsPage.Login(username, password);
		SearchHotel = pageObjectManager.getSearchHotel();
		SearchHotel.SearchHotels(location, hotel, roomtype, roonnos, datepickin, datepickout, adultroom, childroom);
		ChooseSearch = pageObjectManager.getChooseSearch();
		ChooseSearch.ChooseSearchs();
		BookingHotel = pageObjectManager.getBookingHotel();
		BookingHotel.bookingHotel(fn, ln, address, ccno, cctype, ccmonth, ccyear, cvv);

	}

	@When("User should get order id")
	public void userShouldGetOrderId() {
		OrderId = pageObjectManager.getOrderId();
		OrderId.getorderId();

	}

	@Then("User should verify msg")
	public void userShouldVerifyMsg() {
		OrderId.logout();
	}
}
