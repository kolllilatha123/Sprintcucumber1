package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobel;

public class SearchHotel extends LibGlobel {

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement roomnos;

	@FindBy(id = "datepick_in")
	private WebElement datepickin;

	@FindBy(id = "datepick_out")
	private WebElement datepickout;

	@FindBy(id = "adult_room")
	private WebElement adultroom;

	@FindBy(id = "child_room")
	private WebElement childroom;

	@FindBy(id = "Submit")
	private WebElement Submit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public void SearchHotels(String location, String hotel, String roomtype, String roonnos, String datepickin,
			String datepickout, String adultroom, String childroom) {
		selectDataBytext(getLocation(), location);
		selectDataBytext(getHotels(), hotel);
		selectDataBytext(getRoomtype(), roomtype);
		selectDataBytext(getRoomnos(), roonnos);
		type(getDatepickin(), datepickin);
		type(getDatepickout(), datepickout);
		selectDataBytext(getAdultroom(), adultroom);
		selectDataBytext(getChildroom(), childroom);
		btnClick(getSubmit());

	}
}
